package com.andy.design.pattern;

/**
 * 懒加载
 */
public class LazySingleton4ThreadWithCodeBlock {

    private static LazySingleton4ThreadWithCodeBlock instance = null;

    private LazySingleton4ThreadWithCodeBlock(){}

    /**
     * 通过synchronized方法块，缩小同步范围,保证线程安全
     * @return
     */
    public static LazySingleton4ThreadWithCodeBlock getInstance() {
        synchronized(LazySingleton4ThreadWithCodeBlock.class){
            if(null == instance){
                instance = new LazySingleton4ThreadWithCodeBlock();
            }
        }
        return instance;
    }
}
