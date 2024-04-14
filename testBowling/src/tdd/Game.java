package tdd;

public class Game {
	int score = 0 ; 
	int nbLancers = 0 ; 
	int nbBonus = 0 ; 
	
	void roll (int i) {
		nbLancers ++ ;
		

		if (nbBonus > 0) {
			score += i ; 
			nbBonus -- ;
		}
		if (nbLancers == 1 && i == 10) {
			nbBonus = 2 ;
		}
		
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
