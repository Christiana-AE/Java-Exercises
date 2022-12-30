//Source Code 
public void displaySystemProperties()
{
JOptionPane.showMessageDialog(null, "Operating system architecture: " + 
System.getProperty ("os.arch") +
"\n Operating system name: " + System.getProperty("os.name") + 
"\n Operating system version: " + System.getProperty("os.version") + 
"\n User Account Name: " + System.getProperty("user.name") + 
"\n JAVA version: " + System.getProperty("java.version"));
String myOSName = System.getProperty("os.name"); // create variable for Operating 
System Name for if test
if ( myOSName.equals("Windows 10"))
{ 
JOptionPane.showMessageDialog(null, "Congratulations, your Operating System is Windows 10" );
}
else if (myOSName.equals("Linux"))
{
JOptionPane.showMessageDialog(null, "Unfortunately, your Operating System is Linux");
}
else
 {
JOptionPane.showMessageDialog(null, "Your Operating system is neither Windows 10 nor Linux ");
}
}
}
// Test / Evidence 
mySystem.displaySystemProperties();