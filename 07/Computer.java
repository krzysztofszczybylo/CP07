
public class Computer
{
   private Processor cpu;
   private String owner;
   private boolean isOn;
   
   public Computer(Processor cpu, String owner, boolean isOn){
       this.cpu = cpu;
       this.owner = owner;
       this.isOn = isOn;
   }
   private boolean turnOn(boolean isOn){
       isOn = true;
       return isOn;
   }
   public String toString(){
       return("CPU: " + cpu + "\nOwner: " + owner + "\nIs on: " + isOn); 
   }
   public static void main(String args[]){
       Processor p = new Processor("Intel Core i5", 3.25, 4);
       Computer c = new Computer(p, "Michał", true);
       System.out.println(c);
   }
}
