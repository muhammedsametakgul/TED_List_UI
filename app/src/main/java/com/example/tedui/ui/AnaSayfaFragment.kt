package com.example.tedui.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tedui.R
import com.example.tedui.adapter.ParentAdapter
import com.example.tedui.databinding.FragmentAnaSayfaBinding
import com.example.tedui.model.ChildData
import com.example.tedui.model.ParentData
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomnavigation.LabelVisibilityMode

class AnaSayfaFragment : Fragment() {

    private lateinit var binding:FragmentAnaSayfaBinding
    val parentItemList = ArrayList<ParentData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater,container,false)
        binding.rvMain.setHasFixedSize(true)
        binding.rvMain.layoutManager= LinearLayoutManager(requireContext())
        val adapter= ParentAdapter(requireContext(),parentItemList)

        setData()
        binding.rvMain.adapter= adapter





        return binding.root
    }
    fun setData(){
        val childList = ArrayList<ChildData>()
        childList.add(ChildData("How play can spark new ideas for \nyour business","enyeni1"))
        childList.add(ChildData("Why is Chine appointing judges to \ncombat climate change?","enyeni2"))
        childList.add(ChildData("The tradegy of air pollution --and an \nurgent demand for clean air","enyeni3"))
        childList.add(ChildData("You deserve the right to repair your\nstuff","enyeni4"))
        childList.add(ChildData("What nature can teach us about\nsustainable business","enyeni5"))

        parentItemList.add(ParentData("En yeni",childList))

        val childList3 = ArrayList<ChildData>()
        childList3.add(ChildData("How to escape the cynicism","editorpick1"))
        childList3.add(ChildData("How gratitude rewires your brain","editorpick2"))
        childList3.add(ChildData("Why a free and fair internet is more\nvital than ever","editorpick3"))
        childList3.add(ChildData("How moms shape the world","editorpick4"))
        childList3.add(ChildData("3 questions to build resilience--and\nchange the world","editorpick5"))

        parentItemList.add(ParentData("Editor's Picks",childList3))

        val childList2 = ArrayList<ChildData>()
        childList2.add(ChildData("Why do we love? A philosophical\ninquiry","animation1"))
        childList2.add(ChildData("Ancient Greece's greatest popstar","animation2"))
        childList2.add(ChildData("Why should you read 'One Hundred\nYears of Solitude?'","animation3"))
        childList2.add(ChildData("A brief history of melancholy","animation4"))
        childList2.add(ChildData("Would you opt for a life with no pain?","animation5"))

        parentItemList.add(ParentData("TED-Ed animations:Feed your curiosity",childList2))

    }
}