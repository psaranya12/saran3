package sample;
import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
	int n;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	if(n%2==0){
		System.out.println("the given value is even");
	}
	else{
		System.out.println("the given value is odd");
	}
	}

}
