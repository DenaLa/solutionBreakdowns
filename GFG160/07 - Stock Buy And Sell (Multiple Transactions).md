This problem asks you, given an array of prices that denote the cost of a stock each day, how would you find the maximum profit. Another condition of this problem is that we are allowed to buy and sell stocks any number of times.

My first thought was to see where the biggest profits could be made by buying and selling. If we buy from really cheap, and sell when it's worth a lot, then it's make a huge profit, right? That was the baseline of what I was thinking, where I would be shown that that's the idea behind the local minima and local maxima.

When prices go down, we do nothing. When prices meet a local minima, we buy (Indicated by the next day's price being higher. After buying, we let the prices rise again until they start to fall. At that point, we've hit to local maxima. It's then where we sell to maximize our profits, and buy at our new local minima. At the very last day, we sell again because that becomes our new local maxima.

While this works, there is another solution provided that manages to optimize the algorithm in a small way: and that is to sell as long as the price of the stock is increasing. This is called the "Accumulating profit" approach, and it has you buy and sell as long as there is a profit to be made. It doesn't account for local minimas or local maxima, it just places all its bet on profits. And it ends up reaching the same results either way.

There was one more solution involving recursion, but it isn't considered a very good one. It seems to jump through a lot of hoops to work as well, so I realistically don't know if any novice would think to try it on their first go of this problem. But the gist is to recursively compare every potential profit to find the maximum one. It... does not sound very intuitive.
