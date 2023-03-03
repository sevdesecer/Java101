package OOP102;

public class Student {
    private String name;
    private String surname;
    private String id;
    private String address;
    private int note;

    public Student(String name,String surname,String id,String address, int note){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.address = address;
        if (note < 0 || note > 100){
            note = 0;
        }
        this.note = note;
    }
    public String getName(){ // private olan nesneleri başka bir classta kullanmak için getter methodu kullanırız.
        return this.name;
    }
    public void setName(String name){ // private olan nesneleri başka bir classta change yapabilmek için setter methodunu kullanırız.
        this.name = name;
    }

    public String getSurname(){

        return this.surname;
    }
    public void setSurname(String surname){

        this.surname = surname;
    }

    public String getId() {

        return id;
    }
    public void setId(String id) {

        this.id = id;
    }

    public String getAddress() {

        return address;
    }
    public void setAddress(String address) {

        this.address = address;
    }

    public int getNote(){

        return note;
    }
    public void setNote(int note){
        if (note < 0 || note > 100){
            note = 0;
        }
        this.note = note;
    }
}