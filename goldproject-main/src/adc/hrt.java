package adc;

import java.util.Random;
import java.math.*;

public class hrt {
	public static int[][] haritaYap(int x, int e) {
		int[][] dizi = new int[20][20];
		Random r = new Random();
		int xsayac, ysayac, rast, kalan, bolum, k, l,s;
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				dizi[i][j] = 0;
			}
		}
		
		for (int i = 0; i < 80; i++) {
			rast = r.nextInt(4);
			l = r.nextInt(20);
			k = r.nextInt(20);
			if (rast == 0)
				dizi[l][k] = 5;
			if (rast == 1)
				dizi[l][k] = 10;
			if (rast == 2)
				dizi[l][k] = 15;
			if (rast == 3)
				dizi[l][k] = 20;

			dizi[0][0] = 0;
			dizi[19][0] = 0;
			dizi[0][19] = 0;
			dizi[19][19] = 0;

		}
		
		
		return dizi;
	}
}
/*
 * xsayac=0;ysayac=0; do{ rast=r.nextInt(64); kalan=rast % 8; rast=rast-kalan;
 * bolum=rast/8; if(dizi[bolum][kalan]==0) dizi[bolum][kalan]=5; xsayac++; }
 * while(xsayac<x); do{ rast=r.nextInt(64); kalan=rast % 8; rast=rast-kalan;
 * bolum=rast/8; if(dizi[bolum][kalan]==0) dizi[bolum][kalan]=10; ysayac++; }
 * while(ysayac<e);ysayac=0; do{ rast=r.nextInt(64); kalan=rast % 8;
 * rast=rast-kalan; bolum=rast/8; if(dizi[bolum][kalan]==0)
 * dizi[bolum][kalan]=15; ysayac++; } while(ysayac<e);ysayac=0; do{
 * rast=r.nextInt(64); kalan=rast % 8; rast=rast-kalan; bolum=rast/8;
 * if(dizi[bolum][kalan]==0) dizi[bolum][kalan]=15; ysayac++; } while(ysayac<e);
 */