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

    public void setUserName(String userName){
        this.userName=userName;
    }

    public String getUserName(){
        return this.userName;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword2(String password2){
        this.password2=password2;
    }
    public String getPassword2(){
        return this.password2;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setRegisNumber(int regisNumber){
        this.regisNumber=regisNumber;
    }
    public int getRegisNumber(){
        return this.regisNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }
    public void setJob(String job){
        this.job=job;
    }
    public String getJob(){
        return this.job;
    }

}
