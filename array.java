import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] x = {12,64,87,98,34,65,67,31,87};
		System.out.println(x[2]); // accessing elements
		System.out.println(x[7]);
		System.out.println(x[3]);
		System.out.println(x[0]);
		System.out.println(x[8]);
		// updating elements, array is mutable. once it is created we can change values
		x[4] = 21;
		System.out.println(x[4]);
int[] arr = new int[4]; // size of this array is 4
arr[0] = 643;
arr[1] = 433;
arr[2] = 332;
arr[3] = 343;
System.out.println(arr);
}
}