// Generated by view binder compiler. Do not edit!
package com.example.prottipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prottipo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PhotoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button Foto;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Button prosseguir6;

  @NonNull
  public final TextView textView48;

  @NonNull
  public final TextView textView5;

  private PhotoBinding(@NonNull ConstraintLayout rootView, @NonNull Button Foto,
      @NonNull ImageView imageView, @NonNull Button prosseguir6, @NonNull TextView textView48,
      @NonNull TextView textView5) {
    this.rootView = rootView;
    this.Foto = Foto;
    this.imageView = imageView;
    this.prosseguir6 = prosseguir6;
    this.textView48 = textView48;
    this.textView5 = textView5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PhotoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PhotoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.photo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PhotoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Foto;
      Button Foto = ViewBindings.findChildViewById(rootView, id);
      if (Foto == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.prosseguir6;
      Button prosseguir6 = ViewBindings.findChildViewById(rootView, id);
      if (prosseguir6 == null) {
        break missingId;
      }

      id = R.id.textView48;
      TextView textView48 = ViewBindings.findChildViewById(rootView, id);
      if (textView48 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      return new PhotoBinding((ConstraintLayout) rootView, Foto, imageView, prosseguir6, textView48,
          textView5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
