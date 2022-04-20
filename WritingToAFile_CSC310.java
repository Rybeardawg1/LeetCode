import static java.lang.Long.parseLong;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WritingToAFile_CSC310 {
    public static void main(String[] args) {
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream("numbers.txt"));
        } // end try
        catch (FileNotFoundException e) {
            System.out.println("File was not found, program will close.");
            System.exit(0);
        } // end catch

        int[] array = new int[]{399, 437, 767, 936};
        String string = "";

        for(int z:array) {
            for(int i = 0; i < 9999; i++) {
                if(i < 10) {
                    string = Integer.toString(i);
                    string = "000" + string;
                }else if(i < 100){
                    string = Integer.toString(i);
                    string = "00" + string;
                }else if(i < 1000) {
                    string = Integer.toString(i);
                    string = "0" + string;
                }else {
                    string = Integer.toString(i);
                }
                Long num = parseLong(string);
                outputStream.println(311 + "-" + z + "-" + num);
            }
        }
        outputStream.close();
    }// end main
}// end class