package org.zerock.todolist.domain.todo.service

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.zerock.todolist.domain.todo.dto.CreateTodoRequest
import org.zerock.todolist.domain.todo.dto.TodoResponse
import org.zerock.todolist.domain.todo.dto.UpdateTodoRequest

interface TodoService {

    fun getAllTodoList(pageable: Pageable, writer: String?): Page<TodoResponse>

    fun getTodoById(todoId: Long): TodoResponse

    fun createTodo(request: CreateTodoRequest, userEmail: String?): TodoResponse

    fun updateTodo(todoId: Long, request: UpdateTodoRequest, userEmail: String?): TodoResponse

    fun deleteTodo(todoId: Long, userEmail: String?)
}