package C4_Stack_Queue;

public class P106_PriorityQ {
	private int maxSize;
	private long[] queArray;
	private int nItems;
	
	public P106_PriorityQ(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		nItems= 0;
	}
		
	public void insert(long item) {
			int j;
			if(nItems==0)
				queArray[nItems++] = item; //初始化
			else {
				for(j=nItems-1; j>=0; j--) {
					if(item > queArray[j])
						queArray[j+1] = queArray[j];//每个比item小的向下移1个
					else
						break;
				}
				queArray[j+1] = item;//插入合适的位置
				nItems++;
			}
		}
		
		public long remove() {
			return queArray[--nItems];
		}
		
		public long peekMin() {
			return queArray[nItems-1];
		}
		
		public boolean isEmpty() {
			return (nItems==0);
		}
		
		public boolean isFull() {
			return (nItems == maxSize);
		}
	
}
