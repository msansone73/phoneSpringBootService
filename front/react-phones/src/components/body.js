import React, {Component} from 'react'
import axios from 'axios'
class Body extends Component{

    state = {
        customers: []
        ,textbox:''
        ,searchOption:'country'
    }

    componentDidMount(){
        axios.get('http://192.168.1.70:8080/phones/')
        .then(res=>{
            const customers = res.data
            this.setState({ customers })
        })       
    }

    searchByCountry=(e)=>{

        if (e.target.value==='clean'){
        this.setState({textbox:''})
        this.componentDidMount()
        }
        else{
        axios.get('http://192.168.1.70:8080/phones/'+e.target.value+'/'+this.state.textbox+'/')
        .then(res=>{
            this.setState({ customers:res.data })
        })   
    }    
    }

    changeTextBox=(e)=>{
        this.setState({textbox:e.target.value})

    }

    render(){
        return(
            <div>
                <table>
                    <tbody>
                    <tr>
                        <td>Search: 
                            <input value={this.state.textbox}
                            onChange={this.changeTextBox}></input> 
                            
                            </td>
                    </tr>
                    </tbody>
                </table>
                <table>
                    <tbody>
                    <tr>
                        <td> 
                            <button value='country' onClick={this.searchByCountry}> by Country</button>
                            <button value='name' onClick={this.searchByCountry}> by Name</button>
                            <button value='phone' onClick={this.searchByCountry}> by Phone</button>
                            <button value='clean' onClick={this.searchByCountry}> Clean</button>
                            </td>
                    </tr>
                    </tbody>
                </table>
                <br></br>

                <table>
                <thead>
                    <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Phone</th>
                    <th>Country</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        this.state.customers.map(customer => 
                            
                                <tr key={customer.id}>
                                    <td>{customer.id}</td>
                                    <td>{customer.name}</td>
                                    <td>{customer.phone}</td>
                                    <td>{customer.country}</td>
                                </tr>
                            )
                    }
                </tbody>
                <tfoot>
                    <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    </tr>
                </tfoot>
                </table>

            </div>
        )
    }
}

export default Body