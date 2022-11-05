import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class _9_11_reading_html {
    public static void work(){
//        String htmlFile = parsingHtml("data/skillbox_site.html");
        String htmlFile = "data/skillbox_site.html";
//        String siteFile = "https://skillbox.ru/";

        Document doc = Jsoup.parse(htmlFile, "skillbox.ru");
        Elements elements = doc.select("h1");
        System.out.println(elements + "1");

//        System.out.println(htmlFile);
    }

    public static String parsingHtml(String path){
        StringBuilder stringBuilder = new StringBuilder();

        try {
            List<String> stringList = Files.readAllLines(Paths.get(path));
            stringList.forEach(line -> stringBuilder.append(line + "\n"));
        }catch (Exception e){
            e.printStackTrace();
        }


        return path;
    }
}
