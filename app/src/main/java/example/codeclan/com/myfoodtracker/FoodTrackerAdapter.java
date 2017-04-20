package example.codeclan.com.myfoodtracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 20/04/2017.
 */

public class FoodTrackerAdapter extends ArrayAdapter<Food> {

    public FoodTrackerAdapter(Context context, ArrayList<Food> food){
        super(context, 0, food);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.food_items, parent, false);
        }

        Food currentFood = getItem(position);

        TextView day = (TextView) listItemView.findViewById(R.id.day);
        day.setText(currentFood.getDay().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.journal);
        title.setText(currentFood.getJournal());

        listItemView.setTag(currentFood);

        return listItemView;

    }
}