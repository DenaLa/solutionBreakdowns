This problem asks you to find the smallest difference between the tallest and shortest tower in an array of towers. You MUST act on every tower, and each tower can either have their heights increased by K or decreased by K.

Internally, my mind goes to one place -- how do I find the tallest and shortest towers? And then, what do I do to the towers once I get there? Logically, I believe we may want to increase all of the towers save for the tallest, but there is a chance that one or modified towers would then become the tallest. This may not be much of an issue, but there's also the chance of a smallest difference between shortest and tallest if we also increase the height of the tallest tower. This solution would also require two passes of the array. I'm not sure if there needs to be two passes, but I'm trying to wittle down any time I can for as much saves as I can. We also have to make sure that none of the towers reach a negative value.

There were a bit more layers, especially when I looked at the examples given.

This problem is the first where there was only one intended solution. And, to my surprise, it required sorting.

I was on the right track for my internal logic, that the smallest height and the tallest heights modified in the ways I wanted (Add to the smallest, subtract from the tallest) would be able to give me _a_ result that I want, but it is only _one_ result. If we sort the array first, we can easily tell where the tallest and shortest buildings are, at the two ends of the array.

Intuitively, we don't want the tallest building to get any taller, because that would widen the gap between it and any other height. Likewise, we don't want to subtract from the smallest height. So when we act upon these heights, we want to always add to the smallest one, and subtract from the larger ones. And, if subtracting from any height makes it negative, we just skip over it.

Following this logic, as we go through the array, our index will serve as the local minimum when compared to arr[length-1], and a local maximum when compared to arr[0]. When we compare it to arr[length-1], we will add to it, and see if it is larger. When comparing it to arr[0], we subtract from it, and see if it is smaller. This way, we can see if there are any cases where the base minimum and maximum heights are outdone by any potential modifications.

So in the end, our algorithm is as follows:
1. Sort the array
2. Set our answer to arr[length-1] - arr[0]
3. Create a for loop that begins at index 1. Within the for loop:
	i. If subtracting from our current index leads to a negative number, skip it.
	ii. Compare the vaules of (arr[0]+k) and (arr[i]-k]), with (arr[i]-k]) serving as our local maximum. Whichever value is smallest is set as our new minimum.
	iii. Compare the values of (arr[length-1]-k) with (arr[i-1] + k), with (arr[i-1] + k) serving as our local minimum. Whichever value is larger is set as our new maximum
	iv. Compare our previous answer with our max-min. Whichever value is smaller is our new answer.
4. After the for loop, return our answer.
