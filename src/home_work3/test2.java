package home_work3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C:\\work\\repos\\first _project\\resource\\my_first_file_txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            String readLine = bufferedReader.readLine();
            System.out.print(readLine);
        }
        String result = " ";
        while (bufferedReader.ready()) {
            String tempstring = bufferedReader.readLine();
            result += tempstring + " ";
        }
        System.out.println(result);


    }
}
