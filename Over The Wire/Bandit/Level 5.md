"The password for the next level is stored in the only human-readable file in the inhere directory. Tip: if your terminal is messed up, try the “reset” command."

the file command can tell us the type of data is inside a file. This means, we can use our knowledge of readable data types to figure out which files can be read and which ones can't.

we could individually go through each of them and write ```file ./-file00`` and so on and so forth, but it would take a bit. So instead, we will use the wildcard to print all the information we need at once. The format for the answer will be ```file ./*```.

(We need to write it as "./" because all the files start with a -)
