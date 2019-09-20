## DP
> Solves a given complex problem by breaking it into subproblems and stores the results of subproblems to avoid computing the same results again. The idea is to simply store the results of subproblems, so that we do not have to re-compute them when needed later. This simple optimization reduces time complexities from exponential to polynomial.
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
| state      | State Transition relation is diffult to think | State transition relation is easy to think |
| code      | Code gets complicated when lot of conditions are required      |   Code is easy and less complicated |
| speed | Fast, as we directly access previous states from the table      |   Slow due to lot of recursive calls and return statement |
| Subproblem Solving | If all subproblems must be solved at least once, BUDP usually outperforms a TDDP by a constant factor  | If some sub problems need not be solved at all, TDDP has the advantage of solving only subprobelm that are required |
| Table Entries | Starting from the entry, all filled one by one | The table is filled on demand |


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
