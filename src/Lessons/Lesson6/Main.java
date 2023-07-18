package Lessons.Lesson6;

public class Main {
    public static void main(String[] args) {
/*        Apple ranee = new Apple();
        ranee.type = "Ranee";
        ranee.color = "Green";
        ranee.size = "small";
        ranee.weight = 5;

        Peach poznyy = new Peach();
        poznyy.type = "Ranee";
        poznyy.color = "Green";
        poznyy.size = "small";
        poznyy.weight = 3;

        System.out.println(ranee.type + " " + ranee.color + " " + ranee.size);
        System.out.println(poznyy.type + " " + poznyy.color + " " + poznyy.size);

        int weight4 = ranee.weight * 4;
        System.out.println(weight4);

        Student student = new Student(1, "Oleg", "Pavlosich", "Simonenko", 25, "Pravoznavstvo", 5, true);
        System.out.println(student.getIdStudent() + " "+student.getFirstName() + " "+student.getMiddleName() + " "+student.getLastName() +
                " " + student.getAge() + " " + student.getFacultet() + " " + student.getCourse() + " " + student.getScholarShip());*/

        Student student1Marks=new Student(3, 0, 1);
        System.out.println(student1Marks);
        System.out.println(student1Marks.Status(student1Marks.getMathMarks(), student1Marks.getHistoryMarks(), student1Marks.getProgrMarks()));
    }
}
