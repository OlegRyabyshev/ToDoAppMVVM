package com.oryabyshev.todoappmvvm.ui.tasks

import androidx.core.view.isVisible
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.oryabyshev.todoappmvvm.data.Task
import com.oryabyshev.todoappmvvm.databinding.ItemTaskBinding

class TasksAdapter : ListAdapter<Task> {
    class TasksViewHolder(private val binding: ItemTaskBinding) :
        RecyclerView.ViewHolder(binding.root) {

            fun bind(task: Task){
                binding.apply {
                    checkBoxCompleted.isChecked = task.completed
                    textViewName.text = task.name
                    textViewName.paint.isStrikeThruText = task.completed
                    labelPriority.isVisible = task.important
                }
            }
    }
}