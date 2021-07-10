//Addition
public class MatAddMul
{
    public static void main(String args[])
    { 
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
        int c[][]=new int[3][3];  
    
        for(int i=0;i<3;i++)
        {    
            for(int j=0;j<3;j++)
            {    
                c[i][j]=a[i][j]+b[i][j];   
                System.out.print(c[i][j]+" ");    
            }    
            System.out.println();   
        }    
    }
} 

/*
OUTPUT FOR MATRIX ADDITION
C:\Users\HP\Desktop\Mycaptain_Java>javac MatAddMul.java

C:\Users\HP\Desktop\Mycaptain_Java>java MatAddMul
2 6 8
4 8 6
4 6 9
*/

//MULTIPLICATION
public class MatAddMul
{
    public static void main(String args[])
    { 
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
        int c[][]=new int[3][3];  
    
        for(int i=0;i<3;i++)
        {    
            for(int j=0;j<3;j++)
            {    
                c[i][j]=0;      
                for(int k=0;k<3;k++)      
                {      
                    c[i][j]+=a[i][k]*b[k][j];      
                }
                System.out.print(c[i][j]+" ");  
            }  
            System.out.println();
        }          
    }
}
/*
OUTPUT FOR MATRIX MULTIPLICATION
C:\Users\HP\Desktop\Mycaptain_Java>javac MatAddMul.java

C:\Users\HP\Desktop\Mycaptain_Java>java MatAddMul
11 23 29
13 28 32
16 35 44
*/


