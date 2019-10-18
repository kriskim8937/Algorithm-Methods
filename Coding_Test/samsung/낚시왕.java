import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
//  0. 맨처음 shark배열에 상어들을 넣어어준다.
//  0-1. 상어의 속도에 모듈러 연산이 필요
//1. 낚시왕 오른쪽 한칸이동
//2. 낚시왕이 상어잡음
//  2-1. 상어를 잡았다면 정답에 상어의 크기를 더하고 해당 배열을 비워준다
//  2-2. 배열에 있는 상어들을 큐에 넣어준다(중복이동을 피하기 위함)
//3. 상어가 이동(잡아먹음)
//  3-1. 큐에서 상어를 한마리씩 꺼내면서 다음 위치를 계산한다(이때 벽에 충돌계산하여 방향 바꿔주기, 다음 위치 계산 필요)
//  3-2. 상어를 맵에 할당한다, 이때 이미 상어가 존재한다면 그 상어를 지우고 새로운 상어를 넣어준다. 
// 1-3 반복
class Shark {
	int r; // 좌표
	int c;
	int s; // 속도
	int d; // 방향
	int z; // 크기

	public Shark(int r, int c, int s, int d, int z) {
		super();
		this.r = r;
		this.c = c;
		this.s = s;
		this.d = d;
		this.z = z;
	}

	@Override
	public String toString() {
		return "Shark [r=" + r + ", c=" + c + ", s=" + s + ", d=" + d + ", z=" + z + "]";
	}

}

public class Main {
	static int R, C, M, fisher, Ans;
	static Shark[][] map;
	static int[] dr = { 0, -1, 1, 0, 0 };// 위,아래,오,왼
	static int[] dc = { 0, 0, 0, 1, -1 };// 위,아래,오,왼
	static Queue<Shark> q = new LinkedList<Shark>();
	static boolean dirFlag;

	static void move() {
//1. 낚시왕 오른쪽 한칸이동
//2. 낚시왕이 상어잡음
//  2-1. 상어를 잡았다면 정답에 상어의 크기를 더하고 해당 배열을 비워준다
		for (int i = 0; i < R; i++) {
			if (map[i][fisher] != null) {
				Shark a = map[i][fisher];
				Ans += a.z;
				map[i][fisher] = null;
				break;
			}
		}
		fisher++;//낚시꾼 위치 옮기기
		//  2-2. 배열에 있는 상어들을 큐에 넣어준다(중복이동을 피하기 위함)

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] != null) {
					q.add(map[i][j]);
				}
				map[i][j]=null;
			}
		}
		//3. 상어가 이동(잡아먹음)
//  3-1. 큐에서 상어를 한마리씩 꺼내면서 다음 위치를 계산한다(이때 벽에 충돌계산하여 방향 바꿔주기, 다음 위치 계산 필요)
//  3-2. 상어를 맵에 할당한다, 이때 이미 상어가 존재한다면 그 상어를 지우고 새로운 상어를 넣어준다. 
// 1-3 반복
		while (!q.isEmpty()) {
			Shark a = q.poll();
			calcPos(a);
			if (map[a.r][a.c] == null) {
				map[a.r][a.c] = a;
			} else {
				if (map[a.r][a.c].z < a.z) {
					map[a.r][a.c] = a;// 상어가 크면 바꿔줌
				}
			}
		}
		// catch
		//printMap();
		
		
	}

	static void calcPos(Shark shark) {
		int nr = shark.r+(shark.s*dr[shark.d]);
		int nc = shark.c+(shark.s*dc[shark.d]);
		
		if(nr<0 || nr>=R || nc<0 || nc>=C) {
			shark.d += shark.d%2==1?1:-1;
			if(nr<0)
				nr = -nr;
			else if(nc < 0)
				nc = -nc;
			else if(nr>=R)
				nr = (R-1) - (nr-R)-1;
			else if(nc>=C)
				nc = (C-1) - (nc-C)-1;
		}
		
		if(nr<0 || nr>=R || nc<0 || nc>=C) {
			shark.d += shark.d%2==1?1:-1;
			if(nr<0)
				nr = -nr;
			else if(nc < 0)
				nc = -nc;
			else if(nr>=R)
				nr = (R-1) - (nr-R)-1;
			else if(nc>=C)
				nc = (C-1) - (nc-C)-1;
		}
		shark.r = nr;
		shark.c = nc;
	}
	
	static void printMap() {
		for(int i =0;i<R;i++) {
			for(int j =0;j<C;j++) {
				if(map[i][j]!=null) {
					System.out.print(map[i][j].z+" ");
				}else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		R = Integer.parseInt(s[0]);
		C = Integer.parseInt(s[1]);
		M = Integer.parseInt(s[2]);
		map = new Shark[R][C];
    //  0. 맨처음 shark배열에 상어들을 넣어어준다.

		for (int i = 0; i < M; i++) {
			String[] ss = br.readLine().split(" ");
			int dr = Integer.parseInt(ss[3]);
			int speed = Integer.parseInt(ss[2]);
			int r = Integer.parseInt(ss[0]) - 1;
			int c = Integer.parseInt(ss[1]) - 1;
			//  0-1. 상어의 속도에 모듈러 연산이 필요

			if (dr <= 2)// 방향이 위아래인경우
			{
				speed = speed % (2 * (R - 1));
				Shark sss = new Shark(r, c, speed,dr,Integer.parseInt(ss[4]));
				map[r][c] = sss;
			} else if (dr > 2)// 방향이 왼쪽 오른쪽인경우
			{
				speed = speed % (2 * (C - 1));
				Shark sss = new Shark(r, c, speed,dr,Integer.parseInt(ss[4]));
				map[r][c]=sss;
			}
		}
		fisher = 0; // 낚시꾼 위치 
		for (int i = 0; i < C; i++) {
			move();
		}
		System.out.println(Ans);
	}
}
