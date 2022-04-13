package my_utilities;

public class StringUtil {

    /*
        reverse
        create a method that will accept a String and return the reversed version
     */

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

        /*
    Fix Format

    create a method will accept a String and return a String in proper format. Proper format is:
    First character starting as uppercase and the rest as lowercase

     */

    public static String fixFormat(String str) {
        str = str.trim();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }


    public static int frequencyOfCharacter(String str, char letter) {
        str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == letter) {
                count++;
            }
        }

        return count;

    }

    public static String uniqueCharacters(String str) {

        String unique = "";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {

            if (!checked.contains("" + str.charAt(i))) {
                int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                checked += str.charAt(i);

                if (count == 1) {
                    unique += str.charAt(i);
                }
            }
        }

        return unique;

    }


}

