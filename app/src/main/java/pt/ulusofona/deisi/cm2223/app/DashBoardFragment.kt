package pt.ulusofona.deisi.cm2223.app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import pt.ulusofona.deisi.cm2223.app.databinding.FragmentDashBoardBinding
import pt.ulusofona.deisi.cm2223.app.databinding.FragmentFormBinding
import java.util.*

class DashBoardFragment : Fragment() {
    private lateinit var binding: FragmentDashBoardBinding
   // val context: Context = this.requireContext()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(
           R.layout.fragment_dash_board, container, false
       )
       binding = FragmentDashBoardBinding.bind(view)
       binding.voiceButton.setOnClickListener {
           val dialogFragment = DialogFragment()
           dialogFragment.show(parentFragmentManager, "my_dialog")
       }
       return  binding.root
    }
}
