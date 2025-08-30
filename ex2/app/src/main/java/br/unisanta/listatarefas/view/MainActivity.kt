package br.unisanta.listatarefas.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import br.unisanta.listatarefas.R
import br.unisanta.listatarefas.model.Tarefa
import br.unisanta.listatarefas.model.TarefaDAO
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val dao = TarefaDAO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val edtDescricao = findViewById<EditText>(R.id.edt_descricao)
        val btnAdd = findViewById<Button>(R.id.btn_add)
        val fabGet = findViewById<FloatingActionButton>(R.id.fab_get)

        btnAdd.setOnClickListener {
            val nome = edtNome.text.toString()
            val descricao = edtDescricao.text.toString()

            val tarefa = Tarefa(nome, descricao)
            dao.addTarefa(tarefa)

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sucesso")
            builder.setMessage("Tarefa criada com sucesso!")
            val dialog = builder.create()
            dialog.show()

            edtNome.text.clear()
            edtDescricao.text.clear()
        }

        fabGet.setOnClickListener {
            val intent = Intent(this, TarefasActivity::class.java)
            startActivity(intent)
        }
    }
}