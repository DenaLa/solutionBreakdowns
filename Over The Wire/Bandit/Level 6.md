"The password for the next level is stored in a file somewhere under the inhere directory and has all of the following properties:

    human-readable
    1033 bytes in size
    not executable"


We can use file to figure out which text is human readable, du to find file sizes, and find to find which files aren't executable.

I wanted to find a one step solution instead of bruteforcing my way through like I did the first time, so I consulted [the guide](https://mayadevbe.me/posts/overthewire/bandit/level6/) I'd been using for the first time.

the command they ultimately suggested was ```find . -type f -size 1033c ! -executable -exec file '{}' \; | grep ASCII```, but I'll admit, prt of it has me really stumped.

```find . -type -f -size 1033c ! -executable``` makes sense. It's a command that states to find files that are 1033 bytes, and that aren't executable.

```grep ASCII``` makes sense. We're narrowing down our search from our file function

```-exec file '{}' \;``` is the part that stumps me, though. ```-exec``` is a flag that allows us to execute the file command, but the trailing ```'{}' \;``` is where I get completely lost. I'm not sure what it means. I know that ```file */{.,}*``` lets us print all files in all directories, including hidden ones, but I'm not sure how it translates to what we have here.

I think as I go deeper I'll learn what it means incidentally, but for now? I'm lost.
