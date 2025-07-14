class day2 {
    public static void day2(String[] args) {

        //here we have to create the right angled triangle
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //now lets write the code for the reverse reverse right angle

        for(int i=5;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //lets write the program called factorial
    //so how does it work
    //if you give 5  it should calculate 5*4*3*2*1
    public static int fact(int a )
    {
        int f=1;
        //lets go with the logic of fact
        for(int i=2;i<=a;i++){
            f=f*i;
        }
        return f;
    }

    //now we need to create a right angled triangle by the stars


}
