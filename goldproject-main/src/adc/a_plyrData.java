package adc;

public class a_plyrData {
	private static int altın;
	private static int m_maliyet;
	private static int t_maliyet;
	private static int hedef;
	private static int hedefx;
	private static int hedefy;
	private static int konumx;
	private static int konumy;

	public a_plyrData(int altın, int m_maliyet, int t_maliyet, int hedef, int konumx, int konumy) {
		a_plyrData.altın = altın;
		a_plyrData.m_maliyet = m_maliyet;
		a_plyrData.t_maliyet = t_maliyet;
		a_plyrData.hedef = hedef;
		a_plyrData.konumx = konumx;
		a_plyrData.konumy = konumy;
	}

	public static int getAltın() {
		return a_plyrData.altın;
	}

	public static void setAltın(int altın) {
		a_plyrData.altın = altın;
	}

	public static int getM_maliyet() {
		return a_plyrData.m_maliyet;
	}

	public static void setM_maliyet(int m_maliyet) {
		a_plyrData.m_maliyet = m_maliyet;
	}

	public static int getT_maliyet() {
		return a_plyrData.t_maliyet;
	}

	public static void setT_maliyet(int t_maliyet) {
		a_plyrData.t_maliyet = t_maliyet;
	}

	public static int getHedef() {
		return a_plyrData.hedef;
	}

	public static void setHedef(int hedef) {
		a_plyrData.hedef = hedef;
	}

	 public static int getHedefx() {
		return a_plyrData.hedefx;
	}

	public static void setHedefx(int hedefx) {
		a_plyrData.hedefx = hedefx;
	}

	public static int getHedefy() {
		return a_plyrData.hedefy;
	}

	public static void setHedefy(int hedefy) {
		a_plyrData.hedefy = hedefy;
	}

	public static int getKonumx() {
		return a_plyrData.konumx;
	}

	public static void setKonumx(int konumx) {
		a_plyrData.konumx = konumx;
	}

	public static int getKonumy() {
		return a_plyrData.konumy;
	}

	public static void setKonumy(int konumy) {
		a_plyrData.konumy = konumy;
	}
}