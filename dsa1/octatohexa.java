import java.io.*;
import java.util.*;

class octatohexa {

    public static int convert(int n) {
        // your solutions goes here..
        int num = n;
        int dec_value = 0;

        int base = 1;

        int temp = num;
        while (temp != 0) {
            int last_digit = temp % 10;
            temp /= 10;
            dec_value += last_digit * base;

            base *= 8;
        }
        return dec_value;
    }

    public static String convertDeciToHexadeci(int n) {
        char[] hexaDeciNum = new char[100];
        int i = 0;
        while (n != 0) {
            int temp = 0;
            temp = n % 16;
            if (temp < 10) {
                hexaDeciNum[i] = (char) (temp + 48);
                i++;
            } else {
                hexaDeciNum[i] = (char) (temp + 55);
                i++;
            }
            n /= 16;
        }

        String ans = "";
        for (int j = i - 1; j >= 0; j--) {
            ans += hexaDeciNum[j];
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);
        int decnum = convert(n);
        String hexadecimalNumber = convertDeciToHexadeci(decnum);
        System.out.println("Hexadecimal: " + hexadecimalNumber);
    }
}
