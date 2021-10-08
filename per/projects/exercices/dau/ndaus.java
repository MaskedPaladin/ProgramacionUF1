package per.projects.exercices.dau;

import java.util.Scanner;

public class ndaus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vegades: ");
        int vegadas = sc.nextInt();
        int dos = 0;
        int tres = 0;
        int quatre = 0;
        int cinc = 0;
        int sis = 0;
        int set = 0;
        int vuit = 0;
        int nou = 0;
        int deu = 0;
        int onze = 0;
        int dotze = 0;
        for(int i = 0; i<vegadas;i++){
            int dau1 = (int) (Math.random()*6+1);
            int dau2 = (int) (Math.random()*6+1);
            int valor = dau1+dau2;
            switch(valor){
                case(2) : dos++; break;
                case(3) : tres++; break;
                case(4) : quatre++; break;
                case(5) : cinc++; break;
                case(6) : sis++; break;
                case(7) : set++; break;
                case(8) : vuit++; break;
                case(9) : nou++; break;
                case(10) : deu++; break;
                case(11) : onze++; break;
                case(12) : dotze++; break;
            }
            
        }
        System.out.println("2) "+dos+"\n3) "+tres+"\n4) "+quatre+"\n5) "+cinc+"\n6) "+sis+"\n7) "+set+"\n8) "+vuit+"\n9) "+nou+"\n10) "+deu+"\n11) "+onze+"\n12) "+dotze);
    }
}
