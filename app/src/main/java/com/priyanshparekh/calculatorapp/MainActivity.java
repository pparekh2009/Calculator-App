package com.priyanshparekh.calculatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button one_btn, two_btn, three_btn, four_btn, five_btn, six_btn, seven_btn, eight_btn, nine_btn, zero_btn,
            add_btn, sub_btn, mul_btn, div_btn,
            dot_btn, equal_btn, clr_btn, bs_btn,
            sin_btn;

    TextView exp_text, res_text;

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
        setContentView(R.layout.activity_main);

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
        add_btn = findViewById(R.id.add_btn);
        sub_btn = findViewById(R.id.sub_btn);
        mul_btn = findViewById(R.id.mul_btn);
        div_btn = findViewById(R.id.div_btn);
        equal_btn = findViewById(R.id.equal_btn);
        dot_btn = findViewById(R.id.dot_btn);
        clr_btn = findViewById(R.id.clr_btn);
        bs_btn = findViewById(R.id.bs_btn);
        sin_btn = findViewById(R.id.sin_btn);

        exp_text = findViewById(R.id.exp_txt);
        res_text = findViewById(R.id.result_txt);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        ColorFilter colorFilter = new ColorFilter();
        toolbar.getOverflowIcon().setColorFilter(colorFilter);

        one_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                exp_text.setText(exp_text.getText() + "1");
            }
        });

        two_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                exp_text.setText(exp_text.getText() + "2");
            }
        });

        three_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                exp_text.setText(exp_text.getText() + "3");
            }
        });

        four_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                exp_text.setText(exp_text.getText() + "4");
            }
        });

        five_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                exp_text.setText(exp_text.getText() + "5");
            }
        });

        six_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                exp_text.setText(exp_text.getText() + "6");
            }
        });

        seven_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                exp_text.setText(exp_text.getText() + "7");
            }
        });

        eight_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                exp_text.setText(exp_text.getText() + "8");
            }
        });

        nine_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                exp_text.setText(exp_text.getText() + "9");
            }
        });

        zero_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                exp_text.setText(exp_text.getText() + "0");
            }
        });

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp_text.setText(exp_text.getText() + "+");
            }
        });

        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp_text.setText(exp_text.getText() + "-");
            }
        });

        mul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp_text.setText(exp_text.getText() + "x");
            }
        });

        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp_text.setText(exp_text.getText() + "/");
            }
        });

        equal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String expression = exp_text.getText().toString();

                    String[] parts = expression.split("(?<=[\\-+x/])|(?=[\\-+x/])");
                    if (parts.length == 3) {
                        String ans = String.valueOf(calculate(parts[0], parts[1], parts[2]));

                        res_text.setText(ans);

                    } else {
                        exp_text.setText("");
                        res_text.setText("");
                        Toast.makeText(MainActivity.this, "Enter correct operation", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    //res_text.setText(e.toString());
                    Toast.makeText(MainActivity.this, "Enter correct operation", Toast.LENGTH_SHORT).show();
                }
            }
        });

        clr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exp_text.setText("");
                res_text.setText("");
            }
        });

        bs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ex = exp_text.getText().toString();
                String new_ex = ex.substring(0, ex.length() - 1);
                exp_text.setText(new_ex);
            }
        });

        dot_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkNewEx();
                exp_text.setText(exp_text.getText() + ".");
            }
        });
    }

    public float calculate(String op1, String op, String op2) {

        float num1 = Float.parseFloat(op1);
        float num2 = Float.parseFloat(op2);
        float ans = 0;

        switch (op) {
            case "+":
                ans = num1 + num2;
                break;
            case "-":
                ans = num1 - num2;
                break;
            case "x":
                ans = num1 * num2;
                break;
            case "/":
                ans = num1 / num2;
                break;
        }
        return ans;
    }

    public void checkNewEx() {
        if (!res_text.getText().toString().equals("")) {
            exp_text.setText("");
            res_text.setText("");
        }
    }
}


//    @Override
//    public void onConfigurationChanged(@NonNull Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//
//        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            setContentView(R.layout.activity_scientific);
//        }
//        else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
//            setContentView(R.layout.activity_main);
//
//            one_btn = findViewById(R.id.one_btn);
//            two_btn = findViewById(R.id.two_btn);
//            three_btn = findViewById(R.id.three_btn);
//            four_btn = findViewById(R.id.four_btn);
//            five_btn = findViewById(R.id.five_btn);
//            six_btn = findViewById(R.id.six_btn);
//            seven_btn = findViewById(R.id.seven_btn);
//            eight_btn = findViewById(R.id.eight_btn);
//            nine_btn = findViewById(R.id.nine_btn);
//            zero_btn = findViewById(R.id.zero_btn);
//            add_btn = findViewById(R.id.add_btn);
//            sub_btn = findViewById(R.id.sub_btn);
//            mul_btn = findViewById(R.id.mul_btn);
//            div_btn = findViewById(R.id.div_btn);
//            equal_btn = findViewById(R.id.equal_btn);
//            dot_btn = findViewById(R.id.dot_btn);
//            clr_btn = findViewById(R.id.clr_btn);
//            bs_btn = findViewById(R.id.bs_btn);
//            sin_btn = findViewById(R.id.sin_btn);
//
//            exp_text = findViewById(R.id.exp_txt);
//            res_text = findViewById(R.id.result_txt);
//
//            one_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkNewEx();
//                    exp_text.setText(exp_text.getText() + "1");
//                }
//            });
//
//            two_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkNewEx();
//                    exp_text.setText(exp_text.getText() + "2");
//                }
//            });
//
//            three_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkNewEx();
//                    exp_text.setText(exp_text.getText() + "3");
//                }
//            });
//
//            four_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkNewEx();
//                    exp_text.setText(exp_text.getText() + "4");
//                }
//            });
//
//            five_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkNewEx();
//                    exp_text.setText(exp_text.getText() + "5");
//                }
//            });
//
//            six_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkNewEx();
//                    exp_text.setText(exp_text.getText() + "6");
//                }
//            });
//
//            seven_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkNewEx();
//                    exp_text.setText(exp_text.getText() + "7");
//                }
//            });
//
//            eight_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkNewEx();
//                    exp_text.setText(exp_text.getText() + "8");
//                }
//            });
//
//            nine_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkNewEx();
//                    exp_text.setText(exp_text.getText() + "9");
//                }
//            });
//
//            zero_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkNewEx();
//                    exp_text.setText(exp_text.getText() + "0");
//                }
//            });
//
//            add_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    exp_text.setText(exp_text.getText() + "+");
//                }
//            });
//
//            sub_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    exp_text.setText(exp_text.getText() + "-");
//                }
//            });
//
//            mul_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    exp_text.setText(exp_text.getText() + "x");
//                }
//            });
//
//            div_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    exp_text.setText(exp_text.getText() + "/");
//                }
//            });
//
//            equal_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    try {
//                        String expression = exp_text.getText().toString();
//
//                        String[] parts = expression.split("(?<=[\\-+x/])|(?=[\\-+x/])");
//                        if(parts.length == 3) {
//                            String ans = String.valueOf(calculate(parts[0], parts[1], parts[2]));
//
//                            res_text.setText(ans);
//
//                        }
//                        else {
//                            exp_text.setText("");
//                            res_text.setText("");
//                            Toast.makeText(MainActivity.this, "Enter expression with one operation", Toast.LENGTH_SHORT).show();
//                        }
//
//                        Toast.makeText(MainActivity.this, String.valueOf(parts.length), Toast.LENGTH_SHORT).show();
//                    }
//
//                    catch (Exception e) {
//                        //res_text.setText(e.toString());
//                        Toast.makeText(MainActivity.this, "Enter only one operation", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//
//            clr_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    exp_text.setText("");
//                    res_text.setText("");
//                }
//            });
//
//            bs_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    String ex = exp_text.getText().toString();
//                    String new_ex = ex.substring(0, ex.length()-1);
//                    exp_text.setText(new_ex);
//                }
//            });
//
//            dot_btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    checkNewEx();
//                    exp_text.setText(exp_text.getText() + ".");
//                }
//            });
//        }
//    }
//
//    public float calculate(String op1, String op, String op2) {
//
//        float num1 = Float.parseFloat(op1);
//        float num2 = Float.parseFloat(op2);
//        float ans = 0;
//
//        switch (op) {
//            case "+":
//                ans = num1 + num2;
//                break;
//            case "-":
//                ans = num1 - num2;
//                break;
//            case "x":
//                ans = num1 * num2;
//                break;
//            case "/":
//                ans = num1 / num2;
//                break;
//        }
//        return ans;
//    }
//
//    public void checkNewEx() {
//        if (!res_text.getText().toString().equals("")) {
//            exp_text.setText("");
//            res_text.setText("");
//        }
//    }