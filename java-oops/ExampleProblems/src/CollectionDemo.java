import java.util.*;

class WordCount {
    public void countWords(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word Count using Map:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

class WordCountWithoutMap {
    public void countWords(String sentence) {
        String[] words = sentence.split(" ");
        boolean[] visited = new boolean[words.length];
        System.out.println("Word Count without Map:");
        for (int i = 0; i < words.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(words[i] + " = " + count);
        }
    }
}

class CharFrequency {
    public void countCharFrequency(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println("Character Frequency using Map:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

class CharFrequencyWithoutMap {
    public void countCharFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        System.out.println("Character Frequency without Map:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " = " + freq[i]);
            }
        }
    }
}

class RemoveDuplicates {
    public String removeDuplicates(String str) {
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            charSet.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }
        return result.toString();
    }
}

class CollectionUtil {
    public List<String> removeDuplicates(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
}

public class CollectionDemo {
    public static void main(String[] args) {
        String sentence = "Java is great and Java is powerful";
        String str = "programming";
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana"));

        WordCount wc = new WordCount();
        wc.countWords(sentence);

        WordCountWithoutMap wcNoMap = new WordCountWithoutMap();
        wcNoMap.countWords(sentence);

        CharFrequency cf = new CharFrequency();
        cf.countCharFrequency(str);

        CharFrequencyWithoutMap cfNoMap = new CharFrequencyWithoutMap();
        cfNoMap.countCharFrequency(str);

        RemoveDuplicates rd = new RemoveDuplicates();
        System.out.println("String after removing duplicates: " + rd.removeDuplicates(str));

        CollectionUtil cu = new CollectionUtil();
        System.out.println("Original List: " + fruits);
        System.out.println("List after removing duplicates: " + cu.removeDuplicates(fruits));
    }
}