package com.example.test_telros.ui.link;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.test_telros.MainActivity;
import com.example.test_telros.R;
import com.example.test_telros.databinding.FragmentPlayerBinding;
import com.example.test_telros.databinding.FragmentVideoLinkBinding;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

public class VideoLinkFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmentVideoLinkBinding binding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_video_link,
                container,
                false
        );


       binding.play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String linkVideo = binding.textLink.getText().toString();
                if (linkVideo != ""){
                    Navigation.findNavController(view).navigate(
                            VideoLinkFragmentDirections.fragmentVideoLinkToFragmentPlayer().setLinkVideo(linkVideo)
                    );
                }
            }
        });

        return binding.getRoot();
    }

}
