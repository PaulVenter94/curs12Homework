import java.util.HashMap;
import java.util.Map;

public class Ex1Maps {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Paul", 5);
        students.put("Razvan", 3);
        students.put("Larisa", 10);
        students.put("Rares", 7);
        System.out.println(students);
        System.out.println(findHighest(students));
    }

    public static String findHighest(Map<String, Integer> newMap) {
        String name = "";
        int grade = 0;
        for (Map.Entry<String, Integer> elem : newMap.entrySet()) {
            if (elem.getValue() > grade) {
                grade = elem.getValue();
                name = elem.getKey();
            }
        }
        return name;
    }
}
