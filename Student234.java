class Student234
{
    int rollNo;
    static String college = "AEC";

    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.rollNo = 101;
        s2.rollNo = 102;

        System.out.println(s1.rollNo + " " + s1.college);
        System.out.println(s2.rollNo + " " + s2.college);
    }
}