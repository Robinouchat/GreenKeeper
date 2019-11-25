package com.example.hello.ui.listemission
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hello.data.model.MissionModel
import androidx.recyclerview.widget.RecyclerView as RecyclerView
import com.example.hello.data.RecyclerItemClickListenr
import android.R.attr.fragment




class ListeMissionFragment : Fragment() {

    private lateinit var listeMissionViewModel: ListeMissionViewModel

    public var mContext: Context? = null



    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        listeMissionViewModel =
            ViewModelProviders.of(this).get(ListeMissionViewModel::class.java)
        val root = inflater.inflate(com.example.hello.R.layout.fragment_liste_mission, container, false)
        val textView: TextView = root.findViewById(com.example.hello.R.id.text_liste_mission)
        listeMissionViewModel.text.observe(this, Observer {
            textView.text = it
        })

        //val recyclerView = com.example.hello.R.id.recyclerView1 as RecyclerView
        val recyclerView = root.findViewById(com.example.hello.R.id.recyclerView1) as RecyclerView


//        Create an arraylist
        val dataList = ArrayList<MissionModel>()

        dataList.add(MissionModel(1,"Nettoyer le parc pasteur","Il faut nettoyer ce ***** de parc car il est plein de détritus.","testImage",30.toFloat(),"GreenRobin","2019-11-10","2019-11-12",20,"Orléans"))
        dataList.add(MissionModel(2,"Ramasser les ordures place de la république","Merci de ramasser les détritus de la place de la république","testImage",10.toFloat(),"GreenRobin","2019-01-10","2019-01-10",20,"Orléans centre"))
        dataList.add(MissionModel(3,"Feuilles mortes rue saint gilles","Balayer les feuilles mortes","testImage",10.toFloat(),"GreenRobin","2019-05-09","2019-05-12",20,"Chécy"))
        dataList.add(MissionModel(4,"Nettoyer le parc pasteur","Il faut nettoyer ce ***** de parc car il est plein de détritus.","testImage",10.toFloat(),"GreenRobin","2019-03-03","2019-03-09",20,"Fleury les aubrais"))
//        pass the values to RvAdapter
        val rvAdapter = ListeMissionAdapter(
            dataList
        )
        recyclerView.layoutManager = LinearLayoutManager(context)
//        set the recyclerView to the adapter
        recyclerView.adapter = rvAdapter

        recyclerView.addOnItemTouchListener(RecyclerItemClickListenr(mContext, recyclerView, object : RecyclerItemClickListenr.OnItemClickListener {

            override fun onItemClick(view: View, position: Int) {
                val myToast = Toast.makeText(mContext, "Access to mission...", Toast.LENGTH_SHORT)
                myToast.show()
                fragmentManager!!.beginTransaction()
                    .replace((getView()!!.parent as ViewGroup).id,MissionFrgament.newInstance() )
                    .addToBackStack(null)
                    .commit()
            }
            override fun onItemLongClick(view: View?, position: Int) {
                TODO("do nothing")
            }
        }))

        return root
    }

}