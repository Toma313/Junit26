package example;

import config.BaseClass;

public class SingletonePatern extends BaseClass {
    public static SingletonePatern singletonePatern;

    private SingletonePatern() {
    }

    public  static SingletonePatern getSingletonePatern(){
        if (singletonePatern==null){
            singletonePatern = new SingletonePatern();
        }
        return singletonePatern;
    }

}
