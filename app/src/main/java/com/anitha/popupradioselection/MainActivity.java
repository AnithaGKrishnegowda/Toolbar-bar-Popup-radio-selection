package com.anitha.popupradioselection;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    AlertDialog alertDialog1;
 //   CharSequence[] values = {" First Item "," Second Item "," Third Item "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuAbout:


               /* AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                builder.setTitle("Select Your Choice");

                builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int item) {

                        switch(item)
                        {
                            case 0:

                                Toast.makeText(MainActivity.this, "First Item Clicked", Toast.LENGTH_LONG).show();
                                break;
                            case 1:

                                Toast.makeText(MainActivity.this, "Second Item Clicked", Toast.LENGTH_LONG).show();
                                break;
                            case 2:

                                Toast.makeText(MainActivity.this, "Third Item Clicked", Toast.LENGTH_LONG).show();
                                break;
                        }
                        alertDialog1.dismiss();
                    }
                });
                alertDialog1 = builder.create();
                alertDialog1.show();*/

                LayoutInflater li = LayoutInflater.from(context);


                final View promptsView = li.inflate(R.layout.radio_popup, null);


                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setView(promptsView);
                RadioButton one=promptsView.findViewById(R.id.one);
                RadioButton two=promptsView.findViewById(R.id.two);
                RadioButton three=promptsView.findViewById(R.id.three);
/*
if(one.isChecked()||two.isChecked()||three.isChecked()|| four.isChecked()){
    LayoutInflater lin = LayoutInflater.from(context);


    final View promptsView1 = lin.inflate(R.layout.input, null);


    AlertDialog.Builder alertDialogBuilder1 = new AlertDialog.Builder(context);
    alertDialogBuilder1.setView(promptsView1);

    EditText password=promptsView1.findViewById(R.id.edit_password);
    String password_value=password.getText().toString();

    final AlertDialog alertDialog = alertDialogBuilder1.create();


    alertDialog.show();
}*/

                one.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LayoutInflater li = LayoutInflater.from(context);


                        final View promptsView1 = li.inflate(R.layout.input, null);


                        AlertDialog.Builder alertDialogBuilder1 = new AlertDialog.Builder(context);
                        alertDialogBuilder1.setView(promptsView1);

                        EditText password=promptsView1.findViewById(R.id.edit_password);
                        String password_value=password.getText().toString();

                        final AlertDialog alertDialog = alertDialogBuilder1.create();


                        alertDialog.show();
                    }
                });
                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LayoutInflater li = LayoutInflater.from(context);


                        final View promptsView1 = li.inflate(R.layout.input, null);


                        AlertDialog.Builder alertDialogBuilder1 = new AlertDialog.Builder(context);
                        alertDialogBuilder1.setView(promptsView1);

                        EditText password=promptsView1.findViewById(R.id.edit_password);
                        String password_value=password.getText().toString();

                        final AlertDialog alertDialog = alertDialogBuilder1.create();


                        alertDialog.show();
                    }
                });
                three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LayoutInflater li = LayoutInflater.from(context);


                        final View promptsView1 = li.inflate(R.layout.input, null);


                        AlertDialog.Builder alertDialogBuilder1 = new AlertDialog.Builder(context);
                        alertDialogBuilder1.setView(promptsView1);

                        EditText password=promptsView1.findViewById(R.id.edit_password);
                        String password_value=password.getText().toString();

                        final AlertDialog alertDialog = alertDialogBuilder1.create();


                        alertDialog.show();
                    }
                });
                final AlertDialog alertDialog = alertDialogBuilder.create();


                alertDialog.show();



            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
