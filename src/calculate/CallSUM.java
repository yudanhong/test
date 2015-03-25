package calculate;

import java.util.Scanner;

public class CallSUM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] str = s.split(",");
		double sum = 0;
		for(String temp:str){
			sum+=Double.parseDouble(temp);
		}
		System.out.println(sum);
	}
}
