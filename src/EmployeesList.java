import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeesList {
    private List<Employees> employmentList = new ArrayList<>();

    public EmployeesList(List<Employees> list) {
        this.employmentList = list;
    }

    public List<Employees> richList(int richness) {
        List<Employees> list = new ArrayList<>();
        for (Employees employees : employmentList) {
            if (employees.getSalary() > richness) {
                list.add(employees);
            }
        }
        return list;
    }

    public Map<String, List<String>> companyList() {
        Map<String, List<String>> newMap = new HashMap<>();
        for (Employees employees : employmentList) {
            List<String> list = newMap.get(employees.getCompany());
            if (list == null) {
                list = new ArrayList<>();
                newMap.put(employees.getCompany(), list);
            }
            list.add(employees.getName());
        }
        return newMap;
    }

    public int getSum() {
        int sum = 0;
        for (Employees employees : employmentList) {
            sum += employees.getSalary();
        }
        return sum;
    }

    public String biggestSalary() {
        int salary = 0;
        String name = "";
        for (Employees employees : employmentList) {
            if (employees.getSalary() > salary) {
                salary = employees.getSalary();
                name = employees.getCompany();
            }
        }
        return name;
    }

    private Map<String, List<Integer>> mapSalaries() {
        Map<String, List<Integer>> map = new HashMap<>();
        for (Employees employees : employmentList) {
            List<Integer> list = map.get(employees.getCompany());
            if (list == null) {
                list = new ArrayList<>();
                map.put(employees.getCompany(), list);
            }
            list.add(employees.getSalary());
        }
        return map;
    }

    public String biggestSalaries() {
        String name = "";
        int sum = 0;
        Map<String, List<Integer>> map = mapSalaries();
        for (Map.Entry<String, List<Integer>> tempMap : map.entrySet()) {
            int tempSum = 0;
            for (int i = 0; i < tempMap.getValue().size(); i++) {
                tempSum += tempMap.getValue().get(i);
            }
            if (tempSum > sum) {
                sum = tempSum;
                name = tempMap.getKey();
            }
        }
        return name;
    }
}
