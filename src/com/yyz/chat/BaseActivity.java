package com.yyz.chat;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class BaseActivity extends MainActivity{
	
	protected ImageView mImageViewCreate;
	protected ImageView mImageViewLast_1;
	protected ImageView mImageViewLast_2;
	protected ImageView mImageViewNext;
	protected ImageView mImageViewCreated;
	
	protected RelativeLayout mUIDpiType;
	

	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        
	        
	        mImageViewCreate =(ImageView)findViewById(R.id.imageview_create);
	        mImageViewLast_1=(ImageView)findViewById(R.id.imageview_last_1);
	        mImageViewLast_2 = (ImageView)findViewById(R.id.imageview_last_2);
	        mImageViewNext = (ImageView)findViewById(R.id.imageview_next);
	        mImageViewCreated=(ImageView)findViewById(R.id.imageview_created);
	        
	        mUIDpiType = (RelativeLayout)findViewById(R.id.relative_Dpi_Type);
	        
	    }
}
