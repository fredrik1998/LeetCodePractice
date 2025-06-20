package ArraysAndStrings;

public class MergeAlternately {
    public String mergeAlternately(String word1, String word2){
        StringBuilder mergedString = new StringBuilder();

        int len1 = word1.length();
        int len2 = word2.length();

        for(int i = 0; i < Math.max(len1, len2); i++){
            if(i < len1){
                mergedString.append(word1.charAt(i));
            }
            if(i < len2){
                mergedString.append(word2.charAt(i));
            }
        }
        return mergedString.toString();
    }
}
