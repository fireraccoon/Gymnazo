package perreault.jeanwilliam.gymnazo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity {

	Button btnCreateRoutine;
	Button btnLoadRoutine;
	Button btnPerformance;
	Button btnSettings;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.btnCreateRoutine = (Button) findViewById(R.id.main_btnCreateRoutine);
		this.btnLoadRoutine = (Button) findViewById(R.id.main_btnLoadRoutine);
		this.btnPerformance = (Button) findViewById(R.id.main_btnPerformances);
		this.btnSettings = (Button) findViewById(R.id.main_btnSettings);
		
		
	}



}
