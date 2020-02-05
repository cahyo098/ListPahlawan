package id.ac.poliban.mi.cahyo.listpahlawan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Pahlawan> pahlawans = new ArrayList<>();
    private ListView lvPahlawan;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //koneksikan object dengan view
        lvPahlawan = findViewById(R.id.listview);
//ambil data dari CountryData dan berikan ke object countries
        pahlawans.addAll(PahlawanData.getAllPahlawan());
//buat object adapter dan kirim data countries sebagai
//parameter di konstruktor CountryAdapter()
        adapter = new PahlawanAdapter(pahlawans);
//pasang object adapter sebagai adapter lvCountry
        lvPahlawan.setAdapter(adapter);
//menambahkan kejadian ketika user mengklik salah satu item
        lvPahlawan.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Pahlawan yang Anda Pilih")
                    .setMessage(pahlawans.get(position).toString())
                    .setPositiveButton("OK", null).show();
        });
    }
}
