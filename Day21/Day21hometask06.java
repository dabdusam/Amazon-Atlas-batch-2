class Student {
    public int roll_no = 10; // public field – tight coupling

    public int getRoll() {
        System.out.println("getRoll method");
        return roll_no;
    }

    public void setRoll(int roll) {
        // Only set if the roll is <= 100
        if (!(roll > 100)) {
            roll_no = roll;
        }
    }
}

public class Day21hometask06 {
    public static void main(String[] args) {
        Student sobj = new Student();

        // Directly accessing public field (tight coupling)
        sobj.roll_no = 10;  // allowed, but unsafe
        // sobj.roll_no = 110; // if uncommented, it would assign an invalid value

        // Output result
        System.out.println("The roll no of student is " + sobj.roll_no); // Output: 10
    }
}

