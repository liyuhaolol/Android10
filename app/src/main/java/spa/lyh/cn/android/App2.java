package spa.lyh.cn.android;

import android.app.Application;

public class App2 extends Application {
    public static App2 app = null;


    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

    public static App2 getInstance() {
        return app;
    }
}
