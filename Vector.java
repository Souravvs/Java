package package1;

import java.util.Vector;

public class Vector {

		public static void main(String[] args) {
			Vector <String> mammals = new Vector<>();
			Vector <Integer> rollNos = new Vector<>();
			rollNos.add(1);
			rollNos.add(2);
			System.out.println("Roll Nos: " + rollNos);
			rollNos.remove(0);
			
			System.out.println("Roll Nos: " + rollNos);
			rollNos.get(2);
			
		}
}
