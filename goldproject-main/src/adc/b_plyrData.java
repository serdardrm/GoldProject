package adc;

public class b_plyrData {
	private static int altın;
	private static int m_maliyet;
	private static int t_maliyet;
	private static int hedef;
	private static int hedefx;
	private static int hedefy;
	private static int konumx;
	private static int konumy;

	public b_plyrData(int altın, int m_maliyet, int t_maliyet, int hedef, int konumx, int konumy) {
		b_plyrData.altın = altın;
		b_plyrData.m_maliyet = m_maliyet;
		b_plyrData.t_maliyet = t_maliyet;
		b_plyrData.hedef = hedef;
		b_plyrData.konumx = konumx;
		b_plyrData.konumy = konumy;
	}

	public static int getAltın() {
		return b_plyrData.altın;
	}

	public static void setAltın(int altın) {
		b_plyrData.altın = altın;
	}

	public static int getM_maliyet() {
		return b_plyrData.m_maliyet;
	}

	public static void setM_maliyet(int m_maliyet) {
		b_plyrData.m_maliyet = m_maliyet;
	}

	public static int getT_maliyet() {
		return b_plyrData.t_maliyet;
	}

	public static void setT_maliyet(int t_maliyet) {
		b_plyrData.t_maliyet = t_maliyet;
	}

	public static int getHedef() {
		return b_plyrData.hedef;
	}

	public static void setHedef(int hedef) {
		b_plyrData.hedef = hedef;
	}

	public static int getHedefx() {
		return b_plyrData.hedefx;
	}

	public static void setHedefx(int hedefx) {
		b_plyrData.hedefx = hedefx;
	}

	public static int getHedefy() {
		return b_plyrData.hedefy;
	}

	public static void setHedefy(int hedefy) {
		b_plyrData.hedefy = hedefy;
	}

	public static int getKonumx() {
		return b_plyrData.konumx;
	}

	public static void setKonumx(int konumx) {
		b_plyrData.konumx = konumx;
	}

	public static int getKonumy() {
		return b_plyrData.konumy;
	}

	public static void setKonumy(int konumy) {
		b_plyrData.konumy = konumy;
	}
}