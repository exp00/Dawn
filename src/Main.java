import java.util.Scanner;

public class Main {

    public static int Required_Relic = 3;
    public static int posx = 0;
    public static int posy = 0;
    public static int Collected_Relics = 0;
    public static int Relic1;
    public static int Relic2;
    public static int Relic3;
    public static int Hazard1;
    public static int Hazard2;
    public static int Hazard3;
    public static int Exit;
    public static int Cache;
    public static int UnCollected_Cache = 1;
    public static int Collected_Cache = 0;
    public static boolean GameActive = false;
    public static int row;
    public static int collum;
    public static int[][] map;
    public static int MaxEnergy;
    public static int Energy;


    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("           DAWN");
        System.out.println("        MAIN  MENU");
        System.out.println("1)New Game      2)Exit Game");
        System.out.println("===========================");
        int temporary = sc.nextInt();
        if (temporary == 2) {
            System.out.println("===========================");
            System.out.println("          GOODBYE");
            System.out.println("===========================");
            return;
        }
        GameActive = true;
        row = Rando.r(12, 5);
        collum = Rando.r(12, 5);
        map = new int [row+1][collum+1];
        temporary = 1;
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= collum; j++) {
                map[i][j] = temporary;
                temporary++;
            }
        }

        Relic1 = Rando.r(row*collum,2);
        Relic2 = Rando.r(row*collum,2);
        Relic3 = Rando.r(row*collum,2);
        while(true){
            if(Relic1==Relic2){Relic2 = Rando.r(row*collum,2);continue;}
            if(Relic1==Relic3){Relic3 = Rando.r(row*collum,2);continue;}
            if(Relic2==Relic3){Relic3 = Rando.r(row*collum,2);continue;}
            break;
        }

        Hazard1 = Rando.r(row*collum,2);
        Hazard2 = Rando.r(row*collum,2);
        Hazard3 = Rando.r(row*collum,2);
        while(true){
            if(Hazard1==Hazard2){Hazard2 = Rando.r(row*collum,2);continue;}
            if(Hazard1==Hazard3){Hazard3 = Rando.r(row*collum,2);continue;}
            if(Hazard2==Hazard3){Hazard3 = Rando.r(row*collum,2);continue;}
            if(Hazard1==Relic1){Hazard1 = Rando.r(row*collum,2);continue;}
            if(Hazard1==Relic2){Hazard1 = Rando.r(row*collum,2);continue;}
            if(Hazard1==Relic3){Hazard1 = Rando.r(row*collum,2);continue;}
            if(Hazard2==Relic1){Hazard2 = Rando.r(row*collum,2);continue;}
            if(Hazard2==Relic2){Hazard2 = Rando.r(row*collum,2);continue;}
            if(Hazard2==Relic3){Hazard2 = Rando.r(row*collum,2);continue;}
            if(Hazard3==Relic1){Hazard3 = Rando.r(row*collum,2);continue;}
            if(Hazard3==Relic2){Hazard3 = Rando.r(row*collum,2);continue;}
            if(Hazard3==Relic3){Hazard3 = Rando.r(row*collum,2);continue;}
            break;
        }

        Exit = Rando.r(row*collum,2);
        while(true){
            if(Exit==Hazard1){Exit = Rando.r(row*collum,2);continue;}
            if(Exit==Hazard2){Exit = Rando.r(row*collum,2);continue;}
            if(Exit==Hazard3){Exit = Rando.r(row*collum,2);continue;}
            if(Exit==Relic1){Exit = Rando.r(row*collum,2);continue;}
            if(Exit==Relic2){Exit = Rando.r(row*collum,2);continue;}
            if(Exit==Relic3){Exit = Rando.r(row*collum,2);continue;}
            break;
        }

        Cache = Rando.r(row*collum,2);
        while(true){
            if(Cache==Hazard1){Cache = Rando.r(row*collum,2);continue;}
            if(Cache==Hazard2){Cache = Rando.r(row*collum,2);continue;}
            if(Cache==Hazard3){Cache = Rando.r(row*collum,2);continue;}
            if(Cache==Relic1){Cache = Rando.r(row*collum,2);continue;}
            if(Cache==Relic2){Cache = Rando.r(row*collum,2);continue;}
            if(Cache==Relic3){Cache = Rando.r(row*collum,2);continue;}
            if(Cache==Exit){Cache = Rando.r(row*collum,2);continue;}
            break;
        }

        map[0][0] = 0;
        MaxEnergy = 4 * row * collum;
        Energy = MaxEnergy;
        while(GameActive) {
            if(Energy==0 || map[posy][posx] == Exit){Expedition.Ending();GameActive=false;break;}
            Expedition.main(null);
            System.out.print("1)Left2)Right3)Up4)Down");
            temporary = sc.nextInt();
            if (temporary == 1){posx--;}
            if (temporary == 2){posx++;}
            if (temporary == 3){posy--;}
            if (temporary == 4){posy++;}
            if(map[posy][posx] == Relic1){Collected_Relics++;Relic1=-2;}
            if(map[posy][posx] == Relic2){Collected_Relics++;Relic2=-2;}
            if(map[posy][posx] == Relic3){Collected_Relics++;Relic3=-2;}
            if(map[posy][posx] == Hazard1){Energy=Energy-2;}
            if(map[posy][posx] == Hazard2){Energy=Energy-2;}
            if(map[posy][posx] == Hazard3){Energy=Energy-2;}
            if(map[posy][posx] == Cache){Energy=Energy+5;}
            Energy=Energy-1;
        }
    }
}
