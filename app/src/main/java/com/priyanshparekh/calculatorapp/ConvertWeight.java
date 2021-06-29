package com.priyanshparekh.calculatorapp;

public class ConvertWeight {

    float ans = 0;

    public float from_mg_to_other(float input, String unit2) {
        switch (unit2) {
            case "mg":
                ans = input;
                break;
            case "gm":
                ans = input / 1000;
                break;
            case "kg":
                ans = input / 1000000;
                break;
            case "tonne":
                ans = input / 1000000000;
                break;
            case "pound":
                ans = input / 453592;
                break;
            case "ounce":
                ans = input / 28350;
                break;
        }
        return ans;
    }

    public float from_gm_to_other(float input, String unit2) {
        switch (unit2) {
            case "mg":
                ans = input * 1000;
                break;
            case "gm":
                ans = input;
                break;
            case "kg":
                ans = input / 1000;
                break;
            case "tonne":
                ans = input / 1000000;
                break;
            case "pound":
                ans = input / 454;
                break;
            case "ounce":
                ans = (float) (input / 28.35);
                break;
        }
        return ans;
    }

    public float from_kg_to_other(float input, String unit2) {
        switch (unit2) {
            case "mg":
                ans = input * 1000000;
                break;
            case "gm":
                ans = input * 1000;
                break;
            case "kg":
                ans = input;
                break;
            case "tonne":
                ans = input / 1000;
                break;
            case "pound":
                ans = (float) (input * 2.20462);
                break;
            case "ounce":
                ans = (float) (input * 35.274);
                break;
        }
        return ans;
    }

    public float from_tonne_to_other(float input, String unit2) {
        switch (unit2) {
            case "mg":
                ans = input * 1000000000;
                break;
            case "gm":
                ans = input * 1000000;
                break;
            case "kg":
                ans = input * 1000;
                break;
            case "tonne":
                ans = input;
                break;
            case "pound":
                ans = (float) (input * 2204.62);
                break;
            case "ounce":
                ans = input * 35274;
                break;
        }
        return ans;
    }

    public float from_pound_to_other(float input, String unit2) {
        switch (unit2) {
            case "mg":
                ans = input * 453592;
                break;
            case "gm":
                ans = (float) (input * 453.592);
                break;
            case "kg":
                ans = (float) (input / 2.205);
                break;
            case "tonne":
                ans = input / 2205;
                break;
            case "pound":
                ans = input;
                break;
            case "ounce":
                ans = input * 16;
                break;
        }
        return ans;
    }

    public float from_ounce_to_other(float input, String unit2) {
        switch (unit2) {
            case "mg":
                ans = (float) (input * 28349.5);
                break;
            case "gm":
                ans = (float) (input * 28.3495);
                break;
            case "kg":
                ans = (float) (input / 35.274);
                break;
            case "tonne":
                ans = input / 35274;
                break;
            case "pound":
                ans = input / 16;
                break;
            case "ounce":
                ans = input;
                break;
        }
        return ans;
    }
}//"mg", "gm", "kg", "tonne", "pound", "ounce"