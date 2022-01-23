public class Insertion{
	static int size;
	static int value;
	public static int getSize(int size) {
		return size;
	}
	public static  int setSize(int tablesize) {
		size=tablesize;
		return size;
	}
	public int getValue(int value) {
		return value;
	}
	public int setValue(int ivalue) {
		value=ivalue;
		return value;
	}

	public static void insert(int x) {
		int key=x;
		int tsize=size;
		int[] hashtable=new int[tsize];
		int index=key%tsize;
		System.out.println(index);
		for(int j=0;j<tsize;j++) {
			hashtable[index]=x;
		}
		for(int i=0;i<hashtable.length;i++) {
			System.out.println(i+"  "+hashtable[i]);
		}
	}
	public static void main(String[]args) {
		int tablesize=5;
		getSize(tablesize);
		setSize(tablesize);
		insert(26);
		insert(30);
		insert(27);

		
		
	}
}