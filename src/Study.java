class Study
{
    private String course;
    //TODO
    System.out.println(printCourse());

    public Study(String course)
    {

        this.course ="Hfer";

    }

    public String printCourse()
    {
       // System.out.print(course);
       return this.course;
    }

}

class JavaProgram
{
    public static void main(String[] args)
    {
        //TODO

        Study point = new Study();
        System.out.println(point);
    }
} 