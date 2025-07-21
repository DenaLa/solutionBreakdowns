"Given an array arr[] consisting of positive, negative, and zero values, find the maximum product that can be obtained from any contiguous subarray of arr[]. "

This is similar to our last problem, instead this time we're looking at the product. 

I decided to switch my approach to these problems-- I didn't have time to do them "properly" but I still wanted to at least go through them. So I decided to treat them more as walkthroughs and guides more than challenges-- with the hope that a more straightforward learning approach would help me with consistency.

So I looked at the articles and started to absorb the solutions. I feel a bit proud that I've outgrown ever thinking about using a nested loop, as it was so plainly listed in the naive approach.

There were then two approaches left, Expected approach 1 and Expected approach 2. I ended up going with 2 as my final answer, but I still explored both options to understand what each had to offer.

### Approach 1
This approach first assumes we only have positive numbers, and simply multiplies everything from left to right. Then, we have to consider the addition of negative numbers and zeroes.

Hitting a zero (in both approaches) renders further multiplication useless. So the idea is to discard that subarray and start a new one after the zero.

If we hit a negative number, we now have to take the minimum product into account as well. Multiplying 2 minimum numbers will give us a positive number, so we want to keep it in mind in case we run into another negative. 

The step by step approach with this in mind is as follows:
1. Initialize 3 variables for the current maximum, the current minimum, and the maximum product. Set them all as the first element of the array. (Element at index 0)
2. Loop through the array, starting at index 1. This way, we can account for the 0th index without error.
3. For each index, we want to do 3 things:
	1. Calculate a temporary maximum value that won't overwrite the current one. We do this by comparing the current index (arr[i]), max*current, and min*current. Whichever one is the largest becomes our temporary value
	2. Calculate and update the current minimum value using current (arr[i]), max*current, and min*current. It should be noted that the current maximum we use is _not_ the one calculated at this index, and is instead the one we calculated in the last index. Whichever number is the smallest is set to the current minimum
	3. We're done using the value we have stored in current maximum, so we can now replace it with the value we stored in our temporary variable.
4. When we finish with the loop, we should have the maximum product. With this, we can return it.

### Approach 2
This approach is like the first one, but this time, we approach the array from both ends. We continuously multiply as we traverse, keeping a record of the total product from both sides. If we encounter a zero, we forgo the subarray and start a new one-- represented by making our total product 1 and multiplying it by the next element. The issue with this approach is explained to be how it treats negative numbers--We would want an even amount of negative numbers so that we end up with a positive number in the end. This means that we have to ignore a negative element, and since the subarray needs to be contiguous, they opted to ignore whichever negative elemnt comes at the _very end_ for each respective side.

The algorithm... doesn't track negative elements, though. For either side. I believe this principle is handled by the maxProd variable, which would've saved any worthwhile value from any previous loops. So it's less that a worse value is never calculated, it's just that it will always fall to the wayside in the long run.
