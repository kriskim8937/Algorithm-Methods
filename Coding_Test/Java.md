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

### 중첩된 for 문빠져나가기
```
class temp
{
	public static void main()
	{
		Loop1 : for(int i=0; i<10; ++i)
		{
			for(int j=0; j<10; ++j)
			{
				System.out.println(i * j);
				if (i==5 && j==5)
					break Loop1;
			}
		}
	}
}
```
### Char형 int로 바꾸기
```
String st;
for(int i =0;i<len;i++){
a[st.charAt(i)-'a']++
b[st.charAt(i)-'0']++
}
```

## data structure
- 주요 자료 구조들
- Arrays
  - Arrays.sort //배열 정렬
  - Arrays.toString //배열 출력용
  - Arrays.fill //배열 초기화
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
  
## Comprator Comparable 
- 둘은 사용하는 방식이 다르다.. 실수하지 말자

## 2차원 배열
- 자바의 배열은 한줄씩 모두 객체이다
- 2차원 배열의 행의 길이는 고정하고 열의 길이는 유동적으로 하여 선언하는 것이 가능하다
```
me = new char[q][];
for(int i = 0;i<q;i++){
me[i] = sc.next().toCahrArray();
}
```

## reference
- https://www.java67.com/2016/07/how-to-sort-array-in-descending-order-in-java.html
