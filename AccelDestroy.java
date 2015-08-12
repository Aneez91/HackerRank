public class AccelDestroy {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int T = in.nextInt();
	while (T-- > 0) {
		int vertex=in.nextInt();
		int edges=in.nextInt();
		while(edges-->0){
			in.nextInt();
			in.nextInt();
		}
		if(vertex%2==0)
			System.out.println("Alex");
		else
			System.out.println("Artur");
	}
}
}
