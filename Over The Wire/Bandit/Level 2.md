"The password for the next level is stored in a file called - located in the home directory"

This one is as simple as the last one, except there's a catch. ```-``` is a special character. That means it has a special utilization within or command line. It _also_ means we cannot carelessly call it when using a command.

I had remembered this, but didn't quite remeber how to refer to a special character without calling its function. I tried ```cat \-``` and ```cat /-```-- both things I had remembered from attempting to use other special charracters. But eventually I heeded the suggestion OTW made to search google, and found that what I was looking to do was use ```cat ./-```
