package Homeworks.HW_Lesson6_sp;

/*Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil. У тілі класу створіть методи void study(), void read(), void write(), void relax().
Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil і перевизначте кожен із методів, залежно від успішності учня. Конструктор класу
ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів. Передбачте можливість, що користувач може передати 2 або 3 аргументи. Виведіть інформацію про те,
як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.*/

class HW2_ClassRoom {
    private Pupil[] pupils;

    public HW2_ClassRoom(Pupil... pupils) {
        this.pupils = new Pupil[4];
        int length = Math.min(pupils.length, 4);
        for (int i = 0; i < length; i++) {
            this.pupils[i] = pupils[i];
        }
    }

    public void printClassroomInfo() {
        for (int i = 0; i < pupils.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("   Study: ");
            pupils[i].study();
            System.out.print("   Read: ");
            pupils[i].read();
            System.out.print("   Write: ");
            pupils[i].write();
            System.out.print("   Relax: ");
            pupils[i].relax();
            System.out.println();
        }
    }
}

class Pupil {
    public void study() {
        System.out.println("Pupil - Study");
    }

    public void read() {
        System.out.println("Pupil - Read");
    }

    public void write() {
        System.out.println("Pupil - Write");
    }

    public void relax() {
        System.out.println("Pupil - Relax");
    }
}

class ExcellentPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("ExcellentPupil - Study");
    }

    @Override
    public void read() {
        System.out.println("ExcellentPupil - Read");
    }

    @Override
    public void write() {
        System.out.println("ExcellentPupil - Write");
    }

    @Override
    public void relax() {
        System.out.println("ExcellentPupil - Relax");
    }
}

class GoodPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("GoodPupil - Study");
    }

    @Override
    public void read() {
        System.out.println("GoodPupil - Read");
    }

    @Override
    public void write() {
        System.out.println("GoodPupil - Write");
    }

    @Override
    public void relax() {
        System.out.println("GoodPupil - Relax");
    }
}

class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("BadPupil - Study");
    }

    @Override
    public void read() {
        System.out.println("BadPupil - Read");
    }

    @Override
    public void write() {
        System.out.println("BadPupil - Write");
    }

    @Override
    public void relax() {
        System.out.println("BadPupil - Relax");
    }
}