import java.util.Scanner;
public class RockPaperScissor
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    char p1=sc.next().charAt(0);
	   // System.out.println("p1");
	    char p2=sc.next().charAt(0);
// 		System.out.println("p2");
		if(p1=='R' && p2=='S'){
		    System.out.println("person1 Wins");
		} else if(p1=='S' && p2=='R'){
		    System.out.println("person2 Wins");
		}
		else if(p1=='S' && p2=='P'){
		    System.out.println("person1 Wins");
		}
		else if(p1=='P' && p2=='S'){
		    System.out.println("person2 Wins");
		}
		else if(p1=='R' && p2=='R'){
		    System.out.println("person2 Wins");
		}
		else if(p1=='P' && p2=='R'){
		    System.out.println("person1 Wins");
		}
		else if(p1==p2){
		    System.out.println("Tie");
		}
		else{
		    System.out.println("Invalis Input");
		}
	}
}
