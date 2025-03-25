[Original Promblem and Solution here](https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/article/MTQ4NDk1)

The purpose of this problem is to find the second largest element in a given array. Duplicate elements are allowed, so you must create an algorithm that accouts for it.

The problem asks you to find the second largest element in the array.

I am doing these problems to rebuild my memories from college, so I've told myself not to trust my first, or even second instinct. Indeed, seeing this problem I thought of two things:

1. I should sort this array, then find the second to last element
2. I should find the largest number, then go through the array to find the second largest number

I figured the second thought was more in line with what the problem wanted from me. Even though Java has a built in Array sorting function, I wasn't quite sure what the time complexity was. So I went along with my second instinct, as I couldn't think of any other algorithm.

While I originally conceived my idea as a Two Pass Search, I learned that it could very easily be achieved in one. 

In trying to regain my algorithmic sense, this problem has retaught me a very important lesson (In my opinion)--which is to trust some of my human sense. Although I was more inclined to trust the sorting algorithm solution, it didn't account for duplicates. However, sometimes problems are very easily solved by thinking "How would I, a human, solve this problem?" and following suit with having a computer imitate it. Of course, this does not apply in ALL situations, but a willingness to consider the "human" solution is good to have.

So, in this case, and probably many simpler cases, the human analog logic of "Look at the elements one at a time" is better. This will not always hold true, but if the problem is simple it should be kept in mind that the solution will probably be simple as well, and there's no need to overcomplicate it.
