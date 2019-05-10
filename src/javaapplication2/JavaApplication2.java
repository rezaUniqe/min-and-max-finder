/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author king of games
 */
public class JavaApplication2 {



public static void show(int p[][],int m){
System.out.println("final matrix is:[");

for(int i=0;i<m;i++){
    for(int j=0;j<m;j++){
        System.out.print(p[i][j]+",");
    }
    System.out.print("\n");
}
System.out.print("]");  
}

public static int min(int a,int b){
  if(a>=b){
    return b;
  }else{
    return a;
  }
}

public static void floyed(int p[][],int n){
  int [][]d=new int[p.length][p.length];
  //d=p;
  for (int i = 0 ; i < p.length ; i++)
  {
      System.arraycopy(p[i], 0, d[i], 0, p[i].length);
  }
for(int k=0;k<d.length;k++)
{
  for(int i=0;i<d.length;i++)
  {
    for(int j=0;j<d.length;j++)
    {
      int r=d[i][k]+d[k][j];
      d[i][j]=min(d[i][j],r);
      
    }
  }
}

show(d,p.length);

}





  public static void main(String[] args) {
   int [][]p={{0,1,1000,1,5},{9,0,3,2,1000},{1000,1000,0,4,1000},{1000,1000,2,0,3},{3,1000,1000,1000,0}};
   floyed(p,p.length);
  }
}
   
