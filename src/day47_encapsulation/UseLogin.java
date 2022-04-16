package day47_encapsulation;

public class UseLogin {
    public static void main(String[] args) {

        Login obj = new Login();
//        obj.username = "jamesbond";
//        obj.password = "1234";
        // Cannot access private variables directly

    obj.setUsername("JamesBond");
    obj.setPassword("123243434343434");

        System.out.println(obj.getUsername() );
        System.out.println(obj.getPassword());


    }
}
