package main.com.example.solid.OpenClosed.utils;

import main.com.example.solid.OpenClosed.solution.ServiceFreight;

public class FreightDefault implements ServiceFreight {
    public double calculateTo(String city) {
        if ("SÃO PAULO".equalsIgnoreCase(city)) {
            return 15;
        }
        return 30;
    }

    @Override
    public double freightTo(String city) {
        if ("SP".equalsIgnoreCase(city)) {
            return 15;
        }
        return 30;
    }
}