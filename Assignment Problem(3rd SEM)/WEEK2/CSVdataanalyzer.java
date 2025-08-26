import java.util.*;

public class CSVdataanalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter CSV data (comma-separated values, one row per line).");
        System.out.println("Type 'END' to finish input:");

        List<String> lines = new ArrayList<>();
        while (true) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("END")) break;
            lines.add(line);
        }

        String[][] table = parseCSV(lines);
        cleanAndValidateData(table);
        displayFormattedTable(table);
        showSummaryReport(table);

        sc.close();
    }

    // Parse CSV manually (handles simple commas, not quoted CSVs)
    public static String[][] parseCSV(List<String> lines) {
        int rows = lines.size();
        int cols = lines.get(0).split(",").length;
        String[][] table = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String line = lines.get(i);
            int col = 0;
            StringBuilder field = new StringBuilder();

            for (int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);
                if (ch == ',') {
                    table[i][col++] = field.toString();
                    field.setLength(0);
                } else {
                    field.append(ch);
                }
            }
            table[i][col] = field.toString(); // last field
        }
        return table;
    }

    // Trim cells & replace empty with "MISSING"
    public static void cleanAndValidateData(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = table[i][j].trim();
                if (table[i][j].isEmpty()) {
                    table[i][j] = "MISSING";
                }
            }
        }
    }

    // Print formatted table
    public static void displayFormattedTable(String[][] table) {
        System.out.println("\nFormatted Table:");
        for (String[] row : table) {
            for (String cell : row) {
                System.out.printf("%-15s", cell);
            }
            System.out.println();
        }
    }

    // Show summary statistics
    public static void showSummaryReport(String[][] table) {
        int totalRecords = table.length;
        int missing = 0;

        for (String[] row : table) {
            for (String cell : row) {
                if (cell.equals("MISSING")) missing++;
            }
        }

        System.out.println("\nSummary Report:");
        System.out.println("Total Records: " + totalRecords);
        System.out.println("Missing Fields: " + missing);

        double completeness = 100.0 * (totalRecords * table[0].length - missing) 
                              / (totalRecords * table[0].length);

        System.out.printf("Data Completeness: %.2f%%\n", completeness);
    }
}
