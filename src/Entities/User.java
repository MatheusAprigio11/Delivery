package Entities;

public class User {

    private String password;
    public String username;
    private int posX;
    private int posY;

    public User(String username, String password, int posX, int posY) {
        this.setUsername(username);
        this.setPassword(password);
        this.posX = posX;
        this.posY = posY;

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}

