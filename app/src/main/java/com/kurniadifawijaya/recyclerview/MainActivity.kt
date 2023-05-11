package com.kurniadifawijaya.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kurniadifawijaya.recyclerview.adapter.AdapterTeamBola
import com.kurniadifawijaya.recyclerview.databinding.ActivityMainBinding
import com.kurniadifawijaya.recyclerview.model.pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listpemain = ArrayList<pemain>()
        listpemain.add(pemain("Thibaut Courtois",R.drawable.courtois,"Penjaga Gawang","2.00 m","Bree (Belgia)","11 Mei 1992"))
        listpemain.add(pemain("Karim Benzema",R.drawable.benzema,"Penyerang","1,85 m","Lyon (Perancis)","19 Desember 1987"))
        listpemain.add(pemain("Marcelo Vieira da Silva" ,R.drawable.marcello,"Belakang","1,74 m","Rio de Janeiro (Brasil)","12 Mei 1988"))
        listpemain.add(pemain("Sergio Ramos García",R.drawable.ramos,"Belakang","1,84 m","Camas (Sevilla)","30 Maret 1986"))
        listpemain.add(pemain("Zinedine Yazid Zidane" ,R.drawable.zidan,"Pelatih","1,85 m","Marseille (Prancis)","23 Juni 1972"))

        binding.list.adapter = AdapterTeamBola(this,listpemain,object : AdapterTeamBola.OnClickListener{
            override fun detailData(item: pemain?) {
                TODO("Not yet implemented")
            }

        })

    }
}