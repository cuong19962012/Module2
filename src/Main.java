import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("abc");
        list1.add("efg");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("abc");
        list2.add("efg");
        list1.add("hgq");
        System.out.println(list2);
        System.out.println(list1);
        System.out.println(compare_two_linked_lists(list1, list2));
    }

    public static java.util.LinkedList<String> compare_two_linked_lists(java.util.LinkedList<String> linkedList1, java.util.LinkedList<String> linkedList2) {
        //Your code here
        LinkedList<String> lister = new LinkedList<String>();
        LinkedList<String> listless = new LinkedList<String>();
        if (linkedList1.size() > linkedList2.size()) {
            lister = linkedList1;
            listless = linkedList2;
        } else {
            lister = linkedList2;
            listless = linkedList1;
        }
        for (int i = 0; i < lister.size(); i++) {
            if (i < listless.size()) {
                if (lister.get(i) == listless.get(i)) {
                    lister.set(i, "Yes");
                } else {
                    lister.set(i, "No");
                }
            } else {
                lister.set(i, "No");
            }
        }
        return lister;
    }
}