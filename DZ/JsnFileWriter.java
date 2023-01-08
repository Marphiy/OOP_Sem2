
import java.util.HashMap;
import java.util.Map;

public class JsnFileWriter extends Writer{
    private Map<String, Double> studMap = new HashMap<>();
    
    public JsnFileWriter(Map<String, Double> studMap) {
        super(studMap);
        this.studMap = studMap;
    
    }

    public String getString() {
        String str = studMap.toString().replace(", ", ",\n\t\"");
        str = str.replace("=", "\": ");
        str = str.replace("{", "{\n\t\"");
        return str.replace("}", "\n}");     
    }    
}
