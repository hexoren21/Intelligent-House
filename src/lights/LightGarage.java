package lights;
import Interfaces.Light;

public class LightGarage implements Light {
    private boolean flagLightGarage_;
    public LightGarage() {
        this.flagLightGarage_ = false;
    }
    public boolean isFlagLightGarage() {
        return flagLightGarage_;
    }

    @Override
    public void off() {
        this.flagLightGarage_ = false;
    }

    @Override
    public void on() {
        this.flagLightGarage_ = true;
    }

    @Override
    public String toString() {
        return "Light Garage{"
                + flagLightGarage_ +
                '}';
    }
}
