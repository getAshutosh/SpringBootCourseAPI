public final class FinalClass {
	
	class InnerClass {
		void test(){
			if(FinalClass.this.flag){
				simple();
			}
		}
	}
	private boolean flag = true;
	public void simple(){
		System.out.println("Simple");
	}
	public FinalClass(){
		(new InnerClass()).test();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FinalClass();
	}

}
