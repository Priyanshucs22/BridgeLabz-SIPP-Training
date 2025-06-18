import java.util.*;
public class CharArrayCompare {
    public static char[] toCharArrayCustom(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] customArray = toCharArrayCustom(text);
        char[] builtinArray = text.toCharArray();
        boolean result = compareArrays(customArray, builtinArray);
        System.out.println("Are Arrays Equal: " + result);
    }
}