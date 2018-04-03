/**
 * Hashtable class which constructs by back of with LinkedList class in order to overcome the problem with duplicates in
 * Hashtable. All the core functionalities will be in the LinkedList class only.
 */
public class HashtableStudent {
    private StudentLinkedList[] arr;
    private int size;
    private int totalStudents;

    public HashtableStudent(){
        size = 1000;
        arr = new StudentLinkedList[size];
    }

    /**
     * Converts the given rollno into ascii code, then find the modulo of the ascii code with array lenght and then return
     * the reminder which is the index
     * @param rollNo : rollno to be converted
     * @return index
     */
    public int toHashCode(String rollNo){
        int addAsciis = 0;
        int codeValue = 0;
        for (int i = 0; i < rollNo.length(); i++){
            int asciiKey = (int) rollNo.charAt(i); //converts the char to ascii equivalent
            addAsciis += asciiKey;
        }
        codeValue = addAsciis % arr.length;
        return codeValue;
    }

    public boolean insert(int key, Student data){
        if (arr[key] == null){
            arr[key] = new StudentLinkedList();
        }
        arr[key].insertStudent(data);
        totalStudents++;
        return true;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public Student getStdInfo(String rollNo){
        int key = toHashCode(rollNo);
        if (arr[key] == null){
            return null;
        }else {
            Student q = arr[key].fetchStudent(rollNo);
            if (q != null){
                return  q;
            }else {
                return  null;
            }
        }
    }

    public boolean deleteStd(String rollNo){
        boolean have = arr[toHashCode(rollNo)].haveRollNo(rollNo);
        if (have){
            int key = toHashCode(rollNo);
            arr[key].deleteStudent(rollNo);
            totalStudents--;
            return true;
        }
        return false;
    }

    public void showData(){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null){
                arr[i].showAll();
            }
        }
    }
}
