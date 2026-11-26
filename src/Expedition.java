public class Expedition{
    public static void main(String[]arg){
        System.out.println("===========================");
        System.out.println("Energy:" + Main.MaxEnergy + "/" + Main.Energy + "   Relics:" + Main.Required_Relic + "/" + Main.Collected_Relics);
        for (int i = 0; i <= Main.row; i++) {
            System.out.print("    ");
            for (int j = 0; j <= Main.collum; j++) {
                System.out.print(" ");
                if (Main.map[Main.posy][Main.posx] == Main.map[i][j]) {System.out.print("@");}
                else if (Main.map[i][j] == 0) {System.out.print("S");}
                else if(Main.map[i][j] == Main.Relic1){System.out.print("R");}
                else if(Main.map[i][j] == Main.Relic2){System.out.print("R");}
                else if(Main.map[i][j] == Main.Relic3){System.out.print("R");}
                else if(Main.map[i][j] == Main.Hazard1){System.out.print("H");}
                else if(Main.map[i][j] == Main.Hazard2){System.out.print("H");}
                else if(Main.map[i][j] == Main.Hazard3){System.out.print("H");}
                else if(Main.map[i][j] == Main.Cache){System.out.print("C");}
                else if(Main.map[i][j] == Main.Exit){System.out.print("X");}
                else {System.out.print(".");}
            }
            System.out.print("\n");
        }
        System.out.println("===========================");
    }
    public static void Ending(){
        System.out.print("=============");
        System.out.print(" ENDED RESULT UNKOWN ");
        System.out.print("=============");
    }
}
