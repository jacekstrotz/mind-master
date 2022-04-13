/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author strotz
 */
public class Score {
    private String name, s = "data";
    private LocalDateTime time;
    private Integer numGuess;
    private Double timeInMilliSeconds;
    
    private ArrayList<String> keys = new ArrayList<String>(), 
            values = new ArrayList<String>();
    
    public Score(String n, LocalDateTime t, int g, double ti) {
        name = n;
        time = t;
        numGuess = g;
        timeInMilliSeconds = ti;
    }
    
    public Score(String s) {
        parse(s);
        
        name = getKeyVal("name");
        time = LocalDateTime.parse(getKeyVal("time"), Utility.dtf);
        numGuess = Integer.parseInt(getKeyVal("guess"));
        timeInMilliSeconds = Double.parseDouble(getKeyVal("ms"));
    }
    
    public void parse(String s) {
        ArrayList<Integer[]> tags = new ArrayList<Integer[]>();
        keys.clear();
        values.clear();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<')
                for (int j = i; j < s.length(); j++)
                    if (s.charAt(j) == ':') {
                        tags.add(new Integer[]{i+1, j});
                        break;
                    }
        }
        
        for (int i = 0; i < tags.size(); i++) {
            keys.add(s.substring(tags.get(i)[0], tags.get(i)[1]));
            values.add(s.substring(tags.get(i)[1]+1, s.indexOf(">", tags.get(i)[1])).trim());
        }
    }
    
    public String getKeyVal(String k) {
        int idx = keys.indexOf(k);
        return values.get(idx);
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setDateTime(LocalDateTime t) {
        time = t;
    }
    
    public void setNumGuess(int n) {
        numGuess = n;
    }
    
    public void setTime(double t) {
        timeInMilliSeconds = t;
    }
    
    public String getName() {
        return name;
    }
    
    public LocalDateTime getDateTime() {
        return time;
    }
    
    public int getNumGuess() {
        return numGuess;
    }
    
    public double getTime() {
        return timeInMilliSeconds;
    }
    
    public String toString() {
        return name + " - " + numGuess + (numGuess == 1 ? " guess\n\t" : " guesses\n\t") + "Time elapsed: "
                + String.format("%.2f", timeInMilliSeconds) + "s - " + time;
    }
    
    public static class ScoreComparator1 implements Comparator<Score> {
        @Override
        public int compare(Score s, Score t) {
           int f = s.name.compareTo(t.name);
           return f;
        }
    }
    
    public static class ScoreComparator2 implements Comparator<Score> {
        @Override
        public int compare(Score s, Score t) {
            int f = s.time.compareTo(t.time);
            return f;
        }
    }
    
    public static class ScoreComparator3 implements Comparator<Score> {
        @Override
        public int compare(Score s, Score t) {
            int f = s.numGuess.compareTo(t.numGuess);
            return (f == 0) ? f : s.timeInMilliSeconds.compareTo(t.timeInMilliSeconds);
        }
    }
    
}
