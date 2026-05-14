package day16_17.practice;

public class StringConcatenationComparison {

    public static void main(String[] args) {

        int count = 100000;

        // ---------------- String ----------------
        long startString = System.currentTimeMillis();

        String str = "";

        for (int i = 0; i < count; i++) {
            str = str + "Java";
        }

        long endString = System.currentTimeMillis();

        // ---------------- StringBuilder ----------------
        long startBuilder = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            stringBuilder.append("Java");
        }

        long endBuilder = System.currentTimeMillis();

        // ---------------- StringBuffer ----------------
        long startBuffer = System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < count; i++) {
            stringBuffer.append("Java");
        }

        long endBuffer = System.currentTimeMillis();

        // ---------------- Output ----------------
        System.out.println("String Time: " +
                (endString - startString) + " ms");

        System.out.println("StringBuilder Time: " +
                (endBuilder - startBuilder) + " ms");

        System.out.println("StringBuffer Time: " +
                (endBuffer - startBuffer) + " ms");
    }
}
