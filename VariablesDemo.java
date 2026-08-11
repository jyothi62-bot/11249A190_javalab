public class VariablesDemo
{
    int instancevar=10;
    static String staticvar="I am static";
    public void showVariables()
    {
        int localvar=5;
        System.out.println("Instances variable:" +instancevar);
        System.out.println("static variable:" +staticvar);
        System.out.println("local variable:" + localvar);
    }
    public static void main(String[] args)
    {
        VariablesDemo obj1=new VariablesDemo();
        obj1.showVariables();
        System.out.println("Accessing static variable via class :"+ VariablesDemo.staticvar);
    }
}