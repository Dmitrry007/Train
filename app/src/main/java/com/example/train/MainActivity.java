package com.example.train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText id;
    private EditText price;
    private EditText placeStartTrain;
    private EditText placeEndTrain;
    private EditText timeStartTrain;
    private EditText timeEndTrain;
    private Button button;

    private String idUser;
    private String priceUser;
    private String placeStartTrainUser;
    private String placeEndTrainUser;
    private String timeStartTrainUser;
    private String timeEndTrainUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id = findViewById(R.id.Id);
        price = findViewById(R.id.Price);
        placeStartTrain = findViewById(R.id.PlaceStartTrain);
        placeEndTrain = findViewById(R.id.PlaceEndTrain);
        timeStartTrain = findViewById(R.id.TimeStartTrain);
        timeEndTrain = findViewById(R.id.TimeEndTrain);
        button = findViewById(R.id.button);

        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idUser = id.getText().toString();
            priceUser = price.getText().toString();
            placeStartTrainUser = placeStartTrain.getText().toString();
            placeEndTrainUser = placeEndTrain.getText().toString();
            timeStartTrainUser = timeStartTrain.getText().toString();
            timeEndTrainUser = timeEndTrain.getText().toString();
            Ticket ticket = new Ticket(idUser, priceUser, placeStartTrainUser, placeEndTrainUser, timeStartTrainUser, timeEndTrainUser);

            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra(Ticket.class.getSimpleName(), ticket);
            startActivity(intent);



        }
    };
    }
