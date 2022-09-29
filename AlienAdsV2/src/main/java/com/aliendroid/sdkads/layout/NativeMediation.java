package com.aliendroid.sdkads.layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.aliendroid.alienads.R;
import com.smaato.sdk.nativead.NativeAdView;

public class NativeMediation implements NativeAdView {
    private final View binding;
    public NativeMediation(View binding) {
        this.binding = binding;
    }

    @Nullable
    @Override
    public TextView titleView() {
        return binding.findViewById(R.id.title);
    }

    @Nullable
    @Override
    public TextView textView() {
        return binding.findViewById(R.id.text);
    }

    @Nullable
    @Override
    public TextView sponsoredView() {
        // Return null if you don't have this kind of view
        return null;
    }

    @Nullable
    @Override
    public Button ctaView() {
        return binding.findViewById(R.id.cta);
    }

    @Nullable
    @Override
    public ImageView iconView() {
        return binding.findViewById(R.id.icon);
    }

    @Nullable
    @Override
    public View mediaView() {
        return null;
    }

    @Nullable
    @Override
    public View richMediaView() {
        return null;
    }


    @Nullable
    @Override
    public View videoView() {
        return null;
    }

    @Nullable
    @Override
    public RatingBar ratingView() {
        return binding.findViewById(R.id.rating);
    }

    @Nullable
    @Override
    public View privacyView() {
        return null;
    }

}