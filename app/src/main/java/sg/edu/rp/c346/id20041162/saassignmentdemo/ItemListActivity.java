package sg.edu.rp.c346.id20041162.saassignmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class ItemListActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText name;
    Button btnAdd, btnShow, btnUpdate, btnCancel;
    ListView lvItem;
    DatePicker dp;
    Spinner spinnerFilter;

    int indexPos = 0;
    boolean editing = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        name = findViewById(R.id.name);
        btnAdd = findViewById(R.id.btnAdd);
        btnShow = findViewById(R.id.btnShow);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnCancel = findViewById(R.id.btnCancel);
        lvItem = findViewById(R.id.lvItem);
        dp = findViewById(R.id.datePicker);
        spinnerFilter = findViewById(R.id.spinnerFilter);

        ArrayAdapter<CharSequence> adapterFilter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
        adapterFilter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFilter.setAdapter(adapterFilter);
        spinnerFilter.setOnItemSelectedListener(this);

        //List view adapter, warrantyList array



        //making list view long click




        //Show inputs


        //Add input to object and array



        //Get position when on Long click.


        //Update input.



        //Cancel button to hide interface.


    }

    //List view long click options



    //List view long click function


    //Spinner function
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //Filter off

        //Filter on


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }



    //Show input method
    public void showInput(){
        name.setVisibility(View.VISIBLE);
        dp.setVisibility(View.VISIBLE);
        btnCancel.setVisibility(View.VISIBLE);
        btnShow.setVisibility(View.GONE);
    }

    //hide input method
    public void hideInput(){
        name.setVisibility(View.GONE);
        dp.setVisibility(View.GONE);
        btnAdd.setVisibility(View.GONE);
        btnUpdate.setVisibility(View.GONE);
        btnCancel.setVisibility(View.GONE);
        btnShow.setVisibility(View.VISIBLE);
    }
}