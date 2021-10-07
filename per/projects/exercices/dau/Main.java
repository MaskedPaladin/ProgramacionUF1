package per.projects.exercices.dau;
import per.projects.exercices.dau.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        define();
    }
    public static void define(){
        int playerQ = Menu.mainMenu();
        Player[] players = new Player[playerQ];
        JocDaus[] jocdaus = new JocDaus[playerQ];
        for(int i = 0; i<playerQ;i++){
            jocdaus[i] = new JocDaus();
            jocdaus[i].setDaus(6, 0);
        }
        jugar(playerQ, players, jocdaus);
    }
    public static void jugar(int playerq, Player[] players, JocDaus[] jocdaus){
        boolean run = true;
        while(run){
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i<playerq;i++){
                jocdaus[i].jugar();
                System.out.println("Player"+(i+1)+"lanza "+jocdaus[i].toString());
                if(jocdaus[i].getDaus()[0].getValor()==jocdaus[i].getDaus()[1].getValor()&&jocdaus[i].getDaus()[1].getValor()==jocdaus[i].getDaus()[2].getValor()){
                    players[i].setGanadas(players[i].getGanadas()+1);
                    players[i].setJugadas(players[i].getJugadas()+1);
                    for(int j = 0; i<playerq;j++){
                        if(j!=i){
                            int jugadas = players[i].getJugadas();
                            int perdidas = players[i].getPerdidas();
                            players[i].setJugadas(jugadas+1);
                            players[i].setPerdidas(perdidas+1);
                        }
                    }
                    System.out.print("Play another game: ");
                    String option = sc.next();
                    if(option.equals("y")){
                        jugar(playerq, players, jocdaus);
                    }
                    else{
                        define();
                    }
                }
                sc.nextLine();
            }
        }
    }
}
