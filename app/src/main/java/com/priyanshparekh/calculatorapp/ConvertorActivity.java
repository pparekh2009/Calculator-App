package com.priyanshparekh.calculatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ConvertorActivity extends AppCompatActivity {

    ConvertLength convertLength = new ConvertLength();
    ConvertWeight convertWeight = new ConvertWeight();
    ConvertVolume convertVolume = new ConvertVolume();
    ConvertDigitalStorage convertDigitalStorage = new ConvertDigitalStorage();
    ConvertArea convertArea = new ConvertArea();
    ConvertTemp convertTemp = new ConvertTemp();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.simple_cal_menu:
                Intent simple_intent = new Intent(this, MainActivity.class);
                startActivity(simple_intent);
                return true;
            case R.id.sci_cal_menu:
                Intent sci_intent = new Intent(this, ScientificActivity.class);
                startActivity(sci_intent);
                return true;
            case R.id.convertor_menu:
                Intent con_intent = new Intent(this, ConvertorActivity.class);
                startActivity(con_intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertor);

        Spinner category_dropdown = findViewById(R.id.category_dropdown);
        Spinner from_unit_dropdown = findViewById(R.id.from_unit_dropdown);
        Spinner to_unit_dropdown = findViewById(R.id.to_unit_dropdown);
        TextView con_result_txt = findViewById(R.id.con_result_txt);
        Button convert_btn = findViewById(R.id.convert_btn);
        EditText num_input = findViewById(R.id.num_input);

        androidx.appcompat.widget.Toolbar unit_toolbar = findViewById(R.id.unit_toolbar);
        setSupportActionBar(unit_toolbar);

        ColorFilter colorFilter = new ColorFilter();
        unit_toolbar.getOverflowIcon().setColorFilter(colorFilter);

        String[] categories = new String[]{"Length", "Weight", "Volume", "Computer Data", "Area", "Temperature"};

        String[] length = new String[]{"mm", "cm", "dm", "m", "km", "inch", "foot", "yard", "mile"};
        String[] weight = new String[]{"mg", "gm", "kg", "tonne", "pound", "ounce"};
        String[] volume = new String[]{"ml", "litre", "gallon", "m^3", "inch^3", "foot^3", "pint", "tablespoon", "teaspoon"};
        String[] computer_data = new String[]{"bytes", "kb", "mb", "gb", "tb", "pb"};
        String[] area = new String[]{"m^2", "km^2", "mile^2", "foot^2", "inch^2", "yard^2", "acre", "hector"};
        String[] temperature = new String[]{"Celsius", "Fahrenheit", "Kelvin"};

        setDropdownValues(category_dropdown, categories);

        category_dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//                Drawable drawable = getDrawable(R.drawable.btn_style);
//
//                ((TextView) parent.getChildAt(0)).setTextColor(Color.BLUE);
//                ((TextView) parent.getChildAt(0)).setBackground(drawable);
//                ((TextView) parent.getChildAt(0)).setTextSize(34);

                int a = category_dropdown.getSelectedItemPosition();
//                con_result_txt.setText(categories[a]);
                switch (a) {
                    case 0:
                       setDropdownValues(from_unit_dropdown, length);
                       setDropdownValues(to_unit_dropdown, length);
                       break;
                    case 1:
                        setDropdownValues(from_unit_dropdown, weight);
                        setDropdownValues(to_unit_dropdown, weight);
                        break;
                    case 2:
                        setDropdownValues(from_unit_dropdown, volume);
                        setDropdownValues(to_unit_dropdown, volume);
                        break;
                    case 3:
                        setDropdownValues(from_unit_dropdown, computer_data);
                        setDropdownValues(to_unit_dropdown, computer_data);
                        break;
                    case 4:
                        setDropdownValues(from_unit_dropdown, area);
                        setDropdownValues(to_unit_dropdown, area);
                        break;
                    case 5:
                        setDropdownValues(from_unit_dropdown, temperature);
                        setDropdownValues(to_unit_dropdown, temperature);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num = Float.parseFloat(num_input.getText().toString());

//                int from_unit = from_unit_dropdown.getSelectedItemPosition();
//                int to_unit = to_unit_dropdown.getSelectedItemPosition();

                switch (category_dropdown.getSelectedItemPosition()) {
                    case 0: {
                        int from_unit = from_unit_dropdown.getSelectedItemPosition();
                        int to_unit = to_unit_dropdown.getSelectedItemPosition();

                        float result = convertLength(num, length[from_unit], length[to_unit]);
                        con_result_txt.setText(String.valueOf(result));
//                    con_result_txt.setText(String.valueOf(num) + " " + String.valueOf(from_unit) + " " + String.valueOf(to_unit));
                        break;
                    }
                    case 1: {
                        int from_unit = from_unit_dropdown.getSelectedItemPosition();
                        int to_unit = to_unit_dropdown.getSelectedItemPosition();

                        float result = convertWeight(num, weight[from_unit], weight[to_unit]);
                        con_result_txt.setText(String.valueOf(result));
                        break;
                    }
                    case 2: {
                        int from_unit = from_unit_dropdown.getSelectedItemPosition();
                        int to_unit = to_unit_dropdown.getSelectedItemPosition();

                        float result = convertVolume.convertVolume(num, volume[from_unit], volume[to_unit]);
                        con_result_txt.setText(String.valueOf(result));
                        break;
                    }
                    case 3: {
                        int from_unit = from_unit_dropdown.getSelectedItemPosition();
                        int to_unit = to_unit_dropdown.getSelectedItemPosition();

                        float result = convertDigitalStorage.convertDigitalStorage(num, computer_data[from_unit], computer_data[to_unit]);
                        con_result_txt.setText(String.valueOf(result));
                        break;
                    }
                    case 4: {
                        int from_unit = from_unit_dropdown.getSelectedItemPosition();
                        int to_unit = to_unit_dropdown.getSelectedItemPosition();

                        float result = convertArea.convertArea(num, area[from_unit], area
                                [to_unit]);
                        con_result_txt.setText(String.valueOf(result));
                        break;
                    }
                    case 5:
                        int from_unit = from_unit_dropdown.getSelectedItemPosition();
                        int to_unit = to_unit_dropdown.getSelectedItemPosition();

                        float result = convertTemp.convertTemp(num, temperature[from_unit], temperature[to_unit]);
                        con_result_txt.setText(String.valueOf(result));
                        break;
                    default:
                        Toast.makeText(ConvertorActivity.this, "Please enter some value!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public float convertLength(float input, String from, String to) {
        float ans = 0;
        switch(from) {
            case "mm":
//                switch (to) {
//                    case "mm":
//                        ans = input;
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
                ans = convertLength.from_mm_to_other(input, to);
                break;
            case "cm":
//                switch (to) {
//                    case "mm":
//                        ans = input * 10;
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
//        }
                ans = convertLength.from_cm_to_other(input, to);
                break;
            case "dm":
//                switch (to) {
//                    case "mm":
//                        ans = input * 100;
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
                ans = convertLength.from_dm_to_other(input, to);
                break;
            case "m":
//                switch (to) {
//                    case "mm":
//                        ans = input * 1000;
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
                ans = convertLength.from_m_to_other(input, to);
                break;
            case "km":
//                switch (to) {
//                    case "mm":
//                        ans = input * 1000000;
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
                ans = convertLength.from_km_to_other(input, to);
                break;
            case "inch":
//                switch (to) {
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
                ans = convertLength.from_inch_to_other(input, to);
                break;
            case "foot":
//                switch (to) {
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
                ans = convertLength.from_foot_to_other(input, to);
                break;
            case "yard":
//                switch (to) {
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
                ans = convertLength.from_yard_to_other(input, to);
                break;
            case "mile":
//                switch (to) {
//                    case "mm":
//                        ans = input * 1609000;
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
                ans = convertLength.from_mile_to_other(input, to);
                break;
        }
        return ans;
    }

    public float convertWeight(float input, String from, String to) {
        float ans = 0;
        switch (from) {
            case "mg":
                ans = convertWeight.from_mg_to_other(input, to);
                break;
            case "gm":
                ans = convertWeight.from_gm_to_other(input, to);
                break;
            case "kg":
                ans = convertWeight.from_kg_to_other(input, to);
                break;
            case "tonne":
                ans = convertWeight.from_tonne_to_other(input, to);
                break;
            case "pound":
                ans = convertWeight.from_pound_to_other(input, to);
                break;
            case "ounce":
                ans = convertWeight.from_ounce_to_other(input, to);
                break;
        }
        return ans;
    }

    public void setDropdownValues(Spinner spinner, String[] list) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, list);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item, list);
//        adapter.setDropDownViewResource(R.layout.spinner_item);
        spinner.setAdapter(adapter);
    }
}