import java.util.*;

public class CarShop {
    private List<Car> carList;

    public CarShop(List<Car> carList) {
        this.carList = carList;
    }

    public Map<String, Integer> noOfCars() {
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> elem : mapNoOfCars().entrySet()) {
            newMap.put(elem.getKey(), elem.getValue().size());
        }
        return newMap;
    }

    public Map<String, List<Integer>> carKm() {
        Map<String, List<Integer>> map = new HashMap<>();
        for (Car car : carList) {
            List<Integer> list = map.get(car.getName());
            if (list == null) {
                list = new ArrayList<>();
                map.put(car.getName(), list);
            }
            list.add(car.getKm());
        }
        return map;
    }

    public Map<List<Integer>, List<Car>> kmRange() {
        Map<List<Integer>, List<Car>> map = new HashMap<>();
        for (Car car : carList) {
            List<Car> list = map.get(getRange(car));
            if (list == null) {
                list = new ArrayList<>();
                map.put(getRange(car), list);
            }
            list.add(car);
        }
        return map;
    }
    public Map<List<Integer>, List<Car>> priceRange() {
        Map<List<Integer>, List<Car>> map = new HashMap<>();
        for (Car car : carList) {
            List<Car> list = map.get(getPrice(car));
            if (list == null) {
                list = new ArrayList<>();
                map.put(getPrice(car), list);
            }
            list.add(car);
        }
        return map;
    }

    private Map<String, List<Integer>> mapNoOfCars() {
        Map<String, List<Integer>> map = new HashMap<>();
        for (Car car : carList) {
            List<Integer> counter = map.get(car.getName());
            if (counter == null) {
                counter = new ArrayList<>();
                map.put(car.getName(), counter);
            }
            counter.add(1);
        }
        return map;
    }

    private List<Integer> getRange(Car car) {
        List<Integer> list = new ArrayList<>();
        list.add((car.getKm() / 10000) * 10000);
        list.add(((car.getKm() / 10000) + 1) * 10000);
        return list;
    }

    private List<Integer> getPrice(Car car) {
        List<Integer> list = new ArrayList<>();
        list.add((car.getPrice() / 1000) * 1000);
        list.add(((car.getPrice() / 1000) + 1) * 1000);
        return list;
    }
}
