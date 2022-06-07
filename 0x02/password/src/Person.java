

public class Person {

    private String username;
    private String password;

    public Person() {
    }

    public boolean checkUser(){
        return !this.username.contains("!@#$%&*^") && this.username.length() >=8;
    }

    public boolean checkPassword(){
        if (!this.password.matches(".*[A-Z].*")) return false;
        if (!this.password.matches(".*[0-9].*")) return false;
        if (!this.password.matches(".*[-+_!@#$%^&.,?].*")) return false;
        if (this.password.length() < 8) return false;
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
