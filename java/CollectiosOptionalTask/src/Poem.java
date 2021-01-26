import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Poem {
    public Poem() {
    }

    public static void main( String[] args) throws IOException {

    File myFile = new File("C:\\Users\\User\\Desktop\\If.txt");
    FileReader fileReader = new FileReader(myFile);
    BufferedReader reader = new BufferedReader(fileReader);
    int character;
    while ((character = reader.read()) != -1) {
        System.out.print((char) character);}
    FileReader newFileReader = new FileReader(myFile);
        BufferedReader newreader = new BufferedReader(newFileReader);
       String line;
        ArrayList<String> listFromFile = new ArrayList<>();
        while ((line = newreader.readLine()) != null)
            listFromFile.add(line);
            Collections.sort(listFromFile, new ByLength());
            reader.close();
        newreader.close();
        System.out.println("   Sorted ArrayList:" + listFromFile);
    }
}



