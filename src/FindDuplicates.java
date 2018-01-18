import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    String[] strings = {"Hi", "Hi", "Hola", "Bonjour"};

    public String getDuplicateNames(String[] strings) {
    Set set = new HashSet();
    String duplicateNames = "";
        for (String name: strings) {
        if (set.add(name) == false) {
            duplicateNames += "\n" + name;
            }
        }
        return duplicateNames;

    }

}

