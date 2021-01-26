import java.io.*;
import java.util.*;

public class ReadingFromAndWritingIntoFile {
    public static void main(String[] args) throws IOException {
     File myFile = new File("C:\\Users\\User\\Desktop\\file.txt");
        FileReader fileReader = new FileReader(myFile);
        BufferedReader reader = new BufferedReader(fileReader);
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);}
        FileReader newFileReader = new FileReader(myFile);
        BufferedReader newreader = new BufferedReader(newFileReader);
        String line;
        LinkedList<String> listFromFile = new LinkedList<>();
        while ((line = newreader.readLine()) != null)
            listFromFile.add(line);
            Collections.reverse(listFromFile);
                    FileWriter fileWriter = new FileWriter(myFile, false);
            int i;
            for(i = 0; i < listFromFile.size(); i++) {
                fileWriter.write(listFromFile.get(i) + "\r\n");}
            reader.close();
            newreader.close();
        fileWriter.close();
    }}

