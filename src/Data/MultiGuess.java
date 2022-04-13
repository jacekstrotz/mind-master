package Data;

import java.util.ArrayList;

public class MultiGuess {
    public ArrayList<Guess> list;
    
    public MultiGuess() {
        list = new ArrayList<Guess>();
    }
    
    public void addGuess(Guess g) {
        list.add(g);
    }
}
