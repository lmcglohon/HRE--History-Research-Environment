This is the first iteration of the HRE DB Admin tool.

It does not yet include executable programs for Linux, Mac and Windows, which reside at 

https://github.com/MichaelErichsen/HRE--History-Research-Environment/tree/org.hre.v3/org.hre.v3/releng/org.hre.product/target/products

You need to have a Java Runtime Environment installed on your system, and the JAVA_HOME environment variable set to point to it.

If you are running Windows 10, you would

Open settings Select System Select About Select System Info Seletc Advanced System Settings Select Environment Variables

User variables for New... Variable name: JAVA_HOME Variable value: C:\Program Files\Java\jdk1.8.0_141

When having saved and closed you can check by opening a command window (cmd) and typing

set JAVA_HOME

It should reply 

JAVA_HOME=C:\Program Files\Java\jdk1.8.0_141

Then HREMockup should be able to find Java.

TMG9.mv.db is an H2 database with data from the TMG Sample project. If you copy it to your home directory it should be used by the mock up. 

On Windows the home directory is found by opening a command-prompt (cmd.exe) and typing the following command

echo %USERPROFILE%

On Windows 10 that would be C:/users/youruserid

If you got the GUI running and find no data, then either

1) The database is not in the right spot
2) The database is corrupted
3) The parameter in the preferences window is not set to DIRECT or SERVER.
4) If it is set to SERVER then you haven't started the embedded server
from the mock up menu.

If the GUI is blank then either the executable is corrupted or some underlying configuration files has gone bad. In the last case it sometimes seems to help to delete the Mockup directory and to unzip the zip file again.
