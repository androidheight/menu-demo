package com.example.user_adnig.menu_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnContext,popupmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btnContext =(Button)findViewById(R.id.btnContext);
        popupmenu =(Button)findViewById(R.id.btnPopup);
        popupmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        registerForContextMenu(btnContext);
    }

    /* context menu*/

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.rename:
              // implement your code
                Toast.makeText(getApplicationContext(),"Setting clicked",Toast.LENGTH_LONG).show();
                return true;
            case R.id.change_background:
                // implement your code
                Toast.makeText(getApplicationContext(),"change background",Toast.LENGTH_LONG).show();
                return true;
            case R.id.setting:
                // implement your code
                Toast.makeText(getApplicationContext(),"Setting clicked",Toast.LENGTH_LONG).show();
                return true;
            case R.id.account:
                // implement your code
                Toast.makeText(getApplicationContext(),"Account clicked",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
    /* option Menu*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch(id){
            case R.id.search:
                // implement your code
                Toast.makeText(getApplicationContext(),"Search clicked",Toast.LENGTH_LONG).show();

                break;
            case R.id.profile:
                // implement your code
                Toast.makeText(getApplicationContext(),"Profile clicked",Toast.LENGTH_LONG).show();

                break;
            case R.id.setting:
                // implement your code
                Toast.makeText(getApplicationContext(),"Setting clicked",Toast.LENGTH_LONG).show();

                break;
            case R.id.account:
                // implement your code
                Toast.makeText(getApplicationContext(),"Account clicked",Toast.LENGTH_LONG).show();

                break;

            }

        return super.onOptionsItemSelected(item);
    }

    /*popup menu*/

    private void showPopupMenu(View v){
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, v);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.delete:

                        //implement your code
                        Toast.makeText(MainActivity.this,"delete clicked",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.action:
                        //implement your code
                        Toast.makeText(MainActivity.this,"action clicked",Toast.LENGTH_LONG).show();
                       break;

                    case R.id.save:
                        //implement your code
                        Toast.makeText(MainActivity.this,"save clicked",Toast.LENGTH_LONG).show();
                        break;
                    default:
                        break;
                };
                return true;
            }
        });

        popupMenu.show();
    }
}
