# rotate
mport java.util.Scanner;
public class ArrayRotate {
	public static void main(String[] args) {
		System.out.println("how many values to you want enter");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int values[]=new int[n];
	int temp[]=new int[1];
	Scanner input=new Scanner(System.in);
	for(int i=0;i<n;i++){
		 values[i]=input.nextInt();
	}
	System.out.println("Enter samples");
	Scanner inp=new Scanner(System.in);
	int k=inp.nextInt();
	for(int i=1;i<=k;i++){
		for(int j=1;j<n;j++){
			 temp[0]=values[0];
		values[0]=values[j];
		values[j]=temp[0];
	}
		
	}
		for(int m=0;m<n;m++){
			System.out.print(values[m]);
		}
	}
	}
