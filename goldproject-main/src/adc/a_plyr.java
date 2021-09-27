
package adc;

import java.math.*;

public class a_plyr extends plyr {
	public static a_plyrData data = new a_plyrData(200, 5, 5, 0, 0, 0);

	public a_plyr() {
	}

	public boolean altýn_kont() {
		if (a_plyrData.getAltýn() == 0)
			return false;
		else
			return true;

	}
	

	  static void target(int[][] dizi) {
		int min = 1000;
		if (a_plyrData.getHedef() == 0) {
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 20; j++) {
					if (dizi[i][j] != 0) {
						if ((Math.abs(a_plyrData.getKonumx() - j) + Math.abs(a_plyrData.getKonumy() - i)) < min)
						{		a_plyrData.setHedefx(j);
							a_plyrData.setHedefy(i);
						min = Math.abs(a_plyrData.getKonumx() - j) + Math.abs(a_plyrData.getKonumy() - i);}
					}
				}
			}
			a_plyrData.setAltýn(a_plyrData.getAltýn() - a_plyrData.getT_maliyet());
			a_plyrData.setHedef(1);
		}
	}

}
