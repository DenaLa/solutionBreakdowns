"The goal of this level is for you to log into the game using SSH. The host to which you need to connect is bandit.labs.overthewire.org, on port 2220. The username is bandit0 and the password is bandit0. Once logged in, go to the Level 1 page to find out how to beat Level 1."

It's very simple. All we have to do is ensure we can log into the server using the ssh command.

since the host is bandit.labs.overthewire.org, the port is 2220, the username is bandit0 and the password is bandit0, we simply need to type ```ssh bandit0@bandit.labs.overthewire.org -p2220```into our terminal.

Once we do, we will be prompted by a password. The password (which was given to us, is ```bandit0```, so when we type that, we are officially let into the game.

An aside thing to note for posterity, is that ssh is a more secure version of something like Telnet, and lives on port 22.
