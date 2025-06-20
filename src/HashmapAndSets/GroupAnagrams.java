package HashmapAndSets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            anagramMap.putIfAbsent(sortedString, new ArrayList<>());
            anagramMap.get(sortedString).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
