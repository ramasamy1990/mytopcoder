import java.util.Arrays;

public class ANewHope {
	public static void main(String[] args) {
		int[] firstWeek = { 1, 2, 3, 4 };
		int[] lastWeek = { 1, 2, 3, 4 };
		System.out.println("Count is "+count(firstWeek, lastWeek, 3));

	}

	public static int count(int[] firstWeek, int[] lastWeek, int D) {
		int noOfWeeks = 0;
		if(Arrays.equals(firstWeek, lastWeek)){
			noOfWeeks = 1;
		}else{
			int[] aPos = new int[250];
			int[] bPos = new int[250];
			int N = firstWeek.length;
			for(int i= 0; i < N; i++){
				aPos[firstWeek[i] -1 ] = i;
				bPos[lastWeek[i] - 1]= i;
			}
			int avg = 0;
			for(int i=0; i<N; i++){
				if(aPos[i] > bPos[i]){
					int cp = 0;
					while(aPos[i] > bPos[i]){
						aPos[i] = aPos[i] + D - N;
						cp++;
					}
					avg = Math.max(avg, cp);
				}
			}
			noOfWeeks = avg + 1;
		}
		return noOfWeeks;
	}
}
