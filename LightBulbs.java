public class LightBulbs {
	static List<Integer> primesUpTo(final int target) {
	    final boolean[] nonPrime = new boolean[target + 1];

	    for (int i = 2; i <= Math.sqrt(target); ++i) {
	        if (!nonPrime[i]) {
	            for (int j = i * 2; j <= target; j += i) {
	                nonPrime[j] = true;
	            }
	        }
	    }

	    final List<Integer> primes = new ArrayList<Integer>();

	    for (int i = 2; i <= target; ++i) {
	        if (!nonPrime[i]) primes.add(i);
	    }

	    return primes;
	}
	public static void main(String[] args) {
		 	System.out.println(primesUpTo(100));
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int n=in.nextInt();
			if(n>3){
			int i=(int)Math.sqrt(n);
			System.out.println(i );
			}
			else
				System.out.println(1);
		}
	}
	}
