package Assignment3;

public class A3_Q4 {
	static void min_swap(int arr[],int n) {
		int p1=0,p2=0,count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<n) { 
				p1=i;
				int temp=arr[p1];
				arr[p1]=arr[p2];
				arr[p2]=temp;
				p2++;
				count=i>0?count+1:count;
			}
		}
		System.out.println(count);
	}
	

	public static void main(String[] args) {
		int arr[]= {7,54,46,69,12,19};
		int n=20;
		min_swap(arr,n);
		for(int e:arr) {
			System.out.print(e+" ");
		}

	}

}
