
public class File
{
    private String name;
    private String extension;
    private String sizeMB;
    
    public File(String name, String extension, String sizeMB){
        this.name = name;
        this.extension = extension;
        this.sizeMB = sizeMB;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return("Name: " + name + "." + extension + "\nSize: " + sizeMB + "MB");
    }
    
}
