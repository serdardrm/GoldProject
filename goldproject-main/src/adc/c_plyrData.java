package adc;

public class c_plyrData {
	private static int altın;
	private static int m_maliyet;
	private static int t_maliyet;
	private static int hedef;
	private static int hedefx;
	private static int hedefy;
	private static int konumx;
	private static int konumy;

	public c_plyrData(int altın, int m_maliyet, int t_maliyet, int hedef, int konumx, int konumy) {
		c_plyrData.altın = altın;
		c_plyrData.m_maliyet = m_maliyet;
		c_plyrData.t_maliyet = t_maliyet;
		c_plyrData.hedef = hedef;
		c_plyrData.konumx = konumx;
		c_plyrData.konumy = konumy;
	}

	public static int getAltın() {
		return c_plyrData.altın;
	}

	public static void setAltın(int altın) {
		c_plyrData.altın = altın;
	}

	public static int getM_maliyet() {
		return c_plyrData.m_maliyet;
	}

	public static void setM_maliyet(int m_maliyet) {
		c_plyrData.m_maliyet = m_maliyet;
	}

	public static int getT_maliyet() {
		return c_plyrData.t_maliyet;
	}

	public static void setT_maliyet(int t_maliyet) {
		c_plyrData.t_maliyet = t_maliyet;
	}

	public static int getHedef() {
		return c_plyrData.hedef;
	}

	public static void setHedef(int hedef) {
		c_plyrData.hedef = hedef;
	}

	public static int getHedefx() {
		return c_plyrData.hedefx;
	}

	public static void setHedefx(int hedefx) {
		c_plyrData.hedefx = hedefx;
	}

	public static int getHedefy() {
		return c_plyrData.hedefy;
	}

	public static void setHedefy(int hedefy) {
		c_plyrData.hedefy = hedefy;
	}

	public static int getKonumx() {
		return c_plyrData.konumx;
	}

	public static void setKonumx(int konumx) {
		c_plyrData.konumx = konumx;
	}

	public static int getKonumy() {
		return c_plyrData.konumy;
	}

	public static void setKonumy(int konumy) {
		c_plyrData.konumy = konumy;
	}
}