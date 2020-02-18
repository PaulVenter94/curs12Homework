import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String hairColour;

    public Person(String name, int age, String hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getHairColour(), person.getHairColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHairColour());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColour='" + hairColour + '\'' +
                '}';
    }
}
