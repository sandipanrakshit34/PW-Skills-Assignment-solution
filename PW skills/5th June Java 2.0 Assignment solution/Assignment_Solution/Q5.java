package ai.ineuron.StringAssignment;

public class SearchString{
	   public static void main(String[] args) {
	      String strOrig = "Hello readers";
	      int intIndex = strOrig.indexOf("Hello");
	      
	      if(intIndex == - 1) {
	         System.out.println("Not found");
	      } else {
	         System.out.println("Found at index " + intIndex);
	      }
	   }
	}
