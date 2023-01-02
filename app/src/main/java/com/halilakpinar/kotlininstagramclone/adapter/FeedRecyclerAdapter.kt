package com.halilakpinar.kotlininstagramclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.halilakpinar.kotlininstagramclone.databinding.ActivityUploadBinding
import com.halilakpinar.kotlininstagramclone.databinding.RecyclerRowBinding
import com.halilakpinar.kotlininstagramclone.model.Post
import com.squareup.picasso.Picasso

class FeedRecyclerAdapter(val postList:ArrayList<Post>): RecyclerView.Adapter<FeedRecyclerAdapter.PostHolder>() {

    class PostHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val binding =RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostHolder(binding)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.binding.recyclerRowUserEmail.text = postList.get(position).email
        holder.binding.recyclerRowCommentText.text=postList.get(position).comment
        Picasso.get().load(postList.get(position).downloadUrl).into(holder.binding.recyclerRowImageView)

    }

    override fun getItemCount(): Int {
        return postList.size
    }
}