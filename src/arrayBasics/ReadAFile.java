package arrayBasics;

import java.awt.*;
import java.io.*;

public class ReadAFile {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\RAHUL\\Downloads";

        //pdf
        File file = new File(path);
        File opFile = new File(path);

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(opFile);

        try {
            if (fis.available()>0){
                System.out.println("file is not empty");
            }else System.out.println("file is empty");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // read file

        int i = 0;
    try {
        while ((i = fis.read()) != -1) {
            System.out.println(i);

            fos.write(i);

        }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
