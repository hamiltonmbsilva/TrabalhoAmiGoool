package amigoool.hamilton.com.amigoool.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import amigoool.hamilton.com.amigoool.R;
import amigoool.hamilton.com.amigoool.model.Time;

/**
 * Created by Hamilton on 12/04/2018.
 */

public class TimeAdapter extends BaseAdapter{

    private LayoutInflater layout;
    private final List<Time> times;

    public TimeAdapter(Context context, List<Time> times) {
        this.times = times;
        layout = LayoutInflater.from(context);
    }

    @Override
    public int getCount(){
        return times.size();
    }

    @Override
    public Object getItem(int position) {
        return times.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        TextView tvNome ;
        //ImageView img;
        ListView tvJogadores;

        View view = layout.inflate(R.layout.activity_times,parent,false);

        tvNome = view.findViewById(R.id.tv_NomeTimes);
        tvJogadores = view.findViewById(R.id.ListTimes);

        Time t = (Time) getItem(position);

        tvNome.setText(t.getNome());
        //tvJogadores.setAdapter(t.getJogadores(),t.setJogadores());

        return view;
    }

}
