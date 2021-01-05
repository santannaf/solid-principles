package main.com.example.solid.OpenClosed.solution;

public class FreightDifferentiated implements ServiceFreight {
    @Override
    public double freightTo(String city) {
        if ("RJ".equalsIgnoreCase(city)) {
            return 2;
        }
        return 30;
    }
}