import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class  CityParsing {

    private final static String file = "������ �� Java ����.csv";


    private static City parsingLine(String str) {
        String[] data = str.split(";", 6);
        return new City(data[1], data[2], data[3], Long.parseLong(data[4]), data[5]);
    }

    public static List<City> parsingCities() {
        List<City> cityList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(file));
            while (scanner.hasNextLine()) {
                cityList.add(parsingLine(scanner.nextLine()));
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return cityList;
    }

    //sorting list by name using lambda
    public static List<City> sortByNameLambda(List<City> cityList) {
        cityList.sort((c1, c2) -> (c1.getName().compareToIgnoreCase(c2.getName())));
        return cityList;
    }

    //sorting list by name using Comparator

    public static List<City> sortByNameComparator(List<City> cityList){
        Collections.sort(cityList, new Comparator<City>() {
            @Override
            public int compare(City c1, City c2) {
                return c1.getName().compareToIgnoreCase(c2.getName());
            }
        });
        return cityList;
    }


    //sorting by federal district and name using Comparator
    public static void sortByDistrictAndNameComparator(List<City> cityList){
        cityList.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
    }

}