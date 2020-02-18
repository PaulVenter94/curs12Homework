import java.util.*;

public class PersonList {
    private Set<Person> people;

    public PersonList(Set<Person> people) {
        this.people = people;
    }

    public PersonList() {
        this.people = new HashSet<>();
    }

    public Set<String> extractNames() {
        Set<String> nameList = new HashSet<>();
        for (Person elem : this.people) {
            nameList.add(elem.getName());
        }
        return nameList;
    }

    public Map<String, Integer> mapNameAge() {
        Map<String, Integer> map = new HashMap<>();
        for (Person person : people) {
            map.put(person.getName(), person.getAge());
        }
        return map;
    }

    public Set<Person> extractOlder(int age) {
        Set<Person> older = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() > age) {
                older.add(person);
            }
        }
        return older;
    }

    public Map<String, List<String>> mapColour() {
        Map<String, List<String>> map = new HashMap<>();
        for (Person person : people) {
            List<String> list = map.get(person.getHairColour());
            if (list == null){
                list=new ArrayList<>();
                map.put(person.getHairColour(),list);
            }
            list.add(person.getName());
        }
        return map;
    }
    public Map<Integer, List<String>> mapAge() {
        Map<Integer, List<String>> map = new HashMap<>();
        for (Person person : people) {
            List<String> list = map.get(person.getAge());
            if (list == null){
                list=new ArrayList<>();
                map.put(person.getAge(),list);
            }
            list.add(person.getName());
        }
        return map;
    }
}
