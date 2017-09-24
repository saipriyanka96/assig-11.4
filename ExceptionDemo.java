package ed;
//Package is a grouping of related types providing access protection and name 
//space management
//create package name as ed
import java.io.IOException;
//this import statement provides for system input and output through data streams,serialization 
//and the file system
public class ExceptionDemo 
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class
//created as class name exceptiondemo
	{
	void show() throws ArithmeticException
	//we created the validate method that taked integer value as paramter.If the age is less than 18 we are 
	//we are throwing the ArithmeticException otherwise it will print welcome to vote//
	//this will help to display the message
	{
		System.out.println("parent class");
	}
}
class Child extends ExceptionDemo{//subclass creationhere it extends the values of class1 to class2
	void show() throws IOException{//compilation error
		System.out.println("child class");
		//system is final class
//out is a static member of system class and type printStream
//println is method of printStream class.ln means nextline
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try{
	 ExceptionDemo sub=new Child();//creating an object
	 sub.show();//prints the value
 }
 catch(Exception e){
	/*the code is prone to exceptions is placed in the try block
	 *when exception occurs that exception occurred is handled by the 
	 *catch block associated with it
	 */
 }
	}

}
