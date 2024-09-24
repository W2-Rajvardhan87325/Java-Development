enum TrafficLight {
    RED(30), GREEN(60), YELLOW(5);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class Program4 {
    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " lasts for " + light.getDuration() + " seconds.");
        }
    }
}
