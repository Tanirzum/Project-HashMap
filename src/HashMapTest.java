import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {
    public static void main(String[] args) {
        infoPeople();
    }

    public static void infoPeople() {
        HashMap<Integer, People> hashMap = new HashMap();
        Scanner scanner = new Scanner(System.in);

        hashMap.
                put(1, new People("Tanirbergen", "Zamanbek", 18));
        hashMap.put(2, new People("Aman", "Otepbergen", 27));
        hashMap.put(3, new People("Imantai", "Zamanbek", 28));
        hashMap.put(4, new People("Almas", "Bakhytbek", 24));
        hashMap.put(5, new People("Bolatbek", "Nursapa", 45));

        while (true) {
            System.out.println("Пишите id человека и получите данные");
            int idHuman = scanner.nextInt();
            if (idHuman == 1) {
                System.out.println(hashMap.get(1));
            } else if (idHuman == 2) {
                System.out.println(hashMap.get(2));
            } else if (idHuman == 3) {
                System.out.println(hashMap.get(3));
            } else if (idHuman == 4) {
                System.out.println(hashMap.get(4));
            } else if (idHuman == 5) {
                System.out.println(hashMap.get(5));
            } else {
                System.out.println("Такого id нет в базе");
                break;
            }
        }
    }
}
