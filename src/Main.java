public class Main {

    public static void main(String[] args) {

        Node node0 = new Node("halløj");
        Node node1 = new Node("hej");
        Node node2 = new Node("med");
        Node node3 = new Node("dig");

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        node3.previous = node2;
        node2.previous = node1;
        node1.previous = node0;

        Node n = node0;


        Liste liste = new Liste();

        liste.head = node0;
        liste.tail = node3;

        System.out.println(liste.printFromHead());
        //liste.printFromTail(liste.tail);

    }

}
