package pages;

// This is a PAGE class
// This is the page with the locators


// this will be the user object with the credentials OR can be in the Main page (LoginAgentSite.java) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
public class User {
    private String userEmail;

    private String pw;

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmail(){
        return this.userEmail;
    }


    public void setPw(String pw){
        this.pw = pw;
    }

    public String getPw(){
        return this.pw;
    }
}
