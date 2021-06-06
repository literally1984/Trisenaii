# Trisenaii
The official Github repository of Trisenaii, a text-based RPG written in Java.


IMPORTANT:
If the tool you are using to run this code doesn't support ANSI escape codes (For example, the Eclipse IDE does not support them), then remove System.out.print("\033[H\033[2J"); from lines 117, 125, 155, 163, and 314.

To check if whatever your using supports ANSI escape codes, first run the program. If the escape codes do work, then the console should either print "Game files created successfully." or "Error: At least one file has not been successfully created. Parts of the game might not work correctly. Please try restarting the program." If the escape codes do not work, then the console will either print "[H[2JGame files created successfully." or "[H[2JError: At least one file has not been successfully created. Parts of the game might not work correctly. Please try restarting the program."

More info about ANSI escape codes can be found in the links below:
https://www.reddit.com/r/java/comments/1uuvqo/clear_terminal_screen_linux/

https://www.javatpoint.com/how-to-clear-screen-in-java#ANSI-escape-Code
