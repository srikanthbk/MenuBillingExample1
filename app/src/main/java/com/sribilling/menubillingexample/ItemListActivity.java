package com.sribilling.menubillingexample;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ItemListActivity extends AppCompatActivity {
    ListView listView;
    Context context;
    CustomItemList itemList;
    ArrayList<String> checkedValue;
    ArrayList<Product> products = new ArrayList<Product>();
    ListAdapter productListAdapter;
    String[] itemNames={"ITEM_1","ITEM_2","ITEM_3","ITEM_4","ITEM_5","ITEM_6","ITEM_7","ITEM_8","ITEM_9"};
    int[] itemRates={120, 150,160,225,400,282,650,700,950};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        overridePendingTransition(R.anim.enter, R.anim.exit);
        fillData();
        productListAdapter=new ListAdapter(this,products);
        declareAllIds();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
    void fillData() {
     //  products.add(new Product(itemNames, itemRates, false));
        for (int i = 1; i <= 20; i++) {
            products.add(new Product("Product " + i, i * 100, false));
        }
    }

    public void showResult(View v) {
        String result = "Selected Product are :";
        int totalAmount=0;
        for (Product p : productListAdapter.getBox()) {
            if (p.chkBox){
                result += "\n" + p.itemName;
                totalAmount+=p.itemPrice;
            }
        }
        Toast.makeText(this, result+"\n"+"Total Amount:="+totalAmount, Toast.LENGTH_LONG).show();
        testMadu();
    }
    private void declareAllIds(){
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(productListAdapter);
       // itemList=new CustomItemList(this,itemNames,itemRates);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

        //testing code
    private void testMadu(){
        int n=3;
        for(int i=1;i<=n;i++){
            System.out.println(new String(new char[i]).replace("\0",n+""));
        }
    }
        //testing code
}
