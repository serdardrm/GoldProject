package adc;

public class b_plyr extends plyr {
	public static b_plyrData data = new b_plyrData(200, 5, 10, 0, 19, 0);

	public b_plyr() {

	}

	public boolean altın_kont() {
		if (b_plyrData.getAltın() == 0)
			return false;
		else
			return true;

	}

	static void target(int[][] dizi) {
		float min;
		float masraf = 1000;
		if (b_plyrData.getHedef() == 0) {
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 20; j++) {
					min = (Math.abs(b_plyrData.getKonumx() - j) + Math.abs(b_plyrData.getKonumy() - i));
					if (dizi[i][j] != 0) {
						if (masraf > ((min / 3) * 5)) {
							b_plyrData.setHedefx(j);
							b_plyrData.setHedefy(i);
							masraf = ((min / 3) * 5);
						}
					}

				}
			}
			b_plyrData.setAltın(b_plyrData.getAltın() - b_plyrData.getT_maliyet());
			b_plyrData.setHedef(1);

		}
	}

}
