Two Sum is a classic problem and the very first. 

"Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order"

Immediately, I think about finding the complement of the current element I'm looking at. And immediately, I know I can use a hashtable in order to do that. Since we want to return the indices, we make those the values, and the numbers themselves the keys. This way, we can use the ```containsKey``` and ```get``` functions in order to get our indices.

As we put elements in our Hash Map, we check to see if the complement exists inside. If it does, we create a new array that contains the indices, and return it. If the complement doesn't exist for _any_ of our elements, we simply return and empty array.
