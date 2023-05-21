package com.example.train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
        private TextView dataMainActivity;
        private Button button;

        private Ticket ticket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        dataMainActivity = findViewById(R.id.dataTicket);
        button = findViewById(R.id.button2);
        Bundle bundleIntent = getIntent().getExtras();
        if (bundleIntent != null) {
            ticket = (Ticket) bundleIntent.getSerializable(Ticket.class.getSimpleName());

            dataMainActivity.setText("ID: " + ticket.getIdUser() +"\n" + "Место отправки поезда: " + ticket.getPlaceStartTrainUser()
            + "\n" + "Место прибытия поезда: " + ticket.getPlaceEndTrainUser() + "\n"
            + "Время отправки поезда: " + ticket.getTimeStartTrainUser() + "\n"
            + "Стоимость билета: " + ticket.getPriceUser());
        }
        button.setOnClickListener(listener);


    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}