package HashmapAndSets;

import java.util.ArrayList;

public class JewelsStones {
    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        ArrayList<Character> jewelsInStone = new ArrayList<>();
        stones = stones.toLowerCase();
        jewels = jewels.toLowerCase();
        for(char stone : stones.toCharArray()){
            for(char jewel : jewels.toCharArray()){
                if(stone == jewel){
                    jewelsInStone.add(stone);
                    counter++;
                }
            }
        }
        return counter;
    }
}
