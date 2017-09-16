package operators;

public class caseswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int daynumber = 4;
		switch (daynumber) {
		case 1:
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Среда");
			break;
		default:
			System.out.println("Дня с таким номером не существует");
		}
	}

}
