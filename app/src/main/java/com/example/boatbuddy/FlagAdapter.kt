package com.example.boatbuddy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.flag_list_item.view.*


class FlagAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var listItems: List<FlagItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FlagViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.flag_list_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is FlagViewHolder -> {
                holder.bindToView(listItems[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    fun submitFlagList(flagList: List<FlagItem>) {
        listItems = flagList
    }


    class FlagViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        val flag_phonetic = itemView.alphaTitle
        val flag_meaning = itemView.alphaMeaning
        val flag_img = itemView.flagIcon

        fun bindToView(flagItem: FlagItem){
            flag_phonetic.text = flagItem.phonetic
            flag_meaning.text = flagItem.meaning
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.flag_black)
                .error(R.drawable.flag_black)

            val x = itemView.resources.getIdentifier(
                flagItem.flagIcon,
                "drawable",
                itemView.context.packageName
            )

            GlideApp.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(x)
                .into(flag_img)
        }
    }
}