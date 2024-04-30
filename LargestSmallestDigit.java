import java.util.*;
public class LargestSmallestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//say 4196 (Approach 1)
		int n = sc.nextInt();
		int min = n%10; //Just an initialisation
		int max = n%10;
		while(n!=0)
		{
			int digit = n%10;
			if(digit<min)min=digit;
			if(digit>max)max=digit;
			n = n/10;
		}
		System.out.println(max+" "+min);
		
		//Approach 2
//		String s = String.valueOf(n);
//		char c[] = s.toCharArray();
//		Arrays.sort(c);
//		s = String.valueOf(c);
//		System.out.println(s.charAt(s.length()-1)+" "+s.charAt(0));
		sc.close();

	}

}