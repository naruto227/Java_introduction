package testInterface;

/**
 * 多个接口的继承关系
 * Created by hzq on 16-10-14.
 */
public interface InterfaceA {
    void aaa();
}

interface InterfaceB{
    void bbb();
}

interface InterfaceC extends InterfaceA, InterfaceB{
    void ccc();
}

class TestClass implements InterfaceC{
//alt+enter
    @Override
    public void ccc() {

    }

    @Override
    public void aaa() {

    }

    @Override
    public void bbb() {

    }
}
