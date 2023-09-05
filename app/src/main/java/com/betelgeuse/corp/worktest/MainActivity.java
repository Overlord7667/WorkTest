package com.betelgeuse.corp.worktest;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.compose.ui.graphics.Color;
//import androidx.compose.ui.graphics.Color;
//import androidx.compose.ui.text.font.Typeface;
import androidx.core.content.ContextCompat;

//import android.hardware.camera2.CameraManager;
import android.Manifest;
//import android.graphics.Camera;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
//import com.karumi.dexter.Dexter;
//import com.karumi.dexter.MultiplePermissionsReport;
//import com.karumi.dexter.PermissionToken;
//import com.karumi.dexter.listener.PermissionDeniedResponse;
//import com.karumi.dexter.listener.PermissionGrantedResponse;
//import com.karumi.dexter.listener.PermissionRequest;
//import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
//import com.karumi.dexter.listener.single.PermissionListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    //String CameraId;
    //boolean isTern = false;
    //Camera camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Dexter.withActivity(this).withPermission(Manifest.permission.CAMERA).withListener(new PermissionListener() {
//            @Override
//            public void onPermissionGranted(PermissionGrantedResponse response) {
//
//            }
//
//            @Override
//            public void onPermissionDenied(PermissionDeniedResponse response) {
//
//            }
//
//            @Override
//            public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
//
//            }
//        }).check();
//        isTern = getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
//        //cameraManager = (CameraManager) getSystemService(CAMERA_SERVICE);
//        Button button = findViewById(R.id.Light);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                isTern = getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
//                if (isTern){
//                    //Выключить
//                }else {
//                    //Включить
//                }
//            }
//        });
//    }
//
//    public void Light(View view){
//        isTern = getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
////        Toast.makeText(this, "Вы нажали кнопку", Toast.LENGTH_LONG).show();
//        String string = isTern == true?"Есть": "Нету";
//        Toast.makeText(this, string, Toast.LENGTH_LONG).show();

//        TextView textView = new TextView(this);
//        textView.setText("Привет Мир!");
//        textView.setTextSize(30);
//        textView.setTextColor();
//        setContentView(textView);
//    }
        Button button = findViewById(R.id.vizov);
        button.setTextSize(20);
        //button.setTypeface();
        button.setWidth(500);
        button.setHeight(200);
        //button.setBackgroundColor(Color.parseColor("#A6465C"));
        int Color = ContextCompat.getColor(this, R.color.salat);
        button.setTextColor(Color);
        button.setPadding(0,0,0,0);
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) button.getLayoutParams();
        params.setMargins(100,200,0,0);
        button.setLayoutParams(params);

        Button button1 = findViewById(R.id.vizov2);
        button1.setTextSize(40);
        ViewGroup.MarginLayoutParams params1 = (ViewGroup.MarginLayoutParams) button1.getLayoutParams();
        params1.setMargins(200,500,0,0);
        int Color1 = ContextCompat.getColor(this, R.color.textButton);
        button1.setTextColor(Color1);
        int Color2 = ContextCompat.getColor(this, R.color.backButton);
        button1.setBackgroundColor(Color2);
    }

    public void Button1(View view) {
        //Toast.makeText(this, "Вы нажали кнопку", Toast.LENGTH_LONG).show();
        //Snackbar.make(view, R.string.button_click, Snackbar.LENGTH_LONG).show();
        Snackbar.make(view, getString(R.string.message1) + "  " + ++count, Snackbar.LENGTH_LONG).show();
//        Log.i("Button","Work on");
//        Log.e("Button","Work on");
//        Log.w("Button","Work on");
//        Log.d("Button","Work on");
    }

    public void Button2(View view) {
        //Toast.makeText(this, R.string.button_click2, Toast.LENGTH_LONG).show();
        Toast toast = Toast.makeText(this,getString(R.string.message2) + " " + --count, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER| Gravity.LEFT, 0,0);
        LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setImageResource(R.drawable.baseline_light_mode_24);
        toastContainer.addView(imageView,0);
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM,0,0);
        toast.show();
//        Log.i("Button_2","Work on click");
//        Log.e("Button_2","Work on click");
//        Log.w("Button_2","Work on click");
//        Log.d("Button_2","Work on click");
    }


}