"Given a ***circular array*** arr[], find the ***maximum sum*** of any non-empty subarray. A circular array allows wrapping from the end back to the beginning.

***Note:*** A subarray can span from the end of the array and continue at the beginning."

There is a 5 day gap between my completion of this problem and the following retrospective due to having to deal with some other matters, so this retrospective may be shorter.

Dealing with an array in a circular sense is a concept that is a bit new to me. At first I thought about using a Sliding Window approach-- but I wasn't sure how I would implement that in regards to this problem. So, I looked over to the article solution and began to study.

For the first of the better approaches, we use both Kadane's algorithm and prefix and suffix sums. Since we're regarding the array as circular, we can choose to add elements from the start of the array up to a certain point, and from any point in the array greater than our index to the end. In order to compute the max circular array from this, we first need to find all possible max suffix sums (which we store in an array). Then, we calculate the max prefix sum from index 0 to index i, where we start our suffix sum at index i + 1 to avoid double counting the element at i. To calculate potential sums that don't come from the circular nature of the array, we can just use Kadane's Algorithm.

For the expected approach, we use Kadene's algorithm to find the circular array as well. to calculate it, we would need to find of the total sum as the array, minus the sum of a subarray in the middle. Thus, we'd have to find the smallest value of the subarrray in the middle.

There wasn't really much outside of this that I needed to grasp. It did help me think of ways to think about problems. I _am_ starting to wonder if there's a way I can easily shorten this information, however... just a quick way thing to refer to to add onto my studying.
