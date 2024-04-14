package tdd;

public class Game {
	int score = 0 ; 
	int nbLancers = 0 ; 
	
	void roll (int i) {
		nbLancers ++ ; 
		if (nbLancers == 3 && score == 10) {
			score += 2*i ;
		}
		else {
			score += i ;
		}

	}
	
	int score () {
		
		return score ;
	}
}
