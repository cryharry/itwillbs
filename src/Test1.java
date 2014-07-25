
public class Test1 {
	public static void main(String[] args) {
		int height; //키
		double dheight;
		int weight; //몸무게
		double bmi; 
		
		//비만지수bmi = 몸무게kg/키m의 제곱
		
/*		비만지수				출력문장
		30.0이상				고도비만
		25.0이상 ~ 30.0미만 	비만
		23.0이상 ~ 25.0미만	과체중
		18.5이상 ~ 23.0미만	표준체중
		18.5미만				체중미달
*/
		height = 186; weight = 73;
		dheight = height/100.0;
		dheight *= dheight;
		bmi = weight/dheight;
		if(bmi >= 30.0) {
			System.out.println("고도비만");
		} else if(bmi >= 25.0 && bmi < 30.0) {
			System.out.println("비만");
		} else if(bmi >= 23.0 && bmi < 25.0) {
			System.out.println("과체중");
		} else if(bmi >= 18.5 && bmi < 23.0) {
			System.out.println("표준체중");
		} else {
			System.out.println("체중미달");
		}
	}
}
