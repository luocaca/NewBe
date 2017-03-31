package base;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.administrator.myapplication.R;

import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

/**
 * Created by YoKeyword on 16/2/7.
 */
public class BaseBackFragment extends SwipeBackFragment {
    private static final String TAG = "Fragmentation";

    protected void initToolbarNav(Toolbar toolbar) {
        toolbar.setNavigationIcon(R.drawable.home_rich_scan);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _mActivity.onBackPressed();
            }
        });
    }
}
