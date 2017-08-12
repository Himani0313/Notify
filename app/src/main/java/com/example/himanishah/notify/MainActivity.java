package com.example.himanishah.notify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import com.example.himanishah.notify.Model.NoteAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private NoteAdapter mAdapter;
    private EditText input;
    private String editTextInputString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.notesRecyclerView);
        input = (EditText)findViewById(R.id.nameField);

        mRecyclerView.setHasFixedSize(false);
        mLinearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mAdapter = new NoteAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
    }
    public void addButtonClicked (View v){
        editTextInputString = input.getText().toString();
        mAdapter.updateData(editTextInputString);
    }
}
