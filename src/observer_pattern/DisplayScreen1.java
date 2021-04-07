package observer_pattern;

public class DisplayScreen1 implements Observer, DisplayElement{

    private float temperature;
    private  Subject weatherData;

    public DisplayScreen1(Subject weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("Temperature is: "+temperature);

    }

    @Override
    public void update(float temp) {
        this.temperature=temp;
        display();

    }
}
