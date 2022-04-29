package josephusProblemGame;

public class JosephusProblem {
	
	public static int[] solve(int m, int n) {
		
		int[] pos = new int[n];
		int[] elim = new int[n];
		int cElim = 0;
		int cPos = -1;
		
		while(cElim < n) {
			
			cPos = moveNext(pos, cPos, m, n);
			pos[cPos] = -1;
			elim[cElim] = cPos;
			cElim++;
		}
		return elim; 
	}
	
	public static int moveNext(int[] pos, int cPos, int m, int n) {
		
		int i = 0;
		
		while(i < m) {
			cPos++;
			cPos = cPos % n;
			if(pos[cPos] == -1) {
				continue;
			}
			i++;
		}
		return cPos;
	}
}
