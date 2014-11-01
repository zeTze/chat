package com.yyz.chat;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.mcxiaoke.popupmenu.PopupMenuCompat;



public class MenuActivity extends SherlockActivity{
	
	public static final String TAG = MenuActivity.class.getSimpleName();
	
	protected ImageView mImageViewMore;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Views.inject(this);
        mImageViewMore = (ImageView)findViewById(R.id.imageview_more);
        
        mImageViewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BuildConfig.DEBUG) {
                    Log.v(TAG, "onButton1Click()");
                }
                showPopupMenu(mImageViewMore);
            }
        });
        

    }

    private void showPopupMenu(View view) {
        if (BuildConfig.DEBUG) {
            Log.v(TAG, "showPopupMenu()");
        }
//        final PopupMenuCompat.OnMenuItemClickListener onMenuItemClickListener =
//                new PopupMenuCompat.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem item) {
//                        return false;
//                    }
//                };
//        final PopupMenuCompat.OnDismissListener onDismissListener =
//                new PopupMenuCompat.OnDismissListener() {
//                    @Override
//                    public void onDismiss(PopupMenuCompat PopupMenu) {
//
//                    }
//                };
        PopupMenuCompat popupMenu = new PopupMenuCompat(this, view);
//        popupMenu.setOnMenuItemClickListener(onMenuItemClickListener);
//        popupMenu.setOnDismissListener(onDismissListener);
        popupMenu.inflate(R.menu.menu);
        popupMenu.show();
    }
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
    
}
