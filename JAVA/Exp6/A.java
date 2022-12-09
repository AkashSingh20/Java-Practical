class A
{   int a1;            //public by default
    protected int a2;   //protected to A
    void showa1a2()
    {
        System.out.println("In class A: a1 : "+a1+", a2 : "+a2);
    }
}
//create a subclass by extending A
class B extends A
{
    int b;
    void showb()
    {
        System.out.println("In class B:b : "+b);
    }
    void sum()
    {
        System.out.println("a1+a2*b : "+(a1+a2*b));
    }

}
class test {
    public static void main(String args[]) {
        B subob = new B();
        subob.a1 = 5;
        subob.a2 = 6;
        subob.b = 10;
        subob.showa1a2();
        subob.showb();
        subob.sum();
    }
}