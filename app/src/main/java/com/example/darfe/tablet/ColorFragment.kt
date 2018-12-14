package com.example.darfe.tablet


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_color.*


class ColorFragment : Fragment() {

    var color:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        color = arguments?.getInt("color") ?: 0

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_color, container, false)
    }

    override fun onResume() {
        super.onResume()
        val colorNames = resources.getStringArray(R.array.color_names)
        val colors = resources.getIntArray(R.array.colors)

        root.setBackgroundColor(colors[color])
        txtColor.text = colorNames[color]

    }

    companion object {
        val RED = 0
        val GREEN = 1
        val BLUE  = 2
        /*fun instance(color:Int):ColorFragment{
            val fragment = ColorFragment()
            val arg = Bundle()
            arg.putInt("color", color)
            fragment.arguments = arg
            return fragment
        }*/

        fun instance(color:Int):ColorFragment = ColorFragment().apply {
            arguments = Bundle().apply {
                putInt("color", color)
            }
        }

    }

}


