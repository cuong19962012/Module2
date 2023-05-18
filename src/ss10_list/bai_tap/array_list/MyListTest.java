package ss10_list.bai_tap.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(0, 1);
        listInteger.add(1, 2);
        listInteger.add(2, 3);
        listInteger.add(1, 4);
        listInteger.add(3, 4);
        for (int i = 0; i <listInteger.clone().size(); i++) {
            System.out.println(listInteger.clone().get(i));
        }
    }
}
