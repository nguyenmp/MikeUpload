package com.nguyenmp.mikeupload;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class PopUpActivity extends Activity {

	@Override
	public void onCreate(Bundle inState) {
		super.onCreate(inState);

		//Set dialog view
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_popup);

		//Set click listeners
		initClickListeners();
	}

	private void initClickListeners() {
		View cancelView = findViewById(R.id.activity_popup_cancel);
		cancelView.setOnClickListener(new CancelButtonListener(this));
	}

	private static class CancelButtonListener implements View.OnClickListener {
		private final Activity mActivity;

		CancelButtonListener(Activity activity) {
			this.mActivity = activity;
		}

		@Override
		public void onClick(View view) {
			mActivity.finish();
		}
	}
}
