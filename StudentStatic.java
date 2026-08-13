class Students
{
    static String college = "ABC College";
    int rollNo;

    Student(int r)
    {
        rollNo = r;
    }

    public static void main(String[] args)
    {
        Student s1 = new Student(101);
        Student s2 = new Student(102);

        System.out.println(s1.rollNo);
        System.out.println(s2.rollNo);
        System.out.println(Student.college);
    }
}