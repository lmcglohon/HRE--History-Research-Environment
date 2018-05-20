This is the fourth iteration of the HRE Mock Up.

Executable programs for Linux, Mac and Windows reside temporarily as zip files at

http://www.myerichsen.net/HRE/HRE%20Mockup%20Product-win32.win32.x86_64.zip

http://www.myerichsen.net/HRE/HRE%20Mockup%20Product-linux.gtk.x86.zip

http://www.myerichsen.net/HRE/HRE%20Mockup%20Product-linux.gtk.x86_64.zip

http://www.myerichsen.net/HRE/HRE%20Mockup%20Product-macosx.cocoa.x86_64.zip

http://www.myerichsen.net/HRE/HRE%20Mockup%20Product-win32.win32.x86.zip

Just unzip them wherever you want.

You need to have a Java Runtime Environment installed on your system, and the JAVA_HOME environment variable set to point to it.

If you are running Windows 10, you would

Open settings Select System Select About Select System Info Select Advanced System Settings Select Environment Variables

User variables for New... Variable name: JAVA_HOME Variable value: C:\Program Files\Java\jdk1.8.0_144

When having saved and closed you can check by opening a command window (cmd) and typing

set JAVA_HOME

It should reply something like

JAVA_HOME=C:\Program Files\Java\jdk1.8.0_144

Then HREMockup should then be able to find Java.

If the GUI is blank then either the executable is corrupted or some underlying configuration files has gone bad. In the last case it sometimes seems to help to delete the Mockup directory and to unzip the zip file again.

To debug you could open a command window (cmd.exe), drill down to the HRE directory and run

eclipsec.exe

The output in the command window might help to identify the problem.

How to run on Mac:

Unzip the package.

Drill down into folders: eclipse.app Contents MacOS

chmod 644 to 755 for file eclipse

Then you can run it
