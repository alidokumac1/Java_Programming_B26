package ReplitTasks;

public class JavaAscii {
    public static void main(String[] args) {


        String word = "pa-ra-nor-mal";

        int syllables = 0;

        for (int i = 0; word.length() > i; i++) {

            if (word.charAt(i) == '-') {
                syllables++;
            }
        }
        System.out.println(syllables);
    }


            }

