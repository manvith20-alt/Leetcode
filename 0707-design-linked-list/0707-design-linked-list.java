class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    } 
}

class MyLinkedList {
    Node head;

    public MyLinkedList() {
      head = null;
    }
    
    public int get(int index) {
        if(index < 0) return -1;

        Node dummy = head;
        for(int i=0;i<index;i++){
            if(dummy == null) return -1;
                dummy = dummy.next;
        }
        if(dummy == null) return -1;
        return dummy.val;
    }
    
    public void addAtHead(int val) {
        Node dummy = new Node(val);
        dummy.next = head;
        head = dummy;
    }
    
    public void addAtTail(int val) {
        Node dummy = new Node(val);
        if(head == null){
            head = dummy;
            return;
        }
        Node dummy1 = head;
        while(dummy1.next != null){
            dummy1 = dummy1.next;
        }
        dummy1.next = dummy;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0) return;

        if(index == 0){
            addAtHead(val);
            return;
        }
        Node dummy = head;

        for(int i = 0; i < index - 1; i++){
            if(dummy == null) return;
            dummy = dummy.next;
        }

        if(dummy == null) return;
        Node newNode = new Node(val);

        newNode.next = dummy.next;
        dummy.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || head == null) return;

        if(index==0){
            head = head.next;
            return;
        }
        Node dummy = head;
        for(int i=0;i<index-1;i++){
            if(dummy==null) return;
            dummy = dummy.next;
        }
        if(dummy == null || dummy.next == null) return;
        dummy.next = dummy.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */