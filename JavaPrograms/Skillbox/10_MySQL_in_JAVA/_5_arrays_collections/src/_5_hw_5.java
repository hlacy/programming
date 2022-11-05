import java.util.*;

import static java.util.Collections.*;

public class _5_hw_5 {
    public static void todo(){
        String chars = new String("ABCEHKMOPTXY");
        ArrayList<String> carNumbers = new ArrayList<>();
        int i = 0;
        while (i < (chars.length() - 2)){
            int j = 1;
            while (j <= 9){
                int k = 1;
                while (k <= 199){
                    String carNumber = new String();
                    if (k <= 9){
                        carNumber = chars.charAt(i) + String.valueOf(j) + String.valueOf(j) + String.valueOf(j) +
                                chars.charAt(i + 1) + chars.charAt(i + 2) + "0" + String.valueOf(k);
                    } else {
                        carNumber = chars.charAt(i) + String.valueOf(j) + String.valueOf(j) + String.valueOf(j) +
                                chars.charAt(i + 1) + chars.charAt(i + 2) + String.valueOf(k);
                    }
                    carNumbers.add(carNumber);
                    System.out.println(carNumber);
                    k++;
                }
//                k = 1;
                j++;
            }
//            j = 1;
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String outerNumber = scanner.nextLine();
            if (outerNumber.equalsIgnoreCase("stop")) break;

            long timeContainStart = System.nanoTime();
            if (carNumbers.contains(outerNumber)) {
                System.out.println(1);
                long timeContainEnd = System.nanoTime() - timeContainStart;
                System.out.println("direct search is successfully completed,  it takes: " + timeContainEnd);
            }

            long timeBinaryStart = System.nanoTime();
            if (Collections.binarySearch(carNumbers, outerNumber) >= 0) {
                System.out.println("3");
                long timeBinaryEnd = System.nanoTime() - timeBinaryStart;
                System.out.println("binary search is successfully completed,  it takes: " + timeBinaryEnd);
            }

            System.out.println(Collections.binarySearch(carNumbers, outerNumber));
            TreeSet<String> treeSet = new TreeSet<>();
            HashSet<String> hashSet = new HashSet<>();

            treeSet.addAll(carNumbers);
            hashSet.addAll(carNumbers);

            long timeTreeStart = System.nanoTime();
            if (treeSet.contains(outerNumber)) {
                long timeTreeEnd = System.nanoTime() - timeBinaryStart;
                System.out.println("Tree search is successfully completed,  it takes: " + timeTreeEnd);
            }


            long timeHashStart = System.nanoTime();
            if (hashSet.contains(outerNumber)) {
                long timeHashEnd = System.nanoTime() - timeBinaryStart;
                System.out.println("Hash search is successfully completed,  it takes: " + timeHashEnd);
            }

            System.out.println(2);
        }
    }
}
