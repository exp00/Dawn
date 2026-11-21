import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        /*okay so since pdf is so confusing to read i assume wejsut
        have the ints ready for stage 1 */
        int [] position = {0,0};//the character
        int Required_Relic = 3;
        int Collected_Relics = 0;
        int UnCollected_Cache = 1;
        int Collected_Cache = 0;
        int Hazard = 3;
        boolean GameActive = false;
        System.out.println("===========================");
        System.out.println("           DAWN");
        System.out.println("        MAIN  MENU");
        System.out.println("1)New Game      2)Exit Game");
        System.out.println("===========================");
        int main = sc.nextInt();
        if(main==2){
            System.out.println("===========================");
            System.out.println("          GOODBYE");
            System.out.println("===========================");
            return;
        }
        int row = random(12);
        int collum = random(12);
        int MaxEnergy = 4*row*collum;
        int Energy = MaxEnergy;
        System.out.println("===========================");
        System.out.println("Energy:"+MaxEnergy+"/"+Energy+"   Relics:"+Required_Relic+"/"+Collected_Relics);
        System.out.println("      MAP PLACEHOLDER");
        System.out.println("===========================");
    }
    public static int random(int a){
        Random r = new Random();
        while(true) {
            int b = r.nextInt(a);
            if (b >= 5) {return (b);}
        }
    }
}
