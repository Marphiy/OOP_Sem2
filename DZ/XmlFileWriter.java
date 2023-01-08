
import java.util.*;


public class XmlFileWriter extends Writer{
    private Map<String, Double> studMap = new HashMap<>();
    
    public XmlFileWriter(Map<String, Double> studMap) {
        super(studMap);
        this.studMap = studMap;
    
    }

    public String getString() {
        String str = "<?xml version=\"1.0\" encoding=\"utf8\"?>\n<data>\n";
        Iterator iterator = studMap.keySet().iterator();
        while(iterator.hasNext()){
            Object key   = iterator.next();
            Object value = studMap.get(key);
            String newstr = String.format("\t<student>\n\t\t<name>%s</name>\n" + 
                        "\t\t<grade>%s</grade>\n\t</student>\n", key, value);
            str += newstr;

        }
        str += "</data>";

        return str;     
    }

}
