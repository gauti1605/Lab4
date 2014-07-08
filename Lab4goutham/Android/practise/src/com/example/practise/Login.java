package com.example.practise;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class Login extends Activity {

	TextView tv;
	EditText username,password; 
	Button create,insert,reterive,delete;
	String user,pass;
	public final static String EXTRA_MESSAGE ="com.example.practise.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.editText1);
	//	password = (EditText) findViewById(R.id.editText2);
		create = (Button)findViewById(R.id.button1);
		insert = (Button)findViewById(R.id.button2);
		reterive =(Button)findViewById(R.id.button3);
		delete =(Button)findViewById(R.id.button4);
		
		create.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				user = username.getText().toString();
		

				//System.out.println("the values of the login are "+user+" "+pass);
				String url = "http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbaseCreate/testTable1990/GeoLocation:Date:Accelerometer";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
				
			//	String serverUrl ="http://google.com";
				// new LongOperation().execute(serverUrl);
			
		
		
			}
			
			
		});
		
		insert.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				user = username.getText().toString();
			
				String url = "http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbaseRetrieveAll/testTable1990";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			
		
				
			}
			
			
		});
		
		reterive.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				user = username.getText().toString();
			

				
				String url = "http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbaseRetrieveAll/testTable1990";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			
		
				
			}
			
			
		});	
		
		delete.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				user = username.getText().toString();
			

				
				String url = "http://134.193.136.127:8080/HbaseWS/jaxrs/generic/hbasedeletel/testTabje1990";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			
		
				
			}
			
			
		});	
        
    }
    
    
    
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
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

    /**
     * A placeholder fragment containing a simple view.
     */
  

}
