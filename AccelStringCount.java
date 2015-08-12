public class AccelStringCount {
	public static void main(String[] args) { 	Scanner in = new Scanner(System.in);
	int T = in.nextInt();
	while (T-- > 0) {
		int n = in.nextInt();
		int threshold = in.nextInt();
		String str = in.next();
		char[] ch = str.toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		 for (char c : ch) {
			Integer val = m.get(c);
			if (val == null)
				val = 1;
			else
				val++;
			m.put(c, val);

		}
		Object[] a = m.entrySet().toArray();
		Arrays.sort(a, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Map.Entry<Character, Integer>) o2).getValue()
						.compareTo(
								((Map.Entry<Character, Integer>) o1)
										.getValue());
			}
		});
		Object max = a[0];
		int prev = ((Map.Entry<Character, Integer>) max).getValue();
		List<Character> list_character = new ArrayList<Character>();
		String str1 = "";
        if(prev<=threshold)
            {
            System.out.print("NONE");
            System.out.println();
            continue;
        }
		for (Object e : a) {
			int present = ((Map.Entry<Character, Integer>) e).getValue();
			if(present<=threshold)
				break;
			if (prev == present)
				list_character.add(((Map.Entry<Character, Integer>) e)
						.getKey());
			else {
				Collections.sort(list_character);
				for (char v : list_character) {
					System.out.print(v);
					str1 += v;
				}
				prev = present;
				list_character = new ArrayList<Character>();
				list_character.add(((Map.Entry<Character, Integer>) e)
						.getKey());
			}
		 
		}
		Collections.sort(list_character);
		for (char v : list_character)
			System.out.print(v);
		System.out.println();
		 

	}
}
}
