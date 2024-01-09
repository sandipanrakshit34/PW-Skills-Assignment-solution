import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> companyList = new ArrayList<String>();
        companyList.add("Google");
        companyList.add("Apple");
        companyList.add("Microsoft");
        
        Comparator<String> com = (String o1, String o2) -> o1.compareTo(o2);
        
        Collections.sort(companyList, com);
        
        for(String name : companyList) {
            System.out.println(name);
        }
    }
}
