"The password for the next level is stored somewhere on the server and has all of the following properties:

    owned by user bandit7
    owned by group bandit6
    33 bytes in size
"

Since the file is located on the server, we need to ```cd ..``` to the root directory. Then we can use the find command in order to search for our required parameters.

For our find command, we can type ```find / -type f -user bandit7 -group bandit6 -size 33c```.

- ```find /``` lets us search for a file without needing a specific name or directory. I wasn't able to get a definitive answer for this in my search, but I believe this is similar to an empty path, or a generic path. Or calling all paths.
- ```-type f``` tells us that we are looking for a file
- ```- user bandit7``` and ```-group bandit6``` tells us that we need the file to belong to bandit7, but be in the group "bandit6"
- ```-size 33c``` tells us that we're looking for a file that's 33 bytes in size.


In adition, since there will be directories we don't have permission to enter, it would be nice to hide all the "Permission denied" messages we could get. So at the end of our command, we can append ```2>/dev/null```. Meaning, our whole command ends up being:

```find / -type f -user bandit7 -group bandit6 -size 33c 2>/dev/null```.
