# Behold, another one of my repos that I have abandoned. I am very sure that I will never touch this project again, but I'll leave it up for future me.

# Trisenaii
The official Github repository of Trisenaii, a text-based RPG written in Java.



IMPORTANT:

This game utilizes ANSI escape codes, which are used to clear the console.

If the software you are using to run this game doesn't support ANSI escape codes, then remove System.out.print("\033[H\033[2J"); from lines 114, 128, 153, 161, and 296.

Usually, Linux based shells support these codes, and Windows based shells do not.




You're also going to want to enable ASCII control characters in your IDE if it's not already on. This game uses ASCII control characters in the form of \n. This is helpful for writing to files.


If you want to run this on Windows for some strange demented reason then use the Windows Terminal which has ANSI escape code and ASCII control character support.
