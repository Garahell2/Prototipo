// Generated by view binder compiler. Do not edit!
package com.example.prottipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.prottipo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CadastroclienteBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final EditText editTextNumber;

  @NonNull
  public final EditText editTextNumber2;

  @NonNull
  public final EditText editTextPhone;

  @NonNull
  public final EditText editTextTextEmailAddress2;

  @NonNull
  public final EditText editTextTextPersonName;

  @NonNull
  public final EditText editTextTextPersonName2;

  @NonNull
  public final EditText editTextTextPersonName3;

  @NonNull
  public final EditText editTextTextPersonName4;

  @NonNull
  public final Button prosseguir2;

  @NonNull
  public final Spinner spinner2;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  private CadastroclienteBinding(@NonNull ScrollView rootView, @NonNull EditText editTextNumber,
      @NonNull EditText editTextNumber2, @NonNull EditText editTextPhone,
      @NonNull EditText editTextTextEmailAddress2, @NonNull EditText editTextTextPersonName,
      @NonNull EditText editTextTextPersonName2, @NonNull EditText editTextTextPersonName3,
      @NonNull EditText editTextTextPersonName4, @NonNull Button prosseguir2,
      @NonNull Spinner spinner2, @NonNull TextView textView10, @NonNull TextView textView11,
      @NonNull TextView textView12, @NonNull TextView textView16, @NonNull TextView textView2,
      @NonNull TextView textView4, @NonNull TextView textView6, @NonNull TextView textView8,
      @NonNull TextView textView9) {
    this.rootView = rootView;
    this.editTextNumber = editTextNumber;
    this.editTextNumber2 = editTextNumber2;
    this.editTextPhone = editTextPhone;
    this.editTextTextEmailAddress2 = editTextTextEmailAddress2;
    this.editTextTextPersonName = editTextTextPersonName;
    this.editTextTextPersonName2 = editTextTextPersonName2;
    this.editTextTextPersonName3 = editTextTextPersonName3;
    this.editTextTextPersonName4 = editTextTextPersonName4;
    this.prosseguir2 = prosseguir2;
    this.spinner2 = spinner2;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView16 = textView16;
    this.textView2 = textView2;
    this.textView4 = textView4;
    this.textView6 = textView6;
    this.textView8 = textView8;
    this.textView9 = textView9;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static CadastroclienteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CadastroclienteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cadastrocliente, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CadastroclienteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editTextNumber;
      EditText editTextNumber = ViewBindings.findChildViewById(rootView, id);
      if (editTextNumber == null) {
        break missingId;
      }

      id = R.id.editTextNumber2;
      EditText editTextNumber2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextNumber2 == null) {
        break missingId;
      }

      id = R.id.editTextPhone;
      EditText editTextPhone = ViewBindings.findChildViewById(rootView, id);
      if (editTextPhone == null) {
        break missingId;
      }

      id = R.id.editTextTextEmailAddress2;
      EditText editTextTextEmailAddress2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextEmailAddress2 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName;
      EditText editTextTextPersonName = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName2;
      EditText editTextTextPersonName2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName2 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName3;
      EditText editTextTextPersonName3 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName3 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName4;
      EditText editTextTextPersonName4 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName4 == null) {
        break missingId;
      }

      id = R.id.prosseguir2;
      Button prosseguir2 = ViewBindings.findChildViewById(rootView, id);
      if (prosseguir2 == null) {
        break missingId;
      }

      id = R.id.spinner2;
      Spinner spinner2 = ViewBindings.findChildViewById(rootView, id);
      if (spinner2 == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView16;
      TextView textView16 = ViewBindings.findChildViewById(rootView, id);
      if (textView16 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      return new CadastroclienteBinding((ScrollView) rootView, editTextNumber, editTextNumber2,
          editTextPhone, editTextTextEmailAddress2, editTextTextPersonName, editTextTextPersonName2,
          editTextTextPersonName3, editTextTextPersonName4, prosseguir2, spinner2, textView10,
          textView11, textView12, textView16, textView2, textView4, textView6, textView8,
          textView9);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
