package hello;

public class bubblesort {
	public static void main(String[] args) {
		int intArray[]= {9,8,7,5,6};
		System.out.println("Before Sorting");
		for (int i : intArray) {
			System.out.println(i);
		}
		bubblesort(intArray);
		System.out.println("After Sorting");
		for (int i : intArray) {
			System.out.println(i);
		}
	}

	private static void bubblesort(int[] intArray) {
		int temp=0;
		for(int i=0; i<intArray.length; i++) {
			for(int j=1; j<(intArray.length)-i; j++) {
				if(intArray[j-1]> intArray[j]) {
					// swap the elements
					temp=intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		
	}

}
