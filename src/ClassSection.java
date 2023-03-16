import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;
    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        students = new ArrayList<Student>();
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    public void addStudent(Student newStudent) {
        if (newStudent.getYearLevel() == yearLevel && !(isStudentEnrolled(newStudent)))
            students.add(newStudent);
    }
    public void removeStudent(Student oldStudent) {
        int j = 0;
        for (Student i : students) {
            if (i.toString().equals(oldStudent.toString())) {
                students.remove(j);

            }
            j++;
        }
    }
    public boolean isStudentEnrolled(Student check) {
        for (Student i : students) {
            if (check.toString().equals(i.toString())) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return "Subject: " + subject + ", Capacity: " + capacity + ", Students: " + students + ".";
    }
}
