package t2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Student {
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(ArrayList<Student> x, int course){
        Iterator i = x.iterator();
        while (i.hasNext()){
//            Map.Entry e = (Map.Entry) i.next();
//            if (){
            System.out.println(i.next().toString());
            }
        }
    }

