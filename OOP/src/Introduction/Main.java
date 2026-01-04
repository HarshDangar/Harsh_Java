package Introduction;

public class Main {
    public static void main(String[] args) {
//        Student[] students = new Student[5];

        // name declaring of object referring to class
//        Student harsh = new Student();

//        harsh.rollno = 13;
//        harsh.name = "Harsh Dangar";
//        harsh.marks = 99.89f;

//        harsh.changeName("Denish");
//        harsh.greeting();

        Student harsh = new Student(16 , "Denish" , 76f);

        System.out.println(harsh.name);
        System.out.println(harsh.rollno);
        System.out.println(harsh.marks);


        Student arpit = new Student();

        System.out.println(arpit.name);
    }
}


class Student {
    int rollno;
    String name;
    Float marks;

    void greeting() {
        System.out.println("Hello my name is " + name);
    }

    void changeName(String newname) {
        name = newname;
    }

    Student () {
        this (13 , "Saheel" , 65.87f);
        //here one constructor is called in by another constructor
        // and here this is refering like student with argument but we don't write like this because it is refering
    }

    Student (int rno , String naam , Float mark) {
        this.rollno = rno;
        this.name = naam;
        this.marks = mark;
    }
}

