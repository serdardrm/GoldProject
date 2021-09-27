package adc;

public class c_plyr extends plyr {
	public static c_plyrData data = new c_plyrData(200, 5, 15, 0, 0, 19);

	public c_plyr() {
	}

	public boolean altın_kont() {
		if (c_plyrData.getAltın() == 0)
			return false;
		else
			return true;

	}

	static void target(int[][] dizi) {
		float min;
		float masraf = 1000;
		if (c_plyrData.getHedef() == 0) {
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 20; j++) {
					min = (Math.abs(c_plyrData.getKonumx() - j) + Math.abs(c_plyrData.getKonumy() - i));
					if (dizi[i][j] != 0) {
						if (masraf > ((min / 3) * 5)) {
							c_plyrData.setHedefx(j);
							c_plyrData.setHedefy(i);
							masraf = ((min / 3) * 5);
						}
					}

				}
			}
			c_plyrData.setAltın(c_plyrData.getAltın() - c_plyrData.getT_maliyet());
			c_plyrData.setHedef(1);

		}
	}
}
