package practice;
//순서대로 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class ints implements Comparable<ints>{
	int idx;
	int num;
	public ints(int idx, int num) {
		super();
		this.idx = idx;
		this.num = num;
	}
	@Override
	public int compareTo(ints o) {
		if(nhn2.countss[this.num] == nhn2.countss[o.num]) {
			return this.idx-o.idx;
		}
		else return nhn2.countss[o.num]-nhn2.countss[this.num];
	}
	@Override
	public String toString() {
		return "ints [idx=" + idx + ", num=" + num + "]";
	}
}
public class nhn2 {
	public static int []countss;
	static ArrayList<ints> al= new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		countss = new int[101]; 
		for(int i = 0;i<N;i++) {
			String []s = br.readLine().split(" ");
			if(s[0].equals("enqueue")) {
				int temp = Integer.parseInt(s[1]);
				countss[temp]++;
				al.add(new ints(i,temp));
			}else {
				Collections.sort(al);
				ints tp = al.get(0);
				System.out.print(tp.num+" ");
				countss[tp.num]--;
				al.remove(0);
				
			}
		}

	}
}
