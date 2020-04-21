package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class PalindromeDP {
    public static void main(String[] args) {
        String str = "sssd";

        System.out.println(longestPalindrome(str));
    }

    static String longestPalindrome(String s) {
        String sub = "";
        if(s.length() <= 1) return s;
        List<Boolean> subSubOdd = new ArrayList<Boolean>();
        List<Boolean> subSubEven = new ArrayList<Boolean>();

        for (int winLength=1; winLength <= s.length(); winLength ++){
            for(int j = 0; j <= s.length() - winLength; j++){
                String subString = s.substring(j, j + winLength);
                if(winLength == 1){
                    subSubOdd.add(true);
                    sub = subString;
                }else if (winLength == 2){
                    if(s.charAt(j) == s.charAt(j+1)){
                        sub = subString;
                    }
                    subSubEven.add(s.charAt(j) == s.charAt(j+1));

                }else if (winLength % 2 == 0){

                    //j + 1
                    if (isPlindrome(subString, subSubEven.get(j + 1))){
                        sub = subString;
                    }
                    subSubEven.set(j,isPlindrome(subString, subSubEven.get(j + 1)));
                    if (j == s.length() - winLength) subSubEven = subSubEven.subList(0,s.length() - winLength + 1);
                }else if(winLength%2 != 0){


                    if (isPlindrome(subString, subSubOdd.get(j + 1))){
                        sub = subString;
                    }
                    subSubOdd.set(j,isPlindrome(subString, subSubOdd.get(j + 1)));
                    if (j == s.length() - winLength) subSubOdd = subSubOdd.subList(0,s.length() - winLength + 1);
                }

            }
            if(winLength %2 != 0){
                System.out.println(subSubOdd + " " + subSubOdd.size());
            }else {
                System.out.println(subSubEven + " " + subSubEven.size());
            }
        }
        return sub;
    }

    static boolean isPlindrome(String str, boolean subSubsStr){
        return subSubsStr && str.charAt(0) == str.charAt(str.length()-1);
    }
}
