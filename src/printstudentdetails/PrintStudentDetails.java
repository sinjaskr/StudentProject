/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 * store and print student details
 * view class - user interaction
 * @author jaska
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // store and print 3 student details
        Student[] list = new Student[3];
        // objects are created
        Student s1 = new Student(); 
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName("Jaskaran");
        s1.setId(22);
        s2.setName("Harman");
        s2.setId(22);
        s3.setName("Randeep");
        s3.setId(22);
        // store object in array
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        // using for loop
        for (int i=0; i<list.length; i++){
            System.out.println(list[i].getName() +" "+ list[i].getId());
        }
        
    }
    
}
