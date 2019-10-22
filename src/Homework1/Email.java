package Homework1;

public class Email {
    public static boolean isValidEmail(String email) {
        for (int i=0; i<email.length();i++) {
            if (email.charAt(i)=='@')
            return false;
        }
        return false;
    }
}
