package com.alex.car;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.alex.car.Data.Item;
import com.alex.car.Data.TehOsmotr;
import com.alex.car.adapter.AdapterTehOsmotr;
import com.github.aakira.expandablelayout.ExpandableLinearLayout;

import java.util.ArrayList;
import java.util.List;

public class InfoCar extends AppCompatActivity {

    ExpandableLinearLayout expanableTehnHarakt, expanableProbeg, expanableTehOsmotr;
    CardView btnOpenTehnHarakter, btnOpenProbeg, btnOpenTehOsmotr;

    RecyclerView recycleTehOsmotr;
    AdapterTehOsmotr mAdapterTehOsmotr;
    RecyclerView.LayoutManager tehOsmLM;
    List<Item> items;
    private List<TehOsmotr> mTehOsmotrList;
    Context context;
    Drawable overlayColorTehosmotr, wrap, overlayColor;
    ImageView ic_tehosmotr, is_speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!isConnected(InfoCar.this)) buildDialog(InfoCar.this).show();
        else {
            setContentView(R.layout.activity_info_car);

           // ic_tehosmotr = (ImageView) findViewById(R.id.ic_tehosmotr);

            overlayColorTehosmotr = getResources().getDrawable(R.drawable.ic_tehosmotr);
            wrap = DrawableCompat.wrap(overlayColorTehosmotr);
            DrawableCompat.setTint(wrap, getResources().getColor(R.color.colorAccent));
            overlayColor = getResources().getDrawable(R.drawable.ic_speed);
            wrap = DrawableCompat.wrap(overlayColor);
            DrawableCompat.setTint(wrap, getResources().getColor(R.color.colorAccent));


            expanableTehnHarakt = (ExpandableLinearLayout) findViewById(R.id.expanableTehnHarakt);
            expanableProbeg = (ExpandableLinearLayout) findViewById(R.id.expanableProbeg);
            expanableTehOsmotr = (ExpandableLinearLayout) findViewById(R.id.expanableTehOsmotr);

            btnOpenTehnHarakter = (CardView) findViewById(R.id.btnOpenTehnHarakter);
            btnOpenProbeg = (CardView) findViewById(R.id.btnOpenProbeg);
            btnOpenTehOsmotr = (CardView) findViewById(R.id.btnOpenTehOsmotr);


            btnOpenTehnHarakter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    expanableTehnHarakt.toggle();
                }
            });

            btnOpenProbeg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    expanableProbeg.toggle();
                }
            });

            btnOpenTehOsmotr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    expanableTehOsmotr.toggle();
                }
            });

            setData();
        }
    }

    public boolean isConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting())) return true;
            else return false;
        } else
            return false;
    }
    public AlertDialog.Builder buildDialog(Context c) {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("Нет соединения с интернетом");
        builder.setMessage("Для этого вам нужны мобильные данные или Wi-Fi. Нажмите ok для выхода");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        return builder;
    }

    private void setData() {
        mTehOsmotrList = new ArrayList<>();
        mTehOsmotrList.add(new TehOsmotr("Диагностическая карта", "3994857484857484848",
                "5657474567574657", "T566473645464", "A7768595959",
                "21.05.12", "26.06.13"));

        mTehOsmotrList.add(new TehOsmotr("Диагностическая карта", "3994857484857484848",
                "5657474567574657", "T566473645464", "A7768595959",
                "21.05.12", "26.06.13"));

        recycleTehOsmotr = (RecyclerView)findViewById(R.id.recycleTehOsmotr);
        recycleTehOsmotr.setHasFixedSize(true);
        tehOsmLM = new LinearLayoutManager(this);
        recycleTehOsmotr.setLayoutManager(tehOsmLM);

        mAdapterTehOsmotr = new AdapterTehOsmotr(mTehOsmotrList, this);
        recycleTehOsmotr.setAdapter(mAdapterTehOsmotr);

        DividerItemDecoration dividerTehOsmotrItem = new DividerItemDecoration(recycleTehOsmotr.getContext(), LinearLayoutManager.VERTICAL);
        //Drawable drawable= ContextCompat.getDrawable(getContext(), R.drawable.divider);
        Drawable drawable = ContextCompat.getDrawable(getBaseContext(), R.drawable.divider);
        if(drawable!=null)
            dividerTehOsmotrItem.setDrawable(drawable);
        recycleTehOsmotr.addItemDecoration(dividerTehOsmotrItem);
    }

}