package com.permissionx.molibrary;

 public class MODataManager {

    private static class SingletonHolder {
        private static final MODataManager INSTANCE = new MODataManager();
    }
    public static MODataManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
