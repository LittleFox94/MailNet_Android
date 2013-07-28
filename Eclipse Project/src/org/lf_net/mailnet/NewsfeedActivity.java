package org.lf_net.mailnet;

import org.lf_net.mailnet.PostAdapter.Post;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class NewsfeedActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_newsfeed);
		
		PostAdapter adapter = new PostAdapter(this);
		((ListView)findViewById(R.id.listView1)).setAdapter(adapter);
		
		for(int i = 0; i < 100; i++)
			adapter.addItem(new Post("bla" + String.valueOf(i), "01-01-1970", "littefox@lf-net.org"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.newsfeed, menu);
		return true;
	}

}
