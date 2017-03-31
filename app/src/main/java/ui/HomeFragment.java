package ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

import me.yokeyword.fragmentation.SupportFragment;
import me.yokeyword.fragmentation.anim.DefaultNoAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

/**
 * Created by Administrator on 2017/3/31.
 */

public class HomeFragment  extends SupportFragment {


    private Toolbar mToolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        initView(view);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        initData();

    }

    public void initData() {

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        mRecy.setAdapter(null);
    }

    /**
     * 类似于 Activity的 onNewIntent()
     */
    @Override
    protected void onNewBundle(Bundle args) {
        super.onNewBundle(args);

        Toast.makeText(_mActivity, args.getString("from"), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected FragmentAnimator onCreateFragmentAnimator() {
        // 默认不改变
//         return super.onCreateFragmentAnimation();
        // 在进入和离开时 设定无动画
        return new DefaultNoAnimator();
    }



    private void initView(View view) {



//        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
//        mToolbar.setTitle("历史上有哪些打脸的故事？");
//        _mActivity.setSupportActionBar(mToolbar);


    }



    public static HomeFragment newInstance() {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }







}
