import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DroneZone{
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2= new ArrayList<>();
    int m,n;
    public DroneZone(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4) {
        l1=Arrays.asList(x1,x2,x3,x4);
        l2=Arrays.asList(y1,y2,y3,y4);
        m= l1.size();
        n= l1.size();
    }


    public void path(int x, int y)
    {
        for(int i=0;i<m;i++){
            System.out.println("Path taken by drone "+(i+1));
            int kx=l1.get(i);
            int ky=l2.get(i);
            while(true){
                if(kx==m-1){
                    kx=0;
                    if(ky==n-1){
                        ky=ky-1;
                    }
                    else{
                        ky=ky+1;}
                    System.out.println(kx+","+ky);
                }
                if(kx==x && ky==y){
                    System.out.println("Target Reached by drone "+(i+1)+"- "+kx+","+ky);
                    break;
                }
                else if (kx==x) {
                    if(y>ky){
                        ky=ky+1;}
                    else{
                        ky=ky-1;
                    }
                }
                else{
                    kx=kx+1;
                }
                System.out.println(kx+","+ky);
            }
        }
    }

}
