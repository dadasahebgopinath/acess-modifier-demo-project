package com.excellence.finaldemo.child;

import com.excellence.finaldemo.parent.Mobile;

public class OnePlusMobile extends Mobile{

	String camera;

	OnePlusMobile() {
		super();
		camera = "Ultra wide";
	}

	public static void main(String[] args) {

		OnePlusMobile oneplus = new OnePlusMobile();
		oneplus.setCompanyName("One plus");
		oneplus.setPrice(25000.00);
		oneplus.setCamera("Ultra super wide");
		
		oneplus.display();

	}
	


	void setCamera(String inputCamera) {
		camera = inputCamera;
	}

}
