
public class MinimumSubProductInterval {
	static int[] arr;
	static int index;
	static int findMin(int i,int l)
	{
		int min=Integer.MAX_VALUE;
		for(int ind=i ;ind< l;ind++)
			if(min>arr[ind]){
				min=arr[ind];
				index=ind;
				if(min==0)
					return min;
			}
		return min;
	}
	static int minVal(List<Integer> l)
	{
		int min=Integer.MAX_VALUE;
		for(int y:l)
			if(min>y) 
				min=y;
		return min;
	}
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int op = in.nextInt();
	arr=new int[n];
//	List <Integer>list=new ArrayList<Integer>(n);
	int r=0;
	while (n-- > 0)
		arr[r++]=in.nextInt();
		//list.add(in.nextInt());
	 while(op-->0){
		if(in.nextInt()==1){
			int from=in.nextInt()-1,to=in.nextInt();
			int min=findMin(from ,to);
			if(min==0)
				System.out.println(min+" "+(from+1)+" "+to);
			else
				if(min>1)
				{
					 System.out.println(min+" "+(index+1)+" "+(index+1));
				}
				else
					if(min==1)
					{
						int from_index=index+1,to_index=index+1;
						int longest=1;
						for(int i=index ;i<to;i++){
							int count=1;
						while( ++i <to &&arr[ i ]==1)
						{
							count++;
						}
						//i--;
						if(longest<count ){
							longest=count;
						from_index=i-longest+1 ;to_index=i ;
						}
						
						}
						System.out.println(min+" "+from_index+" "+(to_index ));
					}
					else
						if(min<0)
						{
							List <Integer>lis=new ArrayList<Integer>();
							int start=index,end=index;
							for(int i=from;i< to;i++)
							{
								int prod=1,count=1;
								
								while(arr[i]<0)
								{
									start=i;
									count++;
									prod*=arr[i++];
									end=i;
								}
								if(count%2!=0){
									prod/=arr[--i];
									i++;
									end--;
								}
								lis.add(prod);
							}
							int y=minVal(lis);
							System.out.println(y+" "+(start+1)+" "+(end+1));
						}
			
			
		}
		else
		{
			arr[in.nextInt()- 1]=  in.nextInt() ;
		}
	}
 
}
}
