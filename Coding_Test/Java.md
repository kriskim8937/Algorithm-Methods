## 헷갈리는 문법
- 내림차순 정렬하는 법
  - class의 경우 comparator 혹은 comparble 쓰면 된다
  - Object array 의 경우
  ```
  Integer[] cubes = new Integer[] { 8, 27, 64, 125, 256 };
  Arrays.sort(cubes, Collections.reverseOrder());
  ```
  - 근데 
