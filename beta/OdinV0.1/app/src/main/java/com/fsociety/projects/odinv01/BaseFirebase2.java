package com.fsociety.projects.odinv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

import java.util.ArrayList;

public class BaseFirebase2 extends AppCompatActivity {

    Firebase objetoRef;
    ListView listaNomes;
    ArrayList<String> listaDeNomes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_firebase2);

        Firebase.setAndroidContext(this);

        listaNomes = (ListView)findViewById(R.id.listView2);

        objetoRef = new Firebase("https://odinv01-25c80.firebaseio.com/");

        Firebase novaRef = objetoRef.child("lista-femininos");

        final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaDeNomes);
        listaNomes.setAdapter(adaptador);

        novaRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String message = dataSnapshot.getValue(String.class);
                listaDeNomes.add(message);
                adaptador.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }
}
