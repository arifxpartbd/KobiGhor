package kobighor.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity {

    private JcPlayerView jcplayerView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        jcplayerView = (JcPlayerView) findViewById(R.id.jcplayerView);

        String title = getIntent().getExtras().get("title").toString();

        getSupportActionBar().setTitle(title);
        textView=findViewById(R.id.showkobitaId);
        textView.setText(getIntent().getExtras().get("des").toString());

        String url=getIntent().getExtras().get("url").toString();
        if (url.isEmpty()){
            jcplayerView.setVisibility(View.GONE);
        }else {
            jcplayerView.setVisibility(View.VISIBLE);
        }


        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL(title,url));
        jcAudios.add(JcAudio.createFromAssets("Asset audio", "audio.mp3"));

        jcplayerView.initPlaylist(jcAudios, null);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        jcplayerView.kill();
    }
}