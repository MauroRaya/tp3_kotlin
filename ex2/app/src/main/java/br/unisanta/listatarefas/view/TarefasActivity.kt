package br.unisanta.listatarefas.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.listatarefas.R
import br.unisanta.listatarefas.model.TarefaAdapter
import br.unisanta.listatarefas.model.TarefaDAO

class TarefasActivity : AppCompatActivity(R.layout.activity_tarefas) {
    private val dao = TarefaDAO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val rvTarefas = findViewById<RecyclerView>(R.id.rv_tarefas)
        val tarefas = dao.getTarefas()

        rvTarefas.layoutManager = LinearLayoutManager(this)
        rvTarefas.adapter = TarefaAdapter(tarefas)
    }
}