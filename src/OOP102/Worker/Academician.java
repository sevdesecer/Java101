package OOP102.Worker;

public class Academician extends Worker{
    private String department;

    private String degree;

    public Academician(String nameSurname,String eposta,int phoneNumber,String department,String degree){
        super(nameSurname,eposta,phoneNumber); // önce extend yaptığını çağır, sonra diğer değişkenler.

        this.department=department;
        this.degree=degree;

    }
    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDegree() {
        return this.degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void enterLesson(){
        System.out.println(this.getNameSurname() + " entered the lesson");
    }
    @Override // Normalde super class ta bulunan bir method (geçersiz saydık) olmasına rağmen burada tekrar yazdık, sub classlarda bazı methodları farklı kullanmak isteyebiliriz,bu işleme method overriding denir.
    public void enter(){
        System.out.println(this.getNameSurname() + " entered the university from gate A.");
    }


}
