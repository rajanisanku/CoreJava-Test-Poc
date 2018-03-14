package test.learning;

abstract class One {
	abstract int getValue();
	abstract String getName();
	void welcome() {
		System.out.println("welcome");
	}
}

class Abstract_basic extends One {
		public static void main(String[] args) {
		
		One o = new Abstract_basic();
		System.out.println(o.getValue());
		System.out.println(o.getName());
		o.welcome();
	}
	
	
	int getValue() {
		 return 1;
	}
	
	String getName() {
		return "bhoomika";
	}
	void welcome() { System.out.println("hello main");	}

}
