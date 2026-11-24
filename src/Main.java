import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        /*okay so since pdf is so confusing to read i assume wejsut
        have the ints ready for stage 1 */
        int [][] position;
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
        int [][] map = new int[row+1][collum+1];
        for(int i=0;i<=row;i++){
            for (int j=0;j<=collum;j++){
                map [i][j] = 0;
            }
        }
        for(int i=0;i<=row;i++){
            for(int j=0;j<=collum;j++){
                while(true){
                    int a = r.nextInt(row*collum);
                    for(int b = 0;b<=row;b++){
                        for(int c = 0;c<=collum;c++){
                            if(map[b][c]==a){a=0;}
                            if(a!= 0){map[i][j]=a;break;}
                        }
                    }
                }
            }
        }
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
