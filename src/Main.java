import java.util.Arrays;

public class Main {
    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String input) {
        int open = 0;
        int close = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                open += 1;
            } else {
                close += 1;
            }
        }
        return open == close;
    }


    // 2. reverseInteger
    public static String reverseInteger(int intinput) {
        String str = Integer.toString(intinput);
        String output = "";
        for (int i = str.length(); i > 0; i--) {
            output = output + str.charAt(i - 1);
        }
        return output;
    }

    // 3. encryptThis
    public static String encryptThis(String input) {
        String[] words = input.split(" ");
        String output = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 2) {
                int integer = (int) words[i].charAt(0);
                String firstinteger = "";
                firstinteger += integer;
                String a = words[i].substring(1, 2);
                String b = words[i].substring(words[i].length() - 1);
                words[i] = firstinteger + b + words[i].substring(2, words[i].length() - 1) + a;
            } else {
                int firstinteger = (int) words[i].charAt(0);
                words[i] = firstinteger + words[i].substring(1);
            }

            if (i < words.length - 1) {
                output += words[i] + " ";
            } else {
                output += words[i];
            }
        }
        return output;
    }


    // 4. decipherThis
    public static String decipherThis(String input) {
        String[] words = input.split(" ");
        String output = "";
        for (int i = 0; i < words.length; i++) {
            String integer = intPart(words[i]);
            int lengthInteger = integer.length();
            String integerValue = words[i].substring(0, lengthInteger);
            char firstChar = (char) Integer.parseInt(integerValue);
            words[i] = firstChar + words[i].substring(lengthInteger);
            System.out.println(words[i]);
            if(words[i].length() > 2 ) {
                String secondChar = words[i].substring(1, 2);
                String lastChar = words[i].substring(words[i].length() - 1);
                words[i] = words[i].substring(0, 1) + lastChar + words[i].substring(2, words[i].length() - 1) + secondChar;
                System.out.println(words[i]);
            }
            if (i < words.length - 1) {
                output += words[i] + " ";
            } else {
                output += words[i];
            }
        }
        System.out.println(output);
        return output;


    }

    public static String intPart(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9') {
                result += str.charAt(i);
            } else {
                break;
            }

        }
        return result;
    }
}

