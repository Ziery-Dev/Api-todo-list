package br.com.desafio.todolist.service;

import br.com.desafio.todolist.entity.Todo;
import br.com.desafio.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository acao; //injeção de dependencia da classe repositorio



    //Por se tratar de um TodoList, todos o métodos retornam a lista de tarefas

    //método que cria uma tarefa
    public List<Todo>create(Todo obj){
        acao.save(obj);
        return list();
    }

    //Método de consulta que retorna na ordem de prioridade e depois por nome
    public  List <Todo> list(){
        Sort sort =  Sort.by("prioridade").descending().and(Sort.by("nome").ascending()); //ordenação do que irá ser exibido primeiro
       return acao.findAll(sort);
    }

    //atualizar uma tarefa
    public  List <Todo> update(Todo obj){
        acao.save(obj);
        return list();
    }

    //remover uma tarefa
    public  List<Todo> delete(Long id){
        acao.deleteById(id);
        return list();
    }

}
