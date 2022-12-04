import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //3 path. Printing list of cities
        List<City> cityList = CityParsing.parsingCities();
        cityList.forEach(System.out::println);

        //5 path. Sorting list by name of cities
        List<City> cityListSorted = CityParsing.sortByNameLambda(cityList);
        cityList.forEach(System.out::println);

        //5 path. Sorting list by name in region
        List<City> cityList5 = CityParsing.parsingCities();
        CityParsing.sortByDistrictAndNameComparator(cityList5);
        cityList5.forEach(System.out::println);

        //7 path. Searching max population and displaying it
        List<City> cityList7 = CityParsing.parsingCities();
        CityParsing.searchMaxPopulation(cityList7);

        //9 path. Printing list of numbers of cities in region
        List<City> cityList9 = CityParsing.parsingCities();
        CityParsing.searchCitiesInRegion(cityList9);
    }
}