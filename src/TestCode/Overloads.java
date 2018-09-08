package TestCode;

public class Overloads {
    String uniqueID;

    public int addNuns(int num1, int num2) {
        return num1 + num2;
    }

    public double addNums(double num1, double num2) {
        return num1 + num2;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        String stringID = Integer.toString(uniqueID);
        this.uniqueID = stringID;
    }

    public static void main(String[] args) {
        Overloads overloads = new Overloads();
        overloads.setUniqueID(23424);
        System.out.println(overloads.uniqueID);
    }
}
