class Student111
{
    static String college = "ABC College";
    int rollNo;

    Student111(int r)
    {
        rollNo = r;
    }

    public static void main(String[] args)
    {
        Student111 s1 = new Student(101);
        Student111 s2 = new Student(102);

        System.out.println(s1.rollNo);
        System.out.println(s2.rollNo);
        System.out.println(Student.college);
    }
}