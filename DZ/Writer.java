import java.util.*;
import java.io.*;

public abstract class Writer{
    
    private Map<String, Double> studMap = new HashMap<>();

    public Writer(Map<String, Double> studMap) {
        this.studMap = studMap;
    }

    public abstract String getString();

    public void WriteFile(String fileName, String string){
        try(FileWriter writer = new FileWriter(fileName))
        {
            writer.write(string);
            writer.flush();
        }
        catch(IOException ex){            
            System.err.println(ex.getMessage());
        } 
    }   

}