package com.example.a10122914uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.a10122914uts.Fragment.DailyFragment;
import com.example.a10122914uts.Fragment.GalleryFragment;
import com.example.a10122914uts.Fragment.HomeFragment;
import com.example.a10122914uts.Fragment.MusicFragment;
import com.example.a10122914uts.Fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private MeowBottomNavigation meowBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meowBottomNavigation = findViewById(R.id.meowBottom);

        meowBottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_timelapse_24));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_gallery_24));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_home_24));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.ic_music_video_24));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.ic_profile_24));

        meowBottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment = null;

                switch (item.getId()){
                    case 1 :
                        fragment = new DailyFragment();
                        break;
                    case 2 :
                        fragment = new GalleryFragment();
                        break;
                    case 3 :
                        fragment = new HomeFragment();
                        break;
                    case 4 :
                        fragment = new MusicFragment();
                        break;
                    case 5 :
                        fragment = new ProfileFragment();
                        break;
                }

                loadFragment(fragment);
            }
        });

        meowBottomNavigation.show(3, true);

        meowBottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(), "You Clicked " + item.getId(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();
    }
}