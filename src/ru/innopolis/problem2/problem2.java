// your solution here
//fix all the errors including package errors

public interface LightningPort {

    void chargeByLightning();

}

class AndroidAdapter extends LightningPort{
    Android android;
    AndroidAdapter(Android android){
        this.android = android;
    }

    @Override
    public void chargeByLightning() {

    }
}

public class ChargerStation {

    void chargeByLightning(LightningPort lightningPort){
        lightningPort.chargeByLightning();
    }
}

public class problem2{
    public static void main(String[] args) {
        ChargerStation station = new ChargerStation();
        iPhone iPhone = new iPhone();
        station.chargeByLightning(iPhone);
        // focus here
        Android android = new Android();
        station.chargeByLightning(AndroidAdapter(android));
    }
}