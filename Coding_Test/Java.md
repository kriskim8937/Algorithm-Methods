## 헷갈리는 문법
- 내림차순 정렬하는 법
  - class의 경우 comparator 혹은 comparble 쓰면 된다
  - Object array 의 경우
  ```
  Integer[] cubes = new Integer[] { 8, 27, 64, 125, 256 };
  Arrays.sort(cubes, Collections.reverseOrder());
  ```
  - 근데 primitive type의 경우
  > The only way to sort a primitive array in descending order is first to sort it in ascending order and then reverse the array in place as shown on the link.
  걍 wrapper 해라

- 깊은 복사
  - 그냥 for 문 돌려라 
- Map 순회 
- Permutation, Combination 구현하기
## data structure
- 주요 자료 구조들
- Arrays
- Queue
- Linkedlist
- Sorted Map
- Deque
- PriorityQueue /https://www.geeksforgeeks.org/priority-queue-class-in-java-2/
  - 선언 방식
  - iterartor 사용법
  - poll / 맨 처음 꺼 꺼내기
  - contains , 이거 포함해?
  - toArray, array로 변환

## reference
- https://www.java67.com/2016/07/how-to-sort-array-in-descending-order-in-java.html
