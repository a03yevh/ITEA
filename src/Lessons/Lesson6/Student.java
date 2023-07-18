package Lessons.Lesson6;

public class Student {
    private int idStudent;
    private String firstName;
    private String middleName;
    private String lastName;
    private int vik;
    private String facultet;
    private int course;
    private boolean isStependiya;
    private int mathMarksa;
    private int historyMarks;
    private int progrMarks;


    public Student(int mathMarksa, int historyMarks, int progrMarks) {
        this.mathMarksa = mathMarksa;
        this.historyMarks = historyMarks;
        this.progrMarks = progrMarks;
        int a = (mathMarksa + historyMarks + progrMarks) / 3;
        System.out.println(a);

        if (a > 3) {
            isStependiya = true;
        } else {
            isStependiya = false;
        }

    }

    public String Status(int mathMarksa, int historyMarks, int progrMarks) {
        this.mathMarksa = mathMarksa;
        this.historyMarks = historyMarks;
        this.progrMarks = progrMarks;
        int a = (mathMarksa + historyMarks + progrMarks) / 3;
        System.out.println(a);

        String status;
        if (a <= 1) {
            status = "Вас відраховано";
        } else {
            status = "Вас не відраховано";
        }
        return status;
    }

    public int getMathMarks() {
        return mathMarksa;
    }

    public void setMathMarks(int mathMarksa) {
        this.mathMarksa = mathMarksa;
    }

    public int getHistoryMarks() {
        return historyMarks;
    }

    public void setHistoryMarks(int historyMarks) {
        this.historyMarks = historyMarks;
    }

    public int getProgrMarks() {
        return progrMarks;
    }

    public void setProgrMarks(int progrMarks) {
        this.progrMarks = progrMarks;
    }

    public Student(int idStudent, String firstName, String middleName, String lastName, int vik, String facultet, int course, boolean isStependiya) {
        this.idStudent = idStudent;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.vik = vik;
        this.facultet = facultet;
        this.course = course;
        this.isStependiya = isStependiya;
    }

    public int getidStudent() {
        return idStudent;
    }

    public void setidStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getmiddleName() {
        return middleName;
    }

    public void setmiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getVik() {
        return vik;
    }

    public void setVik(int vik) {
        this.vik = vik;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isStependiya() {
        return isStependiya;
    }

    public void setStependiya(boolean stependiya) {
        isStependiya = stependiya;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", vik=" + vik +
                ", facultet='" + facultet + '\'' +
                ", course=" + course +
                ", isStependiya=" + isStependiya +
                '}';
    }
}