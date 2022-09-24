package com.pgl;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;

import java.util.Calendar;

public class NewJobFragment extends Fragment {

    Spinner spinner;
    DatePickerDialog datePickerDialog;
    Button dateButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Code to populate device type spinner
        View view = inflater.inflate(R.layout.fragment_new_job, container, false);
        String[] values = {"HELIOS-ADVANCED", "HELIOS-TT", "FMB-12O", "FMB-920", "FMB-640",
                "FMB-140", "FMB-125", "FMB-130", "TAT-100"};
        spinner = view.findViewById(R.id.devTypeSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),
                android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setPrompt("Select Device");
        spinner.setAdapter(adapter);

        //Code to populate Installation type spinner

        String[] v = {"NEW INSTALLATION", "TRANSFER", "RE-INSTALLATION"};
        spinner = view.findViewById(R.id.instTypeSpinner);
        ArrayAdapter<String> adpter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_dropdown_item_1line, v);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setPrompt("Select Job");
        spinner.setAdapter(adpter);
        //Code to populate Subscription spinner
        String[] subscriptionValues = {"FLEET", "FULL-ECTS", "ECTS-TIPPER", "FLEET-CANBUS", "FLEET-PROBE"};
        spinner = view.findViewById(R.id.subscriptionSpinner);
        ArrayAdapter<String> subscriptionAdapter = new ArrayAdapter<>
                (this.getActivity(), android.R.layout.simple_dropdown_item_1line, subscriptionValues);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(subscriptionAdapter);
        spinner.setPrompt("Select Subscription");
        return view;


    }


}