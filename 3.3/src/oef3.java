import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class oef3 {
    public static void main(String[] args) throws IOException {
        String nm1 = "Goyens";
        int pnt11 = 100;
        int pnt21 = 100;
        int pnt31 = 100;
        double gem1 = (pnt11 + pnt21 + pnt31) / 3;

        String nm2 = "Cietwaar";
        int pnt12 = 29;
        int pnt22 = 30;
        int pnt32 = 93;
        double gem2 = (pnt12 + pnt22 + pnt32) / 3;

        String nm3 = "Makreels";
        int pnt13 = 73;
        int pnt23 = 83;
        int pnt33 = 92;
        double gem3 = (pnt13 + pnt23 + pnt33) / 3;

        double klasgem = Math.round((gem1 + gem2 + gem3) / 3);
        System.out.println(klasgem);
        File file = new File("punten_3");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(pnt11 + " ");
        printWriter.print(pnt12 + " ");
        printWriter.println(pnt13);
        printWriter.print(pnt21 + " ");
        printWriter.print(pnt22 + " ");
        printWriter.println(pnt23);
        printWriter.print(pnt31 + " ");
        printWriter.print(pnt32 + " ");
        printWriter.println(pnt33);
        printWriter.print(klasgem);
        printWriter.close();
    }
}
