public class LongestPalindromicSubstring {
    static int len = 0;
    static int resLen = 0;
    public static void main(String[] args) {
        String s = "abba";
        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i + 1;
            range(s,i,i+1);
            range(s,i,i);
        }
        System.out.println(resLen);
    }

    static void range(String s,int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            len = r - l + 1;
            resLen = Math.max(resLen, len);
            l--;
            r++;
        }
    }
}
