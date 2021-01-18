public class Task4 {
    public static void main( String[] args ) {
        try {
            System.out.println("Enter the text: ");
            String text = ConsoleReader.readText();
            System.out.println("Enter the word: ");
            String word = ConsoleReader.readWord();
            System.out.printf("The word \"%s\" occurs in the text %d times", word, getWordCount(text, word));
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }


    static int getWordCount(String text, String word) {
        if (word.equals("") || text.equals("")) throw new IllegalArgumentException("Invalid input");

        text = text.toLowerCase();
        word = word.toLowerCase();

        int wordCount = 0;
        Matcher matcher = Pattern.compile("\\b" + word + "\\b").matcher(text);

        while (matcher.find()) {
            wordCount++;
        }
        return wordCount;
    }
}