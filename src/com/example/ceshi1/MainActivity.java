package com.example.ceshi1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity implements android.view.View.OnClickListener {
    private ImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv = (ImageView)findViewById(R.id.iv_imageview);
		iv.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
        switch(v.getId()){
           case R.id.iv_imageview:
        	   
        	   break;
        }		
	}
	
	public void getImage(){
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Ñ¡ÔñÏîÄ¿").setItems(R.array.select_image,null);
	}
	

}
