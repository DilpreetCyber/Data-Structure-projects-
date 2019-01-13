
public class BookTree {
	Book root;

	public void addBook(double d, String name) {

		// Create a new Book and initialize it

		Book newBook = new Book(d, name);

		// If there is no root this becomes root

		if (root == null) {
			root = newBook;

		} 
		else {
			

			// Set root as the Book we will start
			// with as we traverse the tree
			Book focusBook = root;

			// Future parent for our new Book

			Book parent;

			while (true) {

				// root is the top parent so we start
				// there

				parent = focusBook;

				// Check if the new Book should go on
				// the left side of the parent Book

				if (d < focusBook.price) {

					focusBook = focusBook.leftChild;
					if (focusBook == null) {
						parent.leftChild = newBook;
						return;
					}

				}
				else { // If we get here put the Book on the right
					focusBook = focusBook.rightChild;
					if (focusBook == null) {
						parent.rightChild = newBook;
						return;
					}

				}

			}
		}

	}

	// All Books are visited in ascending order
	// Recursion is used to go to one Book and
	// then go to its child Books and so forth

	public void inOrderTraverseTree(Book focusBook) {

		if (focusBook != null) {
			// Left Book
			inOrderTraverseTree(focusBook.leftChild);
			System.out.println(focusBook);
			// Right Book
			inOrderTraverseTree(focusBook.rightChild);
			
			

		}

	}

	public void preorderTraverseTree(Book focusBook) {
		if (focusBook != null) {
			System.out.println(focusBook);
			// Left Book
			preorderTraverseTree(focusBook.leftChild);
			// Right Book
			preorderTraverseTree(focusBook.rightChild);
		}

	}

	public static void printMax_Min(Book root){
		
		Book Current1= root;
		while (Current1.rightChild != null)
		{
			 Current1=Current1.rightChild;
		}
		System.out.println("The Max number is: "+Current1);
		
		Book Current2 = root;
		while (Current2.leftChild != null)
		{
			 Current2=Current2.leftChild;
		}
		System.out.println("================================================"
				+ "\nThe Min number is: "+ Current2);
		System.out.println("================================================");
	}
	public void postOrderTraverseTree(Book focusBook) {
		if (focusBook != null) {
			// Left Book
			postOrderTraverseTree(focusBook.leftChild);
			// Right Book
			postOrderTraverseTree(focusBook.rightChild);
			System.out.println(focusBook);
		}

	}

	public Book findBook(double price) {

		// Start at the top of the tree

		Book focusBook = root;

		// While we haven't found the Book
		// keep looking

		while (focusBook.price != price) {

			// If we should search to the left

			if (price < focusBook.price) {
				focusBook = focusBook.leftChild;

			} else {
				focusBook = focusBook.rightChild;

			}

			// The Book wasn't found

			if (focusBook == null)
				return null;

		}

		return focusBook;

	}

	public static void main(String[] args) {

		BookTree theTree = new BookTree();
		theTree.addBook(10.50, "Instructor");
		theTree.addBook(7.50, "President");
		theTree.addBook(15.0, "Maintenance");
		theTree.addBook(9.0, "Secretary");
		theTree.addBook(10.0, "Student");
		theTree.addBook(13.50, "Provost");
		
		// Find the Book with price 15
		System.out.print("========================================");
		System.out.println("\nBook with the price 15");
		System.out.println(theTree.findBook(15));

		// Print out tree in different ways
		System.out.println("inOrderTraverseTree");
		System.out.println("========================================");
		theTree.inOrderTraverseTree(theTree.root);
		System.out.println("\n========================================");
		System.out.println("preorderTraverseTree");
		System.out.println("========================================");
		theTree.preorderTraverseTree(theTree.root);
		System.out.println("\n========================================");
		System.out.println("postOrderTraverseTree");
		System.out.println("========================================");
		theTree.postOrderTraverseTree(theTree.root);
		// Find the Book with price 15
		System.out.println("\nBook with the price 15");

		System.out.println(theTree.findBook(15));
		
		//System.out.println(checkBST(theTree.root,0,10));
		System.out.println("========================================");
		printMax_Min(theTree.root);

	}

}
