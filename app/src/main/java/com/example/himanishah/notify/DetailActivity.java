package com.example.himanishah.notify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class DetailActivity extends AppCompatActivity {

    EditText nameEdit;
    public int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        nameEdit = (EditText)findViewById(R.id.nameEdit);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        position = i.getIntExtra("position",0);
        nameEdit.setText(name);
    }
    public void editButtonClicked (View v){
        Intent intent = new Intent(this,MainActivity.class);
        Log.d("abc",nameEdit.getText().toString());
        Log.d("abcd",String.valueOf(position));
        intent.putExtra("editedname",nameEdit.getText().toString());
        intent.putExtra("position",position);
        intent.putExtra("check",1);
        startActivity(intent);
    }
}
