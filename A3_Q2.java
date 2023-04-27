package Assignment3;

public class A3_Q2 {
	static void sort(int a[])
    {
        int l=0;
        int h=a.length-1;
        int m=0,temp=0;
        while (m<=h) {
            switch (a[m]) {
            case 0: {
                temp=a[l];
                a[l]=a[m];
                a[m]=temp;
                l++;
                m++;
                break;
            }
            case 1:
                m++;
                break;
            case 2: {
                temp=a[m];
                a[m]=a[h];
                a[h]=temp;
                h--;
                break;
            }
            }
        }
    }

	public static void main(String[] args) {
		int arr[]= {0,2,1,2,0,0,2,0,1,2,2,0,1,1};
		sort(arr);
		for(int e:arr) {
			System.out.print(e+" ");
		}

	}

}
