package com.amdocs.CleanCodePractices.demeter;

public class BasicClass {
	
	public void method1(ClassType1 type1Object, ClassType2 type2Object) {
		
		this.method2(); // allowed
		this.method3(); // allowed
		
		
		type1Object.method(); // allowed
		type2Object.method(); // allowed
		
		
		BasicClass basicClassInstance1 = new BasicClass();
		BasicClass basicClassInstance2 = new BasicClass();
		basicClassInstance1.method2(); // allowed
		basicClassInstance2.method2(); // allowed
		
		
		UnrelatedClassA unrelatedClassAInstance = new UnrelatedClassA();
		UnrelatedClassB unrelatedClassBInstance = new UnrelatedClassB();
		unrelatedClassAInstance.method(); // allowed
		unrelatedClassBInstance.method(); // allowed
		
	}
	
	private void method2() {
		// ...
		// ...
	}
	
	private void method3() {
		// ...
		// ...
	}
	
}

class ClassType1 {
	public void method() {
		
	}
}

class ClassType2 {
	public void method() {
		
	}
}

class BaseClassMember {
	public void method() {
		
	}
}


class UnrelatedClassA {
	public void method() {
		
	}
}

class UnrelatedClassB {
	public void method() {
		
	}
}