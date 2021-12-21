package org.ochamo.simplereminderapp.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.ochamo.simplereminderapp.R

class AddReminder : Fragment() {

    companion object {
        fun newInstance() = AddReminder()
    }

    private lateinit var viewModel: AddReminderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_reminder_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddReminderViewModel::class.java)
        // TODO: Use the ViewModel
    }

}