package controlstatements.jumpstatements;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i);
            if(i==5)
            {
                break;
            }
        }
        System.out.println();

        aa:for(int i=1; i<=3; i++)
        {
            bb:for(int j=1; j<=3; j++){
                if(i==2 && j==2)
                {
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }
        System.out.println();

        aa:for(int i=1; i<=3; i++)
        {
            bb:for(int j=1; j<=3; j++){
                if(i==2 && j==2)
                {
                    break bb;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
