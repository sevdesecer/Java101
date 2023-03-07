package OOP102.Worker;

public class Lecturer extends Academician{
    private int doorNo;
    public Lecturer(String nameSurname,String eposta,int phoneNumber,String department,String degree,int doorNo){
        super(nameSurname,eposta,phoneNumber,department,degree);

        this.doorNo= doorNo;
    }

    public int getDoorNo() {
        return this.doorNo;
    }
    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }
}
