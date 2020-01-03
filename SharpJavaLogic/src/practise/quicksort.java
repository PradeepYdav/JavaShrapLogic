package practise;

public class quicksort {
	
	
	public static void Quiclsort(int [] arr,int start,int end) {
		if(end-start<2) {
			return;
		}
		
		int pivot=partion(arr,start,end);
		Quiclsort(arr, start, pivot);
		Quiclsort(arr, pivot+1, end);
		
		
	}
	
	public static int partion(int[] arr,int start,int end) {
		int pivot=arr[start];
		int i=start;
		int j=end;
		
		while(i<j) {
			while(i<j && arr[--j]>=pivot);
			if(i<j) {
				arr[i]=arr[j];
			}
			
			while(i<j && arr[++i]<=pivot);
			if(i<j) {
				arr[j]=arr[i];
			}
			
			
		}
		arr[j]=pivot;
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []  intarray= {20,35,-15,7,55,1,-22};
		Quiclsort(intarray,0,intarray.length);
		
		for (int i : intarray) {
			System.out.println(i);
		}

	}

}
