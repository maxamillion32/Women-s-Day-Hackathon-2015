package women.hackathon.challengeme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ChallengeNotificationScreen extends Activity {

	@SuppressWarnings("null")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		View view = null;
		String challengeAccepted = "false"; //Toggle value based on push notification
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_challenge_notification_screen);
		if("true" == challengeAccepted){
			 view.setBackgroundResource(R.drawable.challenge_accepted);
		}
		if("false" == challengeAccepted){
			 view.setBackgroundResource(R.drawable.challenge_refused);
		}
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
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void onYesButtonClick(View view){
		Toast.makeText(getApplicationContext(), 
				"Are you ready???", Toast.LENGTH_SHORT).show();	
		//Intent challengePage = new Intent(this, ChooseChallenge.class);
		Log.v("Main Activity", "Starting service");
		this.finish();
		//startActivity(challengePage);
		}
}
