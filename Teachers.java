import java.util.*;
class Teacher {
    String name;
    String degree;
    private static int class1;

    private static String school;

    Teacher(String _name, String _degree, int _class1, String _school) {
        name = _name;
        degree = _degree;
        class1 = _class1;
        school = _school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public static int getClass1() {
        return class1;
    }

    public static void setClass1(int class1) {
        Teacher.class1 = class1;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Teacher.school = school;
    }
}
        public class Teachers{
            public static void main(String[] args) {
                Teacher teach1 = new Teacher("ahalya", "b.sc", 10, "private school");
                System.out.println(teach1.name);
                System.out.println(teach1.getSchool());
                teach1.setSchool("sri");
                System.out.println(teach1.getSchool());
                Teacher teach2 = new Teacher("agathiya","M.sc",12,"government school");
                System.out.println(teach2.name);
                System.out.println(teach2.getSchool());
                teach2.setSchool("little");
                Teacher teach3= new Teacher("Ram","B.ed",12,"little");
                System.out.println(teach3.name);
                System.out.println(teach3.getClass1());
                teach3.setSchool("rose");
                System.out.println(teach3.getSchool());
                Teacher teach4= new Teacher("dhivya","BE",6,"london");
                System.out.println(teach4.name);
                System.out.println(teach4.degree);
                teach4.setSchool("ramavilash");
                System.out.println(teach4.getSchool());
                System.out.println(teach3.getSchool());
                System.out.println(teach1.getSchool());
            }
        }