package com.andy.design.pattern;

/**
 * <p>炒菜流程</p>
 *
 * @author AndyWang QQ:295268319
 * @date 2019/6/4 0004 19:14
 */
public abstract class Cook {

    /**菜名*/
    private String name;

    public Cook(){
    }

    public Cook(String name){
        this.name = name;
    }


    public final void doCook(){
        wash();
        cut();
        stirFry();
        server();
    }

    /**上菜*/
    public void server(){
        System.out.println("上菜了：" +this.name);
    }
    /**炒菜*/
    public abstract void stirFry();

    /**切菜*/
    public abstract void cut();

    /**洗菜*/
    public void wash(){
        System.out.println("把菜先洗好");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
