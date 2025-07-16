import java.util.Scanner;

public class day4 {
    public static void main(String[] args){
        //so here we are gonna learn about 2d array
        //int [][] ttw=new int[2][3];
        // here we have given 2 as the row number and 3 as column number

        // the first task of us is to create and print a 2d array
        Scanner sc=new Scanner(System.in);
        int row=2;
        int col=3;
        int [][] a= new int[row][col];
        //now give the input for the 2d array
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                //here we have to give the input
                a[i][j]=sc.nextInt();
            }
        }

        //here we have learnt that a.length gives us the length of rows
        // and a[0].length gives us the length of columns in 2 dimensional array

        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                //here we have to give the input
                System.out.print("matrix["+i+"]["+j+"] ="+a[i][j]+"  ");
            }
            System.out.println();
        }

        //lets go with transposing all the elements of the given 2d array as 2*3 to 3*2
        int [][] transpose=new int[3][2];

        //lets access the elements from actual

    }

}
