package com.example.himanishah.notify.Model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.himanishah.notify.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by himanishah on 8/12/17.
 */

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {

    private List<String> mNotes;
    private Context mContext;

    public static final String TAG = NoteAdapter.class.getSimpleName();

    public NoteAdapter(Context context) {
        mContext = context;
        mNotes = new ArrayList<String>();
    }
    public Context getContext(){
        return mContext;
    }

    public void updateData(String editTextInput) {
        mNotes.add(editTextInput);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.notes_content_row, parent, false);
        return new ViewHolder(v);
    }
    //Replace contents of a view(invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        final String notes = mNotes.get(position);
        holder.rowId.setText(notes.toString());
        Log.d("NoteAdapter", "Bind success!");

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView rowId;

        public ViewHolder(View v) {
            super(v);
            rowId = (TextView) v.findViewById(R.id.row_id);
        }
    }
}
