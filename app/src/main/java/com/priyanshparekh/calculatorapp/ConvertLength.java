package com.priyanshparekh.calculatorapp;

public class ConvertLength {
    public void convertLength(float input, String unit1, String unit2) {
//        float ans = 0;
//        switch (unit1) {
//            case "mm":
//                switch (unit2) {
//                    case "mm":
//                        ans =  input;
//                        break;
//                    case "cm":
//                        ans = input / 10;
//                        break;
//                    case "dm":
//                        ans = input / 100;
//                        break;
//                    case "m":
//                        ans = input / 1000;
//                        break;
//                    case "km":
//                        ans = input / 1000000;
//                        break;
//                    case "inch":
//                        ans = (float) (input / 25.4);
//                        break;
//                    case "foot":
//                        ans = input / 305;
//                        break;
//                    case "yard":
//                        ans = input / 914;
//                        break;
//                    case "mile":
//                        ans = input / 1609000;
//                        break;
//                }
//            case "cm":
//                switch (unit2) {
//                    case "mm":
//                        ans =  input * 10;
//                        break;
//                    case "cm":
//                        ans = input;
//                        break;
//                    case "dm":
//                        ans = input / 10;
//                        break;
//                    case "m":
//                        ans = input / 100;
//                        break;
//                    case "km":
//                        ans = input / 100000;
//                        break;
//                    case "inch":
//                        ans = (float) (input / 2.54);
//                        break;
//                    case "foot":
//                        ans = (float) (input / 30.48);
//                        break;
//                    case "yard":
//                        ans = (float) (input / 91.44);
//                        break;
//                    case "mile":
//                        ans = input / 160934;
//                        break;
//                }
//            case "dm":
//                switch (unit2) {
//                    case "mm":
//                        ans =  input * 100;
//                        break;
//                    case "cm":
//                        ans = input * 10;
//                        break;
//                    case "dm":
//                        ans = input;
//                        break;
//                    case "m":
//                        ans = input / 10;
//                        break;
//                    case "km":
//                        ans = input / 10000;
//                        break;
//                    case "inch":
//                        ans = (float) (input * 3.937);
//                        break;
//                    case "foot":
//                        ans = (float) (input / 3.048);
//                        break;
//                    case "yard":
//                        ans = (float) (input / 9.144);
//                        break;
//                    case "mile":
//                        ans = input / 16093;
//                        break;
//                }
//            case "m":
//                switch (unit2) {
//                    case "mm":
//                        ans =  input * 1000;
//                        break;
//                    case "cm":
//                        ans = input * 100;
//                        break;
//                    case "dm":
//                        ans = input * 10;
//                        break;
//                    case "m":
//                        ans = input;
//                        break;
//                    case "km":
//                        ans = input / 1000;
//                        break;
//                    case "inch":
//                        ans = (float) (input * 39.37);
//                        break;
//                    case "foot":
//                        ans = (float) (input * 3.281);
//                        break;
//                    case "yard":
//                        ans = (float) (input * 1.094);
//                        break;
//                    case "mile":
//                        ans = input / 1609;
//                        break;
//                }
//            case "km":
//                switch (unit2) {
//                    case "mm":
//                        ans =  input * 1000000;
//                        break;
//                    case "cm":
//                        ans = input * 100000;
//                        break;
//                    case "dm":
//                        ans = input * 10000;
//                        break;
//                    case "m":
//                        ans = input * 1000;
//                        break;
//                    case "km":
//                        ans = input;
//                        break;
//                    case "inch":
//                        ans = (float) (input * 39370.1);
//                        break;
//                    case "foot":
//                        ans = (float) (input * 3280.84);
//                        break;
//                    case "yard":
//                        ans = (float) (input * 1093.61);
//                        break;
//                    case "mile":
//                        ans = (float) (input / 1.609);
//                        break;
//                }
//            case "inch":
//                switch (unit2) {
//                    case "mm":
//                        ans = (float) (input * 25.4);
//                        break;
//                    case "cm":
//                        ans = (float) (input * 2.54);
//                        break;
//                    case "dm":
//                        ans = (float) (input / 3.937);
//                        break;
//                    case "m":
//                        ans = (float) (input / 39.37);
//                        break;
//                    case "km":
//                        ans = input / 39370;
//                        break;
//                    case "inch":
//                        ans = input;
//                        break;
//                    case "foot":
//                        ans = input / 12;
//                        break;
//                    case "yard":
//                        ans = input / 36;
//                        break;
//                    case "mile":
//                        ans = input / 63360;
//                        break;
//                }
//            case "foot":
//                switch (unit2) {
//                    case "mm":
//                        ans = (float) (input * 304.8);
//                        break;
//                    case "cm":
//                        ans = (float) (input * 30.48);
//                        break;
//                    case "dm":
//                        ans = (float) (input * 3.048);
//                        break;
//                    case "m":
//                        ans = (float) (input / 3.281);
//                        break;
//                    case "km":
//                        ans = input / 3281;
//                        break;
//                    case "inch":
//                        ans = input * 12;
//                        break;
//                    case "foot":
//                        ans = input;
//                        break;
//                    case "yard":
//                        ans = input / 3;
//                        break;
//                    case "mile":
//                        ans = input / 5280;
//                        break;
//                }
//            case "yard":
//                switch (unit2) {
//                    case "mm":
//                        ans = (float) (input * 914.4);
//                        break;
//                    case "cm":
//                        ans = (float) (input * 91.44);
//                        break;
//                    case "dm":
//                        ans = (float) (input * 9.144);
//                        break;
//                    case "m":
//                        ans = (float) (input / 1.094);
//                        break;
//                    case "km":
//                        ans = input / 1094;
//                        break;
//                    case "inch":
//                        ans = input * 36;
//                        break;
//                    case "foot":
//                        ans = input * 3;
//                        break;
//                    case "yard":
//                        ans = input;
//                        break;
//                    case "mile":
//                        ans = input / 1760;
//                        break;
//                }
//            case "mile":
//                switch (unit2) {
//                    case "mm":
//                        ans =  input * 1609000;
//                        break;
//                    case "cm":
//                        ans = input * 160934;
//                        break;
//                    case "dm":
//                        ans = (float) (input * 16093.4);
//                        break;
//                    case "m":
//                        ans = (float) (input * 1609.34);
//                        break;
//                    case "km":
//                        ans = (float) (input * 1.60934);
//                        break;
//                    case "inch":
//                        ans = input * 63360;
//                        break;
//                    case "foot":
//                        ans = input * 5280;
//                        break;
//                    case "yard":
//                        ans = input * 1760;
//                        break;
//                    case "mile":
//                        ans = input;
//                        break;
//                }
//                //"mm", "cm", "dm", "m", "km", "lightyear", "inch", "foot", "yard", "mile", "AU"
//            }
//            return ans;
    }

    public float from_mm_to_other(float input, String unit2) {
        float ans = 0;
        switch (unit2) {
            case "mm":
                ans = input;
                break;
            case "cm":
                ans = input / 10;
                break;
            case "dm":
                ans = input / 100;
                break;
            case "m":
                ans = input / 1000;
                break;
            case "km":
                ans = input / 1000000;
                break;
            case "inch":
                ans = (float) (input / 25.4);
                break;
            case "foot":
                ans = input / 305;
                break;
            case "yard":
                ans = input / 914;
                break;
            case "mile":
                ans = input / 1609000;
                break;
        }
        return ans;
    }

    public float from_cm_to_other(float input, String unit2) {
         float ans = 0;
         switch (unit2) {
             case "mm":
                 ans = input * 10;
                 break;
             case "cm":
                 ans = input;
                 break;
             case "dm":
                 ans = input / 10;
                 break;
             case "m":
                 ans = input / 100;
                 break;
             case "km":
                 ans = input / 100000;
                 break;
             case "inch":
                 ans = (float) (input / 2.54);
                 break;
             case "foot":
                 ans = (float) (input / 30.48);
                 break;
             case "yard":
                 ans = (float) (input / 91.44);
                 break;
             case "mile":
                 ans = input / 160934;
                 break;
         }
         return ans;
    }

    public float from_dm_to_other(float input, String unit2) {
        float ans = 0;
        switch (unit2) {
            case "mm":
                ans = input * 100;
                break;
            case "cm":
                ans = input * 10;
                break;
            case "dm":
                ans = input;
                break;
            case "m":
                ans = input / 10;
                break;
            case "km":
                ans = input / 10000;
                break;
            case "inch":
                ans = (float) (input * 3.937);
                break;
            case "foot":
                ans = (float) (input / 3.048);
                break;
            case "yard":
                ans = (float) (input / 9.144);
                break;
            case "mile":
                ans = input / 16093;
                break;
        }
        return ans;
    }

    public float from_m_to_other(float input, String unit2) {
        float ans = 0;
        switch (unit2) {
            case "mm":
                ans = input * 1000;
                break;
            case "cm":
                ans = input * 100;
                break;
            case "dm":
                ans = input * 10;
                break;
            case "m":
                ans = input;
                break;
            case "km":
                ans = input / 1000;
                break;
            case "inch":
                ans = (float) (input * 39.37);
                break;
            case "foot":
                ans = (float) (input * 3.281);
                break;
            case "yard":
                ans = (float) (input * 1.094);
                break;
            case "mile":
                ans = input / 1609;
                break;
        }
        return ans;
    }

    public float from_km_to_other(float input, String unit2) {
        float ans = 0;
        switch (unit2) {
            case "mm":
                ans = input * 1000000;
                break;
            case "cm":
                ans = input * 100000;
                break;
            case "dm":
                ans = input * 10000;
                break;
            case "m":
                ans = input * 1000;
                break;
            case "km":
                ans = input;
                break;
            case "inch":
                ans = (float) (input * 39370.1);
                break;
            case "foot":
                ans = (float) (input * 3280.84);
                break;
            case "yard":
                ans = (float) (input * 1093.61);
                break;
            case "mile":
                ans = (float) (input / 1.609);
                break;
        }
        return ans;
    }

    public float from_inch_to_other(float input, String unit2) {
        float ans = 0;
        switch (unit2) {
            case "mm":
                ans = (float) (input * 25.4);
                break;
            case "cm":
                ans = (float) (input * 2.54);
                break;
            case "dm":
                ans = (float) (input / 3.937);
                break;
            case "m":
                ans = (float) (input / 39.37);
                break;
            case "km":
                ans = input / 39370;
                break;
            case "inch":
                ans = input;
                break;
            case "foot":
                ans = input / 12;
                break;
            case "yard":
                ans = input / 36;
                break;
            case "mile":
                ans = input / 63360;
                break;
        }
        return ans;
    }

    public float from_foot_to_other(float input, String unit2) {
        float ans = 0;
        switch (unit2) {
            case "mm":
                ans = (float) (input * 304.8);
                break;
            case "cm":
                ans = (float) (input * 30.48);
                break;
            case "dm":
                ans = (float) (input * 3.048);
                break;
            case "m":
                ans = (float) (input / 3.281);
                break;
            case "km":
                ans = input / 3281;
                break;
            case "inch":
                ans = input * 12;
                break;
            case "foot":
                ans = input;
                break;
            case "yard":
                ans = input / 3;
                break;
            case "mile":
                ans = input / 5280;
                break;
        }
        return ans;
    }

    public float from_yard_to_other(float input, String unit2) {
        float ans = 0;
        switch (unit2) {
            case "mm":
                ans = (float) (input * 914.4);
                break;
            case "cm":
                ans = (float) (input * 91.44);
                break;
            case "dm":
                ans = (float) (input * 9.144);
                break;
            case "m":
                ans = (float) (input / 1.094);
                break;
            case "km":
                ans = input / 1094;
                break;
            case "inch":
                ans = input * 36;
                break;
            case "foot":
                ans = input * 3;
                break;
            case "yard":
                ans = input;
                break;
            case "mile":
                ans = input / 1760;
                break;
        }
        return ans;
    }

    public float from_mile_to_other(float input, String unit2) {
        float ans = 0;
        switch (unit2) {
            case "mm":
                ans = input * 1609000;
                break;
            case "cm":
                ans = input * 160934;
                break;
            case "dm":
                ans = (float) (input * 16093.4);
                break;
            case "m":
                ans = (float) (input * 1609.34);
                break;
            case "km":
                ans = (float) (input * 1.60934);
                break;
            case "inch":
                ans = input * 63360;
                break;
            case "foot":
                ans = input * 5280;
                break;
            case "yard":
                ans = input * 1760;
                break;
            case "mile":
                ans = input;
                break;
        }
        return ans;
    }
}
