package hello.core.json;

public class Test {

    static class A {
        private final B b = new B();

        public void loadB() {
            b.load("a","b","c");
        }
    }

    static class B extends BAbstract {

        public void load(String s) {
            System.out.println(s);
        }
    }

    static abstract class BAbstract implements BAbstractInterface {

        public void load(String... a) {
            for (String s : a) {
                this.load(s);
            }
        }
    }

    interface BAbstractInterface {
        void load(String s);
    }

    public static void main(String[] args) {
        A a = new A();
        a.loadB();
    }
}
