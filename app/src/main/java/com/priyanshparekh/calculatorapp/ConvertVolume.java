package com.priyanshparekh.calculatorapp;

public class ConvertVolume {

    float ans = 0;

   public float convertVolume(float input, String unit1, String unit2) {
        switch (unit1) {
            case "ml":
                ans = from_ml_to_other(input, unit2);
                break;
            case "litre":
                ans = from_litre_to_other(input, unit2);
                break;
            case "gallon":
                ans = from_gallon_to_other(input, unit2);
                break;
            case "m^3":
                ans = from_m3_to_other(input, unit2);
                break;
            case "inch^3":
                ans = from_inch3_to_other(input, unit2);
                break;
            case "foot^3":
                ans = from_foot3_to_other(input, unit2);
                break;
            case "pint":
                ans = from_pint_to_other(input, unit2);
                break;
            case "tablespoon":
                ans = from_tbsp_to_other(input, unit2);
                break;
            case "teaspoon":
                ans = from_tsp_to_other(input, unit2);
                break;
        }
        return ans;
   }

   public float from_ml_to_other(float input, String unit2) {
       switch (unit2) {
           case "ml":
               ans = input;
               break;
           case "litre":
               ans = input / 1000;
               break;
           case "gallon":
               ans = input / 3785;
               break;
           case "m^3":
               ans = input / 1000000;
               break;
           case "inch^3":
               ans = (float) (input / 16.387);
               break;
           case "foot^3":
               ans = input / 28317;
               break;
           case "pint":
               ans = input / 473;
               break;
           case "tablespoon":
               ans = (float) (input / 14.787);
               break;
           case "teaspoon":
               ans = (float) (input / 4.929);
       }
       return ans;
   }

   public float from_litre_to_other(float input, String unit2) {
       switch (unit2) {
           case "ml":
               ans = input * 1000;
               break;
           case "litre":
               ans = input;
               break;
           case "gallon":
               ans = (float) (input / 3.785);
               break;
           case "m^3":
               ans = input / 1000;
               break;
           case "inch^3":
               ans = (float) (input * 61.024);
               break;
           case "foot^3":
               ans = (float) (input / 28.317);
               break;
           case "pint":
               ans = (float) (input * 2.11338);
               break;
           case "tablespoon":
               ans = (float) (input * 67.628);
               break;
           case "teaspoon":
               ans = (float) (input * 202.884);
               break;
       }
       return ans;
   }

   public float from_gallon_to_other(float input, String unit2) {
       switch (unit2) {
           case "ml":
               ans = input * 3785;
               break;
           case "litre":
               ans = (float) (input * 3.78541);
               break;
           case "gallon":
               ans = input;
               break;
           case "m^3":
               ans = input / 264;
               break;
           case "inch^3":
               ans = input * 231;
               break;
           case "foot^3":
               ans = (float) (input / 7.481);
               break;
           case "pint":
               ans = input * 8;
               break;
           case "tablespoon":
               ans = input * 256;
               break;
           case "teaspoon":
               ans = input * 768;
               break;
       }
       return ans;
   }

   public float from_m3_to_other(float input, String unit2) {
       switch (unit2) {
           case "ml":
               ans = input * 1000000;
               break;
           case "litre":
               ans = input * 1000;
               break;
           case "gallon":
               ans = (float) (input * 264.172);
               break;
           case "m^3":
               ans = input;
               break;
           case "inch^3":
               ans = (float) (input * 61023.7);
               break;
           case "foot^3":
               ans = (float) (input * 35.3147);
               break;
           case "pint":
               ans = (float) (input * 2113.38);
               break;
           case "tablespoon":
               ans = input * 67628;
               break;
           case "teaspoon":
               ans = input * 202884;
               break;
       }
       return ans;
   }

   public float from_inch3_to_other(float input, String unit2) {
       switch (unit2) {
           case "ml":
               ans = (float) (input * 16.3871);
               break;
           case "litre":
               ans = (float) (input / 61.024);
               break;
           case "gallon":
               ans = input / 231;
               break;
           case "m^3":
               ans = input / 61024;
               break;
           case "inch^3":
               ans = input;
               break;
           case "foot^3":
               ans = input / 1728;
               break;
           case "pint":
               ans = (float) (input / 28.875);
               break;
           case "tablespoon":
               ans = (float) (input * 1.10823);
               break;
           case "teaspoon":
               ans = (float) (input * 3.32468);
               break;
       }
       return ans;
   }

   public float from_foot3_to_other(float input, String unit2) {
       switch (unit2) {
           case "ml":
               ans = (float) (input * 28316.8);
               break;
           case "litre":
               ans = (float) (input * 28.3168);
               break;
           case "gallon":
               ans = (float) (input * 7.48052);
               break;
           case "m^3":
               ans = (float) (input / 35.315);
               break;
           case "inch^3":
               ans = input * 1728;
               break;
           case "foot^3":
               ans = input;
               break;
           case "pint":
               ans = (float) (input * 59.8442);
               break;
           case "tablespoon":
               ans = (float) (input * 1915.01);
               break;
           case "teaspoon":
               ans = (float) (input * 5745.04);
               break;
       }
       return ans;
   }

   public float from_pint_to_other(float input, String unit2) {
       switch (unit2) {
           case "ml":
               ans = (float) (input * 473.176);
               break;
           case "litre":
               ans = (float) (input / 2.113);
               break;
           case "gallon":
               ans = (float) (input / 15.773);
               break;
           case "m^3":
               ans = input / 4167;
               break;
           case "inch^3":
               ans = (float) (input * 14.6457);
               break;
           case "foot^3":
               ans = input / 118;
               break;
           case "pint":
               ans = input;
               break;
           case "tablespoon":
               ans = (float) (input * 16.2307);
               break;
           case "teaspoon":
               ans = (float) (input * 48.6922);
               break;
       }
       return ans;
   }

   public float from_tbsp_to_other(float input, String unit2) {
       switch (unit2) {
           case "ml":
               ans = (float) (input * 14.7868);
               break;
           case "litre":
               ans = (float) (input / 67.628);
               break;
           case "gallon":
               ans = input / 256;
               break;
           case "m^3":
               ans = input / 67628;
               break;
           case "inch^3":
               ans = (float) (input / 1.108);
               break;
           case "foot^3":
               ans = input / 1918;
               break;
           case "pint":
               ans = input / 32;
               break;
           case "tablespoon":
               ans = input;
               break;
           case "teaspoon":
               ans = input * 3;
               break;
       }
       return ans;
   }

   public float from_tsp_to_other(float input, String unit2) {
       switch (unit2) {
           case "ml":
               ans = (float) (input * 4.92892);
               break;
           case "litre":
               ans = input / 203;
               break;
           case "gallon":
               ans = input / 768;
               break;
           case "m^3":
               ans = input / 202884;
               break;
           case "inch^3":
               ans = (float) (input / 3.325);
               break;
           case "foot^3":
               ans = input / 5745;
               break;
           case "pint":
               ans = input / 96;
               break;
           case "tablespoon":
               ans = input / 3;
               break;
           case "teaspoon":
               ans = input;
               break;
       }
       return ans;
   }
}
// "ml", "litre", "gallon", "m^3", "inch^3", "foot^3", "pint", "tablespoon", "teaspoon"