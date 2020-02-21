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
        CarShop carShop = new CarShop(getCarList());
        System.out.println(carShop.noOfCars());
        System.out.println(carShop.carKm());
        Car car = getCarList().get(1);
        System.out.println(car.getKm());
        System.out.println(carShop.kmRange());
        System.out.println(carShop.priceRange());
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

    public static List<Car> getCarList() {
        Car car = new Car("Audi", 5, 8000, 15_200);
        Car car1 = new Car("BMW", 6, 1156, 15_500);
        Car car2 = new Car("Mercedes", 15, 301_000, 5_300);
        Car car3 = new Car("VW", 5, 123_000, 10_000);
        Car car4 = new Car("Audi", 11, 308_000, 5_600);
        Car car5 = new Car("Audi", 3, 62_000, 20_000);
        List<Car> list = new ArrayList<>();
        list.add(car);
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        return list;
    }
}
