package br.com.desafio.todolist.controller;

import br.com.desafio.todolist.entity.Todo;
import br.com.desafio.todolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    TodoService service; //Injeção de dependecia da classe service

    @PostMapping
   public  List<Todo> create(@RequestBody  @Valid Todo obj){ //RequesBody significa que as informações serão passadas no corpo da requisição
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



    

}
