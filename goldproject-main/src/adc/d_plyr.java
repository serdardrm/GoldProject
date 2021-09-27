package adc;

public class d_plyr extends plyr {
	public static d_plyrData data = new d_plyrData(200, 5, 20, 0, 19, 19);

	d_plyr() {
	}

	public boolean altın_kont() {
		if (d_plyrData.getAltın() == 0)
			return false;
		else
			return true;
	}
	
	static void target(int[][] dizi) {
		float min;
		float masraf = 1000;
		if (d_plyrData.getHedef() == 0) {
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 20; j++) {
					min = (Math.abs(d_plyrData.getKonumx() - j) + Math.abs(d_plyrData.getKonumy() - i));
					if (dizi[i][j] != 0) {
						if (masraf > ((min / 3) * 5)) {
							d_plyrData.setHedefx(j);
							d_plyrData.setHedefy(i);
							masraf = ((min / 3) * 5);
						}
					}

				}
			}
			d_plyrData.setAltın(d_plyrData.getAltın() - d_plyrData.getT_maliyet());
			d_plyrData.setHedef(1);

		}
	}

}
