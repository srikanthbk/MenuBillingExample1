package com.sribilling.menubillingexample;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by srikanth bk nurture-user on 30-01-2018.
 */

public class CustomItemList extends ArrayAdapter{
    private String[] itemName;
    public int[] itemRate;
    private Activity context;
    TextView textViewItemRate;
    CheckBox itemCheck;

    public CustomItemList(Activity context,String[] itemName,int[] itemRate){
        super(context,R.layout.custom_list_items,itemName);
        this.context=context;
        this.itemName=itemName;
        this.itemRate=itemRate;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem =inflater.inflate(R.layout.custom_list_items,null,true);
        TextView textViewItemName=(TextView)listViewItem.findViewById(R.id.textViewItemName);
        textViewItemRate=(TextView)listViewItem.findViewById(R.id.textViewRate);
        textViewItemName.setText(itemName[position]);
        textViewItemRate.setText(itemRate[position]);
        itemCheck= listViewItem.findViewById(R.id.chkBxRate);
        if(itemCheck.isChecked()){
            System.out.println("yes i have checked this"+itemRate[position]);
            Toast.makeText(context,"Yes u have clicked",Toast.LENGTH_LONG).show();
        }
        itemCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(itemCheck.isChecked()){
                    itemCheck.setChecked(true);
                }else{
                    itemCheck.setChecked(false);
                }
            }
        });
        itemCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b==true){
                    System.out.println("yes i have checked this");
                    }

            }
        });
        return listViewItem;
    }
}
