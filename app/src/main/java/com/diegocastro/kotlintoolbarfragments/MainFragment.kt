package com.diegocastro.kotlintoolbarfragments

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.diegocastro.kotlintoolbarfragments.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding:FragmentMainBinding?=null
    private val binding get()=_binding!!

    companion object{
        fun newInstance()=MainFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }


    //dejamos solo el onCreateView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentMainBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)
    }

//para activar menu en el fragmento hay que cambiar por requireContext

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.menu_search->{
                Toast.makeText(requireContext(), "Search", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_save->{
                Toast.makeText(requireContext(), "Save", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.menu_news->{
                Toast.makeText(requireContext(), "News", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_main,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}