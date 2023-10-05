public class User extends Login{

    super()
    public String name;
    private int posX;
    private int posY;
    private String cpf;

    public User(String name, String username, String password, int posX, int posY, String cpf){
        this.name = name;
        this.username = username;
        this.password = password;
        this.posX = posX;
        this.posY = posY;
        this.cpf = cpf;

        super.setUsername();
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
