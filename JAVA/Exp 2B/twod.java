class twod
        {
public static void main(String[] args)
        {
        int[ ][ ] a = new int[10][5];
        System.out.println("Demo of 2D array initialized with zero");
        for (int r=0; r<10; r++)
        {
        for(int c=0; c<5; c++)
        {
        System.out.print(" " + a[r][c]);
        }
        System.out.println("");
        }
        }
        }