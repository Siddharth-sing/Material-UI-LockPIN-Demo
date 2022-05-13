# Material-UI-LockPIN-Demo

## App's Overview 
<p>
In this article, I am going to create a multi-screen yet simple application that will be demonstrating the best way to create lock screens for the apps using shared preferences and some material UI components.   
<p> 

![Lock Screen Demo App](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/9rl99od84mlvrxn5xj8i.gif)

---

## Steps to proceed
  
<p>
We will be proceeding in a very beginner-friendly way. All the steps are mentioned below.

- [Project Setup ](#setup)
- [Building the app's UI ](#UI)
- [Creating the Backend of the app](#back)
- [GitHub Repo ](#GitHub)
- [Writer's Support ❤️](#support)


<p>

<p>
  
## Setup
  
<a name="setup"></a>
* First of all, create a brand new project in your android studio. Assuming that it will be an easy part, so not explaining all. 
![Image description](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/iu4ykvvoqn5g1prrfvrp.jpg)
* Then set up your emulator properly to check the application.

Now we are good to go for next step.
<p>
<p>
  
## Building the app's UI
  
<a name="UI"></a>
  App's UI will be built in 4 steps :
  * [Main Activity UI (activity_main.xml)](#mainA)
  * [Set Password Screen UI (activity_set_password.xml)](#setA)
  * [PIN Entering screen UI (activity_password_type.xml)](#passA)
  * [Screen open upon correct PIN UI (activity_welcome.xml)](#welA)

App's UI is built with some of the `material UI` component for giving it a better look.

Simply copy each and every `.xml` file below and create the same into your project.

<a name="mainA"></a>

> activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>

<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/backgroud"
    android:theme="@style/Theme.MaterialComponents.DayNight.NoActionBar"
    >

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center_horizontal"
        android:orientation="vertical"
        android:layout_centerInParent="true"
        tools:context=".MainActivity">

        <ImageView
            android:layout_width="100dp"
            android:layout_height="100dp"
            android:src="@drawable/ic_baseline_android_24"
            android:layout_marginBottom="4dp"
            />
        <TextView
            android:id="@+id/tv_app_name"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Lock Up !"
            android:gravity="center"
            android:textSize="25sp"
            android:textStyle="bold"
            android:textColor="@color/gradientEnd"
            android:layout_marginBottom="26dp"
            android:letterSpacing="0.3"/>

        <androidx.cardview.widget.CardView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="20dp"
            android:layout_marginEnd="20dp"
            android:background="@color/white"
            app:cardCornerRadius="8dp"
            app:cardElevation="5dp"
            >
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:padding="16dp">

                <TextView
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="Welcome"
                    android:gravity="center"
                    android:textSize="30sp"
                    android:textColor="#0091EA"
                    android:textStyle="bold"/>
                <TextView
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:text="Please set the lock screen pin"
                    android:gravity="center"
                    android:textSize="16sp"
                    android:textColor="#7A8089"
                    android:textStyle="bold"/>
                <LinearLayout
                    android:id="@+id/llLaunchScreen"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    tools:visibility="visible"
                    android:padding="8dp"
                    android:layout_centerInParent="true"
                    >

                    <androidx.cardview.widget.CardView
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        app:cardCornerRadius="50dp"

                        >
                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:orientation="vertical"
                            >
                        <Button
                            android:id="@+id/buttonSetPin"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:backgroundTint="@color/gradientStart"
                            android:text="Set/Change PIN"
                            android:padding="16dp"
                            android:textColor="#FFFFFF"
                            android:textStyle="bold"
                            />
                        <Button
                            android:id="@+id/buttonTypePin"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:backgroundTint="@color/gradientStart"
                            android:text="Type Pin To get in"
                            android:padding="16dp"
                            android:textColor="#FFFFFF"
                            android:textStyle="bold"
                            />
                        </LinearLayout>
                    </androidx.cardview.widget.CardView>
                </LinearLayout>

            </LinearLayout>

        </androidx.cardview.widget.CardView>

    </LinearLayout>
</RelativeLayout>

```
<a name="setA"></a>

>activity_set_password.xml

```

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:background="@drawable/backgroud"
    android:orientation="vertical"

    >

    <ImageView
        android:id="@+id/imgAnd"
        android:layout_width="170dp"
        android:layout_height="170dp"
        android:layout_marginTop="5dp"
        android:src="@drawable/ic_baseline_android_24"
        android:layout_centerHorizontal="true"
        />
    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/mtxtName"
        android:padding="18dp"
        style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/imgAnd"
        >

        <androidx.appcompat.widget.AppCompatEditText
            android:id="@+id/edtName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Enter your Name"
            android:padding="18dp"
            android:textColorHint="@color/white"
            android:inputType="text"
            android:textSize="16sp"

            />
    </com.google.android.material.textfield.TextInputLayout>

    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/mtxtPass"
        android:padding="18dp"
        style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/mtxtName"

        >

        <androidx.appcompat.widget.AppCompatEditText
            android:id="@+id/edtPass"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Enter your password"
            android:padding="18dp"
            android:textColorHint="@color/white"
            android:inputType="numberPassword"
            android:textSize="16sp"

            />
    </com.google.android.material.textfield.TextInputLayout>

    <Button
        android:id="@+id/btnSave"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:backgroundTint="@color/gradientEnd"
        android:text="Save Pin"
        android:padding="16dp"
        android:layout_margin="25dp"
        android:textColor="#FFFFFF"
        android:textStyle="bold"
        android:layout_below="@+id/mtxtPass"
        />

</RelativeLayout>

```

<a name="passA"></a>

>activity_password_type.xml

```

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/backgroud"
    android:orientation="vertical"
    >

    <ImageView
        android:id="@+id/imgAnd"
        android:layout_width="170dp"
        android:layout_height="170dp"
        android:layout_marginTop="5dp"
        android:src="@drawable/ic_baseline_android_24"
        android:layout_centerHorizontal="true"
        />
    <com.google.android.material.textfield.TextInputLayout
        android:id="@+id/mtxtName"
        android:padding="18dp"
        style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/imgAnd"
        >
    </com.google.android.material.textfield.TextInputLayout>

    <TextView
        android:id="@+id/txtPass"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:layout_marginTop="215dp"
        android:textColor="#EDE8E8"
        android:textStyle="bold"
        android:letterSpacing="1.5"
        android:textSize="22dp"
        android:maxLength="4"
        android:inputType="numberPassword"
        android:text="1234" />

    <LinearLayout
        android:id="@+id/keyBoard"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:layout_alignParentBottom="true"
        >

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            >

            <Button
                android:id="@+id/btn1"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="15dp"
                android:text="1"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />

            <Button
                android:id="@+id/btn2"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="15dp"
                android:text="2"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />

            <Button
                android:id="@+id/btn3"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="15dp"
                android:text="3"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <Button
                android:id="@+id/btn4"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="15dp"
                android:text="4"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />

            <Button
                android:id="@+id/btn5"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="15dp"
                android:text="5"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />

            <Button
                android:id="@+id/btn6"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="15dp"
                android:text="6"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <Button
                android:id="@+id/btn7"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="15dp"
                android:text="7"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />

            <Button
                android:id="@+id/btn8"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="15dp"
                android:text="8"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />

            <Button
                android:id="@+id/btn9"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="15dp"
                android:text="9"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <ImageButton
                android:id="@+id/btnErase"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="22dp"
                android:src="@drawable/ic_baseline_arrow_back_ios_24"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />

            <Button
                android:id="@+id/btn0"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="15dp"
                android:text="0"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />

            <ImageButton
                android:id="@+id/btnCheck"
                style="@style/Widget.MaterialComponents.Button.TextButton"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:padding="22dp"
                android:src="@drawable/ic_baseline_check_24"
                android:textColor="@color/white"
                android:textSize="18dp"
                android:textStyle="bold" />
        </LinearLayout>


    </LinearLayout>

</RelativeLayout>

```

<a name="welA"></a>

> activity_welcome.xml

```

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".WelcomeActivity"
    android:background="@drawable/backgroud">


    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="WELCOME !"
        android:textColor="@color/white"
        android:textSize="56sp"
        android:layout_centerInParent="true"
        android:layout_centerHorizontal="true"
        android:textStyle="bold"
        android:letterSpacing="0.1"
        />

</RelativeLayout>

```

<p>

<a name="back"></a>

## App's Backend

Similar to the UI, the app's backend is also divided into four parts namely :

- [MainActivity.kt ](#mainB)
- [SetPasswordActivity.kt ](#setB)
- [PasswordTypeActivity.kt](#passB)
- [WelcomeActivity.kt](#welB)

<a name="mainB"></a>

> MainActivity.kt
```

package com.siddharthsinghbaghel.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTypePin: Button = findViewById(R.id.buttonTypePin)
        val buttonSetPin: Button = findViewById(R.id.buttonSetPin)

        /* buttonSetPin will open the SetPasswordActivity.kt.
        *
        *  In other words the activity opened will
        *  overwrite the default shared preferences or set new values if not present.
        *
        *  You can further create it for reseting passwords or forgotten
        *  password option in your app
        * */

        buttonSetPin.setOnClickListener{
            val intent = Intent(this,SetPasswordActivity::class.java)
            startActivity(intent)
        }


        /*
        *  buttonTypePin will open the PasswordTypeActivit.kt
        *
        * If the user has already set the pin he/she
        * can just enter the pin correctly and can enter the
        * next screen.
        * */

        buttonTypePin.setOnClickListener{
            val intent = Intent(this,PasswordTypeActivity::class.java)
            startActivity(intent)

        }

    }
}


```

<a name="setB"></a>

> SetPasswordActivity.kt

```

package com.siddharthsinghbaghel.sharedpreferences

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_password)


        val edtName: EditText = findViewById(R.id.edtName)
        val edtPass: EditText = findViewById(R.id.edtPass)
        val btnSave: Button = findViewById(R.id.btnSave)



        /* Creating the shared preference to store (name, password)
        *  as a key value pair.
        * */

        val sharedPref = getSharedPreferences("passPref", MODE_PRIVATE)
        val editor = sharedPref.edit()


        /*
        * onClick of btnSave the data present in edit texts
        * name and pass in .xml file will be  stored in our
        * shared preference (sharedpref)
        * */

        btnSave.setOnClickListener{

            val name: String = edtName.text.toString()
            val password: String = edtPass.text.toString()

            editor.apply {

                putString("name", name)
                putString("password", password)
                apply() /* can also use commit() here but apply() is the best practice according to google */
            }


            Toast.makeText(this, "PIN successfully set ", Toast.LENGTH_SHORT).show()

            /* On successfully creating the PIN user will
            *  will be directed to the PasswordTypeActivity screen
            *  where user have to enter the correct PIN to enter the WelcomeActivity.kt
            * */

            val intent = Intent(this,PasswordTypeActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}


```

<a name="passB"></a>

> PasswordTypeActivity.kt

```

package com.siddharthsinghbaghel.sharedpreferences

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class PasswordTypeActivity : AppCompatActivity(), View.OnClickListener {

    /* codeString is the string in which the PIN entered by user is stored.*/
    private var codeString: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_type)


        /* Since we have to check the whether the entered
        *  password by user is correct or not, we need
        *  shared preference where we stored that.
        *  To retrieve data from shared preference the below code
        *  is executed.
        * */
        val sharedPref = getSharedPreferences("passPref", MODE_PRIVATE)
        val password = sharedPref.getString("password", "1234")


        val txtPass: TextView = findViewById(R.id.txtPass)

        txtPass.text = "" /*Emptied the textview to show the simultaneous
                            entering effect of all 4 digits of PIN */

        val btn0: Button = findViewById(R.id.btn0)
        val btn1:Button = findViewById(R.id.btn1)
        val btn2:Button = findViewById(R.id.btn2)
        val btn3:Button = findViewById(R.id.btn3)
        val btn4:Button = findViewById(R.id.btn4)
        val btn5:Button = findViewById(R.id.btn5)
        val btn6:Button = findViewById(R.id.btn6)
        val btn7:Button = findViewById(R.id.btn7)
        val btn8:Button = findViewById(R.id.btn8)
        val btn9:Button = findViewById(R.id.btn9)
        val btnErase: ImageButton = findViewById(R.id.btnErase)
        val btnCheck: ImageButton = findViewById(R.id.btnCheck)


        btn0.setOnClickListener(this)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
        btnErase.setOnClickListener(this)



        btnCheck.setOnClickListener{

            /* btnCheck is called means iuser enter the desired PIN
             * now it's our turn to check it.
            * */

            codeString = txtPass.text.toString()

            if(codeString == password)
            {
                Toast.makeText(this, "Correct PIN Welcome!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,WelcomeActivity::class.java)
                startActivity(intent)
                finish()
            }else{

                Toast.makeText(this, "Wrong PIN please try again", Toast.LENGTH_SHORT).show()
                txtPass.text = ""
                codeString = txtPass.text.toString()
            }


        }


    }

    private fun setDotView() {

        /* this function will simply set the values
        *  which user is entering one by one as PIN in
        *  textView (txtPass) to give a PIN entering
        *  view.
        * */

        val txtPass: TextView = findViewById(R.id.txtPass)
        txtPass.text = codeString
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn0 -> codeString += "0"
            R.id.btn1 -> codeString += "1"
            R.id.btn2 -> codeString += "2"
            R.id.btn3 -> codeString += "3"
            R.id.btn4 -> codeString += "4"
            R.id.btn5 -> codeString += "5"
            R.id.btn6 -> codeString += "6"
            R.id.btn7 -> codeString += "7"
            R.id.btn8 -> codeString += "8"
            R.id.btn9 -> codeString += "9"
            R.id.btnErase -> {
                codeString = removeLastChar(codeString).toString()
            }
            else -> {
            }
        }
        setDotView()
    }


    private fun removeLastChar(s: String?): String? {

        /* the erase button will erase the
        *  the last entered value from the keyboard.
        *  The Erase button's working is followed in this function.
        * */
        return if (s == null || s.length == 0) {
            s
        } else s.substring(0, s.length - 1)
    }


}


```

<a name="welB"></a>

> WelcomeActivity.kt

```

package com.siddharthsinghbaghel.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class WelcomeActivity : AppCompatActivity() {

   /* Here we used onRestart() callback
   *  because if user pushes the home button
   *  or opened any other application or just closed the app and 
   *  restart it again, the first session will expire and the app
   *  will be locked up again. Thus user have to enter the password 
   *  always when he/she stops and restart the app.
   * */
   
    override fun onRestart() {
        super.onRestart()
        val intent = Intent(this,PasswordTypeActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }
}

```

<a name="GitHub"></a> 
  
## GitHub Repository
  
* Fork the repository for better and easy understanding and for quick learning.

{% github Siddharth-sing/Material-UI-LockPIN-Demo %}

<a name="support"></a> 
  
## Writer's Support
  
* If you find the article useful show some ❤️ by staring some of my repositories and following me on dev.to and github.
 <div>
  <p align="middle">
  <a href="https://www.linkedin.com/in/siddharth-singh-baghel-912866190/">
  <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">
  </a>
  <a href="https://github.com/Siddharth-sing">
  <img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white">
  </a>
  <a href="https://dev.to/siddharthsing">
  <img src="https://img.shields.io/badge/dev.to-0A0A0A?style=for-the-badge&logo=dev.to&logoColor=white">
  </a>
