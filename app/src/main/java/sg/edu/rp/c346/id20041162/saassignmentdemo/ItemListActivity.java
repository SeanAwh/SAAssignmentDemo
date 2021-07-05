package sg.edu.rp.c346.id20041162.saassignmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class ItemListActivity extends AppCompatActivity {

    EditText name;
    Button btnAdd, btnShow, btnUpdate, btnCancel;
    ListView lvItem;
    DatePicker dp;
    Spinner spinnerFilter;

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