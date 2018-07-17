package com.sribilling.menubillingexample;

/**
 * Created by nurture-user on 02-02-2018.
 */

public class Product {

    String itemName;
    int itemPrice;
    boolean chkBox;

    Product(String _itemName, int _itemPrice, boolean _chkBox){
        itemName=_itemName;
        itemPrice=_itemPrice;
        chkBox=_chkBox;
    }
}
