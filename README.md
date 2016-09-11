# AndroidLibSample
Let me tell you about how to use this example.

Step1
New Project ( Empty Activity ) # running project (for checking Module )
Step2

New Module # this is library module that you want.
Step3

    package com.narith.testlib;
    import android.util.Log;
    public class Test {
        public static void HelloWorld() {
            Log.d("Test","Hello World");
        }
    }


Step4

include module Dependency ( in Project Structure - Dependencies) # You should make sure that include Module dependency from which you made.
Step5

Check it out that it works or not. ( like below )

import com.narith.testlib.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check function
        Test.HelloWorld();
    }
}


Step6

Run app in Machine and check it out.
