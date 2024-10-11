package ab45_assignments;

class Univercity1
{
	static void fund()
	{
		
	}
}

class College1 extends Univercity1
{
	static void miscellanius_expend()
	{
		
	}
}

class Colllege_Student1 extends College1
{
	static void tutionFee()
	{
		
	}
}

public class Assignment21_MltipleLevel_Inheritence_Singleclass extends Colllege_Student1 {

	public static void main(String[] args) {

		tutionFee();
		miscellanius_expend();
		fund();

	}

}
