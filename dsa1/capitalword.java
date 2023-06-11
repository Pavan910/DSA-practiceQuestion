import java.util.Arrays;

public class capitalword {
    public static String[] capital(String[] words) {
        String[] Capword = new String[words.length];
        capitalword(words, Capword, 0);
        return Capword;
    }

    private static void capitalword(String[] words, String[] Capword, int index) {
        if (index == words.length) {
            return;
        }
        Capword[index] = words[index].toUpperCase();
        capitalword(words, Capword, index + 1);
    }

    public static void main(String[] args) {
        String[] words = { "foo", "bar", "world" };
        String[] capitalword = capital(words);
        System.out.println(Arrays.toString(capitalword));
    }
}
