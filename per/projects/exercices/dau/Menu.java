package per.projects.exercices.dau;
import java.util.Scanner;

public class Menu {
    public static int mainMenu(){
        int defaultPlayers = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Jugar");
        System.out.println("2) Max players");
        System.out.println("3) Exit");
        int option = sc.nextInt();
        switch(option){
            case(1): Main.define(); break;
            case(2): defaultPlayers = config(); break;
            case(3): System.exit(0);
            default : mainMenu();
        }
        return defaultPlayers;
    }
    public static int config(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Max Players: ");
        int option = sc.nextInt();
        return option;
    }
}
