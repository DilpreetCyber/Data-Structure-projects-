
public class BubbleTeaQuickSort {
	public static void quickSort(BubbleTea[] a, int low, int high) {
		 if (a == null || a.length == 0)
		 return;
		if (low >= high)
		 return;
		// pick the pivot
		 int middle = low + (high - low) / 2;
		 double pivot = a[middle].getprice();

		 // make left < pivot and right > pivot
		 int i = low, j = high;
		 while (i <= j) {
		 while (a[i].getprice() < pivot) {
		 i++;
		 }

		 while (a[j].getprice() > pivot) {
		 j--;
		 } 

		 if(i<=j) {
			 BubbleTea temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			 i++;
			 j--;
		 }
	}
		 if(low<j)
			 quickSort(a,low,j);
		 if(high>i)
			 quickSort(a,i,high);
}
	public static void main(String[]args) {
		BubbleTea[] drinks= new BubbleTea[5];
		drinks[0]=new BubbleTea(4.75,"Passionfruit","Coconut jelly","Medium");
		drinks[1]=new BubbleTea(5.75,"Honeydew","Bubbles","Medium");
		drinks[2]=new BubbleTea(4.00, "Mango","Bubbles","Small");
		drinks[3]=new BubbleTea(6.00, "Matcha","GreenTea Bubbles","Large");
		drinks[4]=new BubbleTea(4.50, "Taro","lychee jelly","Small");
			quickSort(drinks,0,drinks.length-1);
			for(int i=0; i < drinks.length;i++)
			{
				System.out.println("Price: "+drinks[i].getprice()+"\nFlavor: "+drinks[i].getflavor()+"\nType: "+drinks[i].gettype()+"\nSize: "+drinks[i].getsize()+"\n");
			}
	}
}