
class TestShirt {
	 public static void main(String args[])
	   {
	       //This object creation would call the default constructor
	       shirt myobj = new shirt();
	       
	       System.out.println("Collar Size: "+myobj.getCollar_size());
	       System.out.println("Shirt Meterials: "+myobj.getShirt_meterial());
	       System.out.println("Shirt Sleev Lenght: "+myobj.getShirt_sleev_length());

	       /* this object call perameter constructor*/
	       shirt myobj2 = new shirt(20, "nilon", 70);
	       System.out.println("Collar Size: "+myobj2.getCollar_size());
	       System.out.println("Shirt Meterials: "+myobj2.getShirt_meterial());
	       System.out.println("Shirt Sleev Lenght: "+myobj2.getShirt_sleev_length());
	       
	       shirt myobj3 = new shirt(19, "wollen", 65);
	       System.out.println("Collar Size: "+myobj3.getCollar_size());
	       System.out.println("Shirt Meterials: "+myobj3.getShirt_meterial());
	       System.out.println("Shirt Sleev Lenght: "+myobj3.getShirt_sleev_length());
	  }
}
