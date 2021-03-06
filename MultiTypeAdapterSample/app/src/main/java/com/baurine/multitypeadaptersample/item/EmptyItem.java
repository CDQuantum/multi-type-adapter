package com.baurine.multitypeadaptersample.item;

import com.baurine.multitypeadaptersample.R;

/**
 * Created by baurine on 1/10/17.
 */

public class EmptyItem extends BaseItem {
    @Override
    public int getLayout() {
        return R.layout.item_empty;
    }

    /////////////////////////////////////////////////
    public EmptyItem() {
        content = "Currently has no items, please refresh it later!";
    }

    /////////////////////////////////////////////////
    // data part
    private String content;

    public String getContent() {
        return content;
    }
}
