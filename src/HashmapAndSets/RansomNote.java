package HashmapAndSets;

class RansomNote{
    public boolean canConstruct(String ransomNote, String magazine){
        int[] charCounter = new int[26];

        for(char c : magazine.toCharArray()){
            charCounter[c - 'a']++;
        }

        for(char c : ransomNote.toCharArray()){
            if(charCounter[c - 'a'] == 0){
                return false;
            }
            charCounter[c - 'a']--;
        }
        return true;
    }
}
