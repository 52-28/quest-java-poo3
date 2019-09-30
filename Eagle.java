public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
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
        if (!this.flying) {
            System.out.printf("%s takeoff %n", this.getName());
	    this.flying = true;
	}
    }

    @Override
    public int ascend(int altitude) {
        if (this.flying) {
	    this.altitude = this.altitude + altitude;
            System.out.printf("%s ascend over: %d%n", this.getName(), this.altitude);
	}
	return this.altitude;
    }

    @Override
    public int descend(int altitude) {

        if (this.flying) {
	    this.altitude = this.altitude - altitude;
            System.out.printf("%s descends to %d meters %n", this.getName(), this.altitude);
	}
	else {
            System.out.printf("%s lives on trees%n", this.getName());	
	}
	return this.altitude;
    }

    @Override
    public void land() {

        if (this.altitude >5) {
            System.out.printf("%s can't land, it's to high %n", this.getName());
	}
	else {
            System.out.printf("%s land %n", this.getName());
	    this.flying = false;	
	}
    }


}
