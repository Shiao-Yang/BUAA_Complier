package frontend.Source;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws IOException {

        Source source = new Source("src\\frontend\\Source\\testfile.txt");
        ArrayList<String> lines = source.getLines();

        for(int i = 0; i < lines.size(); i++) {
            System.out.println(i + " " + source.getLine(i));
        }

        //ArrayList<String> lines = new ArrayList<>();

        /*
        File file = new File("src\\frontend\\Source\\testfile.txt");
        System.out.println(file.exists());

        BufferedReader br = new BufferedReader(new FileReader("src\\frontend\\Source\\testfile.txt"));
        String line = "";

        while((line = br.readLine()) != null) {
            lines.add(line);
        }

        for(int i = 0; i < lines.size(); i++) {
            System.out.println(i + " " + lines.get(i));
        }
        */

    }
}
