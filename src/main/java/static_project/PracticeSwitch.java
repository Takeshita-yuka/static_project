package static_project;

public class PracticeSwitch {

	public static void main(String[] args) {
		
		int[] jobNumbers = { 3, 1, 4, 2, 5, 4, 1, 5, 3, 2 };
		
		for (int jobNumber: jobNumbers) {
			
			switch (jobNumber) {
				case 1:
					System.out.println("勇者");
					break;
				case 2:
					System.out.println("バトルマスター");
					break;
				case 3:
					System.out.println("パラディン");
					break;
				case 4:
					System.out.println("海賊");
					break;
				case 5:
					System.out.println("魔法剣士");
					break;
			}
		}
	}

}
