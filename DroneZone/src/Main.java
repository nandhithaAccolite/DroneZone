import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of a grid (rows columns)");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] grid= new int[m][n];
        System.out.println("Created grid with size ("+m+","+n+")");
        System.out.println("Enter position of first drone(x1 y1)");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        while(true)
        {
            if(x1>=m || y1>=n){
                System.out.println("Position out of grid range");
                System.out.println("Enter position of first drone(x1 y1)");
                x1=sc.nextInt();
                y1=sc.nextInt();
            }
            else{
                break;
            }
        }
        grid[x1][y1]=1;
        System.out.println("Enter position of second drone(x2 y2)");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        while(true)
        {
            if(x2>=m || y2>=n){
                System.out.println("Position out of grid range");
                System.out.println("Enter position of second drone(x2 y2)");
                x2=sc.nextInt();
                y2=sc.nextInt();
            }
            else if (grid[x2][y2]==1) {
                System.out.println("Already drone exist in this position");
                System.out.println("Enter position of second drone(x2 y2)");
                x2=sc.nextInt();
                y2=sc.nextInt();
            } else{break;}
        }
        grid[x2][y2]=1;
        System.out.println("Enter position of third drone(x3 y3)");
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        while(true)
        {
            if(x3>=m || y3>=n){
                System.out.println("Position out of grid range");
                System.out.println("Enter position of third drone(x3 y3)");
                x3=sc.nextInt();
                y3=sc.nextInt();
            }
            else if ((grid[x3][y3]==1)) {
                System.out.println("Already drone exist in this position");
                System.out.println("Enter position of third drone(x3 y3)");
                x3=sc.nextInt();
                y3=sc.nextInt();
            }
            else{break;}
        }
        grid[x3][y3]=1;
        System.out.println("Enter position of fourth drone(x4 y4)");
        int x4=sc.nextInt();
        int y4=sc.nextInt();
        while(true)
        {
            if(x4>=m || y4>=n){
                System.out.println("Position out of grid range");
                System.out.println("Enter position of fourth drone(x4 y4)");
                x4=sc.nextInt();
                y4=sc.nextInt();
            }
            else if ((grid[x4][y4]==1)) {
                System.out.println("Already drone exist in this position");
                System.out.println("Enter position of fourth drone(x4 y4)");
                x4=sc.nextInt();
                y4=sc.nextInt();
            }
            else{break;}
        }
        grid[x4][y4]=1;
        System.out.println("Enter position of target(x y)");
        int x=sc.nextInt();
        int y=sc.nextInt();
        while(true) {
            if (x >= m || y >= n) {
                System.out.println("Position out of grid range");
                System.out.println("Enter position target(x y)");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            else{
                break;
            }
        }
        grid[x][y]=100;

        DroneZone d= new DroneZone(x1,y1,x2,y2,x3,y3,x4,y4);
        d.path(x,y);
    }
}
