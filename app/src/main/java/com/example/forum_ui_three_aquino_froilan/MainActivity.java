package com.example.forum_ui_three_aquino_froilan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intentObject = new Intent();
        final EditText LAST_NAME = findViewById(R.id.lastName);
        final EditText FIRST_NAME = findViewById(R.id.firstName);
        final EditText MIDDLE_INITIAL = findViewById(R.id.middleInitial);
        final EditText CONTACT_NUMBER = findViewById(R.id.contactNumber);
        final EditText STREET = findViewById(R.id.street);
        final EditText LOT_NUMBER = findViewById(R.id.lotNumber);
        final EditText HOUSE_NUMBER = findViewById(R.id.houseNumber);
        final EditText APARTMENT_NAME = findViewById(R.id.apartmentName);
        final EditText BARANGAY = findViewById(R.id.barangay);
        final EditText CITY_MUNICIPALITY = findViewById(R.id.cityMunicipality);
        final EditText BLOCK_NUMBER = findViewById(R.id.blockNumber);
        final EditText PROVINCE_STATE = findViewById(R.id.provinceState);
        final EditText EMAIL = findViewById(R.id.email);
        final RadioGroup GENDER_GROUP = findViewById(R.id.genderGroup);
        final Spinner DIALECT_KNOWN = findViewById(R.id.dialectKnown);
        final Button SET_TIME = findViewById(R.id.setTime);
        final Button SUBMIT = findViewById(R.id.submit);
    }
}