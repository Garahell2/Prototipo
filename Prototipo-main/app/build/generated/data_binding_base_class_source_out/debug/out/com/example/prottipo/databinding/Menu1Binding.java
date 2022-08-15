// Generated by view binder compiler. Do not edit!
package com.example.prottipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class Menu1Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button backButton;

  @NonNull
  public final Button handtoolwrench;

  @NonNull
  public final Button pressuregauge;

  @NonNull
  public final Button pressurepump;

  @NonNull
  public final TextView textView;

  private Menu1Binding(@NonNull ConstraintLayout rootView, @NonNull Button backButton,
      @NonNull Button handtoolwrench, @NonNull Button pressuregauge, @NonNull Button pressurepump,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.handtoolwrench = handtoolwrench;
    this.pressuregauge = pressuregauge;
    this.pressurepump = pressurepump;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Menu1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Menu1Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.menu1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Menu1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      Button backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.handtoolwrench;
      Button handtoolwrench = ViewBindings.findChildViewById(rootView, id);
      if (handtoolwrench == null) {
        break missingId;
      }

      id = R.id.pressuregauge;
      Button pressuregauge = ViewBindings.findChildViewById(rootView, id);
      if (pressuregauge == null) {
        break missingId;
      }

      id = R.id.pressurepump;
      Button pressurepump = ViewBindings.findChildViewById(rootView, id);
      if (pressurepump == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new Menu1Binding((ConstraintLayout) rootView, backButton, handtoolwrench,
          pressuregauge, pressurepump, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}