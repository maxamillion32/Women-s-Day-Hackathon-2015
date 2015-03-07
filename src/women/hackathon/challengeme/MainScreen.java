package women.hackathon.challengeme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_screen, menu);
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
				"Yes I'm ready", Toast.LENGTH_SHORT).show();	
		Intent challengePage = new Intent(this, ChooseChallenge.class);
		Log.v("Main Activity", "Navigating to choose challenge page");
		startActivity(challengePage);
		}
	
	public void onNoButtonClick(View view){
		Toast.makeText(getApplicationContext(), 
				"No I'm not", Toast.LENGTH_SHORT).show();	
		Process.killProcess(Process.myPid()); 		
		}
}
