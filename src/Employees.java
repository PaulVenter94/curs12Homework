import java.util.Objects;
import java.util.Set;

public class Employees extends Person {
    private final String company;
    private final int salary;

    public Employees(String name, int age, String hairColour, String company, int salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;
        if (!super.equals(o)) return false;
        Employees employees = (Employees) o;
        return getSalary() == employees.getSalary() &&
                Objects.equals(getCompany(), employees.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCompany(), getSalary());
    }

    @Override
    public String toString() {
        return super.toString()+" Employees{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                "} " ;
    }
}
