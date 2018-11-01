package c.c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double firstNumber;
    private double secondNumber;
    private double result;

    private String operation = "";

    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.display);
        display.setText("");

        Button b = (Button) findViewById(R.id.backspace);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText().toString().substring(0, display.getText().toString().length() - 1));
                    firstNumber = secondNumber = Double.parseDouble(display.getText().toString());
                } catch(Exception e) {}
            }
        });

        Button c = (Button) findViewById(R.id.clear);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText("");
                    firstNumber = secondNumber = 0;
                } catch(Exception e) {}
            }
        });

        Button plusminus = (Button) findViewById(R.id.plusminus);
        plusminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    firstNumber = secondNumber = Double.parseDouble(display.getText().toString());
                    firstNumber = secondNumber = -1 * firstNumber;
                    display.setText(firstNumber + "");
                } catch(Exception e) {}
            }
        });

        Button percent = (Button) findViewById(R.id.percent);
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "percent";
                display.setText("");
            }
        });

        Button divide = (Button) findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "divide";
                display.setText("");
            }
        });

        Button times = (Button) findViewById(R.id.times);
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "times";
                display.setText("");
            }
        });

        Button minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "minus";
                display.setText("");
            }
        });

        Button plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = "plus";
                display.setText("");
            }
        });

        Button zero = (Button) findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.equals("")) {
                    display.setText(display.getText().toString() + "0");
                    firstNumber = Double.parseDouble(display.getText().toString());
                } else {
                    try {
                        display.setText(display.getText().toString() + "0");
                        secondNumber = Double.parseDouble(display.getText().toString());
                    } catch(Exception e) {}
                }
            }
        });

        Button one = (Button) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.equals("")) {
                    display.setText(display.getText().toString() + "1");
                    firstNumber = Double.parseDouble(display.getText().toString());
                } else {
                    try {
                        display.setText(display.getText().toString() + "1");
                        secondNumber = Double.parseDouble(display.getText().toString());
                    } catch(Exception e) {}
                }
            }
        });

        Button two = (Button) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.equals("")) {
                    display.setText(display.getText().toString() + "2");
                    firstNumber = Double.parseDouble(display.getText().toString());
                } else {
                    try {
                        display.setText(display.getText().toString() + "2");
                        secondNumber = Double.parseDouble(display.getText().toString());
                    } catch(Exception e) {}
                }
            }
        });

        Button three = (Button) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.equals("")) {
                    display.setText(display.getText().toString() + "3");
                    firstNumber = Double.parseDouble(display.getText().toString());
                } else {
                    try {
                        display.setText(display.getText().toString() + "3");
                        secondNumber = Double.parseDouble(display.getText().toString());
                    } catch(Exception e) {}
                }
            }
        });

        Button four = (Button) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.equals("")) {
                    display.setText(display.getText().toString() + "4");
                    firstNumber = Double.parseDouble(display.getText().toString());
                } else {
                    try {
                        display.setText(display.getText().toString() + "4");
                        secondNumber = Double.parseDouble(display.getText().toString());
                    } catch(Exception e) {}
                }
            }
        });

        Button five = (Button) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.equals("")) {
                    display.setText(display.getText().toString() + "5");
                    firstNumber = Double.parseDouble(display.getText().toString());
                } else {
                    try {
                        display.setText(display.getText().toString() + "5");
                        secondNumber = Double.parseDouble(display.getText().toString());
                    } catch(Exception e) {}
                }
            }
        });

        Button six = (Button) findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.equals("")) {
                    display.setText(display.getText().toString() + "6");
                    firstNumber = Double.parseDouble(display.getText().toString());
                } else {
                    try {
                        display.setText(display.getText().toString() + "6");
                        secondNumber = Double.parseDouble(display.getText().toString());
                    } catch(Exception e) {}
                }
            }
        });

        Button seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.equals("")) {
                    display.setText(display.getText().toString() + "7");
                    firstNumber = Double.parseDouble(display.getText().toString());
                } else {
                    try {
                        display.setText(display.getText().toString() + "7");
                        secondNumber = Double.parseDouble(display.getText().toString());
                    } catch(Exception e) {}
                }
            }
        });

        Button eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.equals("")) {
                    display.setText(display.getText().toString() + "8");
                    firstNumber = Double.parseDouble(display.getText().toString());
                } else {
                    try {
                        display.setText(display.getText().toString() + "8");
                        secondNumber = Double.parseDouble(display.getText().toString());
                    } catch(Exception e) {}
                }
            }
        });

        Button nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.equals("")) {
                    display.setText(display.getText().toString() + "9");
                    firstNumber = Double.parseDouble(display.getText().toString());
                } else {
                    try {
                        display.setText(display.getText().toString() + "9");
                        secondNumber = Double.parseDouble(display.getText().toString());
                    } catch(Exception e) {}
                }
            }
        });

        Button point = (Button) findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!display.getText().toString().contains(".")) {
                    if (operation.equals("")) {
                        try {
                            display.setText(display.getText().toString() + ".");
                            firstNumber = Double.parseDouble(display.getText().toString());
                        } catch (Exception e) {}
                    } else {
                        try {
                            display.setText(display.getText().toString() + ".");
                            secondNumber = Double.parseDouble(display.getText().toString());
                        } catch (Exception e) {
                        }
                    }
                }
            }
        });

        Button equals = (Button) findViewById(R.id.equals);
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation.equals("percent")) {
                    try {
                        result = firstNumber * (secondNumber / 100);
                        display.setText(result + "");
                        firstNumber = result;
                        operation = "";
                    } catch (Exception e) {
                    }
                }
                if(operation.equals("divide")) {
                    try {
                        result = firstNumber / secondNumber;
                        display.setText(result + "");
                        firstNumber = result;
                        operation = "";
                    } catch (Exception e) {
                    }
                }
                if(operation.equals("times")) {
                    try {
                        result = firstNumber * secondNumber;
                        display.setText(result + "");
                        firstNumber = result;
                        operation = "";
                    } catch (Exception e) {
                    }
                }
                if(operation.equals("minus")) {
                    try {
                        result = firstNumber - secondNumber;
                        display.setText(result + "");
                        firstNumber = result;
                        operation = "";
                    } catch (Exception e) {
                    }
                }
                if(operation.equals("plus")) {
                    try {
                        result = firstNumber + secondNumber;
                        display.setText(result + "");
                        firstNumber = result;
                        operation = "";
                    } catch (Exception e) {
                    }
                }
            }
        });
    }
}