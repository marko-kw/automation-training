package utils;

public class User {
    public static String VALID_EMAIL = "marko.delgadillo+qa1@kw.com";
    public static String VALID_PASSWORD = "blahblahblah1";
    String userEmail;
    String password;

    public User(String userEmail, String password) {
        this.VALID_EMAIL = userEmail;
        this.VALID_PASSWORD = password;
    }
}