package com.example.mmd_v1.ui.ListEquitment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mmd_v1.R
import com.example.tesst.model.Eqiutmentreponsev2.Data.dataDevice.Device


class AdapterEquitment (var mcontext: Context, var listEquitment: List<Device>): RecyclerView.Adapter<AdapterEquitment.ViewHolder>(){
    private var mListner : onclicklist? = null

    fun setitemonclicklistner(listner : onclicklist){
        mListner = listner

    }

    fun setfilerter(mlistEquitment : List<Device>){
        this.listEquitment = mlistEquitment
        notifyDataSetChanged()
    }

    class ViewHolder (itemView: View, listner: onclicklist) : RecyclerView.ViewHolder(itemView) {
        var tv_Name : TextView
        var tv_ID : TextView
        var tv_Model : TextView
        var tv_Serial : TextView
        var tv_tinhtrang : TextView
        var imagedevice : ImageView
        var layoutitem : LinearLayout

        init {
            tv_Name = itemView.findViewById(R.id.textviewCardNameDevice)
            tv_ID = itemView.findViewById(R.id.tv_dvID)
            tv_Model = itemView.findViewById(R.id.tv_model)
            tv_Serial = itemView.findViewById(R.id.tv_serial)
            tv_tinhtrang = itemView.findViewById(R.id.tv_tinh_trang)
            imagedevice = itemView.findViewById(R.id.Imagedevice)
            layoutitem = itemView.findViewById(R.id.layoutitemDevice)
            itemView.setOnClickListener(){
                listner.onclickitem(adapterPosition)
            }
        }


    }
    fun setfiteredlist(listEquitment: List<Device>){
        this.listEquitment = listEquitment
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(mcontext).inflate(R.layout.item_list_device, parent, false)
        return  ViewHolder(itemView, mListner!!)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // id, dvID, dvName, dvModel, dvSerial, userDepartment, status, providerID, country, manufacturer, maintainDate
        val status = arrayOf(
            "Chưa bàn giao", "Đang sử dụng", "Đang báo hỏng", "Đang sửa chữa",
            "Đã ngưng sử dụng", "Đã thanh lý"
        )
        holder.tv_Name.text = listEquitment.get(position)?.title
        holder.tv_ID.text = listEquitment.get(position)?.id.toString()
        holder.tv_Model.text = listEquitment.get(position)?.model
        holder.tv_Serial.text = listEquitment.get(position)?.serial
        holder.tv_tinhtrang.text = listEquitment.get(position)?.status

    }

    override fun getItemCount(): Int {
        return listEquitment.size!!
    }
}