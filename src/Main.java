import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<Car,CarInfo> cars =new HashMap<>();
        cars.put(new Car(1,253435),new CarInfo(2003,"Audi",4000,"Black"));
        cars.put(new Car(4,456557),new CarInfo(2006,"Mers",5000,"blue"));
        cars.put(new Car(2,354569),new CarInfo(2005,"bmw",4500,"black"));
        cars.put(new Car(3,654345),new CarInfo(2001,"lada",2000,"white"));


        for(Map.Entry entry:cars.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
//        cars.forEach(
//                (key, value) -> {
//            System.out.println(key);
//            System.out.println(value);
//        }
//        );
    }
}