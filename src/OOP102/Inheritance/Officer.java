package OOP102.Inheritance;

public class Officer extends Worker{

    private String department;
    private String shift;

    public Officer(String nameSurname,String eposta,int phoneNumber,String department,String shift){
        super(nameSurname,eposta,phoneNumber);

        this.department = department;
        this.shift = shift;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getShift() {
        return this.shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work(){
        System.out.println(this.getNameSurname() + " started working in the company.");
    }

}
