public class Main {
    public static void main(String[] args) {
        String word = "laptop";
        reverseWord(word);
    }

    public static void reverseWord(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}