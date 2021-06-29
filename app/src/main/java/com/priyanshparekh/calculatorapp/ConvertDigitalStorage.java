package com.priyanshparekh.calculatorapp;

public class ConvertDigitalStorage {

    float ans = 0;

   public float convertDigitalStorage(float input, String unit1, String unit2) {
       switch (unit1) {
           case "bytes":
               ans = from_bytes_to_other(input, unit2);
               break;
           case "kb":
               ans = from_kb_to_other(input, unit2);
               break;
           case "mb":
               ans = from_mb_to_other(input, unit2);
               break;
           case "gb":
               ans = from_gb_to_other(input, unit2);
               break;
           case "tb":
               ans = from_tb_to_other(input, unit2);
               break;
           case "pb":
               from_pb_to_other(input, unit2);
               break;
       }
       return ans;
   }

   public float from_bytes_to_other(float input, String unit2) {

       switch (unit2) {
           case "bytes":
               ans = input;
               break;
           case "kb":
               ans = input / 1024;
               break;
           case "mb":
               ans = input / 1048576;
               break;
           case "gb":
               ans = input / 1073741824;
               break;
           case "tb":
               ans = input / 1073741824 / 1024;
               break;
           case "pb":
               ans = input / 1073741824 / 1024 / 1024;
               break;
       }
       return ans;
   }

   public float from_kb_to_other(float input, String unit2) {
       switch (unit2) {
           case "bytes":
               ans = input * 1024;
               break;
           case "kb":
               ans = input;
               break;
           case "mb":
               ans = input / 1024;
               break;
           case "gb":
               ans = input / 1048576;
               break;
           case "tb":
               ans = input / 1073741824;
               break;
           case "pb":
               ans = input / 1073741824 / 1024;
               break;
       }
       return ans;
   }

   public float from_mb_to_other(float input, String unit2) {
       switch (unit2) {
           case "bytes":
               ans = input * 1024 * 1024;
               break;
           case "kb":
               ans = input * 1024;
               break;
           case "mb":
               ans = input;
               break;
           case "gb":
               ans = input / 1024;
               break;
           case "tb":
               ans = input / 1024 / 1024;
               break;
           case "pb":
               ans = input / 1024 / 1024 / 1024;
               break;
       }
       return ans;
   }

   public float from_gb_to_other(float input, String unit2) {
       switch (unit2) {
           case "bytes":
               ans = input * 1024 * 1024 * 1024;
               break;
           case "kb":
               ans = input * 1024 * 1024;
               break;
           case "mb":
               ans = input * 1024;
               break;
           case "gb":
               ans = input;
               break;
           case "tb":
               ans = input / 1024;
               break;
           case "pb":
               ans = input / 1024 / 1024;
               break;
       }
       return ans;
   }

   public float from_tb_to_other(float input, String unit2) {
       switch (unit2) {
           case "bytes":
               ans = input * 1024 * 1024 * 1024 * 1024;
               break;
           case "kb":
               ans = input * 1024 * 1024 * 1024;
               break;
           case "mb":
               ans = input * 1024 * 1024;
               break;
           case "gb":
               ans = input * 1024;
               break;
           case "tb":
               ans = input;
               break;
           case "pb":
               ans = input / 1024;
               break;
       }
       return ans;
   }

   public float from_pb_to_other(float input, String unit2) {
       switch (unit2) {
           case "bytes":
               ans = input * 1024 * 1024 * 1024 * 1024 * 1024;
               break;
           case "kb":
               ans = input * 1024 * 1024 * 1024 * 1024;
               break;
           case "mb":
               ans = input * 1024 * 1024 * 1024;
               break;
           case "gb":
               ans = input * 1024 * 1024;
               break;
           case "tb":
               ans = input * 1024;
               break;
           case "pb":
               ans = input;
               break;
       }
       return ans;
   }
}
// "bytes", "kb", "mb", "gb", "tb", "pb"