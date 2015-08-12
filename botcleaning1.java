lass Vo1 implements Comparable<Vo1>{
	Integer row,col,diff;
	public int getDiff() {
		return diff;
	}
	public void setDiff(int diff) {
		this.diff = diff;
	}
	Vo1(int r,int c,int d)
	{
		row=r;
		col=c;
		diff=d;
	}
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	 
	 
	@Override
	public int compareTo(Vo1 o) {
		// TODO Auto-generated method stub
		
		return diff.compareTo(o.getDiff());
	}
}
public class botcleaning1 {
	
	static void next_move(int posr, int posc, String[] board){
		List <Vo1>l=new ArrayList<Vo1>();
		int row_distance=posr-0,col_distance=posc-0;
		int row_distance_end=4-posr ,col_distance_end=4-posc ;
		 if(board[posr].charAt(posc)=='d')
		 {
				System.out.println("CLEAN");
				return;
			}

			 
		 
		if(row_distance>row_distance_end){
			for(int i=4;i>=posr;i--)
			{
				
				for(int f=0;f<board[i].length();f++)
				{
					if(board[i].charAt(f)=='d')
						l.add(new Vo1(i,f,((   Math.max(posr, i) -Math.min(posr, i) )+(posc-f) )));
				}
			}
			
		 if(l.size()==0)
			for(int i=0;i<=posr;i++)
			{
				
				for(int f=0;f<board[i].length();f++)
				{
					if(board[i].charAt(f)=='d'){
						l.add(new Vo1(i,f,(   Math.max(posr, i) -Math.min(posr, i))+(posc-f) ));
					}
				}
			}
		}else{
			for(int i=0;i<=posr;i++)
			{
				
				for(int f=0;f<board[i].length();f++)
				{
					if(board[i].charAt(f)=='d')
						l.add(new Vo1(i,f,(   Math.max(posr, i) -Math.min(posr, i) )+(Math.max(posc, f) -Math.min(posc, f) ) ));
				}
			}
			 if(l.size()==0)
			for(int i=4;i>=posr;i--)
			{
				
				for(int f=0;f<board[i].length();f++)
				{
					if(board[i].charAt(f)=='d')
						l.add(new Vo1(i,f,(   Math.max(posr, i) -Math.min(posr, i) )+(Math.max(posc, f) -Math.min(posc, f) ) ));
				}
			}
			
		}
		Collections.sort(l);
		Vo1 v1=l.get(0);
		int rowdiff_n=v1.getRow()-posr;
		int col_Diff_n=v1.getCol()-posc;
		 
		
		if(col_Diff_n>0){
			   System.out.println("RIGHT");
			   return;

		  }
			  if(col_Diff_n<0){
			   System.out.println("LEFT");
			   return;

		  }
			 if(rowdiff_n>0)
		  {
			   System.out.println("DOWN");
			   return;
		  }
			if(rowdiff_n<0)
		  {
			   System.out.println("UP");
			   return;
		  }
	}
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int [] pos = new int[2];
	        String board[] = new String[5];
	        for(int i=0;i<2;i++) pos[i] = in.nextInt();
	        for(int i=0;i<5;i++) board[i] = in.next();
	        next_move(pos[0], pos[1], board);
	    }
}/*
-b---
-d---
---d-
---d-
--d-d*/
