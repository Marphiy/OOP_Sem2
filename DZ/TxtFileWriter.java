import java.util.HashMap;
import java.util.Map;

public class TxtFileWriter extends Writer{
    private Map<String, Double> studMap = new HashMap<>();

    public TxtFileWriter(Map<String, Double> studMap) {
        super(studMap);
        this.studMap = studMap;
    }

    @Override
    public String getString() {
        String str = studMap.toString().replace("{", "");
        str = str.replace(", ", "\n");

        return str.replace("}", "");
    }
    
    
}
