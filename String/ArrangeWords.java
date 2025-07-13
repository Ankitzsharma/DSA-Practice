package String;

public class ArrangeWords {
    public static String arrangeWords(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        
        // Sort words by length
        java.util.Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        
        // Capitalize the first word
        if (words.length > 0) {
            words[0] = Character.toUpperCase(words[0].charAt(0)) + words[0].substring(1);
        }
        
        // Append words to result
        for (String word : words) {
            result.append(word).append(" ");
        }
        
        // Remove trailing space and return
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String text = "Keep calm and code on";
        System.out.println(arrangeWords(text));
    }
    
}
