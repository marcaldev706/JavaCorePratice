package ApplicationsPKG.ClientData;

public class Client {
    private String name;
    private String email;
    private int age;
    private char gender;
    private int idCode;

    public Client(int age, String email, char gender, String name) {
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.name = name;
        this.idCode = idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }
}
