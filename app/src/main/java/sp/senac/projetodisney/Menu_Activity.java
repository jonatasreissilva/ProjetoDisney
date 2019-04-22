package sp.senac.projetodisney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
    }

    public void Cinderela(View view) {
        Intent intent = new Intent(Menu_Activity.this, Disney_Activity.class);
        startActivity(intent);
    }

    public void Jasmine(View view) {
        Intent intent = new Intent(Menu_Activity.this, Jasmine_Activity.class);
        startActivity(intent);
    }

    public void Bela(View view) {
        Intent intent = new Intent(Menu_Activity.this, Bela_Activity.class);
        startActivity(intent);
    }

    public void Neve(View view) {
        Intent intent = new Intent(Menu_Activity.this, Neve_Activity.class);
        startActivity(intent);
    }

    public void Ariel(View view) {
        Intent intent = new Intent(Menu_Activity.this, Ariel_Activity.class);
        startActivity(intent);
    }

    public void Adormecida(View view) {
        Intent intent = new Intent(Menu_Activity.this, Adormecida_Activity.class);
        startActivity(intent);
    }

    public void Elza(View view) {
        Intent intent = new Intent(Menu_Activity.this, Elza_Activity.class);
        startActivity(intent);
    }

    public void Merida(View view) {
        Intent intent = new Intent(Menu_Activity.this, Merida_Activity.class);
        startActivity(intent);
    }

    public void Mulan(View view) {
        Intent intent = new Intent(Menu_Activity.this, Mulan_Activity.class);
        startActivity(intent);
    }

    public void Sofia(View view) {
        Intent intent = new Intent(Menu_Activity.this, Sofia_Activity.class);
        startActivity(intent);
    }
}