public class OperatorConditional
 {

	public static void main(String[] args) {
		int value = 4;
		int anotherValue = 5;

		System.out.println("Conditional AND");
		boolean result = value == 3 && anotherValue == 5;
		boolean anotherResult = value != 3 && anotherValue == 5;

		System.out.println("hasil operator AND pada syarat value == 3 && anotherValue == 5 adalah " +result);
		System.out.println("hasil operator AND pada syarat alue != 3 && anotherValue == 5 adalah " + anotherResult);
		System.out.println();

		System.out.println("Conditional OR");
		result = value == 3 || anotherValue == 5;
		anotherResult = value != 3 || anotherValue == 5;

		System.out.println("hasil operator AND pada syarat value == 3 || anotherValue == 5 adalah " + result);
		System.out.println("hasil operator AND pada syarat value != 3 || anotherValue == 5 adalah " + anotherResult);
		System.out.println();
	}
}