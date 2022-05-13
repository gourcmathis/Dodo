package com.example.dodo.adapter;


import android.widget.TextView;

import com.example.dodo.model.Task;

public interface OnTodoClickListener {
    void onTodoClick(Task task);
    void onTodoRadioButtonClick(Task task, TextView textView);
    void onTodoDeleteButtonClick(Task task);
}
