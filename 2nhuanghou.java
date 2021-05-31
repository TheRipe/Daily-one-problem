public class Main {
	static int n;      //皇后个数
	static int count=0;//放置的个数
	static int map[][];//二维数组表示棋盘
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();  //输入n;
		map=new int[n][n];
		for(int i=0;i<n;i++)  //输入棋盘数据
		{
			for(int j=0;j<n;j++)
			{
				map[i][j]=sc.nextInt();
			}
		}
		put(0,2);   //从第0行开始放置白皇后，2表示白皇后，3表示黑皇后
		System.out.println(count);  //输出找到的个数
 
	}
 
	private static void put(int t, int s) //放置皇后
	{
		if(t==n)  //遍历到棋盘的最后一行
		{
			if(s==2)
				put(0,3);  //白皇后放置成功，开始放置黑皇后
			else count++;  //全部放置成功，计数器加一
			return ;
		}
		for(int i=0;i<n;i++)  //对每一列进行遍历
		{
			if(map[t][i]!=1)
				continue;
			if(check(t,i,s))  //判断是否满足题目要求
			{
				map[t][i]=s;
			}
			else continue;    //不满足就同一行的下一个位置
			put(t+1,s);       //对下一行进行放置
			map[t][i]=1;
		}
		
	}
 
	private static boolean check(int t, int i, int s)  //判断是否满足题目要求
	{
		for(int q=t-1; q>=0;q--)  //检查当前位置上方是否有相同皇后
		{
			if(map[q][i]==s)
				return false;
		}
		for(int q=t-1,w=i-1;q>=0&&w>=0;q--,w--) //检查左对角线
		{
			if(map[q][w]==s)
				return false;
		}
		for(int q=t-1,w=i+1;q>=0&&w<n;q--,w++) //检查右对角线
		{
			if(map[q][w]==s)
				return false;
		}
		return true;  
	}
 
}

