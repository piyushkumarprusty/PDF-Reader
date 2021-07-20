package com.example.android.pdfreader;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PDFAdapter extends ArrayAdapter<File> {

    Context context;
    ViewHolder viewHolder;
    ArrayList<File> al_pdf;

    public PDFAdapter( Context context,  ViewHolder viewHolder, ArrayList<File> al_pdf) {
        super(context, resource);
        this.viewHolder = viewHolder;
        this.al_pdf = al_pdf;
    }


    public class ViewHolder {
        TextView tv_filename;

    }

}
