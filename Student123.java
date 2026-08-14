class Student123
{
    static int count = 0;

    Student()
    {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
    }
}