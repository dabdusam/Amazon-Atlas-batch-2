class Students {
    private int roll_no = 0;

    public int getRoll() {
        System.out.println("getRoll method");
        return roll_no;
    }

    public void setRoll(int roll) {
        if (!(roll > 100)) {
            roll_no = roll;
        }
    }
}

public class Day21hometask07 {
    public static void main(String[] args) {
        Student sobj = new Student(); // Could also use an interface type for more flexibility
        sobj.setRoll(10); // Set a valid roll number
        System.out.println("The roll no of student is " + sobj.getRoll());
    }
}

