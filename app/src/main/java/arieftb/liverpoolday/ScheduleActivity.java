package arieftb.liverpoolday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import arieftb.liverpoolday.adapter.ScheduleAdapter;
import arieftb.liverpoolday.pojo.ScheduleModel;

public class ScheduleActivity extends AppCompatActivity {

    String[][] mData =  new String[][]{
            {
                    "Liverpool Vs Chelsea", "15 - Mei - 2017 16:00", "Anfield Stadium", "R.drawable.lfclogo",
                    "150000"
            },
            {
                    "Liverpool Vs Manchester United", "15 - Mei - 2017 16:00", "Anfield Stadium", "R.drawable.lfclogo",
                    "150000"
            }

    };

    int[][] mData2 = new int[][]{
            {
                    R.drawable.lfclogo, 150000
            },
            {
                    R.drawable.lfclogo, 150000
            }

    };

    private ListView lvPertandingan;
    private ArrayList listSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        lvPertandingan = (ListView) findViewById(R.id.lv_jadwal);
        listSchedule = new ArrayList<>();

        ScheduleModel mScheduleModel = null;

        for (int i = 0; i < mData.length; i++ ) {

            mScheduleModel = new ScheduleModel();

            mScheduleModel.setClub(mData[i][0]);
            mScheduleModel.setWaktu(mData[i][1]);
            mScheduleModel.setLokasi(mData[i][2]);
            mScheduleModel.setImage(mData2[i][0]);
            mScheduleModel.setHarga(mData2[i][1]);

            listSchedule.add(mScheduleModel);
        }

        ScheduleAdapter mScheduleAdapter = new ScheduleAdapter(ScheduleActivity.this, listSchedule);
        lvPertandingan.setAdapter(mScheduleAdapter);

        lvPertandingan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Berhasil" , Toast.LENGTH_SHORT).show();

            }
        });
    }
}
