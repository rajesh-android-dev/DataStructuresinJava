/**
 * Linked list class for students to overcome the problem with duplicate values in hashtable
 */
public class StudentLinkedList {

    private Node head;

    public StudentLinkedList() {
        head = new Node();
        head.data = null;
        head.next = null;
    }

    public boolean insertStudent(Student std) {
        Node n = new Node();
        n.data = std;
        n.next = head.next;
        head.next = n;
        return true;
    }

    public boolean haveRollNo(String rollNo) {
        Node a = head.next;
        boolean have = false;
        while (a != null) {
            if (rollNo.equals(a.data.getRollNo())) {
                have = true;
                break;
            }
            a = a.next;
        }
        return have;
    }

    public Student fetchStudent(String rollNo){
        Student data = null;
        Node p = head.next;
        while (p != null){
            if (rollNo.equals(p.data.getRollNo())){
                data = p.data;
                break;
            }
            p = p.next;
        }
        return data;
    }

    public void deleteStudent(String rollNo){
        Node p = head;
        Node q = head.next;
        while (q != null && !(rollNo.equals(q.data.getRollNo()))){
            p = q;
            q = q.next;
        }
        if (q != null){
            p.next = q.next;
        }else {
            System.out.print("Roll no not found");
        }
    }

    public void showAll(){
        Node x = head.next;
        while (x != null){
            System.out.println(x.data);
            x = x.next;
        }
    }

    class Node {
        private Student data;
        private Node next;
    }
}
