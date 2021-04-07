import com.company.Printable;

public class CAR implements Printable {
    private int wheel;
    private String VOLUME;

    public CAR(int wheel, String VOLUME) {
        this.wheel = wheel;
        this.VOLUME = VOLUME;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getVOLUME() {
        return VOLUME;
    }

    public void setVOLUME(String VOLUME) {
        this.VOLUME = VOLUME;
    }

    @Override
    public void print() {
        System.out.println("wheel"+ getWheel() + "\n VOLUME"+getVOLUME()
        );

    }
}
