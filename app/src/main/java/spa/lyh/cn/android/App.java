package spa.lyh.cn.android;

public class App extends App2{

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public String A(){
        return "hahah";
    }

    public static App getInstance() {
        return (App)app;
    }
}
