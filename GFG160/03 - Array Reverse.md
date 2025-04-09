This problem asks you to reverse the given array.

My first thought was to get a temporary array. However, I was determined to do things in place, so I moved on to the next thought.

My next thought was to use two pointers, like one would do in a physical space if they were only allowed one container. The two pointers start at the opposite ends of the array, and when they pass each other in the middle, the loop ends. It's important that the loop ends if they pass each other and not when they meet, because while the two pointers meet in an array with an odd number of elements, they will not meet in an array where there is an even number of elements.

A revision of this thought process only needs a traversal of half the array, and only one element as a pointer. It does require a temporary variable that is present in most (if not all) swapping problems, but it presents a way to solve the problem I enjoy more. I tend to like math based solutions if I can parse them easily-- to me, math is a more reliable way to figure a lot of things out than memorization. This third solution just requires you to go through half of the array, and swapping the counterpart of the current position (Which would be at n-i-1). Naturally this works for both an odd and even number of elements in an array-- if the array has an odd number of elements, it stops before the middle. If it's even, it stops exactly AT the middle. This is ultimately the solution I chose.

There's a third solution in recursion, but I'll have to admit that it escapes me. Especially with its complexity. While it's a technical marval in its own right, I'm not sure if its a worthwhile solution to explore.

It's a clever solution-- it breaks down the larger array into smaller subarrays and swaps the first and last element of that sub array. Each recursion brings the starting and end point closer and closer together. But it's the type of solution that is only really good for it's concepts than actual practicality. Not to insult it, again, it's insanely clever to use recursion like that to me. It's a nice way to get your feet wet with the concept, as well.

But for now, I really did enjoy the solution where you only traveled half the array. Which is why I was very upset I couldn't use it in the next solution, where using a reversal is possible.
