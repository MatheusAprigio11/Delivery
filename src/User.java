public class User extends Login{
    private String username;
    private String password;
    public String name;
    private int posX;
    private int posY;
    private String cpf;

    public User(String name, String username, String password, int posX, int posY, String cpf){
        super();
        this.name = name;
        this.setUsername(username);
        this.setPassword(password);
        this.posX = posX;
        this.posY = posY;
        this.setCpf(cpf);

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
