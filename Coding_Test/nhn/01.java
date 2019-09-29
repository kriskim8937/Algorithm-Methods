package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
//곤충카드
//곤충 카드 string으로 입력받고 1개 추가해서 서로 같게 가능한지
public class nhn1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		ArrayList<String> bugs = new ArrayList<String>();
		ArrayList<Integer> counts = new ArrayList<Integer>();
		for (String ss : s) {
			if (!bugs.contains(ss)) {
				bugs.add(ss);
				counts.add(1);
			} else {
				int idx = bugs.indexOf(ss);
				counts.set(idx, counts.get(idx) + 1);
			}
		}
		int temp = counts.get(0);
		// System.out.println(bugs.toString());
		//System.out.println(counts.toString());
		boolean card = true;
		boolean difflag = false;
		int befo = -1;
		for (int i = 0; i < counts.size(); i++) {
			System.out.println(befo);
			if (befo > 0 && counts.get(i) != befo) {
				if (card && (befo + 1 == counts.get(i) || befo == counts.get(i) + 1)) {
					card = false;
					counts.set(i, counts.get(i)+1);
					difflag = true;
				} else {
					flag = false;
					break;
				}

			}

			befo = math.max(counts.get(i),);
		}
		if (flag) {
			System.out.println("Y");
			if (difflag) {
				System.out.println(N + 1);
			} else {
				System.out.println(N);
			}
			System.out.println(bugs.size());
		} else {
			System.out.println("N");
			System.out.println(N);
			System.out.println(bugs.size());
		}

	}
}
