

public class Pattern {
    public static void main(String[] args) {


           int n=5;
           

           for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
           }
           for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
           }
           

          
        //    for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //    }
                //  int n =5;
                //  //upper half
                //  for(int i=1; i<=n; i++){
                //     for(int j=1; j<=i; j++){
                //         System.out.print("*");
                //     }
                //     //upper halg space
                //     int space=2*(n-i);
                //     for(int j=1;j<=space;j++){
                //         System.out.print(" ");
                //     }
                //   for(int j=1; j<=i; j++){
                //     System.out.print("*");
                //   } 
                //   System.out.println(); 
                //  }
                //  for(int i=n; i>=1; i--){
                //     for(int j=1; j<=i; j++){
                //         System.out.print("*");
                //     }
                //     //upper halg space
                //     int space=2*(n-i);
                //     for(int j=1;j<=space;j++){
                //         System.out.print(" ");
                //     }
                //   for(int j=1; j<=i; j++){
                //     System.out.print("*");
                //   } 
                //   System.out.println(); 
                //  }







        // public class Solution{
            // public static void main(String[] args){
                // Scanner sc = new Scanner(System.in);
                // int n= sc.nextInt();
                // if(n%2!=0){
                //     System.out.println("Weird");
                // }else if(n>=2&&n<=5){
                //     System.out.println("Not Weird");
                    
                // }else if(n>=6&&n<=20){
                //     System.out.println("Weird");
                // }else{
                //     System.out.println("Not Weird");
                // }
                
            // }
            
        // }





        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++ ){
        //         int sum= i+ j;
        //         if(sum%2==0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }
        

        // for(int i=1; i<=n;i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(no);
        //         no++;
        //     }
        //     System.out.println();
        // }
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        //  int n = 4;
        //  for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //  }
        //  for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //       System.out.print(" ");
        //     }
        //     for(int j=1; j<=i;j++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }
        //  for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }



            // int a=4;
            // int b=5;
            // for(int i=1; i<=a; i++){
            //     for(int j=1; j<=b; j++){
            //         if(i==1 || j==1 || i==a || j==b){
            //             System.out.print("*");
            //         }else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }
        

        // for(int i=1; i<=4; i++ ){
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    
}
