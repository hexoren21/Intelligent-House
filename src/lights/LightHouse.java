package lights;
import Interfaces.Light;

public class LightHouse implements Light {
    private boolean flagLightHouse_;
    public LightHouse() {
        this.flagLightHouse_ = false;
    }
    public boolean isFlagLightHouse_() {
        return flagLightHouse_;
    }

    @Override
    public void off() {
        this.flagLightHouse_ = false;
    }

    @Override
    public void on() {
            this.flagLightHouse_ = true;
    }

    @Override
    public String toString() {
        return "Light House{"
                + flagLightHouse_ +
                '}';
    }
}
