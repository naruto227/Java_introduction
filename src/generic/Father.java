package generic;

/**
 * 泛型父类
 * Created by hzq on 16-11-1.
 */
public abstract class Father<T1, T2> {

}

/**
 * 保留类型：全部/部分保留
 * 不保留：具体类型 ，没有类型，擦除    Object
 */

class C1<T1,T2> extends Father<T1,T2>{}

class C2<T2> extends Father<Integer,T2>{}

class C3 extends Father<Integer,String>{}

class C4 extends Father/*<Object,Object>*/{}