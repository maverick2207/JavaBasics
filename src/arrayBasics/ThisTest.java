package arrayBasics;

public class ThisTest {
	
	 int i;
	    
	    public static void main(String[] args) {
	           ThisTest obj=new ThisTest();
	           ThisTest obj1=new ThisTest();
	           obj.i=2;
	           
	           System.out.println(obj);
	           System.out.println(obj1);
	           
	           System.out.println(obj.i); //print obj.i (will print 2)
	           obj.m1();
	           System.out.println(obj.i); //print obj.i again (will print 3),
	                                      //after m1() internally called m2(this)      
	    }
	    
	    void m1(){
	           m2(this); //passing this (current class object) as argument,
	                        //object is passed as a reference
	    }
	    
	    void m2(ThisTest obj1){
	    	System.out.println(obj1);
	           obj1.i=3; //obj1 and obj are referring to same object.
	                  //So, any changes to obj1 will be reflected in obj as well or vice-versa.
	    }

}
