import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";

        
        str = str.toLowerCase();

        
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        
        for (char ch : str.toCharArray()) {
            if (!Character.isWhitespace(ch)) {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        
        System.out.println("Duplicate characters in the string \"" + str + "\" are:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " - Count: " + charCountMap.get(ch));
            }
        }
    }
}
