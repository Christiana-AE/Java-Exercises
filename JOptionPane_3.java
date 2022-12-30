//Source Code 
String userChoice1;
int userChoice;
do
{
userChoice1 = JOptionPane.showInputDialog ("Choose one of the following options \n Choice 
1 - Print System Details. \n Choice 2 - Diagnose System \n Choice 3 - Set Details \n Choice 4 - Quit 
the program");
userChoice = Integer.parseInt(userChoice1); // change from string to integer
switch (userChoice) 
{
case 1: 
mySystem.displayDetails();
break;
case 2: 
mySystem.diagnoseSystem();
break; 
 case 3: 
mySystemMemory = JOptionPane.showInputDialog("Enter computer memory size in 
MB");
mySystemHardDisk = JOptionPane.showInputDialog("Enter computer hard disk size 
in GB");
systemMemory = Integer.parseInt( mySystemMemory );
systemHardDisk = Double.parseDouble(mySystemHardDisk);
mySystem.setMemory(systemMemory);
mySystem.setHardDisk(systemHardDisk);
break;
default: 
if (userChoice != 4) JOptionPane.showMessageDialog(null, "Unknown option, please choose 
between options 1 to 4");
}
} 
while (userChoice != 4)
}
