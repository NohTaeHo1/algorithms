package mamberOOP;

public class MemberModel {
    private String userName;
    private String password;
    private String password2;
    private String name;
    private int regisNumber;
    private int phoneNumber;
    private String address;
    private String job;
    private double height;
    private double weight;
//카우프 지수에 사용하는 생성자
    public MemberModel(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

//회원가입에 사용하는 생성자
    public MemberModel(String userName, String password, String password2,
                       String name, int regisNumber, int phoneNumber, String address, String job) {
        this.userName = userName;
        this.password = password;
        this.password2 = password2;
        this.name = name;
        this.regisNumber = regisNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }

    public MemberModel(){}


    public void setHeight() {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getPassword2() {
        return this.password2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRegisNumber(int regisNumber) {
        this.regisNumber = regisNumber;
    }

    public int getRegisNumber() {
        return this.regisNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return this.job;
    }

    @Override
    public String toString() {
        return "MemberModel{" +
                "userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", regisNumber=" + regisNumber +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}