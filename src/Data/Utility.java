
package Data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 *
 * @author strotz
 */
public class Utility {
    static public Random random; 
    static public DateTimeFormatter dtf;
    
    public Utility() {
        random = new Random();
        dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
    }
    
    static public int getMinVal(int v1, int v2) {
        return v1 > v2 ? v2 : v1;
    }
    
    static public int getMaxVal(int v1, int v2) {
        return v1 > v2 ? v1 : v2;
    }
    
    static public int[] generateCode() {
        int[] p = new int[4];
        p[0] = Utility.random.nextInt(4);
        p[1] = Utility.random.nextInt(4);
        p[2] = Utility.random.nextInt(4);
        p[3] = Utility.random.nextInt(4);
        
        return p;
    }
    
    static public long getSystemTime() {
        return System.currentTimeMillis();
    }
    
    static public String getTimeAsString(LocalDateTime lt) {
        return dtf.format(lt);
    }
    
    public static int writeFile(String s, String f, boolean dir) {
        String d;
        if (!dir) {
            d = Path.of("").toAbsolutePath().toString() + File.separator 
                    + "input";

            (new File(d)).mkdir();
            
            f = d + File.separator + f + ".msco"; // custom file extension
        }
        
        try {
            File file = new File(f);
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            
            return 2;
        }
        
        try {
            FileWriter myWriter = new FileWriter(f);
            
            myWriter.write(s);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            
            return 3;
        }
        return 0;
    }
}