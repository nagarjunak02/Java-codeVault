package LeetCode;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";


        int sc = 0;
        int tc = 0;

        while(sc<s.length() && tc<t.length()){
            if(s.charAt(sc) == t.charAt(tc)){
                sc++;
            }
            tc++;
        }

        System.out.println(sc == s.length() );
    }
}
