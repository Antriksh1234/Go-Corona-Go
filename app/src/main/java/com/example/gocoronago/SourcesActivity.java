package com.example.gocoronago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SourcesActivity extends AppCompatActivity {

    public void openYoutube(View view)
    {
        Uri video;
        // Build the intent
        if(Integer.parseInt(view.getTag().toString())==4)
        {
            video = Uri.parse("https://www.youtube.com/watch?v=TGxjE82HMjM");
        }
        else if(Integer.parseInt(view.getTag().toString())==1)
        {
            video = Uri.parse("https://www.youtube.com/watch?v=BtN-goy9VOY&amp;t=206s");
        }
        else if(Integer.parseInt(view.getTag().toString())==2)
        {
            video = Uri.parse("https://www.youtube.com/watch?v=xnkQUgamT_k");
        }
        else
        {
            video = Uri.parse("https://www.youtube.com/watch?v=jgGdQkXJENA");
        }
          Intent intent = new Intent(Intent.ACTION_VIEW, video);
        // Verify it resolves
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(intent, 0);
        boolean isIntentSafe = activities.size() > 0;

        // Start an activity if it's safe
        if (isIntentSafe) {
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"No app to open the video",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sources);
    }
}
