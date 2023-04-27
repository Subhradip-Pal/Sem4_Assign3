package Assignment3;

public class A3_Q1 {
	static void sort(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				count++;
		}
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		for(int i=count;i<arr.length;i++) {
			arr[i]=1;
		}
	}

	public static void main(String[] args) {
		int arr[]= {0,1,0,0,0,1,0,1,1};
		sort(arr);
		for(int e:arr) {
			System.out.print(e+" ");
		}

	}

}
