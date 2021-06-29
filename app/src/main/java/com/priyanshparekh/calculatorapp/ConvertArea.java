package com.priyanshparekh.calculatorapp;

public class ConvertArea {

    float ans = 0;

    public float convertArea(float input, String unit1, String unit2) {
        switch (unit1) {
            case "m^2":
                ans = from_m2_to_other(input, unit2);
                break;
            case "km^2":
                ans = from_km2_to_other(input, unit2);
                break;
            case "mile^2":
                ans = from_mile2_to_other(input, unit2);
                break;
            case "foot^2":
                ans = from_foot2_to_other(input, unit2);
                break;
            case "inch^2":
                ans = from_inch2_to_other(input, unit2);
                break;
            case "yard^2":
                ans = from_yard2_to_other(input, unit2);
                break;
            case "acre":
                ans = from_acre_to_other(input, unit2);
                break;
            case "hector":
                ans = from_hector_to_other(input, unit2);
                break;
        }
        return ans;
    }

    public float from_m2_to_other(float input, String unit2) {
        switch (unit2) {
            case "m^2":
                ans = input;
                break;
            case "km^2":
                ans = input / 1000000;
                break;
            case "mile^2":
                ans = input / 2590000;
                break;
            case "foot^2":
                ans = (float) (input * 10.7639);
                break;
            case "inch^2":
                ans = input * 1550;
                break;
            case "yard^2":
                ans = (float) (input * 1.19599);
                break;
            case "acre":
                ans = input / 4047;
                break;
            case "hector":
                ans = input / 10000;
                break;
        }
        return ans;
    }

    public float from_km2_to_other(float input, String unit2) {
        switch (unit2) {
            case "m^2":
                ans = input * 1000000;
                break;
            case "km^2":
                ans = input;
                break;
            case "mile^2":
                ans = (float) (input / 2.59);
                break;
            case "foot^2":
                ans = input * 10760000;
                break;
            case "inch^2":
                ans = input * 1550000000;
                break;
            case "yard^2":
                ans = input * 1196000;
                break;
            case "acre":
                ans = input * 247;
                break;
            case "hector":
                ans = input * 100;
                break;
        }
        return ans;
    }

    public float from_mile2_to_other(float input, String unit2) {
        switch (unit2) {
            case "m^2":
                ans = input * 2590000;
                break;
            case "km^2":
                ans = (float) (input * 2.59);
                break;
            case "mile^2":
                ans = input;
                break;
            case "foot^2":
                ans = input * 27880000;
                break;
            case "inch^2":
                ans = input * 401900000 * 10;
                break;
            case "yard^2":
                ans = input * 3096000;
                break;
            case "acre":
                ans = input * 640;
                break;
            case "hector":
                ans = (float) (input * 258.999);
                break;
        }
        return ans;
    }

    public float from_foot2_to_other(float input, String unit2) {
        switch (unit2) {
            case "m^2":
                ans = (float) (input / 10.764);
                break;
            case "km^2":
                ans = input / 10760000;
                break;
            case "mile^2":
                ans = input / 27880000;
                break;
            case "foot^2":
                ans = input * 9;
                break;
            case "inch^2":
                ans = input * 1296;
                break;
            case "yard^2":
                ans = input / 9;
                break;
            case "acre":
                ans = input / 4840;
                break;
            case "hector":
                ans = input / 11960;
                break;
        }
        return ans;
    }

    public float from_inch2_to_other(float input, String unit2) {
        switch (unit2) {
            case "m^2":
                ans = input / 1550;
                break;
            case "km^2":
                ans = input / 1550000000;
                break;
            case "mile^2":
                ans = input / 401400000 * 10;
                break;
            case "foot^2":
                ans = input / 144;
                break;
            case "inch^2":
                ans = input;
                break;
            case "yard^2":
                ans = input / 1296;
                break;
            case "acre":
                ans = input / 6273000;
                break;
            case "hector":
                ans = input / 15500000;
                break;
        }
        return ans;
    }

    public float from_yard2_to_other(float input, String unit2) {
        switch (unit2) {
            case "m^2":
                ans = (float) (input / 1.196);
                break;
            case "km^2":
                ans = input / 1196000;
                break;
            case "mile^2":
                ans = input / 3098000;
                break;
            case "foot^2":
                ans = input * 9;
                break;
            case "inch^2":
                ans = input * 1296;
                break;
            case "yard^2":
                ans = input;
                break;
            case "acre":
                ans = input / 4840;
                break;
            case "hector":
                ans = input / 11960;
                break;
        }
        return ans;
    }

    public float from_acre_to_other(float input, String unit2) {
        switch (unit2) {
            case "m^2":
                ans = (float) (input * 4046.86);
                break;
            case "km^2":
                ans = input / 247;
                break;
            case "mile^2":
                ans = input / 640;
                break;
            case "foot^2":
                ans = input * 43560;
                break;
            case "inch^2":
                ans = input * 6273000;
                break;
            case "yard^2":
                ans = input * 4840;
                break;
            case "acre":
                ans = input;
                break;
            case "hector":
                ans = (float) (input / 2.471);
                break;
        }
        return ans;
    }

    public float from_hector_to_other(float input, String unit2) {
        switch (unit2) {
            case "m^2":
                ans = input * 10000;
                break;
            case "km^2":
                ans = input / 100;
                break;
            case "mile^2":
                ans = input / 259;
                break;
            case "foot^2":
                ans = input * 107639;
                break;
            case "inch^2":
                ans = input * 15500000;
                break;
            case "yard^2":
                ans = (float) (input * 11959.9);
                break;
            case "acre":
                ans = (float) (input * 2.47105);
                break;
            case "hector":
                ans = input;
                break;
    }
        return ans;}
}
// "cm^2", "m^2", "km^2", "foot^2", "inch^2", "yard^2", "acre", "hector"