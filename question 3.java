import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "Hello world, how are you? Are you doing good?";
        
        
        str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        
        String[] words = str.split("\\s+");

        
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

    
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
