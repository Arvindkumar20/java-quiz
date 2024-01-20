import java.util.Scanner;

// **************************easy class start here******************************************************* 
class Easy { 
    public int ans;
        public int score =0;
    // ******************************************************************score function start here 
    public void score(){
        System.out.println("Congrantulation");
        System.out.println("your score is : " + score);
    }
    public void easy(){
        System.out.println("*****WELCOME TO OUR EASY QUIZ QUERY***** \n query 1 start here");
        // ****************************************query one start here ***************************************************************************************************************
System.out.println("2 , 3 = 13\n4 , 2 = 20\n5 , 3 = 34\n2 , 5 = ?\ngive  your solution : ");
// *******************************try start*************************
try (Scanner sc = new Scanner(System.in)){
     ans=sc.nextInt();
if(ans==29){
    score+=10;
    System.out.println("\nQuery 2 start here");
easy2();
}
// **************else start *******
else{
    System.out.println("wrong answer  X\n If you want to again solve it then type 1\n  or\n   you want help then type 0 ");
    ans=sc.nextInt();
    if (ans==1){
       easy(); 
    }
    else{
        System.out.println("2 , 3 = 2*2 + 3*3 => 13\n4 , 2 = 4*4 + 2*2 => 20\n5 , 3 = 5*5 + 3*3 => 34\n2 , 5 = 5*5 + 2*2=>29");
        System.out.println("if you want to try again then pres 1 for skip press 0");
       ans=sc.nextInt();
        if(ans==1)
easy();
     easy2();
    }
} 
}
// ***********************try end **************************************
    }
       // ****************************************query two start here function easy 2 start***************************************************************************************************************
    public void easy2(){
System.out.println("\n 3 , 3 = 18\n3 , 4 = 25,\n2 , 7 = 53\n4 , 5 = ?\ngive  your solution : ");
// ***********************************try start ********************
try (Scanner sc = new Scanner(System.in)) {
     ans=sc.nextInt();
if(ans==41){
        score+=10;
    System.out.println("query 3 start here");
easy3();
    }
    else{
        System.out.println("wrong answer  X\n If you want to again solve it then type 1\n  or\n   you want help then type 0 ");
    ans=sc.nextInt();
    if (ans==1){
       easy2(); 
    }
    else {    
    System.out.println("3 , 3 = 3*3 + 3*3 => 18\n3 , 4 = 3*3 + 4*4 => 25\n2 , 7 = 2*2 + 7*7 => 53\n4 , 5 = 4*4 + 5*5 => 41");
  System.out.println("if you want to try again then press 1 for skip press 0");
        ans=sc.nextInt();
        if(ans==1)
easy2();
     easy3();
    }  
}
}
// **********************************try end ************************
    }
     // ********************function easy 2 end*****************query three start here easy function start here ***************************************************************************************************************
     public void easy3(){
System.out.println("\n 4 , 3 = 25\n7 , 4 = 65,\n8 , 5 = 89\n9 , 3 = ?\ngive  your solution : ");
// ***********************************try start ********************
try (Scanner sc = new Scanner(System.in)) {
     ans=sc.nextInt();
if(ans==90){
        score+=10;
    System.out.println("query 4 start here");
easy4();
    }
    else{
        System.out.println("wrong answer  X\n If you want to again solve it then type 1\n  or\n   you want help then type 0 ");
    ans=sc.nextInt();
    if (ans==1){
       easy3(); 
    }
    else {    
    System.out.println("4 , 3 = 4*4 + 3*3 => 25\n7 , 4 = 7*7 + 4*4 => 65\n8 , 5 = 8*8 + 5*5 => 89\n9 , 3 = 9*9 + 3*3 => 90");
  System.out.println("if you want to try again then press 1 for skip press 0");
        ans=sc.nextInt();
        if(ans==1)
easy3();
     easy4();
    }  
}
}
// ********************************************try end 
     }
         //  *****************************************functin easy_3 end**************    //  *****************************************functin easy_4 start*********************** 
     public void easy4(){
System.out.println("\n 5 , 5 = 50\n6 , 6 = 72,\n4 , 4 = 32\n7 , 7 = ?\ngive  your solution : ");
// ***********************************try start ********************
try (Scanner sc = new Scanner(System.in)) {
     ans=sc.nextInt();
if(ans==98){
        score+=10;
    System.out.println("query 5 start here");
easy5();
    }
    else{
        System.out.println("wrong answer  X\n If you want to again solve it then type 1\n  or\n   you want help then type 0 ");
    ans=sc.nextInt();
    if (ans==1){
       easy4(); 
    }
    else {    
    System.out.println("5 , 5 = 5*5 + 5*5 => 50\n6 , 6 = 6*6 + 6*6 => 72\n4 , 4 = 4*4 + 4*4 => 32\n7 , 7 = 7*7 + 7*7 => 98");
  System.out.println("if you want to try again then press 1 for skip press 0");
        ans=sc.nextInt();
        if(ans==1)
easy4();
     easy5();
     
    }  
}
}
// ********************************************try end 
     }
    //  *****************************************functin easy_4 end***************     //************************************/ functin easy_5 start ***********************
    public void easy5(){
        System.out.println("9 , 8 = 17\n8 , 7 = 15\n7 , 6 = 13\n6 , 5 = ?\ngive your solution : ");
// ********************************start try here 
try(Scanner sc=new Scanner(System.in)){
    ans=sc.nextInt();
    if(ans==11){
        score+=10;
score();
Mediam a= new Mediam();
a.mediam();
    }
       else{
        System.out.println("wrong answer  X\n If you want to again solve it then type 1\n  or\n   you want help then type 0 ");
    ans=sc.nextInt();
    if (ans==1){
       easy5(); 
    }
    else {    
    System.out.println("3 , 3 = 3*3 - 3 => 6\n3 , 4 = 3*3 - 4 => 5\n2 , 3 = 2*2 - 3 => 1\n4 , 5 = 4*4 - 5 => 11");
  System.out.println("if you want to try again then press 1 for skip press 0");
        ans=sc.nextInt();
        if(ans==1)
easy5();
Mediam a= new Mediam();
a.mediam();
} 
}
}
// ********************************try end here 
    }
}
// ************************************************************Easy class end here********************************************mediam class start here************************************ 
class Mediam{
    Easy a=new Easy();
    // **********************************************************functin mediam start 
    public void mediam(){
        System.out.println("*****WELCOME TO OUR MEDIAM QUIZ QUERY*****");
System.out.println("\n 3 , 3 = 6\n3 , 4 = 5,\n2 , 3 = 1\n4 , 5 = ?\ngive  your solution : ");
// ***********************************try start ********************
try (Scanner sc = new Scanner(System.in)) {
     a.ans=sc.nextInt();
if(a.ans==11){
    a.score+=10;
    System.out.println("query 2 start here");
mediam2();
    }
    else{
        System.out.println("wrong answer  X\n If you want to again solve it then type 1\n  or\n   you want help then type 0 ");
    a.ans=sc.nextInt();
    if (a.ans==1){
       mediam(); 
    }
    else {    
    System.out.println("3 , 3 = 3*3 - 3 => 6\n3 , 4 = 3*3 - 4 => 5\n2 , 3 = 2*2 - 3 => 1\n4 , 5 = 4*4 - 5 => 11");
  System.out.println("if you want to try again then press 1 for skip press 0");
        a.ans=sc.nextInt();
        if(a.ans==1)
mediam();
     mediam2();
    }  
}
}
// ********************************************try end 
     }
    //  *****************************************functin mediam end ***********************    // ***************************functin mediam 2 start*************************************** 
     public void mediam2(){
System.out.println("\n 4 , 3 = 13\n4 , 4 = 12,\n7 , 7 = 42\n4 , 10 = ?\ngive  your solution : ");
// ***********************************try start ********************
try (Scanner sc = new Scanner(System.in)) {
     a.ans=sc.nextInt();
if(a.ans==6){
    a.score+=10;
    System.out.println("query 3 start here");
    mediam3();
    }
    else{
        System.out.println("wrong answer  X\n If you want to again solve it then type 1\n  or\n   you want help then type 0 ");
  a.ans=sc.nextInt();
    if (a.ans==1){
       mediam2(); 
    }
    else {    
    System.out.println("4 , 3 = 4*4 - 3 => 13\n4 , 4 = 4*4 - 4 => 12\n7 , 7 = 7*7 - 7 => 42\n4 , 10 = 4*4 - 5 => 6");
  System.out.println("if you want to try again then press 1 for skip press 0");
        a.ans=sc.nextInt();
        if(a.ans==1)
mediam2();
mediam3();
}  
}
}
// ********************************************try end 
     }
    //  *****************************************functin mediam2 end*********function mediam 3 start******************************************************************************************************* 
    public void mediam3(){
     System.out.println("\n 5 , 3 = 22\n7 , 4 = 45,\n6 , 7 = 29\n10 , 10 = ?\ngive  your solution : ");
// ***********************************try start ********************
try (Scanner sc = new Scanner(System.in)) {
     a.ans=sc.nextInt();
if(a.ans==90){
    a.score+=10;
    a.score();
    Deficult m=new Deficult();
    m.deficult();
    }
    else{
        System.out.println("wrong answer  X\n If you want to again solve it then type 1\n  or\n   you want help then type 0 ");
  a.ans=sc.nextInt();
    if (a.ans==1){
       mediam2(); 
    }
    else {    
    System.out.println("5 , 3 = 5*5 - 3 => 22\n7 , 4 = 7*7 - 4 => 45\n6 , 7 = 6*6 - 7 => 29\n10 , 10 = 10*10 - 10 => 90");
  System.out.println("if you want to try again then press 1 for skip press 0");
        a.ans=sc.nextInt();
        if(a.ans==1)
mediam3();
 Deficult m=new Deficult();
    m.deficult();
}  
}
}
// ********************************************try end 
     }   
    }
// ****************************************************functin mediam 3 and mediam class end******************************** *****************************deficult class start here******************************************************* 
class Deficult{
    Easy a=new Easy();
public void deficult(){
        System.out.println("*****WELCOME TO OUR DEFICULT QUIZ QUERY*****\ndeficult query 1 start here");
System.out.println("\n 8 , 8 = 8\n10 , 4 = 7,\n2 , 10 = 6\n44 , 10 = ?\ngive  your solution : ");
// ***********************************try start ********************
try (Scanner sc = new Scanner(System.in)) {
     a.ans=sc.nextInt();
if(a.ans==27){
    a.score+=10;
    System.out.println("query 3 start here");
    deficult2();
    }
    else{
        System.out.println("wrong answer  X\n If you want to again solve it then type 1\n  or\n   you want help then type 0 ");
  a.ans=sc.nextInt();
    if (a.ans==1){
       deficult(); 
    }
    else {    
    System.out.println("8 , 8 = 8/2 + 8/2  => 8\n10 , 4 = 10/2 + 4/2 => 7\n2 , 10 = 2/2 + 10/2 => 6\n44 , 10 = 44/2 + 10/2 => 27");
  System.out.println("if you want to try again then press 1 for skip press 0");
        a.ans=sc.nextInt();
        if(a.ans==1)
deficult();
deficult2();
}  
}
}
// ********************************************try end 
     }
    //  *****************************************functin deficult end*********************function deficult2 start**********************************************************************************************
public void deficult2(){
 System.out.println("\n 3 , 9 = 4\n12 , 24 = 12,\n6 , 36 = 14\n45 , 9 = ?\ngive  your solution : ");
// ***********************************try start ********************
try (Scanner sc = new Scanner(System.in)) {
     a.ans=sc.nextInt();     
if(a.ans==18){
    a.score+=10;
    a.score();
    }
    else{
        System.out.println("wrong answer  X\n If you want to again solve it then type 1\n  or\n   you want help then type 0 ");
  a.ans=sc.nextInt();
    if (a.ans==1){
       deficult2(); 
    }
    else {    
    System.out.println("3 , 9 = 3/3 + 9/3 => 4 \n12 , 24 = 12/3 + 24/3 => 12 \n6 , 36 = 6/2 + 36/3 => 14\n45 , 9 = 45/3 + 9/3 => 18");
  System.out.println("if you want to try again then press 1 for skip press 0");
        a.ans=sc.nextInt();
        if(a.ans==1)
deficult2();
deficult();
}  
}
}
// ********************************************try end 
     }   
}
public class index {
public static void main(String[] args){
   try(
    Scanner sc=new Scanner(System.in);
   ){
     System.out.println("*****WELCOME TO  OUR QUIZ*****");
   System.out.println("Which quiz you want to play choose option");
   System.out.println("***easy***\n***mediam***\n***deficult***\n      or  \n  ***help***\n  ***score***\n for exit choose exit");
    System.out.println("write your choice here : ");
        String choice=sc.nextLine();
        Easy a=new Easy();
        Mediam b=new Mediam();
        Deficult c=new Deficult();
        switch ((choice)) {
            case "EASY":
            case "easy":
            case "Easy":
            a.easy();
                break;
                case "MEDIAM":
                case "Mediam":
                case "mediam":
                b.mediam();
            case "DIFICULT":
            case "Dificult":
            case "deficult":
             c.deficult();
            break;
            case "exit":
           break;
            default:
            System.out.println("please choose only shown above option");
                break;
        }
   }
}   
}