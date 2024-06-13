package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		int userAge; 
		String serviceCost = "";
		
		userAge = 30;
		
		serviceCost = switch(userAge) {
			case 10 -> "1000円";
			case 20 -> "2000円";
			case 30, 40 -> "3000円";
			case 50, 60, 70 -> "4000円";
			case 80 -> "5000円";
			default -> "500円";
		};
		
		System.out.println( userAge + "代の料金は" + serviceCost);

	}

}
