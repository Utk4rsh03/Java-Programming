public class Stringperformancecomparison {
    public static void main(String[] args) {
        System.out.println(" PERFORMANCE COMPARISON ");

        long start = System.nanoTime();
        concatenateWithString(1000);
        long end = System.nanoTime();
        System.out.println("String concatenation time: " + (end - start) + " ns");

        start = System.nanoTime();
        concatenateWithStringBuilder(1000);
        end = System.nanoTime();
        System.out.println("StringBuilder concatenation time: " + (end - start) + " ns");

        start = System.nanoTime();
        concatenateWithStringBuffer(1000);
        end = System.nanoTime();
        System.out.println("StringBuffer concatenation time: " + (end - start) + " ns");

        demonstrateStringBuilderMethods();
    }

    public static String concatenateWithString(int iterations) {
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "Java " + i + " ";
        }
        return result;
    }

    public static String concatenateWithStringBuilder(int iterations) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("Java ").append(i).append(" ");
        }
        return sb.toString();
    }

    public static String concatenateWithStringBuffer(int iterations) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sb.append("Java ").append(i).append(" ");
        }
        return sb.toString();
    }

    public static void demonstrateStringBuilderMethods() {
        StringBuilder sb = new StringBuilder("Hello World");

        sb.append("!");               // Hello World!
        sb.insert(6, "Java ");        // Hello Java World!
        sb.delete(0, 6);              // Java World!
        sb.deleteCharAt(0);           // ava World!
        sb.reverse();                 // !dlroW ava
        sb.replace(0, 5, "Hi");       // Hiava
        sb.setCharAt(0, 'h');         // hiava

        System.out.println("StringBuilder capacity: " + sb.capacity());
        sb.ensureCapacity(50);
        sb.trimToSize();

        System.out.println("StringBuilder content after modifications: " + sb.toString());
    }
}
