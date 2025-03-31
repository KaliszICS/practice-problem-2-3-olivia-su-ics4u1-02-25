public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void bubbleSortString(String[] strings){
		int n = strings.length;
		
		for (int i = 0; i < n - 1; i++) {
			
			for (int j = 0; j < n - 1 - i; j++) {
				if (strings[j].toLowerCase().compareTo(strings[j + 1].toLowerCase()) > 0 ) {
					String temp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = temp;
					
				}
			}
	
		}

	}


}
