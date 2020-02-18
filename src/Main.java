import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PersonList personList = new PersonList(createList());
        System.out.println(personList.extractNames());
        System.out.println(personList.mapNameAge());
        System.out.println(personList.extractOlder(25));
        System.out.println(personList.mapColour());
        System.out.println(personList.mapAge());
        EmployeesList employeesList = new EmployeesList(getEmploymentList());
        System.out.println(employeesList.richList(5000));
        System.out.println(employeesList.companyList());
        System.out.println(employeesList.getSum());
        System.out.println(employeesList.biggestSalary());
        System.out.println(employeesList.biggestSalaries());
    }

    public static Set<Person> createList() {
        Person person = new Person("Andrei", 26, "Brunet");
        Person person2 = new Person("Paul", 18, "Blond");
        Person person3 = new Person("Rares", 26, "Blond");
        Person person4 = new Person("Raul", 33, "Roscat");
        Person person5 = new Person("Larisa", 26, "Brunet");
        Set<Person> list = new HashSet<>();
        list.add(person);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        return list;
    }

    public static List<Employees> getEmploymentList() {
        Employees employees = new Employees("Andrei", 26, "Brunet", "Microsoft", 44000);
        Employees employees2 = new Employees("Raul", 18, "Blond", "Microsoft", 4000);
        Employees employees3 = new Employees("Paul", 22, "Blond", "Google", 3000);
        Employees employees4 = new Employees("Paula", 45, "Brunet", "Apple", 45000);
        Employees employees5 = new Employees("Vali", 34, "Roscat", "Google", 10000);
        Employees employees6 = new Employees("Nicolae", 26, "Brunet", "Samsung", 15000);
        Employees employees1 = new Employees("Raul", 18, "Blond", "Apple", 2000);
        List<Employees> list = new ArrayList<>();
        list.add(employees);
        list.add(employees2);
        list.add(employees3);
        list.add(employees4);
        list.add(employees5);
        list.add(employees6);
        list.add(employees1);
        return list;
    }
}
