package tdd;

public class Game {
	private int[] lancers = new int[21];
    private int roll;


    public void roll(int i) {
    	lancers[roll] = i;
    	roll ++ ;
    }

    public int score() {
        int score = 0;
        int indiceRoll = 0;

        for (int i = 0; i < 10; i++) {
            if (lancers[indiceRoll] == 10) {
                score += 10 + lancers[indiceRoll + 1] + lancers[indiceRoll + 2];
                indiceRoll += 1;
            } else if (lancers[indiceRoll] + lancers[indiceRoll + 1] == 10) {
                score += 10 + lancers[indiceRoll + 2];
                indiceRoll += 2;
            } else {
                score += lancers[indiceRoll] + lancers[indiceRoll + 1];
                indiceRoll += 2;
            }
        }

        return score;
    }



}
