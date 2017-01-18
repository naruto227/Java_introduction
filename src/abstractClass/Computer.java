package abstractClass;

/**
 * Created by hzq on 17-1-18.
 */
public class Computer implements USB{
    /**内存容量*/
    int memorySize;

    public byte[] readData(){
        //读数据的逻辑
        return new byte[0];
    }

    public void writeData(byte[] data){
        //写数据的逻辑
    }
}
