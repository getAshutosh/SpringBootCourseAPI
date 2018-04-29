package interfaceAndAbstract;

abstract class my {
    public void mymethod() {
        System.out.print("Abstract");
    }
}

class poly {
    public static void main(String a[]) {
        my m = new my() {};
        m.mymethod();
    }
}
