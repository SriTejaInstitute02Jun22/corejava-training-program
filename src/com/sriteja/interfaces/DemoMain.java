package com.sriteja.interfaces;

public class DemoMain {

	public static void main(String args[]) {
		
		/**
		 * Interface Object creation
		 * Interface_Name object_name = new InterfaceImpl_classname();
		 * */
		DemoInterface demo = new DemoImpl();
		demo.show();
		demo.get();
	}
}
