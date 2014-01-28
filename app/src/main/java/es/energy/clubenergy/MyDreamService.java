package es.energy.clubenergy;

import android.graphics.Color;
import android.service.dreams.DreamService;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by AGE on 28/01/14.
 */
public class MyDreamService extends DreamService{

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setContentView(R.layout.dream);
        // Allow user touch
        setInteractive(false);
        // Hide system UI
        setFullscreen(true);

    }
}
