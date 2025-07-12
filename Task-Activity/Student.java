public class Student {
    private String firstName;
    private String lastName;

    // Constructor
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to print the full name
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    // Main method to test the class
    public static void main(String[] args) {
    Student student = new Student("Morgan", "Freeman");
    student.printFullName();

    student = new Student("Brad", "Pitt");
    student.printFullName();

    student = new Student("Kevin", "Spacey");
    student.printFullName();
}
}

