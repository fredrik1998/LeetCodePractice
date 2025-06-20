package TwoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;

        while (left < right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Brute force

//    public boolean isPalindrome(String s) {
//        StringBuilder palindrome = new StringBuilder();
//
//        s = s.toLowerCase();
//
//        for(int i = 0; i < s.length(); i++){
//            char a = s.charAt(i);
//            if(Character.isAlphabetic(a) || Character.isDigit(a)){
//                palindrome.append(a);
//            }
//        }
//        return (palindrome.toString().contentEquals(palindrome.reverse()));
//    }


}
