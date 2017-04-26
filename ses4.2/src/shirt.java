
public class shirt {
	private int collar_size;
	   private String shirt_meterial;
	   private int shirt_sleev_lenght;
	   shirt()
	   {
	       //Default constructor
	       collar_size = 17;
	       shirt_meterial = "Cotton";
	       shirt_sleev_lenght = 60;
	   }
	   shirt(int num1, String str, int num2)
	   {
	       //Parameterized constructor
		   collar_size = num1;
	       shirt_meterial = str;
	       shirt_sleev_lenght = num2;
	   }
	   //Getter and setter methods
	   public int getCollar_size() {
	       return collar_size;
	   }
	   public void setCollar_size(int collar_size) {
	       this.collar_size = collar_size;
	   }
	   public String getShirt_meterial() {
	       return shirt_meterial;
	   }
	   public void setShirt_meterial(String shirt_meterial) {
	       this.shirt_meterial = shirt_meterial;
	   }
	   public int getShirt_sleev_length() {
	       return shirt_sleev_lenght;
	   }
	   public void setShirt_sleev_length(int shirt_sleev_lenght) {
	       this.shirt_sleev_lenght = shirt_sleev_lenght;
	   }
	}

	
	
	  


