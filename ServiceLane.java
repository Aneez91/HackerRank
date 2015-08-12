public class ServiceLane {
	static int arr[];
	static int findMin(int index1,int index2)
	{
		int min=arr[index1];
		if(min==1)
			return 1;
		while(index1< index2)
		{
			if(arr[index1++]>arr[index1]){
				min=arr[index1];
				if(min==1)
					return 1;
			}
		}
		return min;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in 	);
	int N=sc.nextInt();
	int T=sc.nextInt();
	 arr =new int[N];
	for(int i=0;i<N;i++)
		arr[i]=sc.nextInt();
	for(int i=0;i<T;i++)
	{
		System.out.println( findMin(sc.nextInt(),sc.nextInt()));
	}
	
}
}
