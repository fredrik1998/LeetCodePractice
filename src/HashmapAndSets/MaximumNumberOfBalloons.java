package HashmapAndSets;

class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text){
        int[] charCounter = new int[26];

        for(char c : text.toCharArray()){
            charCounter[c - 'a']++;
        }


        return Math.min(charCounter['b' - 'a'],
                          Math.min(charCounter['a' - 'a'],
                          Math.min(charCounter['l' - 'a'] / 2,
                          Math.min(charCounter['o' - 'a'] / 2,
                          charCounter['n' - 'a']))));

    }
}
