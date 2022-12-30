import javax.swing.JOptionPane;

public class System_Y3872586 {
    // the attributes
    private String make;
    private String model;
    private int speed;
    private int memorySize; // size in MB
    private double hardDiskSize; // size in GB
    private double purchaseCost;

    // the constructor
    public System_Y3872586(String makeIn, String modelIn, int speedIn) {
        make = makeIn;
        model = modelIn;
        speed = speedIn;
    }

    // method to return attribute values
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getProcessorSpeed() {
        return speed;
    }

    // method to set the corresponding attributes
    public void setMemory(int memorySizeIn) {
        memorySize = memorySizeIn;
    }

    public void setHardDisk(double hardDiskSizeIn) {
        hardDiskSize = hardDiskSizeIn;
    }

    public void setPurchaseCost(double purchaseCostIn) {
        purchaseCost = purchaseCostIn;
    }

public void displayDetails () // using JOptionPane
{
JOptionPane.showMessageDialog(null, "The System make is" + getMake() + "\nThe 
model is " + getModel() + " with a speed of " + getProcessorSpeed());
}

    public String checkHDStatus() {
        if (hardDiskSize < 2) // size in GB
        {
            return "Low";
        } else {
            return "Ok";
        }
    }

    public boolean goodMemorySize() {
        if (memorySize < 128) // memory in MB
            return false;
        else
            return true;
    }

    public void diagnoseSystem() {
        System.out.println("Hard disk size = " + checkHDStatus());
        System.out.println("Memory size OK = " + goodMemorySize());
}

// System Test
import javax.swing.JOptionPane;

public class SystemTest_Y3872586 {
    public static void main(String[] args) {
        String mySystemMake, mySystemModel, systemSpeed;
        int mySystemSpeed;
        System_Y3872586 mySystem; // creating a new system with name to reference it

        // Get the values from the user
        mySystemMake = JOptionPane.showInputDialog("What is your computer make");
        mySystemModel = JOptionPane.showInputDialog("What is your system model");
        systemSpeed = JOptionPane.showInputDialog("What is your computer system speed");
        mySystemSpeed = Integer.parseInt(systemSpeed);
        mySystem = new System_Y3872586(mySystemMake, mySystemModel, mySystemSpeed);

        // variables to hold the system memory, hard disk, purchase cost
        String mySystemMemory, mySystemHardDisk, mySystemPurchaseCost;
        int systemMemory;
        double systemHardDisk, systemPurchaseCost;
        mySystemMemory = JOptionPane.showInputDialog("Enter computer memory size in MB");
        mySystemHardDisk = JOptionPane.showInputDialog("Enter computer hard disk size in GB");
        mySystemPurchaseCost = JOptionPane.showInputDialog("Enter the cost of purchase");
        systemMemory = Integer.parseInt(mySystemMemory);
        systemHardDisk = Double.parseDouble(mySystemHardDisk);
        systemPurchaseCost = Double.parseDouble(mySystemPurchaseCost);
        mySystem.setMemory(systemMemory);
        mySystem.setHardDisk(systemHardDisk);
        mySystem.setPurchaseCost(systemPurchaseCost);
        mySystem.diagnoseSystem();
        mySystem.displayDetails();
    }
}
