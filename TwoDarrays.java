


public class TwoDarrays{
    public static void main(String[] args) {
        int n= 5;
        int pos= 2;
        int bitmask = 1<<pos;

        if((bitmask & n ) == 0){
            System.out.println("bitmask is zero");
        }else{
            System.out.println("bitmask is one");
        }

    }
}

//     StringBuilder sb= new StringBuilder("Himanshu");
   



//     for(int i=0; i<sb.length()/2; i++){

//         int front= i;
//         int back= sb.length()- 1 -i;  //8-1-0

//         char frontchar= sb.charAt(front);
//         char backchar= sb.charAt(back);

//        sb.setCharAt(front,backchar);
//        sb.setCharAt(back,frontchar);



//     }
//     System.out.println(sb);
    
// }
// }
//     Scanner sc = new Scanner(System.in); 
//                 int rows = sc.nextInt();
//                 int cols = sc.nextInt();
        
        
//                 int[][] numbers = new int[rows][cols];
        
//                 //taking inputs
//                 for(int i=0; i<rows; i++){
//                     for(int j=0; j<cols; j++){
        
//                         numbers[i][j]=sc.nextInt();
//                     }
//                 }

//             int x= sc.nextInt();

//             for(int i=0; i<rows; i++){
//                 for(int j=0; j<cols; j++){
//                     if(numbers[i][j]==x){
//                         System.out.print("x is at the location: ("+ i +","+ j +" ) ");
                        
//                     }


//                 }
                
                
//             }
            

// }



// }
//     try (Scanner sc = new Scanner(System.in)) {
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();


//         int[][] numbers = new int[rows][cols];

//         //taking inputs
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){

//                 numbers[i][j]=sc.nextInt();
//             }
//         }

//         //for output
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(numbers[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

// }
// }
    

