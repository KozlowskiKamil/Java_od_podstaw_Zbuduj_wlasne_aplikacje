package Challenge.roadsterChallenge;

public class Roadster {
    float topspeed, acceleration, crazyTopSpeed, crazyAcceleration;

    boolean crazyMode;
    public Roadster(float topspeed, float acceleration) {
        this.topspeed = topspeed;
        this.acceleration = acceleration;
    }

    public Roadster(float topspeed, float acceleration, float crazyTopSpeed, float crazyAcceleration, boolean crazyMode) {
        this.topspeed = topspeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
        this.crazyMode = crazyMode = true;
    }

    public float getTopspeed() {
        return topspeed;
    }
    public float getTopspeed(boolean crazyMode) {
        if (crazyMode) {
            return crazyTopSpeed;
        }else return topspeed;
    }

    public void setTopspeed(float topspeed) {
        this.topspeed = topspeed;
    }

    public float getAcceleration() {
        return acceleration;
    }
    public float getAcceleration(boolean crazyMode) {
        if (crazyMode){
            return crazyAcceleration;
        }else return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public float getCrazyTopSpeed() {
        return crazyTopSpeed;
    }

    public void setCrazyTopSpeed(float crazyTopSpeed) {
        this.crazyTopSpeed = crazyTopSpeed;
    }

    public float getCrazyAcceleration() {
        return crazyAcceleration;
    }

    public void setCrazyAcceleration(float crazyAcceleration) {
        this.crazyAcceleration = crazyAcceleration;
    }
}
