package com.priyanshparekh.calculatorapp;

public class ConvertTemp {

    float ans = 0;

    public float convertTemp(float input, String unit1, String unit2) {
        switch (unit1) {
            case "Celsius":
                ans = from_c_to_other(input, unit2);
                break;
            case "Fahrenheit":
                ans = from_f_to_other(input, unit2);
                break;
            case "Kelvin":
                ans = from_k_to_other(input, unit2);
                break;
        }
        return ans;
    }

    public float from_c_to_other(float input, String unit2) {
        switch (unit2) {
            case "Celsius":
                ans = input;
                break;
            case "Fahrenheit":
                ans = (input * 9/5) + 32;
                break;
            case "Kelvin":
                ans = (float) (input + 273.15);
                break;
        }
        return ans;
    }

    public float from_f_to_other(float input, String unit2) {
        switch (unit2) {
            case "Celsius":
                ans = (input - 32)  * 5/9;
                break;
            case "Fahrenheit":
                ans = input;
                break;
            case "Kelvin":
                ans = (float) ((input - 32)  * 5/9 + 273.15);
                break;
        }
        return ans;
    }

    public float from_k_to_other(float input, String unit2) {
        switch (unit2) {
            case "Celsius":
                ans = (float) (input - 273.15);
                break;
            case "Fahrenheit":
                ans = (float) ((input - 273.15) * 9/5 + 32);
                break;
            case "Kelvin":
                ans = input;
                break;
        }
        return ans;
    }
}
