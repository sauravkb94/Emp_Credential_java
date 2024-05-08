package emailapp;

public class Emailapp {

    public static void main(String[] args) {
        Email em1 = new Email ("Saurav","Kumar");

        em1.setAlternativeEmail("Admin@xyz.com");
        System.out.println(em1.showinfo());
    }
}
