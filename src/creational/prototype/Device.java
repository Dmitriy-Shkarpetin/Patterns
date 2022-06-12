package creational.prototype;

/*
 *  it's abstract base class Device.
 *  it determines method CloneIt, witch is  which is
 * the basis of the Prototype pattern
 */
abstract class Device {
    private String name;

    abstract Device CloneIt();

    public Device() {
        SetName("Unknown device");
    }

    public Device(String name) {
        SetName(name);
    }

    public String GetName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

}
