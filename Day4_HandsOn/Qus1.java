package Day4_Ass;



public class Qus1 {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = new String[] {"KES22HAV","RAH23UL","CHAMAN24JAY","DD22BC","DAU22BC"};
		
		for (int i=0; i<strArray.length; i++)  
		{  
			if (strArray[i].contains("22")) {
			System.out.println(strArray[i]);  
			count++;
			}
		}  
		System.out.println(count);  

	}

}
