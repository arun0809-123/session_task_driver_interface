import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Driver driver1=new Driver();
        Driver driver=new Driver(19347085,"arun janyshbekov", (byte) 16,'m',"arun@gmail.com",12345L,1.3);
        System.out.println(driver);
        driver1.favoriteSport();
        driver1.favoriteLanguage();
        driver1.favoriteMouth();
        driver1.getLastName();
        System.out.println(" ");
        Doctor doctors=new Doctor();
        Doctor doctor=new Doctor(1964533,"altyn shakirav",(byte) 16,'m',"altyn@gmail.com",15354L,1.5);
        System.out.println(doctor);
        doctors.favoriteSport();
        doctors.favoriteLanguage();
        doctors.favoriteMouth();
        doctors.getLastName();
        System.out.println(" ");
        Programmer programmers=new Programmer();
        Programmer programmer=new Programmer(184653,"jalilava jainabek",(byte)29,'d',"jalilava@gmail.com",19737,1.9 );
        System.out.println(programmer);
        programmers.favoriteSport();
        programmers.favoriteLanguage();
        programmers.favoriteMouth();
        programmers.getLastName();
        sortoo();
    }
    public static void sortoo(){
        Driver driver=new Driver(19347085,"arun janyshbekov", (byte) 16,'m',"arun@gmail.com",12345L,1.3);
        Doctor doctor=new Doctor(1964533,"altyn shakirav",(byte) 16,'m',"altyn@gmail.com",15354L,1.5);
        Programmer programmer=new Programmer(184653,"jalilava jainabek",(byte)29,'d',"jalilava@gmail.com",19737,1.9 );
        Scanner scanner=new Scanner(System.in);
        while (true){
            String s= scanner.next();
            switch (s){
                case "driver":
                    System.out.println(driver);
                    break;
                case "doctor":
                    System.out.println(doctor);
                    break;
                case "programmer":
                    System.out.println(programmer);
                    break;
                default:
                    System.out.println("???");
            }
        }
    }
}