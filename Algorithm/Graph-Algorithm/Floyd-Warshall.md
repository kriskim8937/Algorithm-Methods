## Floyd-Warshall
- 다익스트라와 유사하다
- Dynamic Programming 을 사용한다. 
- A에서 Z까지의 최단거리는, A-Z, (A-B-Z), (A-C-Z)..... 들의 값중 최소 값이다 ```
## Where to use?
- All Pairs Shortest Path
- 다익스트라의 시간 복잡도는 n^n, 만약이대로 모든 vertex의 최단 거리를 구한다고 하면 n^3!!
- 같은 vertex 끼리 비용이 다를 수 있음
## Solve
- 간선 그래프 배열을 만든다. 1-1은 0으로 연결 안되있는 것은 Integer.Max_Value
- 1번 노드 출발 혹은 1번 노드 도착을 배열에 채운다, 나머지 값들은 2-3 의경우 2-1 + 1-3 과 비교해서 작은 값을 넣는다.
- 이를 N번 노드까지 반복한다. 
```
// A Java program for Floyd Warshall All Pairs Shortest 
// Path algorithm. 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
  
class AllPairShortestPath 
{ 
    final static int INF = 99999, V = 4; 
  
    void floydWarshall(int graph[][]) 
    { 
        int dist[][] = new int[V][V]; 
        int i, j, k; 
  
        /* Initialize the solution matrix same as input graph matrix. 
           Or we can say the initial values of shortest distances 
           are based on shortest paths considering no intermediate 
           vertex. */
        for (i = 0; i < V; i++) 
            for (j = 0; j < V; j++) 
                dist[i][j] = graph[i][j]; 
  
        /* Add all vertices one by one to the set of intermediate 
           vertices. 
          ---> Before start of an iteration, we have shortest 
               distances between all pairs of vertices such that 
               the shortest distances consider only the vertices in 
               set {0, 1, 2, .. k-1} as intermediate vertices. 
          ----> After the end of an iteration, vertex no. k is added 
                to the set of intermediate vertices and the set 
                becomes {0, 1, 2, .. k} */
        for (k = 0; k < V; k++) 
        { 
            // Pick all vertices as source one by one 
            for (i = 0; i < V; i++) 
            { 
                // Pick all vertices as destination for the 
                // above picked source 
                for (j = 0; j < V; j++) 
                { 
                    // If vertex k is on the shortest path from 
                    // i to j, then update the value of dist[i][j] 
                    if (dist[i][k] + dist[k][j] < dist[i][j]) 
                        dist[i][j] = dist[i][k] + dist[k][j]; 
                } 
            } 
        } 
  
        // Print the shortest distance matrix 
        printSolution(dist); 
    } 
  
    void printSolution(int dist[][]) 
    { 
        System.out.println("The following matrix shows the shortest "+ 
                         "distances between every pair of vertices"); 
        for (int i=0; i<V; ++i) 
        { 
            for (int j=0; j<V; ++j) 
            { 
                if (dist[i][j]==INF) 
                    System.out.print("INF "); 
                else
                    System.out.print(dist[i][j]+"   "); 
            } 
            System.out.println(); 
        } 
    } 
  
    // Driver program to test above function 
    public static void main (String[] args) 
    { 
        /* Let us create the following weighted graph 
           10 
        (0)------->(3) 
        |         /|\ 
        5 |          | 
        |          | 1 
        \|/         | 
        (1)------->(2) 
           3           */
        int graph[][] = { {0,   5,  INF, 10}, 
                          {INF, 0,   3, INF}, 
                          {INF, INF, 0,   1}, 
                          {INF, INF, INF, 0} 
                        }; 
        AllPairShortestPath a = new AllPairShortestPath(); 
  
        // Print the solution 
        a.floydWarshall(graph); 
    } 
} 
  
// Contributed by Aakash Hasija 
```
