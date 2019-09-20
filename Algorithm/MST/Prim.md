## Prim
- Greedy algorithm
- Minumum Sapnning Tree
## MST?
- a spanning tree means all vertices must be connected
## Where to use?
- 최소비용
- ex)
  - 도시들을 모두 연결하면서 도로의 길이가 최소가 되도록 하는 문제
  - 단자들을 모두 연결하면서 전선의 길이가 가장 최소가 되도록 하는 문제
  - 삼성상시테스트 기출 ) 섬을 모두 연결하면서 다리의 길이가 최소로 되도록 하는 
## Complexity
- Time O(n^2)/ 정점의 n 만큼 반복, 내부 반복문이 n번 반복
> 그래프 내에 적은 숫자의 간선만을 가지는 ‘희소 그래프(Sparse Graph)’의 경우 Kruskal 알고리즘이 적합하고
그래프에 간선이 많이 존재하는 ‘밀집 그래프(Dense Graph)’ 의 경우는 Prim 알고리즘이 적합하다.

## reference
https://gmlwjd9405.github.io/2018/08/30/algorithm-prim-mst.html
