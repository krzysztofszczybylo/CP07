import java.util.ArrayList;

public class Folder
{
    private String name;
    private ArrayList<File> folder;
    public Folder(String name, ArrayList<File> folder){
        this.name = name;
        this.folder = new ArrayList<File>(); 
    }
    public void add(File file){
        this.folder.add(file);
    }
    public void remove(String name){
        for (int i=0; i < this.folder.size(); i++){
            if (this.folder.get(i).getName() == name)
                this.folder.remove(i);
            }
    }
    public static void main(String args[]){
        
        File fi1 = new File("Zdjecie", "jpg", "2");
        File fi2 = new File("Gra", "exe", "231");
        File fi3 = new File("Dane", "csv", "0.43");
        Folder fo1 = new Folder("Nowy folder");
        fo1.add(fi1);
        fo1.add(fi2);
        System.out.println(fo1);
        fo1.add(fi3);
        System.out.println(fo1);
        fo1.remove("Dane");
        System.out.println(fo1);
    }

    
}
