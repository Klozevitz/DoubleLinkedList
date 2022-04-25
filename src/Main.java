public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7};
        List list = new List(array);

        list.printList();
        System.out.println();
        list.pop(3);
        list.printList();
        System.out.println();
        list.reverseList();
        System.out.println();
        list.pop();
        list.printList();
        System.out.println();
        list.reverseList();
        System.out.println();
        list.popHead();
        list.printList();
        list.reverseList();
    }
}
