import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {



            MobileManagement.loadDB();
            MobileManagement.printAll();
            while(true){
                Scanner sc = new Scanner(System.in);
                System.out.println("What do you want to do ?");
                System.out.println("1 -Add new mobile");
                System.out.println("2 -Remove mobile");
                System.out.println("3 -Update mobile");
                System.out.println("4 -Find latest Mobile version");
                System.out.println("5 -Find oldest Mobile version");
                System.out.println("6 -Print all mobile ");
                System.out.println("7 -Find mobile by id");
                System.out.println("0. Exit");

                int choice = sc.nextInt();
                choosing(choice);
            }
        }
        public static void choosing(int choice){
            switch (choice){
                case 1:
                    MobileManagement.addMobile();
                    break;
                case 2:
                    MobileManagement.removeMobile();
                    break;
                case 3:
                    MobileManagement.updateMobile();
                    break;
                case 4:
                    MobileManagement.latestMobilVersion();
                    break;
                case 5:
                    MobileManagement.oldestMobilVersion();
                    break;
                case 6:
                    MobileManagement.printAll();
                    break;
                case 7:
                    MobileManagement.mobileById();
                    break;

                default :
                    System.exit(0);
            }
        }
    }

