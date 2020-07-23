package web.model;

public class Car {
    private String nick;
    private int trafficPolicemanCounter;
    private int downedPedestrianCounter;

    public Car(String nick, int trafficPolicemanCounter, int downedPedestrianCounter) {
        this.nick = nick;
        this.trafficPolicemanCounter = trafficPolicemanCounter;
        this.downedPedestrianCounter = downedPedestrianCounter;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getTrafficPolicemanCounter() {
        return trafficPolicemanCounter;
    }

    public void setTrafficPolicemanCounter(int trafficPolicemanCounter) {
        this.trafficPolicemanCounter = trafficPolicemanCounter;
    }

    public int getDownedPedestrianCounter() {
        return downedPedestrianCounter;
    }

    public void setDownedPedestrianCounter(int downedPedestrianCounter) {
        this.downedPedestrianCounter = downedPedestrianCounter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nick='" + nick + '\'' +
                ", trafficPolicemanCounter=" + trafficPolicemanCounter +
                ", downedPedestrianCounter=" + downedPedestrianCounter +
                '}';
    }
}
