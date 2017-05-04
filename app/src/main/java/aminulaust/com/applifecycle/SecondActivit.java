package aminulaust.com.applifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivit extends CheckActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
