public class SingletonApi {
    private static SingletonApi instance;

    private SingletonApi() {
    }

    public static SingletonApi getInstance() {
        if(instance == null) {
            instance = new SingletonApi();
        }
        return instance;
    }
    public void status(FascadaApi fascadaApi) {
        System.out.println(fascadaApi);
    }
}
