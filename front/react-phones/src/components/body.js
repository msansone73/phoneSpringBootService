import React, {Component} from 'react'
import axios from 'axios'
class Body extends Component{

    state = {
        customers: []
    }

    componentDidMount(){
        axios.get('http://192.168.1.70:8080/Phones/')
        .then(res=>{
            const customers = res.data
            this.setState({ customers })
        })       
    }

    searchByCountry=(e)=>{
        axios.get('http://192.168.1.70:8080/Phones/country/Morocco/')
        .then(res=>{
            const customers = res.data
            this.setState({ customers:res.data })
        })       
    }

    


    render(){
        return(
            <div>
                <table>
                    <tr>
                        <td>Country 
                            <input></input> 
                            <button onClick={this.searchByCountry}> pesquisar</button>
                            </td>
                    </tr>
                </table>
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
                            </tr>)
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