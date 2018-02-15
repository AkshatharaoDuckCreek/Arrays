import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection3 {
	
	public static void main(String args[]){
		
		Student s1 = new Student(1,"Akshatha", 9001) ; 
		
		Student s2 = new Student(2,"Akshatha", 9001) ; 
		
         Student s3 = new Student(3,"Testter",10001) ;
         
         
         ArrayList<Student> list = new ArrayList<Student>() ; 
         list.add(s1) ; 
         list.add(s2) ; 
         list.add(s3) ; 
         
         Iterator itr = list.iterator() ; 
         
         while(itr.hasNext()){
        	 
        	 Student st = (Student)itr.next() ; 
        	 System.out.println(st.id + st.name + st.age);
         }
	}

}
