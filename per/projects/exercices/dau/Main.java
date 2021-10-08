package per.projects.exercices.dau;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Daus");
        System.out.println("2) Parchis");
        System.out.println("3) Tic Tac Toe");
        System.out.println("4) Exit");
        int option = sc.nextInt();
        switch (option){
            case(1) : daus(0,0);
            case(2) : main(null);
            case(3) : main(null);
            case(4) : System.exit(0);
            default: main(null);
        }
    }
    public static void daus(int ganadas1, int ganadas2){
        Scanner sc = new Scanner(System.in);
        JocDaus player1 = new JocDaus(new Dau[]{new Dau(0), new Dau(0), new Dau(0)});
        JocDaus player2 = new JocDaus(new Dau[]{new Dau(0), new Dau(0), new Dau(0)});
        boolean running = true;
        while(running){
            Dau[] p1newdaus = player1.jugar();
            player1.setDaus(p1newdaus);
            System.out.println("Player1: "+player1.getDaus()[0].getValor()+" "+player1.getDaus()[1].getValor()+" "+player1.getDaus()[2].getValor());
            Dau[] p2newdaus = player2.jugar();
            player2.setDaus(p2newdaus);
            System.out.println("Player2: "+player2.getDaus()[0].getValor()+" "+player2.getDaus()[1].getValor()+" "+player2.getDaus()[2].getValor());
            if(player1.getDaus()[0].getValor()==player1.getDaus()[1].getValor()&&player1.getDaus()[1].getValor()==player1.getDaus()[2].getValor()){
                ganadas1++;
                System.out.print("Jugar de nuevo 1)Si 2)Other: ");
                int option = sc.nextInt();
                switch(option){
                    case(1) : daus(ganadas1, ganadas2); break;
                    case(2) : System.out.println("GanadasP1: "+ganadas1+"\nGanadasP2: "+ganadas2); running=false;
                    default : System.out.println("GanadasP1: "+ganadas1+"\nGanadasP2: "+ganadas2); running=false;
                }
            }
            if(player2.getDaus()[0].getValor()==player2.getDaus()[1].getValor()&&player2.getDaus()[1].getValor()==player2.getDaus()[2].getValor()){
                ganadas2++;
            }
            sc.nextLine();
        }
    }
}