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
        String[] values = {"PGL CONTRO", "SPEEDIX", "GLOBAL TRACKER", "HELLIOS ADVANCED", "HELLIOS T", "RUPTELA FM TC04", "RUPTELA FM PRO4",
                "RUPTELA ECO4+", "RUPTELA ECO4 LIGHT", "TELTONIKA FMB 12O", "TELTONIKA FMB 920",};
        spinner = view.findViewById(R.id.devTypeSpinner);
        spinner.setPrompt("SELECT DEVICE TYPE");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),
                android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        //Code to populate Installation type spinner

        String[] v = {"NEW INSTALLATION", "TRANSFER", "RE-INSTALLATION"};
        spinner = view.findViewById(R.id.instTypeSpinner);
        ArrayAdapter<String> adpter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, v);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setPrompt("SELECT JOB TYPE");
        spinner.setAdapter(adpter);

        return view;


    }


}