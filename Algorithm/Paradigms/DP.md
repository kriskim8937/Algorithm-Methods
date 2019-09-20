## DP
> Dynamic Programming is mainly an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for same inputs, we can optimize it using Dynamic Programming. The idea is to simply store the results of subproblems, so that we do not have to re-compute them when needed later. This simple optimization reduces time complexities from exponential to polynomial. For example, if we write simple recursive solution for Fibonacci Numbers, we get exponential time complexity and if we optimize it by storing solutions of subproblems, time complexity reduces to linear.
## Summary
```
Smarter version brute force
Recursive + Memoization
If you use only recursive 'for', lots of overlaps will occur
pigeonhole principle
implicit order
K-napsack
deterministic
non-deterministic
p versus np https://ratsgo.github.io/data%20structure&algorithm/2017/11/30/NP/
```
## How to store value
 - Tabulation: Bottom Up / 상향식 
 - Memoization: Top Down / 하향식
## Where to use? (Application)
 - Tabulation: Bottom Up 
  
 - Memoization: Top Down / 상향식
## comparison
| Tables        | Tabulation/ Bottom Up    | Memoization/ Top Down |
|:-------------:|:-------------:|:-----------:|
| state      | State Transition relation is diffult to think | $1600 |
| code      | centered      |   $12 |
| speed | are neat      |    $1 |
| Subproblem Solving | are neat      |    $1 |
| Table Entries | are neat      |    $1 |


## tags
find shorted way

## Problems
- Tabulation
  - Solved
  - Unsolved
    - [x] 토끼수 구하기 
- Memoization
  - Solved
  - Unsolved
