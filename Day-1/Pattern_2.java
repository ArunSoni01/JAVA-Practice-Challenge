//Printing Name- Saswati
public class Pattern_2{
    public static void main(String[] args) {
        int n=11;
        for(int i=0; i<n; i++)
        {   
            //S
            for(int j=0; j<n; j++)
            {
              if(i==0 && j<=(n-1)/2 && j>0|| i==(n-1)/2 && j<=(n-1)/2 && j!=(n-1)/2 && j>0 || i==(n-1) && j<(n-1)/2  || j==0 && i<(n-1)/2 && i!=0 || j==(n-1)/2 && i>(n-1)/2 && i<(n-1)) 
              {
                System.out.print("*");
              }
              else 
              {
                System.out.print(" ");
              }
            }
            System.out.print(" ");
            //A
            for(int j=0; j<n; j++)
            {
              if(j==0 && i!=0|| j==(n-1) && i!=0 || i==0 && j>0 && j!=(n-1) || i==(n-1)/2)
              {
                System.out.print("*");
              }
              else 
              {
                System.out.print(" ");
              }
            }
            System.out.print("    ");
            //S
            for(int j=0; j<n; j++)
            {
              if(i==0 && j<=(n-1)/2 && j>0|| i==(n-1)/2 && j<=(n-1)/2 && j!=(n-1)/2 && j>0 || i==(n-1) && j<(n-1)/2  || j==0 && i<(n-1)/2 && i!=0 || j==(n-1)/2 && i>(n-1)/2 && i<(n-1)) 
              {
                System.out.print("*");
              }
              else 
              {
                System.out.print(" ");
              }
            }
            System.out.print(" ");
            //W
            for(int j=0; j<n; j++)
            {
              if(j==0 || j==(n-1) || i==j && i>=(n-1)/2 || i+j==(n-1)&& i>=(n-1)/2) 
              {
                System.out.print("*");
              }
              else 
              {
                System.out.print(" ");
              }
            }
            System.out.print("  ");
             //A
            for(int j=0; j<n; j++)
            {
              if(j==0 && i!=0|| j==(n-1) && i!=0 || i==0 && j>0 && j!=(n-1) || i==(n-1)/2)
              {
                System.out.print("*");
              }
              else 
              {
                System.out.print(" ");
              }
            }
            System.out.print("    ");
            //T
            for(int j=0; j<n; j++)
            {
               if(i==0 && j<=(n-1)  || j==(n-1)/2 ) 
               {
                  System.out.print("*");
                }
              else 
               {
                 System.out.print(" ");
               }
            }
            System.out.print("   ");
            //I
            for(int j=0; j<n; j++)
            {
               if(i==0 && j<=(n-1) || i==(n-1) && j<=(n-1) || j==(n-1)/2 ) 
               {
                  System.out.print("*");
                }
              else 
               {
                 System.out.print(" ");
               }
            }
            System.out.print("   ");
        
            System.out.println();
          }      
    }
}
