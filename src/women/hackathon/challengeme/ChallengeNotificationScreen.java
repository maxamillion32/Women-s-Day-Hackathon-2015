package women.hackathon.challengeme;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ChallengeNotificationScreen extends Activity {

	View root;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//View view = null;
		String challengeAccepted = "false"; //Toggle value based on push notification
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_challenge_notification_screen);
		
	    root = findViewById(R.layout.activity_challenge_notification_screen);

		/*
		 * 
		 * If notification value received from server is Accepted, then open Challenge Accepted screen
		 * else open Challenge Refused Screen
		 * 
		 */
		
//		if("true" == challengeAccepted){
//			 view.setBackgroundResource(R.drawable.challenge_accepted);
//		}
//		if("false" == challengeAccepted){
//			 view.setBackgroundResource(R.drawable.challenge_refused);
//		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.challenge_notification_screen, menu);
		return true;
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case R.id.Challenge_accepted:
			Log.v("Main Activity", "Challenge Accepted");
			//root.setBackgroundColor(getResources().getColor(R.color.red));
			//root.setBackgroundResource(R.drawable.challenge_accepted);
			Toast.makeText(getApplicationContext(), 
					"Challenge Accepted", Toast.LENGTH_SHORT).show();	
			//changeBackground(true);
			return true;
		case R.id.Challenge_refused:
			Log.v("Main Activity", "Challenge Refused");
			//changeBackground(false);
			Toast.makeText(getApplicationContext(), 
					"Challenge Refused", Toast.LENGTH_SHORT).show();	
			//root.setBackgroundResource(R.drawable.challenge_accepted);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
		/*if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);*/
//	}
//	private void changeBackground(boolean b) {
//
//		if(true==b){
//			ImageView root = (ImageView) findViewById(R.id.Challenge_accepted);
//			root.setBackground(getWallpaper());
//		}
//		else if(false==b){
//			ImageView root = (ImageView) findViewById(R.id.Challenge_refused);
//			root.setBackground(getWallpaper());
//		}
	}

	public void onAlrightButtonClick(View view){
		Toast.makeText(getApplicationContext(), 
				"Are you ready???", Toast.LENGTH_SHORT).show();	
		//Intent challengePage = new Intent(this, ChooseChallenge.class);
		Log.v("Main Activity", "Starting service");
		this.finish();
		//startActivity(challengePage);
		}
}
