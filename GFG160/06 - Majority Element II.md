Given an array, find all the array elements that occurr more than n/3 times. n will stand in for the array's length.

The exact wording is floor(n/3), which is important to note. The question is esstenially asking you if there are elements that appear more than a third of the time in a given array.

There ARE three given solutions, but I never entertained the very first one. So for the sake of brevity and accuracy, I'll be skipping the explanation on using a nested loop, and going straight to using a Hash Map.

For problems like this, I immediately think of using a Hash Map. To me it's very intuitive, it'd be like making a tally on pen and paper. If you encounter a new element, add it to the hash map. If you encounter a recourring element, add a tally to it. And once you're finished, you go through the hash map to see which elements appear more than n/3 times. Then, we place those elements into a seperate list. Which SEEMS great. And I'd like to think it is-- it's pretty intuitive for the most part. However, it takes up a bit more space than usual. And as expected, there is a way to do this without taking up more space.

There is an algorithm called the Boyer-Moore's algorithm. I've never heard of it before approaching this problem. It's an algorithm designed to find majority elements, hence why it is the expected approach for this problem. It works on a baseline assumption, that for our case relies on the fact that we are looking for elements that occur more than n/3 times-- if 2 elements appear more than n/3 times, then the remaining elements definitely DO NOT appear more than n/3 times. It workes similarly if the constant was 2, or 4 instead. For 2, if 1 element appears more than n/2 times, then the other ones don't. For 4, if three elements appear more than n/4 times, then the other ones don't. It hinges on the logical reasoning that there is only so much space with the portions you are dividing the array into, and there's only so much space a elements can take up before your ratio exceeds 1.

For our implementation of this algorithm, we do the following:

1. Initialize 2 candidates, and 2 counts for each element
2. As we iterate though the array we keep certain things in mind:
	a. if an element is equal to either candidate, incriment the count by 1. If the element is not equal to any candidate, decrease the count by 1.
	b. If any count reaches 0, replace that candidate with the current element and increment the count by 1.
3. After we go through the array once, we go through it again. After resetting the count to 0, we only search the array to count how many times our candidates appears.
4. After this, we will create an array list, and if the count of the candidate is over n/3, we add it to the result array list. This should give us our answer.

The logic for this is that if any count hits 0 during our first pass, it means that there is an element that appears either more times or the exact same numbers of times as it. If this is true, it cannot be a majority element. So, it gets replaced and we keep searching for elements.

This algorithm is split into what I like to count as the scouting and eligibility test phases. The first pass is just scouting to see what candidates you can get. The second is for eligibility-- it checks to see if our candidates really do appear more than n/3 times.

It took me a little bit to wrap my head around the eligibility phase, but once I got it down, the rest came to me simply.
