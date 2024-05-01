import java.io.*;
import java.util.*;

public class gridMaker {
    public static void main(String[] args) throws IOException {
        String grid1 = "grid1.txt";
        String grid2 = "grid2.txt";
        boolean type = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Horizontal Length of grid (from left to right):");
        int gridX = input.nextInt();
        System.out.println("Vertical Length of grid (from top to bottom):");
        int gridY = input.nextInt();
        gridGen(grid1, gridX, gridY, type);
        type = false;
        gridGen(grid2, gridX, gridY, type);
        input.close();
    }

    public static void gridGen(String fileName, int gridX, int gridY, boolean type)  throws IOException {
        File file = new File(fileName);
        @SuppressWarnings("resource")
        PrintStream output = new PrintStream(new FileOutputStream(file), true, "UTF-8");
        output.print("<line-height=12px>");
        int spc = 0;
        if (type == true) {
            for (int j = 1; j <= gridY; j++) {
                if (spc == 1) {
                    output.print("<space=23.75px>"); 
                }
                for (int i = 1; i <= gridX; i++) {
                    output.print("■<space=7.75px>");
                }
                if (spc == 0) {
                    spc = 1;
                } else if (spc == 1) {
                    spc = 0;
                }
                output.print("<br>");
            }
        } else if (type == false) {
            for (int j = 1; j <= gridY; j++) {
                if (spc == 0) {
                    output.print("<space=23.75px>"); 
                }
                for (int i = 1; i <= gridX; i++) {
                    output.print("■<space=7.75px>");
                }
                if (spc == 0) {
                    spc = 1;
                } else if (spc == 1) {
                    spc = 0;
                }
                output.print("<br>");
            }
        }
        
    }
}