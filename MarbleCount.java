public class MarbleCount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0){
		int n=sc.nextInt();
		if(n>1){
			//long ans=(n-2)*(n-1);
			long ans=1;
			long f=n-2;
			while(f>0){
				ans*=f--;
			}
			System.out.println(ans+2);
		}
		else{
			System.out.println(1);
		}
		
	}
}
}
