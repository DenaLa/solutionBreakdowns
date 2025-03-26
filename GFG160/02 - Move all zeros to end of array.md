[Original Problem and Solution Here](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/article/MTIzNDkz)

This problem asks you to move all zeroes in a given array to the end of the array.

There was a particular element that I felt I got caught up in, and that was "Moving the original elements within the array." Meaning, I was so concerned with perserving the original elements that I overlooked something very simple: I could manually replace all the zeroes.

This, of course, was only possible if I was opting to create a temporary array. As of now I am obsessed with the concept of editing thing in place, meaning, I don't want to create new data structures if I can help it. My original idea was to somehow formulate logic to swap the elements, logic that once again served me well as it was, indeed, the solution that the problem was looking for.

Making a variable to serve as a pointer has been used in a lot of solutions to many practice problems I have seen over the years, and here is no different. In using this pointer, we can keep track of each place a zero shows up, and when we encounter a nonzero number, we are able to swap the places between the zero and non zero.

Again, it's good to imagine these data structures as physical objects, and what I, as a human being would do in order to solve the problem most efficiently. I get caught up in what the computer is able to do, and what would be most clever, that I forget the simpler lines of logic present if I simply stop and think about it for a second. 

It's here where I wonder, that a longer pencil and paper brainstorming session should be needed for these problems, instead of an eagerness to code right away.
