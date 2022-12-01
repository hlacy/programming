import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<City> cityList = CityParsing.parsingCities();
        cityList.forEach(System.out::println);
    }
}