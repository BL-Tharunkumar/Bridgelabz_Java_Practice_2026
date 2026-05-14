package day16_17.practice;

public class SentenceSearch {

    // Linear Search Method
    public static String searchSentence(String[] sentences, String word) {

        // Traverse the array of sentences
        for (String sentence : sentences) {

            // Check if the sentence contains the word
            if (sentence.contains(word)) {
                return sentence;
            }
        }

        // If word is not found
        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
                "Java is a programming language",
                "Python is easy to learn",
                "Data Structures are important",
                "Java supports OOP concepts"
        };

        String word = "Java";

        String result = searchSentence(sentences, word);

        // Output
        System.out.println("Result: " + result);
    }
}
