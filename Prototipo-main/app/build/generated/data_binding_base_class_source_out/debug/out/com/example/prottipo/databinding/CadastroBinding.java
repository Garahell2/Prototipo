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

public final class CadastroBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button8;

  @NonNull
  public final EditText editTextDate;

  @NonNull
  public final EditText editTextDate2;

  @NonNull
  public final EditText editTextTextPersonName2;

  @NonNull
  public final EditText editTextTextPersonName4;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView24;

  @NonNull
  public final TextView textView25;

  @NonNull
  public final TextView textView26;

  @NonNull
  public final TextView textView27;

  private CadastroBinding(@NonNull ConstraintLayout rootView, @NonNull Button button8,
      @NonNull EditText editTextDate, @NonNull EditText editTextDate2,
      @NonNull EditText editTextTextPersonName2, @NonNull EditText editTextTextPersonName4,
      @NonNull TextView textView2, @NonNull TextView textView24, @NonNull TextView textView25,
      @NonNull TextView textView26, @NonNull TextView textView27) {
    this.rootView = rootView;
    this.button8 = button8;
    this.editTextDate = editTextDate;
    this.editTextDate2 = editTextDate2;
    this.editTextTextPersonName2 = editTextTextPersonName2;
    this.editTextTextPersonName4 = editTextTextPersonName4;
    this.textView2 = textView2;
    this.textView24 = textView24;
    this.textView25 = textView25;
    this.textView26 = textView26;
    this.textView27 = textView27;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CadastroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CadastroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cadastro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CadastroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button8;
      Button button8 = ViewBindings.findChildViewById(rootView, id);
      if (button8 == null) {
        break missingId;
      }

      id = R.id.editTextDate;
      EditText editTextDate = ViewBindings.findChildViewById(rootView, id);
      if (editTextDate == null) {
        break missingId;
      }

      id = R.id.editTextDate2;
      EditText editTextDate2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextDate2 == null) {
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

      id = R.id.textView24;
      TextView textView24 = ViewBindings.findChildViewById(rootView, id);
      if (textView24 == null) {
        break missingId;
      }

      id = R.id.textView25;
      TextView textView25 = ViewBindings.findChildViewById(rootView, id);
      if (textView25 == null) {
        break missingId;
      }

      id = R.id.textView26;
      TextView textView26 = ViewBindings.findChildViewById(rootView, id);
      if (textView26 == null) {
        break missingId;
      }

      id = R.id.textView27;
      TextView textView27 = ViewBindings.findChildViewById(rootView, id);
      if (textView27 == null) {
        break missingId;
      }

      return new CadastroBinding((ConstraintLayout) rootView, button8, editTextDate, editTextDate2,
          editTextTextPersonName2, editTextTextPersonName4, textView2, textView24, textView25,
          textView26, textView27);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
