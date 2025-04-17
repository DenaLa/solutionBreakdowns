This problem asks you to find the next permutation off a given set of numbers. If you have the last permutation, you give the first.

The first thing I thought to do was to make a list of all the permutations, and then give the next one of the permutation asked of me. But in my mind I figured that would be time consuming, and probably use up a bunch of space that wouldn't need to be used. And lo and behold, that is exactly what I was told. So I accept that, and go back to the drawing board, and read on.

This is where I was told the pattern, and the better algorithm. It relied on finding the rightmost elements of two types: Fnd the rightmost element that is smaller than it's right neighbor (calling it the pivot), and to find the element that is rightmost to the pivot and also larger than it. You swap these two elements, and then reverse every element to the right of the pivot.

I tried this out for a few set of numbers. I had a different internal logic, but something I think most people have as well. When you start making new permutations, you just sort of keep ordering them from least to greatest according to this intrinsic knowledge that you possess. Each element has it's turn staying at one index, while you rearrange everything to the right of it. But of course, the logic presented to me is just as solid. I was able to get it down, with a few hiccups:

I never accounted for what happens when there isn't a pivot. In that case, you can just reverse the whole array.

When using variables to mark indexes, they should always be initialized out of bounds at -1. This way it's an actual invalid place, and it doesn't come with the assumption that what we're looking for is at the start, at index 0.

And the last thing is to mind where you end your loops. I had made a small mistake, which led to the loop ending earlier than it should have (it wasn't able to read a later variable that would be the proper successor to the pivot).
