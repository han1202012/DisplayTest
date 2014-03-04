package shuliang.han.displaytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class MainActivity extends Activity {

	//��Ļ�Ŀ��, ��λ����
	private int screenWidth;
	private int screenHeight;
	
	//��Ļ���ܶ�
	private float density;	//ֻ��������� : 0.75/ 1.0/ 1.5/ 2.0/ 3.0
	private int densityDpi;	//ֻ��������� : 120/ 160/ 240/ 320/ 480
	
	//ˮƽ��ֱ��ȷ�ܶ�
	private float xdpi;	//ˮƽ�����ϵ�׼ȷ�ܶ�, ��ÿӢ������ص�
	private float ydpi;	//��ֱ�����ϵ�׼ȷ�ܶ�, ��û��������ص�
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		getPixelWindowManager();
//		getPixelDisplayMetrics();
		getPixelDisplayMetricsII();
		
		System.out.println("��:" + screenWidth + ", ��:"+screenHeight);
		System.out.println("�ܶ� density:" + density + ",densityDpi:" +densityDpi);
		System.out.println("��ȷ�ܶ� xdpi:" + xdpi + ", ydpi:" + ydpi);
	}
	
	private void getPixelWindowManager() {
		screenWidth = getWindowManager().getDefaultDisplay().getWidth();
		screenHeight = getWindowManager().getDefaultDisplay().getHeight();
	}
	
	private void getPixelDisplayMetrics() {
		DisplayMetrics dm = new DisplayMetrics();
		dm = getResources().getDisplayMetrics();
		
		screenWidth = dm.widthPixels;
		screenHeight = dm.heightPixels;
		
		density = dm.density;
		densityDpi = dm.densityDpi;
		
		xdpi = dm.xdpi;
		ydpi = dm.ydpi;
	}
	
	private void getPixelDisplayMetricsII() {
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		
		screenWidth = dm.widthPixels;
		screenHeight = dm.heightPixels;
		
		density = dm.density;
		densityDpi = dm.densityDpi;
		
		xdpi = dm.xdpi;
		ydpi = dm.ydpi;
	}
}
