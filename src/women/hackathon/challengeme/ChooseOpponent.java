package women.hackathon.challengeme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ChooseOpponent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_opponent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.choose_opponent, menu);
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
	
	public void onChallengeButtonClick(View view){
		Toast.makeText(getApplicationContext(), 
				"Your friend has been challenged. "
				+ "Will notify you when the challenge is accepted", Toast.LENGTH_SHORT).show();	
		Intent ChallengeNotificationScreenpage = new Intent(this, ChallengeNotificationScreen.class);
		Log.v("Main Activity", "Navigating to choose ChallengeNotificationScreen page");
		this.finish();
		startActivity(ChallengeNotificationScreenpage);
		}
	
}
