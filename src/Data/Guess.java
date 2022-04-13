package Data;

public class Guess {
    private int[] pegsGuess, pegsAnswer, correct;
    private boolean exact;
    
    public Guess() {
        pegsGuess = new int[]{0,0,0,0};
        pegsAnswer = new int[]{0,0,0,0};
        correct = new int[]{0,0};
    }
    
    public Guess(int a[], int g[]) {
        pegsGuess = new int[4];
        pegsAnswer = new int[4];
        correct = new int[2]; // 0 - correct, 1 - correct with incorrect placement
                
        for (int i = 0; i < 4; i++) {
            pegsGuess[i] = g[i];
            pegsAnswer[i] = a[i];
        }
        
        check();
    }
    
    /* This method is, in my opinion, the easiest approach for finding the
     * number of correct answers. It scans both the guess and answers for the 
     * occurences of one digit (0-3). For example, if Guess is 0001 and Answer
     * is 1010, Answer has 2 occurences of 1, and Guess has 1 occurence of 1.
     * This information means that there is one misplaced 1, but there are 
     * two 1s in the answer. 
     *
     */
    public void check() {
        correct = new int[]{0,0};
        exact = false;
        
        String guess = "" + pegsGuess[0] + pegsGuess[1] + pegsGuess[2] + pegsGuess[3];
        String answer = "" + pegsAnswer[0] + pegsAnswer[1] + pegsAnswer[2] + pegsAnswer[3];
        for (int i = 0; i < 4; i++) {
            String a = guess.replaceAll("[^" + i +"]*", "");
            String b = answer.replaceAll("[^" + i + "]*", "");

            correct[1] += Utility.getMinVal(a.length(), b.length());
            
            if (pegsGuess[i] == pegsAnswer[i]) {
                --correct[1];
                ++correct[0];
            }
        }
        
        if (correct[0] == 4 && correct[1] == 0)
            exact = true;
    }
    
    public void setCorrect(int i, int c) {
        correct[i] = c;
    }
    
    public int getCorrect(int i) {
        return correct[i];
    }
    
    public boolean getExact() {
        return exact;
    }
    
    public void setExact(boolean e) {
        exact = e;
    }
    
    public int getGuess(int i) {
        return pegsGuess[i];
    }
    
    public void setGuess(int i, int g) {
        pegsGuess[i] = g;
    }
    
    public int getAnswer(int i) {
        return pegsAnswer[i];
    }
    
    public void setAnswer(int i, int g) {
        pegsAnswer[i] = g;
    }
    
    public String toString() {
        return "Guess [" + pegsGuess[0] + " " + pegsGuess[1] + " " + pegsGuess[2]
                + " " + pegsGuess[3] + "]\n\tNumber of Correct Guesses: " + correct[0]
                + "\n\tNumber of Correct Guesses with Improper Placement: " + correct[1]
                + "\n\t" + (exact ? "[ CORRECT ]\n" : "[ INCORRECT ]\n");
    }
}
