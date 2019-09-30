public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = true;
        this.altitude = 0;
	
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }


    @Override
    public void takeOff() {
        if (this.flying) {
            System.out.printf("%s can takeoff %n", this.getName());
	}
    }

    @Override
    public int ascend(int altitude) {
        if (this.flying) {
	    this.altitude = altitude;
            System.out.printf("%s ascend over: %d%n", this.getName(), this.altitude);
	}
	return this.altitude;
    }

    @Override
    public int descend(int altitude) {
	this.altitude = altitude;
        if (this.flying && this.altitude != 0) {
            System.out.printf("%s can go down to dive to hunt from %d meters %n", this.getName(), this.altitude);
	}
	else {
            System.out.printf("%s lives on trees%n", this.getName());	
	}
	return this.altitude;
    }

    @Override
    public void land() {
	this.altitude = altitude;
        if (!this.flying) {
            System.out.printf("%s can't fly, it's living in plains%n", this.getName());
	}
	else {
            System.out.printf("%s walks trough plains all along the day%n", this.getName());	
	}
    }


}
