public class StringPermutation {
    public static void premutation(String str) {
        prem("", str);
    }

    private static void prem(String s, String r) {
        int n = r.length();
        if (n == 0) {
            System.out.println(s);
        }
        for (int i = 0; i < n; i++) {
            String news = s + r.charAt(i);
            String newrem = r.substring(0, i) + r.substring(i + 1);
            prem(news, newrem);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        premutation(str);
    }
}
