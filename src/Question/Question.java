package Question;

import java.io.*;
import java.util.*;

public class Question {
    List<String> question;
    File file; // = new File("question.txt");

    public Question() throws IOException {
        question = new ArrayList<>();
        file = new File("question.txt");
        readFile();
    }

    private void readFile() throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(new File("question.txt"))));
        try {
            String line;
            while ((line = br.readLine()) != null) {
                question.add(line);
                //System.out.println(line);
            }
        }

        finally {
            br.close();
        }
    }

    public List<String> getList(){
        return question;
    }
}
