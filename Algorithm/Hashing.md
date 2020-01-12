## Hashing

## Summary
> Hashing is a technique that is used to uniquely identify a specific object from a group of similar objects.


## Where to use? (Application)
> Assume that you have an object and you want to assign a key to it to make searching easy. To store the key/value pair, you can use a simple array like a data structure where keys (integers) can be used directly as an index to store values. However, in cases where the keys are large and cannot be used directly as an index, you should use hashing.
- Associative arrays: Hash tables are commonly used to implement many types of in-memory tables. They are used to implement associative arrays (arrays whose indices are arbitrary strings or other complicated objects).
- Database indexing: Hash tables may also be used as disk-based data structures and database indices (such as in dbm).
- Caches: Hash tables can be used to implement caches i.e. auxiliary data tables that are used to speed up the access to data, which is primarily stored in slower media.
- Object representation: Several dynamic languages, such as Perl, Python, JavaScript, and Ruby use hash tables to implement objects.
- Hash Functions are used in various algorithms to make their computing faster

## comparison
| Tables        | Hashing          | Array |
|:-------------:|:-------------:|:-----:|
| Time-complexity to access data      | O(1)| O(N) |
| col 2 is      | centered      |   $12 |
| zebra stripes | are neat      |    $1 |

## implementation
- 1. An element is converted into an integer by using a hash function. This element can be used as an index to store the original element, which falls into the hash table.
- 2. The element is stored in the hash table where it can be quickly retrieved using hashed key.
- Hash Function : A hash function is any function that can be used to map a data set of an arbitrary size to a data set of a fixed size, which falls into the hash table. The values returned by a hash function are called hash values, hash codes, hash sums, or simply hashes.
  - To achieve a good hashing mechanism, It is important to have a good hash function with the following basic requirements:
    - 1. Easy to compute: It should be easy to compute and must not become an algorithm in itself.
    - 2. Uniform distribution: It should provide a uniform distribution across the hash table and should not result in clustering.
    - 3. Less collisions: Collisions occur when pairs of elements are mapped to the same hash value. These should be avoided.
      - It is recommended that you use prime numbers in case of modulo.
    - Note: Irrespective of how good a hash function is, collisions are bound to occur. Therefore, to maintain the performance of a hash table, it is important to manage collisions through various collision resolution techniques.
- Collision resolution techniques
  - Separate chaining(open hashing)
  - Linear probing (open addresiing or closed hashing)
  - Quadratic Probing
  - Double hashing

## tags

## Problems
- Solved

- Unsolved
## reference
- https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/tutorial/
