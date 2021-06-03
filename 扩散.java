
public class 扩散 {
	public static final int VALUE = 5000;
	public static void main(String[] args) {
		boolean[][] graph = new boolean[10000][10000];
		Queue<Integer[]> queue = new LinkedList<>();
		int time = 0;
		graph[0 + VALUE][0 + VALUE] = true;
		graph[2020 + VALUE][11 + VALUE] = true;
		graph[11 + VALUE][14 + VALUE] = true;
		graph[2000 + VALUE][2000 + VALUE] = true;
		while (time < 2020) {
			long startTime = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
				for (int j = 0; j < 10000; j++) {
					if (graph[i][j] == true) {
						Integer[] temp = {i, j};
						queue.add(temp);
					}
				}
			}
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Integer[] com = queue.poll();
				graph[com[0] + 1][com[1]] = true;
				graph[com[0] - 1][com[1]] = true;
				graph[com[0]][com[1] + 1] = true;			
				graph[com[0]][com[1] - 1] = true;				
			}
			long endTime = System.currentTimeMillis();
			System.out.println("第" + time + "次" + (endTime - startTime) + " ms");
			time++;
		}
		int res = 0;
		for (int i = 0; i < 10000; i++) {
			for (int j = 0; j < 10000; j++) {
				if(graph[i][j] == true) {
					res++;
				}
			}
			System.out.println(res);
			}
	}

}

