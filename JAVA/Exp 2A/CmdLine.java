class CmdLine
{
    public static void main(String args [])
    {
        int x,y,s;
        float f;
        x=Integer.parseInt(args[0]);
        y=Integer.parseInt(args[1]);
        s=x+y;
        System.out.println("sum of " + x + " and " + y +" is " +s);
        f=Float.parseFloat(args[2]);
        System.out.println("float value"+f);
    }
}