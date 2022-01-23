public class InsertionusingArray{
	public static void insert(int x[]){
	int hashtable[]=new int[10];
	for(int i=0;i<x.length;i++) {
		int value=x[i];
		int index=value%hashtable.length;
		hashtable[index]=x[i];
	}
	for(int j=0;j<hashtable.length;j++) {
		System.out.println(j+" "+hashtable[j]);
	}
	}
public static void main(String[]args){
	int[] array= {10,91,23,44};
	insert(array);
}
}
