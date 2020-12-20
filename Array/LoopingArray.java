public class LoopingArray {
	public static void main(String[] args) {
		int[] arrInt = new int[50];

		// inisiasi dan menampilkan arrInt dari elemen ke 1 sampe ke 50 dan ini bisa digunakan untuk menampilkan satu juga data dalam array bahkan ratusan juga array :
		for (int x = 0; x < arrInt.length; x++) {
			arrInt[x] = x + 1;
			System.out.println(arrInt[x]);
		}
	}
}