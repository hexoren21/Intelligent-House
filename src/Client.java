public class Client {
    public static void main(String[] args) {
        FascadaApi fascadaApi = new FascadaApi();
        SingletonApi singletonApi = SingletonApi.getInstance();
        singletonApi.status(fascadaApi);
        fascadaApi.unLockHouse();
        singletonApi.status(fascadaApi);
        fascadaApi.openDoorHouse();
        singletonApi.status(fascadaApi);
        fascadaApi.closeDoorHouse();
        singletonApi.status(fascadaApi);
        fascadaApi.openDoorGarage();

    }
}
