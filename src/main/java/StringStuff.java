import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringStuff {

    public static void main(String[] args) {

        checkForDuplicates("JAVA");
        checkIfTwoWordsAreAnagrams("mary", "army");
        printFirstNonRepeatedCharacter("eebvc");
        reverseAString("Hello");
        reverseAStringWithRecursion("Hello");
        isPalindrone("radar");
        printDuplicateCharactersAndTheCount("mississippi");
    }

    public static void checkForDuplicates(String s) {
        char[] array = s.toLowerCase().toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void checkIfTwoWordsAreAnagrams(String str1, String str2) {
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (array1.length != array2.length) {
            System.out.println("Is not anagram");
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                System.out.println("Is not anagram");
            }
        }

        System.out.println(str1 + " and " + str2 + " are anagrams");
    }

    public static void printFirstNonRepeatedCharacter(String str) {
        char[] array = str.toLowerCase().toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non repeated character is " + entry.getKey());
                break;
            }
        }
    }

    public static void reverseAString(String word) {
        char[] array = word.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
        }
        System.out.println(sb.toString());
    }

    public static String reverseAStringWithRecursion(String word) {
        if (word.length() < 2) {
            return word;
        }

        return reverseAStringWithRecursion(word.substring(1)) + word.charAt(0);
    }

    public static void isPalindrone(String word) {
        StringBuilder sb = new StringBuilder(word);
        String reversedWord = sb.reverse().toString();

        char[] reversedArray = reversedWord.toCharArray();
        char[] wordArray = word.toCharArray();

        Arrays.sort(reversedArray);
        Arrays.sort(wordArray);

        if (Arrays.equals(reversedArray, wordArray)) {
            System.out.println(word + " is a palindrone");
        }
        System.out.println(word + " is not a  palindrone");
    }

    public static void printDuplicateCharactersAndTheCount(String word) {
        char[] array = word.toLowerCase().toCharArray();
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();

        for (int i = 0; i < array.length; i++) {
            char c = array[i];

            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }

        for (Character c : countMap.keySet()) {
            Integer count = countMap.get(c);
            if (count > 1) {
                System.out.println(c + ": " + count);
            }
        }
    }
}
