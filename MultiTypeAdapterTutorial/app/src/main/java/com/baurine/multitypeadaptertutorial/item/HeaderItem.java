package com.baurine.multitypeadaptertutorial.item;

import com.baurine.multitypeadaptertutorial.R;
import com.baurine.multitypeadaptertutorial.adapter.MultiTypeAdapter;

/**
 * Created by baurine on 1/14/17.
 */

public class HeaderItem implements MultiTypeAdapter.IItem {
    @Override
    public int getType() {
        return R.layout.item_header;
    }
}
