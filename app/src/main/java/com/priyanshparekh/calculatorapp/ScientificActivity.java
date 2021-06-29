package com.priyanshparekh.calculatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ScientificActivity extends AppCompatActivity {

    Button sin_btn, cos_btn, tan_btn, sinh_btn, cosh_btn, tanh_btn,
            fact_btn, logxy_btn, ln_btn,
            root_btn, sqr_btn, power_btn, pi_btn, e_btn, inv_btn, yrootx_btn,
            one_btn, two_btn, three_btn, four_btn, five_btn, six_btn, seven_btn, eight_btn, nine_btn, zero_btn,
            clr_btn, bs_btn, dot_btn, equal_btn;

    TextView sci_exp_txt, sci_result_txt;

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
                //Toast.makeText(this, "Unit Convertor", Toast.LENGTH_SHORT).show();
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
        setContentView(R.layout.activity_scientific);

        sin_btn = findViewById(R.id.sin_btn);
        cos_btn = findViewById(R.id.cos_btn);
        tan_btn = findViewById(R.id.tan_btn);
        sinh_btn = findViewById(R.id.sinh_btn);
        cosh_btn = findViewById(R.id.cosh_btn);
        tanh_btn = findViewById(R.id.tanh_btn);
        fact_btn = findViewById(R.id.fact_btn);
        logxy_btn = findViewById(R.id.logxy_btn);
        ln_btn = findViewById(R.id.ln_btn);
        root_btn = findViewById(R.id.root_btn);
        sqr_btn = findViewById(R.id.sqr_btn);
        power_btn = findViewById(R.id.power_btn);
        pi_btn = findViewById(R.id.pi_btn);
        e_btn = findViewById(R.id.e_btn);
        inv_btn = findViewById(R.id.inv_btn);
        yrootx_btn = findViewById(R.id.yrootx_btn);

        one_btn = findViewById(R.id.one_btn);
        two_btn = findViewById(R.id.two_btn);
        three_btn = findViewById(R.id.three_btn);
        four_btn = findViewById(R.id.four_btn);
        five_btn = findViewById(R.id.five_btn);
        six_btn = findViewById(R.id.six_btn);
        seven_btn = findViewById(R.id.seven_btn);
        eight_btn = findViewById(R.id.eight_btn);
        nine_btn = findViewById(R.id.nine_btn);
        zero_btn = findViewById(R.id.zero_btn);

        clr_btn = findViewById(R.id.clr_btn);
        bs_btn = findViewById(R.id.bs_btn);
        equal_btn = findViewById(R.id.equal_btn);
        dot_btn = findViewById(R.id.dot_btn);


        sci_exp_txt = findViewById(R.id.sci_exp_txt);
        sci_result_txt = findViewById(R.id.sci_result_txt);

        try {
            sin_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkNewEx();
                    String ex = sci_exp_txt.getText().toString();
                    if(ex == "") {
                        Toast.makeText(ScientificActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        double num = Double.parseDouble(ex);
                        sci_result_txt.setText(String.valueOf(Math.sin(Math.toRadians(num))));
                    }
                }
            });

            cos_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkNewEx();
                    double num = Double.parseDouble(sci_exp_txt.getText().toString());
                    sci_result_txt.setText(String.valueOf(Math.cos(Math.toRadians(num))));
                }
            });

            tan_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkNewEx();
                    double num = Double.parseDouble(sci_exp_txt.getText().toString());
                    sci_result_txt.setText(String.valueOf(Math.tan(Math.toRadians(num))));
                }
            });

            sinh_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkNewEx();
                    double num = Double.parseDouble(sci_exp_txt.getText().toString());
                    sci_result_txt.setText(String.valueOf(Math.sinh(Math.toRadians(num))));
                }
            });

            cosh_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkNewEx();
                    double num = Double.parseDouble(sci_exp_txt.getText().toString());
                    sci_result_txt.setText(String.valueOf(Math.cosh(Math.toRadians(num))));
                }
            });

            tanh_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    checkNewEx();
                    double num = Double.parseDouble(sci_exp_txt.getText().toString());
                    sci_result_txt.setText(String.valueOf(Math.tanh(Math.toRadians(num))));
                }
            });
        }
        catch (Exception e) {
            Toast.makeText(ScientificActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
        }

        fact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                try {
                    long num = Long.parseLong(sci_exp_txt.getText().toString());
                    if(num < 21) {
                        for(long i = num-1; i>0; i--) {
                            num = i * num;
                            sci_result_txt.setText(String.valueOf(num));
                        }
                    }
                    else {
                        sci_result_txt.setText("Error");
                    }
                }
                catch (NumberFormatException e) {
                    Toast.makeText(ScientificActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        logxy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                double num = Double.parseDouble(sci_exp_txt.getText().toString());
                sci_result_txt.setText(String.valueOf(Math.log10(num)));
            }
        });

        ln_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                double num = Double.parseDouble(sci_exp_txt.getText().toString());
                sci_result_txt.setText(String.valueOf(Math.log(num)));
            }
        });

        root_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                double num = Double.parseDouble(sci_exp_txt.getText().toString());
                sci_result_txt.setText(String.valueOf(Math.sqrt(num)));
            }
        });

        sqr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                double num = Double.parseDouble(sci_exp_txt.getText().toString());
                sci_result_txt.setText(String.valueOf(num*num));
            }
        });

        power_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + "^");
            }
        });

        pi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText("3.14159");
            }
        });

        e_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText("2.71828");
            }
        });

        inv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                double num = Double.parseDouble(sci_exp_txt.getText().toString());
                sci_result_txt.setText(String.valueOf(1/num));
            }
        });

        yrootx_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText().toString() + "√");
            }
        });

        one_btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + "1");
            }
        });

        two_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + "2");
            }
        });

        three_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + "3");
            }
        });

        four_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + "4");
            }
        });

        five_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + "5");
            }
        });

        six_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + "6");
            }
        });

        seven_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + "7");
            }
        });

        eight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + "8");
            }
        });

        nine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + "9");
            }
        });

        zero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + "0");
            }
        });

        clr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sci_exp_txt.setText("");
                sci_result_txt.setText("");
            }
        });

        bs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ex = sci_exp_txt.getText().toString();
                String new_ex = ex.substring(0, ex.length()-1);
                sci_exp_txt.setText(new_ex);
            }
        });

        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String expression = sci_exp_txt.getText().toString();

                    String[] parts = expression.split("(?<=[\\^√])|(?=[\\^√])");
                    if(parts.length == 3) {
                        String ans = String.valueOf(calculate(parts[0], parts[1], parts[2]));

                        sci_result_txt.setText(ans);
                    }
                }
                catch (Exception e) {
                    Toast.makeText(ScientificActivity.this, "There is some error.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        dot_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                sci_exp_txt.setText(sci_exp_txt.getText() + ".");
            }
        });
    }

    public void checkNewEx() {
        if (!sci_result_txt.getText().toString().equals("")) {
            sci_exp_txt.setText("");
            sci_result_txt.setText("");
        }
    }

    public double calculate(String op1, String op, String op2) {
        double x = Double.parseDouble(op1);
        double y = Double.parseDouble(op2);
        double ans = 0;

        switch (op) {
            case "^":
                ans = Math.pow(x, y);
                break;
            case "√":
                ans = Math.pow(y, 1/x);
                break;
        }
        return  ans;
    }
}

//  sin
//  cos
//  tan
//  sinh
//  cosh
//  tanh
//  factorial
//  root
//  square
//  ln
//  logx
//  power
//inverse
//  e
//y root x