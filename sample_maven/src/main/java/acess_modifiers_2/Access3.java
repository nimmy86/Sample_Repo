package acess_modifiers_2;

import access_modifiers.Access1;

public class Access3 extends Access1{

public static void main(String args[]) {
	Access1 ob = new Access1(); 
	ob.display1();
	Access3 obj = new Access3();
	obj.display3();
	obj.display1();
	
	
}
}
