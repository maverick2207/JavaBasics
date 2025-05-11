package arrayBasics;

class k {

    public k() {
        System.out.println("k");
    }

}

class l extends k {
    public l() {
        System.out.println("l");
    }
}

class m extends l {
    public m() {
        System.out.println("m");
    }
}

public class ExtendBasics2 {

    public static void main(String[] args) {
        m obj = new m();
    }


}
