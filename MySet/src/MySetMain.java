public class MySetMain extends MySet{
    public static void main(String[] args){

        MySet set = new MySet();

        set.size();

        Node test1 = new Node(2, null);
        Node test2 = new Node(4, test1);

        set.size();

        set.add(test2);
        set.add(test1);

        set.contains(test1);
        set.contains(5);

        System.out.println(set.toString());

        set.remove(test1);

        System.out.println(set.toString());
    }
}
