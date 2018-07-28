package com.alex.car.Helper;

import android.content.Context;

import com.alex.car.Data.Item;

import java.util.ArrayList;
import java.util.List;

public class CarLab {

    private static CarLab sCarLab;

    private List<Item> mainModel;


    public  static CarLab get (Context context) {
        if (sCarLab == null) {
            sCarLab = new CarLab(context);
        }
        return sCarLab;
    }

    private CarLab(Context context) {
        mainModel = new ArrayList<>();
        Item mainitem = new Item();
        mainitem.setTotalMarka("MAZDAaa");
        mainitem.setTatalGod("2012");
        mainModel.add(mainitem);
    }

    public List<Item> getMainModels() {
        return mainModel;
    }
}
