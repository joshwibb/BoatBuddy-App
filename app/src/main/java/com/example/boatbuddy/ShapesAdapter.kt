package com.example.boatbuddy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.shapes_list_item.view.*


class ShapesAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var listItems: List<ShapesItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ShapesViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.shapes_list_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ShapesViewHolder -> {
                holder.bindToView(listItems[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    fun submitShapesList(shapesList: List<ShapesItem>) {
        listItems = shapesList
    }


    class ShapesViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        val shapes_name = itemView.shapesName
        val shapes_img = itemView.shapesIcon

        fun bindToView(shapesItem: ShapesItem){
            shapes_name.text = shapesItem.name
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.flag_black)
                .error(R.drawable.flag_black)

            val x = itemView.resources.getIdentifier(
                shapesItem.shapesIcon,
                "drawable",
                itemView.context.packageName
            )

            GlideApp.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(x)
                .into(shapes_img)
        }
    }
}