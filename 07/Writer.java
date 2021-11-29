
public class Writer
{
    private String name;
    private String surname;
    private int age;
    private String adress;
    
    public Writer(String name, String surname, int age, String adress){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }
    
    private void writeBook(){
        System.out.println("Writing...");
    }
    
    public String toString(){
        return("Name :" + name + surname + "\nAge :" + age + "\nAdress :" + adress);
        

    }
}
