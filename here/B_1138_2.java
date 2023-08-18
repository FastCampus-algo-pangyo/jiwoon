import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] people = new int[N+1];
		int[] result = new int[N+1];

		for(int i=1; i<=N; i++) {
			people[i] = Integer.parseInt(st.nextToken());
		}

		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				if(people[i] == 0 && result[j] == 0) {
					result[j] = i;
					break;
				} else if(result[j] == 0) {
					people[i]--;
				}
			}
		}

		for(int i=1; i<=N; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
