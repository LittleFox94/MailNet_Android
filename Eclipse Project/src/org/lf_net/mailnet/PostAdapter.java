package org.lf_net.mailnet;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class PostAdapter extends BaseAdapter {

	static public class Post {
		public String PostContent;
		public String PostTimestamp;
		public String PosterEMail;
		
		public Post(String content, String timestamp, String email) {
			PostContent = content;
			PostTimestamp = timestamp;
			PosterEMail = email;
		}
	}
	
	ArrayList<Post> _list = new ArrayList<Post>();
	
	Context _context;
	
	public PostAdapter(Context context) {
		_context = context;
	}
	
	public void addItem(Post post) {
		_list.add(post);
	}
	
	@Override
	public int getCount() {
		return _list.size();
	}

	@Override
	public Object getItem(int arg0) {
		return _list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return _list.get(arg0).hashCode();
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {	
		View row = arg1;
		PostHolder holder = null;
		
		if(row == null) {
						
			LayoutInflater inflater = ((Activity)_context).getLayoutInflater();
			row = inflater.inflate(R.layout.view_post, null);
		
			holder = new PostHolder();
			holder.contactBadge = (QuickContactBadge)row.findViewById(R.id.viewPostContactBadge);
			holder.contentLabel = (TextView)row.findViewById(R.id.viewPostLabelContent);
			holder.posterLabel = (TextView)row.findViewById(R.id.viewPostLabelAuthor);
			holder.timeStampLabel = (TextView)row.findViewById(R.id.viewPostLabelTimestamp);
			
			row.setTag(holder);
		}
		else
		{
			holder = (PostHolder)row.getTag();
		}
		
		Post post = _list.get(arg0);
		
		holder.contactBadge.assignContactFromEmail(post.PosterEMail, true);
		holder.contentLabel.setText(post.PostContent);
		holder.posterLabel.setText(post.PosterEMail);
		holder.timeStampLabel.setText(post.PostTimestamp);
		
		return row;
	}

	static class PostHolder {
		QuickContactBadge contactBadge;
		TextView timeStampLabel;
		TextView contentLabel;
		TextView posterLabel;
	}
	
}
