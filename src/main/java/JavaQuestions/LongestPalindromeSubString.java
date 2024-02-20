package JavaQuestions;

public class LongestPalindromeSubString {
    public static void main(String[] args) {

        System.out.println(longestSubStringPalindrome("racec"));

    }



    public static  String longestSubStringPalindrome(String s){
        if(s == null || s.length() <1) return "";
        int start = 0;
        int end = 0;
        for(int i = 0; i <s.length(); i ++){
            int len1 = expendFromMiddle(s, i, i); //"racecar" starting point from the middle
            int len2 = expendFromMiddle(s, i , i +1) ;//"aabbaa"
            int len = Math.max(len1,len2);
            if(len > end -start){
                start = i - ((len -1) /2);
                end=i + (len/2);
            }

        }
        return s.substring(start, end +1);

}

  private static int expendFromMiddle(String s, int left, int right){
        if(s==null || left> right) return 0;

        while(left >= 0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left -1;
    }

}
