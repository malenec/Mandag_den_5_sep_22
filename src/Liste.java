public class Liste {

    Node head = null;
    Node tail = null;

    public Liste(String s) {

        String [] strings = s.split(" ");

        for (String string : strings) {
            insertFromHead(new Node(string));
        }

    }

    public Liste() {
    }

    /*
    public Liste(String s) {
        String [] strings = s.split(" ");

        for (String string : strings) {
            insertFromHead(new Node(string));
            //insertFromHead(string);

        }
    }

    public Liste() {

    }
     */

    Node insertFromTail(Node node){

        if (isEmpty()) {
            // er liste tom
            tail = node;
            head = node;
            return tail;
        }

        // liste er ikke tom
        tail.next = node;
        node.previous = tail;
        tail = node;
        return tail;

    }

    Node insertFromHead(Node node){

        if (isEmpty()) {
            // er liste tom
            head = node;
            tail = node;
            return head;
        }

        // liste er ikke tom
        node.next = head;
        head.previous = node;
        head = node;
        return head;
    }

    /*
    Node insertFromHead(String s){

        String [] strings = s.split(" ");

        for (String string : strings) {
            insertFromHead(string);
        }

        Node node = new Node(s);

        //return insertFromHead(node);
        return head;
    }
     */

    boolean isEmpty(){

        return head == null && tail == null;
    }

     String printFromHead() {

        StringBuilder stringBuilder = new StringBuilder();

        Node n = head;

        while(n != null){

            stringBuilder.append(n.data + " ");

            n = n.next;
        }
        return stringBuilder.toString().trim();
    }

    String printFromTail(){

        StringBuilder stringBuilder = new StringBuilder();

        Node n = tail;

        while(n != null){

            stringBuilder.append(n.data + " ");

            n = n.previous;
        }
        return stringBuilder.toString().trim();
    }

    public void removeFromHead() {

        if(isEmpty()){
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        head.previous.next = null;
        head.previous = null;
    }
}
