package com.example.boatbuddy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.lights_list_item.view.*


@GlideModule
class MyGlideApp : AppGlideModule(){
    override fun isManifestParsingEnabled(): Boolean {
        return false
    }
}

class LightsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var listItems: List<LightsItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return LightsViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.lights_list_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is LightsViewHolder -> {
                holder.bindToView(listItems[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    fun submitLightsList(lightsList: List<LightsItem>) {
        listItems = lightsList
    }


    class LightsViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        val lights_name = itemView.lightsName
        val lights_img = itemView.lightsIcon

        fun bindToView(lightsItem: LightsItem){
            lights_name.text = lightsItem.name
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.flag_black)
                .error(R.drawable.flag_black)

            val x = itemView.resources.getIdentifier(
                lightsItem.lightsIcon,
                "drawable",
                itemView.context.packageName
            )

            GlideApp.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(x)
                .into(lights_img)
        }
    }
}