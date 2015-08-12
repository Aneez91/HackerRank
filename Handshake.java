public class Handshake {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int T = in.nextInt();
	while (T-- > 0) {
		int n = in.nextInt();
		int sum=0;
		while(n-->0)
			sum+=n;
		System.out.println(sum);
	}
}
}
