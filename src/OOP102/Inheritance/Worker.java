package OOP102.Inheritance;

public class Worker {
    private String nameSurname;
    private String eposta ;
    private int phoneNumber;

    public Worker(String nameSurname,String eposta,int phoneNumber){
        this.nameSurname = nameSurname;
        this.eposta = eposta;
        this.phoneNumber = phoneNumber;
    }
    public String getNameSurname(){
        return this.nameSurname;
    }
    public void setNameSurname(String nameSurname){
        this.nameSurname=nameSurname;
    }
    public String getEposta(){
        return this.eposta;
    }
    public void setEposta(String eposta){
        this.eposta = eposta;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void enter(){
        System.out.println(this.nameSurname + " entered the university.");
    }
    public void leave(){
        System.out.println(this.nameSurname + " leaved the university.");
    }
}
