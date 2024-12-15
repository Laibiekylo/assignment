public class task3 {
    private int currentChannel;
    private int currentVolumeLevel;
    private boolean power;

    public Television() {
        this.currentChannel = 1;
        this.currentVolumeLevel = 0;
        this.power = false;
    }

    public void changeChannels(int channel) {
        this.currentChannel = channel;
        System.out.println("Channel changed to: " + this.currentChannel);
    }

    public void adjustVolume(int volume) {
        this.currentVolumeLevel = volume;
        System.out.println("Volume adjusted to: " + this.currentVolumeLevel);
    }

    public void turnOn() {
        this.power = true;
        System.out.println("Television turned on.");
    }

    public void turnOff() {
        this.power = false;
        System.out.println("Television turned off.");
    }

    public void displayStatus() {
        System.out.println("Current Channel: " + currentChannel);
        System.out.println("Current Volume: " + currentVolumeLevel);
        System.out.println("Power: " + (power ? "On" : "Off"));
    }
}

public class TestTelevision {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.turnOn();
        tv1.changeChannels(10);
        tv1.adjustVolume(20);
        tv1.displayStatus();

        Television tv2 = new Television();
        tv2.turnOn();
        tv2.changeChannels(5);
        tv2.adjustVolume(15);
        tv2.displayStatus();
    }
}