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

    public PDFAdapter(@NonNull @org.jetbrains.annotations.NotNull Context context, int resource, Context context1, ViewHolder viewHolder, ArrayList<File> al_pdf) {
        super(context, resource);
        this.context = context1;
        this.viewHolder = viewHolder;
        this.al_pdf = al_pdf;
    }

    public PDFAdapter(@NonNull @org.jetbrains.annotations.NotNull Context context, int resource, int textViewResourceId, Context context1, ViewHolder viewHolder, ArrayList<File> al_pdf) {
        super(context, resource, textViewResourceId);
        this.context = context1;
        this.viewHolder = viewHolder;
        this.al_pdf = al_pdf;
    }

    public PDFAdapter(@NonNull @org.jetbrains.annotations.NotNull Context context, int resource, @NonNull @org.jetbrains.annotations.NotNull File[] objects, Context context1, ViewHolder viewHolder, ArrayList<File> al_pdf) {
        super(context, resource, objects);
        this.context = context1;
        this.viewHolder = viewHolder;
        this.al_pdf = al_pdf;
    }

    public PDFAdapter(@NonNull @org.jetbrains.annotations.NotNull Context context, int resource, int textViewResourceId, @NonNull @org.jetbrains.annotations.NotNull File[] objects, Context context1, ViewHolder viewHolder, ArrayList<File> al_pdf) {
        super(context, resource, textViewResourceId, objects);
        this.context = context1;
        this.viewHolder = viewHolder;
        this.al_pdf = al_pdf;
    }

    public PDFAdapter(@NonNull @org.jetbrains.annotations.NotNull Context context, int resource, @NonNull @org.jetbrains.annotations.NotNull List<File> objects, Context context1, ViewHolder viewHolder, ArrayList<File> al_pdf) {
        super(context, resource, objects);
        this.context = context1;
        this.viewHolder = viewHolder;
        this.al_pdf = al_pdf;
    }

    public PDFAdapter(@NonNull @org.jetbrains.annotations.NotNull Context context, int resource, int textViewResourceId, @NonNull @org.jetbrains.annotations.NotNull List<File> objects, Context context1, ViewHolder viewHolder, ArrayList<File> al_pdf) {
        super(context, resource, textViewResourceId, objects);
        this.context = context1;
        this.viewHolder = viewHolder;
        this.al_pdf = al_pdf;
    }

    public class ViewHolder {
        TextView tv_filename;

    }

}
