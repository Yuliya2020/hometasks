import java.io.*;

import java.util.*;


public class ArrayListWritingAndSorting {

    public static void main( String[] args) throws IOException {
        File myFile = new File("C:\\Users\\User\\Desktop\\file.txt");
        FileReader fileReader = new FileReader(myFile);
        BufferedReader reader = new BufferedReader(fileReader);
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);}
        {FileReader newFileReader = new FileReader(myFile);
        BufferedReader newreader = new BufferedReader(newFileReader);
        String line;
        ArrayList<String> listFromFile = new ArrayList<>();
        while ((line = newreader.readLine()) != null)
        listFromFile.add(line);
        Collections.sort(listFromFile);
        reader.close();
        newreader.close();
        System.out.println("   Sorted ArrayList:" + listFromFile);
    }}}
