// Generated by view binder compiler. Do not edit!
package com.example.prottipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class Cadastro2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button9;

  @NonNull
  public final EditText editTextTextPersonName2;

  @NonNull
  public final EditText editTextTextPersonName4;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView28;

  @NonNull
  public final TextView textView29;

  private Cadastro2Binding(@NonNull ConstraintLayout rootView, @NonNull Button button9,
      @NonNull EditText editTextTextPersonName2, @NonNull EditText editTextTextPersonName4,
      @NonNull TextView textView2, @NonNull TextView textView28, @NonNull TextView textView29) {
    this.rootView = rootView;
    this.button9 = button9;
    this.editTextTextPersonName2 = editTextTextPersonName2;
    this.editTextTextPersonName4 = editTextTextPersonName4;
    this.textView2 = textView2;
    this.textView28 = textView28;
    this.textView29 = textView29;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Cadastro2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Cadastro2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cadastro2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Cadastro2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button9;
      Button button9 = ViewBindings.findChildViewById(rootView, id);
      if (button9 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName2;
      EditText editTextTextPersonName2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName2 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName4;
      EditText editTextTextPersonName4 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName4 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView28;
      TextView textView28 = ViewBindings.findChildViewById(rootView, id);
      if (textView28 == null) {
        break missingId;
      }

      id = R.id.textView29;
      TextView textView29 = ViewBindings.findChildViewById(rootView, id);
      if (textView29 == null) {
        break missingId;
      }

      return new Cadastro2Binding((ConstraintLayout) rootView, button9, editTextTextPersonName2,
          editTextTextPersonName4, textView2, textView28, textView29);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
