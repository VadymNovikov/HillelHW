public class TestCustomCollectionImpl {
    public static void main(String[] args) {
        checkOperations();
    }
    private static void checkOperations() {
        // Check create collection
        CustomCollectionImpl c = new CustomCollectionImpl();
        CustomCollectionImpl c1 = new CustomCollectionImpl();
        CustomCollectionImpl c2 = new CustomCollectionImpl();
        CustomCollectionImpl c3 = new CustomCollectionImpl();
        CustomCollectionImpl c4 = new CustomCollectionImpl();
        assert (c.size() == 0);
//
        // Check add elements
        assert (c.add("one"));
        assert (c.add("two"));
        assert (c.add("three"));
        System.out.println(c);
//
//        // Check contains element
        assert (c.contains("one"));
        assert (!c.contains("three"));
//
        // Check delete element by value
        assert (c.delete("two"));
        assert (!c.delete("two"));
        assert (c.size() == 1);
//

        // Check add element by index
        assert (c.add("four"));
//        assert (!c.add(10, "five"));
//        assert (c.add(1, "five"));
        assert (c.get(0).equals("one"));
        assert (c.get(1).equals("five"));
        assert (c.get(2).equals("four"));
        assert (c.delete("four"));

        // Check equals
        assert (c1.add("one"));
        assert (c1.add("five"));
        assert (c1.equals(c));
        assert (c1.add("ten"));
        assert (!c1.equals(c));

        // Check clear
        assert (c.clear());
        assert (!c.contains("Some value"));
        assert (!c.delete("Some value"));
        assert (c.size() == 0);

        //Check addAll
        c2.addAll(new String[]{"A", "B", "C", "D", "E", "F"});
        c4.addAll(new String[]{"A", "B", "C", "D", "E", "F"});
//        c2.addAll(new String[]{null, null, null});
//        c4.addAll(new String[]{null, null, null, null});
        assert c2.equals(c4);
        c2.delete(1);
        c3.addAll(new String[]{"G", "H", "I", "J", "K", "L"});
        System.out.println(c2.get(1));
        c3.addAll(c2);
        System.out.println(c3);
        c2.addAll(c3);
        System.out.println(c2);
        System.out.println(c2.size());
        c2.delete(10);
        System.out.println(c2.size());
        System.out.println(c4);
        c4.delete("B");
        System.out.println(c4);
        System.out.println(c4.contains("f"));
    }
}