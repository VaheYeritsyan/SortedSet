package student;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private Integer age;

    public Student(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Student student) {
        int result = this.age.compareTo(student.getAge());
        if (result == 0) {
            result = this.firstName.compareTo(student.getFirstName());
            if (result == 0) {
                result = this.lastName.compareTo(student.getLastName());
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + "\n";
    }
}
