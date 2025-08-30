package br.unisanta.listatarefas.model

class TarefaDAO {
    companion object {
        val tarefas = mutableListOf<Tarefa>()
    }

    fun getTarefas(): MutableList<Tarefa> {
        return tarefas
    }

    fun addTarefa(tarefa: Tarefa) {
        tarefas.add(tarefa)
    }
}