class RollNumberTable extends Thread {
    private int number;

    public RollNumberTable(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Multiplication Table for Roll Number: " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        System.out.println();
    }
}

class DOBTable extends Thread {
    private int number;

    public DOBTable(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Multiplication Table for Date of Birth: " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        int rollNumber = 348; // Last three digits of roll number, e.g., "2022-SE-348"
        int dobNumber = 9;    // Day of birth, e.g., "09-June"

        RollNumberTable rollNumberTable = new RollNumberTable(rollNumber);
        DOBTable dobTable = new DOBTable(dobNumber);

        rollNumberTable.start();
        dobTable.start();
    }
}

