package br.unisanta.listatarefas.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.listatarefas.R

class TarefaAdapter(
    private val tarefas: MutableList<Tarefa>
) : RecyclerView.Adapter<TarefaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.tarefa_item, parent, false)

        return TarefaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = tarefas[position]

        holder.txvNome.text = tarefa.nome
        holder.txvDescricao.text = tarefa.descricao

        holder.cbConcluida.setOnCheckedChangeListener(null)
        holder.cbConcluida.isChecked = tarefa.concluida
        holder.cbConcluida.setOnCheckedChangeListener { _, concluida ->
            tarefa.concluida = concluida
        }
    }

    override fun getItemCount(): Int {
        return tarefas.size
    }
}