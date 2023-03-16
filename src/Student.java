public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;
    public Student(String firstName, String lastName, int age, int yearLevel) {
        id = studentCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        studentCount++;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public int getYearLevel() {
        return yearLevel;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
    public boolean equals(Student other) {
        if (other.toString().equals(toString())) {
            return true;
        }
        return false;
    }
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Age: " + age + ", Year Level: " + yearLevel + ".";
    }
    public void setId(int id) {
        this.id = id;
    }
}
