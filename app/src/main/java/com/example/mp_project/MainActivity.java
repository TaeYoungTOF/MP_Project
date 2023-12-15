package com.example.mp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int REQUEST_CODE_INFO = 101;

    public String champion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn1 = findViewById(R.id.imageButton1);
        btn1.setOnClickListener(this);
        ImageButton btn2 = findViewById(R.id.imageButton2);
        btn2.setOnClickListener(this);
        ImageButton btn3 = findViewById(R.id.imageButton3);
        btn3.setOnClickListener(this);
        ImageButton btn4 = findViewById(R.id.imageButton4);
        btn4.setOnClickListener(this);
        ImageButton btn5 = findViewById(R.id.imageButton5);
        btn5.setOnClickListener(this);
        ImageButton btn6 = findViewById(R.id.imageButton6);
        btn6.setOnClickListener(this);
        ImageButton btn7 = findViewById(R.id.imageButton7);
        btn7.setOnClickListener(this);
        ImageButton btn8 = findViewById(R.id.imageButton8);
        btn8.setOnClickListener(this);
        ImageButton btn9 = findViewById(R.id.imageButton9);
        btn9.setOnClickListener(this);
        ImageButton btn10 = findViewById(R.id.imageButton10);
        btn10.setOnClickListener(this);
        ImageButton btn11 = findViewById(R.id.imageButton11);
        btn11.setOnClickListener(this);
        ImageButton btn12 = findViewById(R.id.imageButton12);
        btn12.setOnClickListener(this);
        ImageButton btn13 = findViewById(R.id.imageButton13);
        btn13.setOnClickListener(this);
        ImageButton btn14 = findViewById(R.id.imageButton14);
        btn14.setOnClickListener(this);
        ImageButton btn15 = findViewById(R.id.imageButton15);
        btn15.setOnClickListener(this);
        ImageButton btn16 = findViewById(R.id.imageButton16);
        btn16.setOnClickListener(this);
        ImageButton btn17 = findViewById(R.id.imageButton17);
        btn17.setOnClickListener(this);
        ImageButton btn18 = findViewById(R.id.imageButton18);
        btn18.setOnClickListener(this);
        ImageButton btn19 = findViewById(R.id.imageButton19);
        btn19.setOnClickListener(this);
        ImageButton btn20 = findViewById(R.id.imageButton20);
        btn20.setOnClickListener(this);
        ImageButton btn21 = findViewById(R.id.imageButton21);
        btn21.setOnClickListener(this);
        ImageButton btn22 = findViewById(R.id.imageButton22);
        btn22.setOnClickListener(this);
        ImageButton btn23 = findViewById(R.id.imageButton23);
        btn23.setOnClickListener(this);
        ImageButton btn24 = findViewById(R.id.imageButton24);
        btn24.setOnClickListener(this);
        ImageButton btn25 = findViewById(R.id.imageButton25);
        btn25.setOnClickListener(this);
        ImageButton btn26 = findViewById(R.id.imageButton26);
        btn26.setOnClickListener(this);
        ImageButton btn27 = findViewById(R.id.imageButton27);
        btn27.setOnClickListener(this);
        ImageButton btn28 = findViewById(R.id.imageButton28);
        btn28.setOnClickListener(this);
        ImageButton btn29 = findViewById(R.id.imageButton29);
        btn29.setOnClickListener(this);
        ImageButton btn30 = findViewById(R.id.imageButton30);
        btn30.setOnClickListener(this);
        ImageButton btn31 = findViewById(R.id.imageButton31);
        btn31.setOnClickListener(this);
        ImageButton btn32 = findViewById(R.id.imageButton32);
        btn32.setOnClickListener(this);
        ImageButton btn33 = findViewById(R.id.imageButton33);
        btn33.setOnClickListener(this);
        ImageButton btn34 = findViewById(R.id.imageButton34);
        btn34.setOnClickListener(this);
        ImageButton btn35 = findViewById(R.id.imageButton35);
        btn35.setOnClickListener(this);
        ImageButton btn36 = findViewById(R.id.imageButton36);
        btn36.setOnClickListener(this);
        ImageButton btn37 = findViewById(R.id.imageButton37);
        btn37.setOnClickListener(this);
        ImageButton btn38 = findViewById(R.id.imageButton38);
        btn38.setOnClickListener(this);
        ImageButton btn39 = findViewById(R.id.imageButton39);
        btn39.setOnClickListener(this);
        ImageButton btn40 = findViewById(R.id.imageButton40);
        btn40.setOnClickListener(this);
        ImageButton btn41 = findViewById(R.id.imageButton41);
        btn41.setOnClickListener(this);
        ImageButton btn42 = findViewById(R.id.imageButton42);
        btn42.setOnClickListener(this);
        ImageButton btn43 = findViewById(R.id.imageButton43);
        btn43.setOnClickListener(this);
        ImageButton btn44 = findViewById(R.id.imageButton44);
        btn44.setOnClickListener(this);
        ImageButton btn45 = findViewById(R.id.imageButton45);
        btn45.setOnClickListener(this);
        ImageButton btn46 = findViewById(R.id.imageButton46);
        btn46.setOnClickListener(this);
        ImageButton btn47 = findViewById(R.id.imageButton47);
        btn47.setOnClickListener(this);
        ImageButton btn48 = findViewById(R.id.imageButton48);
        btn48.setOnClickListener(this);
        ImageButton btn49 = findViewById(R.id.imageButton49);
        btn49.setOnClickListener(this);
        ImageButton btn50 = findViewById(R.id.imageButton50);
        btn50.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.imageButton1) {
            champion = "Garen";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton2) {
            champion = "Galio";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton3) {
            champion = "GangPlank";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton4) {
            champion = "Gragas";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton5) {
            champion = "Graves";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton6) {
            champion = "Gwen";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton7) {
            champion = "Gnar";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton8) {
            champion = "Nami";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton9) {
            champion = "Nasus";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton10) {
            champion = "Naafiri";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton11) {
            champion = "Nautilus";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        }  else if (id == R.id.imageButton12) {
            champion = "Nocturne";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton13) {
            champion = "Nunu";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton14) {
            champion = "Nidalee";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton15) {
            champion = "Neeko";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton16) {
            champion = "Nilah";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton17) {
            champion = "Darius";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton18) {
            champion = "Diana";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton19) {
            champion = "Draven";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton20) {
            champion = "Ryze";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton21) {
            champion = "Rakan";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        }  else if (id == R.id.imageButton22) {
            champion = "Rammus";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton23) {
            champion = "Lux";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton24) {
            champion = "Rumble";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton25) {
            champion = "Renata";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton26) {
            champion = "Renekton";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton27) {
            champion = "Leona";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton28) {
            champion = "RekSai";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton29) {
            champion = "Rell";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton30) {
            champion = "Rengar";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton31) {
            champion = "Lucian";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        }  else if (id == R.id.imageButton32) {
            champion = "Lulu";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton33) {
            champion = "Leblanc";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton34) {
            champion = "LeeSin";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton35) {
            champion = "Riven";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton36) {
            champion = "Lissandra";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton37) {
            champion = "Lillia";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton38) {
            champion = "MasterYi";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton39) {
            champion = "Maokai";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton40) {
            champion = "Malzahar";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton41) {
            champion = "Malphite";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        }  else if (id == R.id.imageButton42) {
            champion = "Mordekaiser";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton43) {
            champion = "Morgana";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton44) {
            champion = "DrMundo";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton45) {
            champion = "MissFortune";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton46) {
            champion = "Milio";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton47) {
            champion = "Bard";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton48) {
            champion = "Varus";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton49) {
            champion = "Vi";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        } else if (id == R.id.imageButton50) {
            champion = "Veigar";
            Intent intent  = new Intent(getApplicationContext(), infoActivity.class);
            intent.putExtra("champion", champion);
            startActivityForResult(intent, REQUEST_CODE_INFO);
        }
    }
}