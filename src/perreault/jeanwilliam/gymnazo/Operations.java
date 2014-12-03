package perreault.jeanwilliam.gymnazo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Operations {
	
	private DatabaseHelper databaseHelper;
	private SQLiteDatabase database;
	
	public Operations(Context c){
		databaseHelper = new DatabaseHelper(c);
	}
	
	
	
	public void ouvrirDB(){
		database = databaseHelper.getWritableDatabase();
	}
	
	public void fermerDB(){
		database.close();
	}
	
	
	
	
}
