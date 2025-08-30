package br.unisanta.listatarefas.model

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.listatarefas.R

class TarefaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val txvNome = itemView.findViewById<TextView>(R.id.txv_nome)
    val txvDescricao = itemView.findViewById<TextView>(R.id.txv_descricao)
    val cbConcluida = itemView.findViewById<CheckBox>(R.id.cb_concluida)
}