package adc;

public class d_plyrData {
	private static int altın;
	private static int m_maliyet;
	private static int t_maliyet;
	private static int hedef;
	private static int hedefx;
	private static int hedefy;
	private static int konumx;
	private static int konumy;

	public  d_plyrData(int altın, int m_maliyet, int t_maliyet, int hedef, int konumx, int konumy) {
		d_plyrData.altın = altın;
		d_plyrData.m_maliyet = m_maliyet;
		d_plyrData.t_maliyet = t_maliyet;
		d_plyrData.hedef = hedef;
		d_plyrData.konumx = konumx;
		d_plyrData.konumy = konumy;
	}

	public static int getAltın() {
		return d_plyrData.altın;
	}

	public static void setAltın(int altın) {
		d_plyrData.altın = altın;
	}

	public static int getM_maliyet() {
		return d_plyrData.m_maliyet;
	}

	public static void setM_maliyet(int m_maliyet) {
		d_plyrData.m_maliyet = m_maliyet;
	}

	public static int getT_maliyet() {
		return d_plyrData.t_maliyet;
	}

	public static void setT_maliyet(int t_maliyet) {
		d_plyrData.t_maliyet = t_maliyet;
	}

	public static int getHedef() {
		return d_plyrData.hedef;
	}

	public static void setHedef(int hedef) {
		d_plyrData.hedef = hedef;
	}

	public static int getHedefx() {
		return d_plyrData.hedefx;
	}

	public static void setHedefx(int hedefx) {
		d_plyrData.hedefx = hedefx;
	}

	public static int getHedefy() {
		return d_plyrData.hedefy;
	}

	public static void setHedefy(int hedefy) {
		d_plyrData.hedefy = hedefy;
	}

	public static int getKonumx() {
		return d_plyrData.konumx;
	}

	public static void setKonumx(int konumx) {
		d_plyrData.konumx = konumx;
	}

	public static int getKonumy() {
		return d_plyrData.konumy;
	}

	public static void setKonumy(int konumy) {
		d_plyrData.konumy = konumy;
	}
}