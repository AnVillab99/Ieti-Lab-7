import React from 'react';
import TodoCard from './TodoCard'

export class TodoList extends React.Component {

    constructor(props) {
        super(props);
        
        
    }

    render() {
        console.log("todolist")
        console.log(this.props.todoList);
        const todoList = this.props.todoList.map((todo, i) => {
            
            return (
                <TodoCard key={i} state ={todo.state} description={todo.description} priority={todo.priority} dueDate={todo.dueDate} authorEmail={todo.email} author={todo.author}/>
                
            );
        });

        return (
            <div>
                
                    
                    {todoList}
                
                    

            </div>
        );


    }

}