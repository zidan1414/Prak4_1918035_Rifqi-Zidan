package com.example.pertemuan4_recyclerview;

import androidx.recyclerview.widget.RecyclerView;

public class MahasiswaAdapter extends
        RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>{
    private ArrayList<Mahasiswa> dataList;
    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.item_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }
    public void onBindViewHolder(MahasiswaViewHolder holder, int
            position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNim.setText(dataList.get(position).getNim());
        holder.txtAngkatan.setText(dataList.get(position).getAngkatan());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class MahasiswaViewHolder extends
            RecyclerView.ViewHolder{
        private TextView txtNama, txtNim, txtAngkatan;
        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama);

            txtNim = (TextView)
                    itemView.findViewById(R.id.txt_nim);
            txtAngkatan = (TextView)
                    itemView.findViewById(R.id.txt_angkatan);
        }
    }
}