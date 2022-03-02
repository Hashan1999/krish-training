package ProblemOfVicky;
import java.util.Scanner;
public class Vicky{
public static void main(String[]args){

//Distance and  
int distance;
int timeToTravel=0;


Scanner scan=new Scanner(System.in);

//Input Valdate for not to Characters and Negative Numbers
do{
System.out.println("Enter a Valid Distance");
while(!scan.hasNextInt()){
System.out.println("Enter a Valid Distance");
scan.next();
}
distance=scan.nextInt();
}while(distance<0);



//Decrease distance to jump and increase Time to travel Until Distance become Zero or less
while(distance>=0){
if(distance>=5){
timeToTravel+=1;
distance-=5;
if(distance>=3){
timeToTravel+=2;
distance-=3;
if(distance>=1){
timeToTravel+=3;
distance-=1;
}else{
break;
}
}else{
break;
}
}else{
break;
}

}
System.out.println("Vicky get " +timeToTravel+" Seconds"+ " To Complete the Travel ");
}


}