import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MobileManagement {
    public static ArrayList<Mobile> mobiles = new ArrayList<>();


    public static Mobile createMobile(String operation) {
        Scanner sc = new Scanner(System.in);
        if (operation.equalsIgnoreCase("insert") ) {
            System.out.println("Enter mobile id:");
        } else {
            System.out.println("Enter existed mobile id:");
        }

        String id = sc.nextLine();

        System.out.println("Enter mobile  name:");
        String mobileName = sc.nextLine();

        System.out.println("Enter mobile model:");
        int mobileModel = sc.nextInt();

        System.out.println("Enter Model  year:");
        int mobilYear = sc.nextInt();

        System.out.println("Enter mobile memory:");
        int memory = sc.nextInt();

        System.out.println("Enter mobile price");
        int price = sc.nextInt();

        Mobile mb = new Mobile(id, mobileName, mobileModel, mobilYear, memory, price);

        return mb;

    }

    public static void addMobile() {
        System.out.println("* Add new Mobile");
        Mobile a = createMobile("insert");
        mobiles.add(a);
        System.out.println("Mobile added ! ");
        System.out.println(a.toString());
    }

    public static void removeMobile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("* remove mobile");
        System.out.println("* Enter mobile id:");
        String id = sc.nextLine();
        mobiles.removeIf(m -> m.getId().equalsIgnoreCase(id));
        System.out.println("mobile removed !");
    }

    public static void updateMobile() {
        System.out.println("* Update  Mobile ");
        Mobile a = createMobile("update");
        for (Mobile mobile : mobiles) {
            if (mobile.getId().equalsIgnoreCase(a.getId())) {
                mobile.setMobileName(a.getMobileName());
                mobile.setMobileModel(a.getMobileModel());
                mobile.setMobileYear(a.getMobileYear());
                mobile.setMemory(a.getMemory());
                mobile.setPrice(a.getPrice());
                break;
            }
        }
        System.out.println("mobile updated");
    }

    public static void mobileById() {
        System.out.println("Enter mobile id");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

        for (Mobile a : mobiles) {
            if (a.getId().equalsIgnoreCase(id)) {
                System.out.println(a.toString());
            }
        }
    }

    public static void printAll() {
        System.out.println("-------------------------------");
        for (Mobile mb : mobiles) {
            System.out.println(mb.toString());
        }
    }
    public static void loadDB() {
        mobiles.add(new Mobile("1", "iphone", 3, 2007, 16, 1000));
        mobiles.add(new Mobile("2", "iphone", 4, 2009, 16, 2000));
        mobiles.add(new Mobile("3", "iphone", 5, 2011, 32, 3000));
        mobiles.add(new Mobile("4", "iphone", 6, 2013, 64, 4000));
        mobiles.add(new Mobile("5", "iphone", 7, 2014, 64, 5000));
        mobiles.add(new Mobile("6", "iphone", 8, 2016, 128, 6000));
        mobiles.add(new Mobile("7", "iphone", 9, 2018, 256, 7000));
        mobiles.add(new Mobile("8", "iphone", 10,2019, 512, 8000));
    }

    public static void latestMobilVersion() {
        Mobile mb;
        mb = Collections.max(mobiles, Comparator.comparing(m -> m.getMobileYear()));
        System.out.println("The latest Mobile is : "+"id: " + mb.getId()+",Mobile name:"+mb.getMobileName()+", Mobile Model:"+mb.getMobileModel()+",mobileyear:"+mb.getMobileYear()+",memory:"+mb.getMemory()+" GB, price: "+mb.getPrice());
    }
    public static void oldestMobilVersion() {
        Mobile mb;
        mb = Collections.min(mobiles, Comparator.comparing(m -> m.getMobileYear()));
        System.out.println("The older Mobile is : " +"id: "+ mb.getId()+",Mobile name:"+mb.getMobileName()+", Mobile Model:"+mb.getMobileModel()+",mobileyear:"+mb.getMobileYear()+",memory:"+mb.getMemory()+" GB, price: "+mb.getPrice());
    }

}
