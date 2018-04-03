public class Main {

    public static void main(String[] args){
        HashtableStudent htStudent = new HashtableStudent();

        Student std1 = new Student("Rajesh","92108",7.9);
        Student std2 = new Student("Kannan","92109",7.2);
        Student std3 = new Student("Veera","92111",7.8);
        Student std4 = new Student("venkat","29111",7.1);

        int std1Key = htStudent.toHashCode(std1.getRollNo());
        int std2Key = htStudent.toHashCode(std2.getRollNo());
        int std3Key = htStudent.toHashCode(std3.getRollNo());
        int std4Key = htStudent.toHashCode(std4.getRollNo());

        htStudent.insert(std1Key,std1);
        htStudent.insert(std2Key,std2);
        htStudent.insert(std3Key,std3);
        htStudent.insert(std4Key,std4);

//        Student newStd2 = htStudent.getStdInfo(std2.getRollNo());
//        if (newStd2.getName().equals(std2.getName())){
//            System.out.println("Match found");
//        }

        htStudent.showData();

        htStudent.deleteStd(std3.getRollNo());

        htStudent.showData();
    }
}
