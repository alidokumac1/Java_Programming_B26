package day19_string;

public class IndexOfMethod3 {
    public static void main(String[] args) {

        String word = "definition";


        System.out.println("first i : " + word.indexOf('i'));
        System.out.println("last i :" + word.lastIndexOf('i'));


        System.out.println("second i: " + word.indexOf('i', 4));

        System.out.println("third i: " + word.indexOf('i', 6));
        System.out.println( "first f :" + word.indexOf('f',1));




       String res = word.replaceFirst("(?:i)+" , "a");

        System.out.println(res);

        String mySt = "Hello";
        System.out.println(mySt.replace('H', '阿'));

        System.out.println("____________________________________________");

        String sms = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";

        String sender = sms.substring((sms.indexOf("<")+1),sms.indexOf(">"));

        String number = sms.substring((sms.indexOf("[")+1),sms.indexOf("]"));

        String message = sms.substring((sms.indexOf("{")+2),sms.indexOf("}"));


        System.out.println("Sender: "+sender+"\n"+"Number: "+number+"\n"+"Message: "+message);





    }
}
