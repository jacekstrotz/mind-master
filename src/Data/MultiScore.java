package Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class MultiScore {
    public ArrayList<Score> list = new ArrayList<Score>();
    private String s = "data";
    
    public MultiScore(String b) {
        list.clear();
        if (b.isBlank())
            read();
        else {
            String c[] = b.split("\n");
            for (int i = 0; i < c.length; i++) {
                list.add(new Score(c[i]));
            }
        }
    }
    
    public String read() {
        String output = "";
        list.clear();
        
        ArrayList<String> lines = new ArrayList<>();
        Path f = Path.of(Path.of("").toAbsolutePath().toString(), "input", s + ".msco");
        
        try {
            output = "\n"+Files.readString(f)+"\n";
            for (int i = 0; i < output.length(); i++)
                if (output.charAt(i) == '\n' && i != output.length()-1)
                    lines.add(output.substring(i+1, output.indexOf("\n", i+1)).trim());
            
            for (int i = 0; i < lines.size(); i++)
                if (!lines.get(i).isBlank()) list.add(new Score(lines.get(i)));
                else lines.remove(i);
            
        } catch (IOException e) {
            System.out.println("An error occured");
        }
        
        return output;
    }
    
    public void addScore(Score s) {
        list.add(s);
    }
    
    public void write() {
        String f = "";
        for (int i = 0; i < list.size(); i++) {
            f += "<name:" + list.get(i).getName() + ">"
               + "<time:" + Utility.dtf.format(list.get(i).getDateTime()) + ">"
               + "<guess:" + list.get(i).getNumGuess() + ">"
               + "<ms:" + list.get(i).getTime() + ">\n";
        }
        
        Utility.writeFile(f, "data", false);
    }
    
    public void write(String s) {
        Utility.writeFile(s, "data", false);
    }
    
    public String output() {
        String f = "";
        
        Collections.sort(DataModel.ms.list, new Score.ScoreComparator3());
        for (int i = 0; i < ((DataModel.ms.list.size() >= 10) ? 10 : list.size()); i++) {
            f += "<name:" + list.get(i).getName() + ">"
               + "<time:" + Utility.dtf.format(list.get(i).getDateTime()) + ">"
               + "<guess:" + list.get(i).getNumGuess() + ">"
               + "<ms:" + list.get(i).getTime() + ">\n";
        }
        return f;
    }
}
