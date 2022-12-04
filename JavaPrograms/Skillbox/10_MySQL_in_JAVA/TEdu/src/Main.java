import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cityList = CityParsing.parsingCities();

//        List<City> cityListSorted = CityParsing.sortByNameLambda(cityList);
//        cityList.forEach(System.out::println);
//
//        System.out.println();
//
//        List<City> cityList3 = CityParsing.parsingCities();
//        CityParsing.sortByDistrictAndNameComparator(cityList3);
//        cityList3.forEach(System.out::println);
//        CityParsing.searchMaxPopulation(cityList);
        CityParsing.searchCitiesInRegion(cityList);
    }
}