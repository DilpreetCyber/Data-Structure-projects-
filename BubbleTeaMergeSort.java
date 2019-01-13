
public class BubbleTeaMergeSort {
	public static void mergeSort(BubbleTea a[], int low, int high) {
		 if(low == high) {
			 return;
		 }
		 int length = high-low+1;
		 int pivot = (low+high) / 2;
		 mergeSort(a, low, pivot);
		 mergeSort(a, pivot+1, high);
		 BubbleTea working[] = new	BubbleTea[length];
		 for(int i = 0; i < length; i++) {
			 working[i] = a[low+i];
		 }
		 int m1 = 0;
		 int m2 = pivot-low+1;
		 for(int i = 0; i < length; i++) {
			 if(m2 <= high-low)
				 if(m1 <= pivot-low)
					 if(working[m1].getprice() > working[m2].getprice())
						 a[i+low] = working[m2++];
					 else
						 a[i+low] = working[m1++];
				 else
					 a[i+low] = working[m2++];
			 else
				 a[i+low] = working[m1++];
}
	}
	public static void main(String[]args) {
		BubbleTea[] drinks= new BubbleTea[5];
		drinks[0]=new BubbleTea(4.75,"Passionfruit","Coconut jelly","Medium");
		drinks[1]=new BubbleTea(5.75,"Honeydew","Bubbles","Medium");
		drinks[2]=new BubbleTea(4.00, "Mango","Bubbles","Small");
		drinks[3]=new BubbleTea(6.00, "Matcha","GreenTea Bubbles","Large");
		drinks[4]=new BubbleTea(4.50, "Taro","lychee jelly","Small");
		mergeSort(drinks,0,drinks.length-1);
			for(int i=0; i < drinks.length;i++) 
			{
				System.out.println("Price: "+drinks[i].getprice()+"\nFlavor: "+drinks[i].getflavor()+"\nType: "+drinks[i].gettype()+"\nSize: "+drinks[i].getsize()+"\n");
			}
	}
}
