import java.util.*;

public class Fileorganizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file names (with extensions). Type 'END' to finish:");

        List<String> filenames = new ArrayList<>();
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("END")) break;
            filenames.add(name);
        }

        organizeFiles(filenames);
        sc.close();
    }

    public static void organizeFiles(List<String> files) {
        Map<String, String> categories = Map.of(
            "txt", "Document", "doc", "Document",
            "jpg", "Image", "png", "Image",
            "mp4", "Video", "mp3", "Audio"
        );

        System.out.printf("%-20s %-15s %-30s\n", "Original Name", "Category", "Suggested Name");

        int doc = 0, img = 0, other = 0;
        int index = 1;

        for (String filename : files) {
            String category = "Unknown";
            String baseName = filename;
            String extension = "";
            int dotIndex = filename.lastIndexOf('.');

            if (dotIndex != -1 && dotIndex < filename.length() - 1) {
                baseName = filename.substring(0, dotIndex);
                extension = filename.substring(dotIndex + 1).toLowerCase();
                category = categories.getOrDefault(extension, "Other");
            }

            if (category.equals("Document")) doc++;
            else if (category.equals("Image")) img++;
            else other++;

            String newName = category + "_" + index + "." + extension;
            index++;

            System.out.printf("%-20s %-15s %-30s\n", filename, category, newName);
        }

        System.out.println("\nCategory Summary:");
        System.out.println("Documents: " + doc);
        System.out.println("Images: " + img);
        System.out.println("Others: " + other);
    }
}
