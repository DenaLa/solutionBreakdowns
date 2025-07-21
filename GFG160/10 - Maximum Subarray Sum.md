"You are given an integer array **arr[]**. You need to find the **maximum** sum of a subarray (containing at least one element) in the array arr[]."

I will admit, I was completely stumped on what to do when reading this question. I thought about going at it from different approaches, but none of them really seemed to be an algorithm, or anything that could really _work._ I knew that traversal would help me get my answer, but I wasn't sure _how_ to go about it.

The article guide then introduced **Kadene's algorithm**. To be honest, the way the algorithm was explained in the article was not very helpful--the wording feels very obtuse. But I was able to get a better understanding once I looked at the example, and at the code.

We begin making a subarray from the very first element, and begin to travel through it. We keep track of the total sum from the first element of our subarray, to the current element we are at. If the sum of our current subarray is bigger than the element we are pointing to, then we continue adding to the subarray. However, if our sum is smaller than the element, it would be better to discard the subarray and begin a new one.

After I understood this, the whole problem became pretty simple. The one thing that tripped me up was the for loop, which I had made start at 0 instead of 1.

