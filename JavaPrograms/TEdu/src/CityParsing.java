import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  CityParsing {

    private final static String file = new String("Задача ВС Java Сбер.csv");


    private static City parsingLine(String str){
        String[] data = str.split(";", 6);
        return new City(data[1], data[2], data[3], Long.parseLong(data[4]), data[5]);
    }

    public static List<City> parsingCities() {
        List<City> cityList = new  ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(file));
            while (scanner.hasNextLine()){
                cityList.add(parsingLine(scanner.nextLine()));
            }
            scanner.close();
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        return cityList;
    }
}
