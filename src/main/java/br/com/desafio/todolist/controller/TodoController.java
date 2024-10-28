package br.com.desafio.todolist.controller;

import br.com.desafio.todolist.entity.Todo;
import br.com.desafio.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    TodoService service; //Injeção de dependecia da classe service

    @PostMapping
   public  List<Todo> create(@RequestBody Todo obj){ //RequesBody significa que as informações serão passadas no corpo da requisição
       return service.create(obj);
   }

   @GetMapping
   public  List <Todo> list(){
        return service.list();
   }

   @PutMapping
    public  List <Todo> updade(@RequestBody Todo obj){
       return service.update(obj);

    }

    @DeleteMapping("{id}")
    public  List <Todo> delete(@PathVariable Long id){ //@PathVariable indica que o valor do id será recuperado da requisição http
       return service.delete(id);

    }



    //Obs, poderia se passado um endpooin em cada GetMapping, Delet, etc. como não foi passado, o padrão é o "todos"


}
