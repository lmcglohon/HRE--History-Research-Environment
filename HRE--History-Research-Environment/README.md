This is a skeleton of HRE V0.1.

It includes executable programs for Linux, Mac and Windows, which reside at 

http://www.myerichsen.net/HRE/

You need to have a Java Runtime Environment installed on your system, and the JAVA_HOME environment variable set to point to it.

If you are running Windows 10, you would

Open settings Select System - Select About - Select System Info - Select Advanced System Settings - Select Environment Variables

User variables for New... Variable name: JAVA_HOME Variable value: C:\Program Files\Java\jdk1.8.0_164

When having saved and closed you can check by opening a command window (cmd) and typing

set JAVA_HOME

It should reply something like

JAVA_HOME=C:\Program Files\Java\jdk1.8.0_164

Then the executable should be able to find Java.

HRE starts up blank, but can create an empty HRE H2 database for you.
