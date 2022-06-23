package while_loop;

public class SqreNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print(25);
	}
	public static void print(int n) {
		int i=1; 
		int sqrd = 0;
		while (i<=n) {
			sqrd = i*i;
			i++;
		}
		System.out.println(sqrd);
	}
}
