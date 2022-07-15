package nik.nov.russianalphabetforkids;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdaptor_Test extends ArrayAdapter<AlphabetInformation> {
    public ListAdaptor_Test(@NonNull Context context, int resource, @NonNull ArrayList<AlphabetInformation> arr) {
        super(context, R.layout.testlist_layout, resource, arr);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        AlphabetInformation info= getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.testlist_layout, parent, false);
        ImageView imageView = convertView.findViewById(R.id.imageView4);
        imageView.setImageResource(info.getImageid());
        return convertView;
    }
}
