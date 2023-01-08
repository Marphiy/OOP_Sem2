
import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> studMap = new HashMap<>(Map.of("Иванов Антон", 4.2, 
                "Дмитриева Оксана", 3.7, "Децибелов Аргентин", 5.0));
        System.out.println(studMap);
        JsnFileWriter jfw = new JsnFileWriter(studMap);
        TxtFileWriter tfw = new TxtFileWriter(studMap);
        XmlFileWriter xfw = new XmlFileWriter(studMap);
        jfw.WriteFile("file1.json", jfw.getString());
        tfw.WriteFile("file.txt", tfw.getString());
        xfw.WriteFile("file.xml", xfw.getString());

    }
}
