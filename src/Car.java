import java.util.Objects;

public class Car {
    private final String name;
    private final int age;
    private final int km;
    private final int price;

    public Car(String name, int age, int km, int price) {
        this.name = name;
        this.age = age;
        this.km = km;
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getKm() {
        return km;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getAge() == car.getAge() &&
                getKm() == car.getKm() &&
                getPrice() == car.getPrice() &&
                Objects.equals(getName(), car.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getKm(), getPrice());
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", km=" + km +
                ", price=" + price +
                '}';
    }
}
