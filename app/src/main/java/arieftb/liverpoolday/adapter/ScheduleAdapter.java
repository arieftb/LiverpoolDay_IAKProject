package arieftb.liverpoolday.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import arieftb.liverpoolday.R;
import arieftb.liverpoolday.ScheduleActivity;
import arieftb.liverpoolday.pojo.ScheduleModel;

/**
 * Created by root on 14/05/17.
 */

public class ScheduleAdapter extends BaseAdapter {

    ArrayList listSchedule;
    Activity activity;

    public ScheduleAdapter(Activity activity, ArrayList listSchedule) {
        this.listSchedule = listSchedule;
        this.activity = activity;
    }


    @Override
    public int getCount() {
        return listSchedule.size();
    }

    @Override
    public Object getItem(int position) {
        return listSchedule.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View mView = convertView;
        ViewHolder mHolder = null;

        if(mView == null) {
            mHolder = new ViewHolder();

            LayoutInflater mInfalter = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            mView = mInfalter.inflate(R.layout.list_schedule, null);
            mHolder.ivLogoClub = (ImageView) mView.findViewById(R.id.iv_logoClub);
            mHolder.tvPertandingan = (TextView) mView.findViewById(R.id.tv_pertandingan);
            mHolder.tvJadwal = (TextView) mView.findViewById(R.id.tv_jadwal);
            mView.setTag(mHolder);
        }
        else {
            mHolder = (ViewHolder) mView.getTag();
        }

        ScheduleModel mScheduleModel = (ScheduleModel) getItem(position);
        mHolder.ivLogoClub.setImageResource(mScheduleModel.getImage());
        mHolder.tvJadwal.setText(mScheduleModel.getWaktu());
        mHolder.tvPertandingan.setText(mScheduleModel.getClub());


        return mView;
    }

    static class ViewHolder{
        ImageView ivLogoClub;
        TextView tvPertandingan, tvJadwal;
    }
}
