package Bank;

public class Loan {



	
		
		private String name;
		private double AmoutL=0;
		private static int AcCount=0;
		private String startDate,EndDate;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getAmoutL() {
			return AmoutL;
		}

		public void setAmoutL(double amoutL) {
			AmoutL = amoutL;
		}

		public static int getAcCount() {
			return AcCount;
		}

		public static void setAcCount(int acCount) {
			AcCount = acCount;
		}

		public String getStartDate() {
			return startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getEndDate() {
			return EndDate;
		}

		public void setEndDate(String endDate) {
			EndDate = endDate;
		}

		public  Loan(String name,double amoutL,String startDate,String endDate)
		{
			this.name=name;
			this.setAmoutL(amoutL);
			this.startDate=startDate;
			this.EndDate=endDate;
			this.AcCount+=1;
			
		}
		
		

		
		
		
		
		

	

}
