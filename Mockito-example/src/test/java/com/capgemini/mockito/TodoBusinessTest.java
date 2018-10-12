package com.capgemini.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
 import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.capgemini.business.TodoBusinessImpl;
import com.capgemini.data.api.TodoService;
 public class TodoBusinessTest {
	 
@Test
public void testretrieveTodosRelatedToSpring() {
	TodoService todoServiceStub=mock(TodoService.class);
	List<String>todos=Arrays.asList();
	when(todoServiceStub.retrieveTodos("Dummy")).thenReturn(todos);
	TodoBusinessImpl todoBusiness=new TodoBusinessImpl(todoServiceStub);
	List<String>filteredTodos=todoBusiness.retrieveTodosRelatedToSpring("Dummy");
	assertEquals(0,filteredTodos.size());
}

@Test
public void testretrieveTodosRelatedToSpring2() {
	TodoService todoServiceStub=mock(TodoService.class);
	TodoBusinessImpl todoBusiness=new TodoBusinessImpl(todoServiceStub);
	List<String>filteredTodos=todoBusiness.retrieveTodosRelatedToSpring("Dummy1");
	assertEquals(0,filteredTodos.size());
}
}