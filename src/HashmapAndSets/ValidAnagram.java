package HashmapAndSets;

import java.util.Arrays;

class ValidAnagram{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] charArray = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray, charArray2);
    }
}