package practice;
//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

// A 카드를 뽑은 플레이어 사탕획ㅇ득 팔로워 획득
// J 카드를 뽑은 플레이어 양옆 획득 팔로워 획득
// Q 모든 플레이어 사탕 획등 팔로워 x
// K 팔로워 지정 
// 3 3 1 2 2
//팔루워 배열
public class nhn3 {
	static int N;
	static ArrayList<Integer>[] followers;
	static int [] candys; 
	static boolean [] check;
	static void dfs(ArrayList<Integer> aa) {
		if(aa.size()!=0) {
			for(int i= 0;i<aa.size();i++) {
				if(!check[aa.get(i)]) {
					candys[aa.get(i)]++;
					check[aa.get(i)] = true;
					dfs(followers[aa.get(i)]);
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		followers = new ArrayList[N];
		candys = new int[N];
		for (int i = 0; i < N; i++) {
			followers[i] = new ArrayList<Integer>();
		}
		String[] s = br.readLine().split(" ");
		int idx = 0;
		for (int i = 0;i<s.length;i++) {
			check = new boolean [N];
			if (s[i].equals("A")) {
				candys[idx]++;
				dfs(followers[idx]);
			} else if (s[i].equals("J")) {
				int bidx = idx-1;
				int aidx = idx +1;
				if(bidx<0) {
					bidx = N-1;
				}
				if(aidx>=N) {
					aidx = 0;
				}
				
				candys[bidx]++;
				candys[aidx]++;
				dfs(followers[bidx]);
				dfs(followers[aidx]);
				//System.out.println(Arrays.toString(candys));
			} else if (s[i].equals("Q")) {
				for(int j = 0;j<N;j++) {
					candys[j]++;
				}
			} else if (s[i].equals("K")) {
				followers[idx].add(Integer.parseInt(s[i+1]));
				i++;
			}
			idx++;
			idx = idx%N;
		}
		for(int i = 0;i<N;i++) {
			System.out.print(candys[i]+" ");
		}
	}

}
