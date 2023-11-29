import React, { Component } from 'react'
import ItemService from '../services/ItemService';

class CreateItemComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            
            id: this.props.match.params.id,
            item_name: '',
            count: '',
            amount: ''
        }
        this.changeitem_nameHandler = this.changeitem_nameHandler.bind(this);
        this.changecountHandler = this.changecountHandler.bind(this);
        this.saveOrUpdateItem = this.saveOrUpdateItem.bind(this);
    }

    
    componentDidMount(){

        
        if(this.state.id === '_add'){
            return
        }else{
            ItemService.getById(this.state.id).then( (res) =>{
                let items = res.data;
                this.setState({item_name: items.item_name,
                    count: items.count,
                    amount : items.amount
                });
            });
        }        
    }
    saveOrUpdateItem = (e) => {
        e.preventDefault();
        let items = {item_name: this.state.firstName, count: this.state.count, amount: this.state.amount};
        console.log('items => ' + JSON.stringify(items));

        // step 5
        if(this.state.id === '_add'){
            ItemService.createItems(items).then(res =>{
                this.props.history.push('/items');
            });
        }else{
            ItemService.updateItem(items, this.state.id).then( res => {
                this.props.history.push('/items');
            });
        }
    }
    
    changeitem_nameHandler= (event) => {
        this.setState({item_name: event.target.value});
    }

    changecountHandler= (event) => {
        this.setState({count: event.target.value});
    }

    changeamountHandler= (event) => {
        this.setState({amount: event.target.value});
    }

    cancel(){
        this.props.history.push('/items');
    }

    getTitle(){
        if(this.state.id === '_add'){
            return <h3 className="text-center">Add Items</h3>
        }else{
            return <h3 className="text-center">Update Items</h3>
        }
    }
    render() {
        return (
            <div>
                <br></br>
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                {
                                    this.getTitle()
                                }
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group">
                                            <label> Item Name: </label>
                                            <input placeholder="item_name" name="item_name" className="form-control" 
                                                value={this.state.item_name} onChange={this.changeitem_nameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Count: </label>
                                            <input placeholder="count" name="count" className="form-control" 
                                                value={this.state.count} onChange={this.changecountHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Amount: </label>
                                            <input placeholder="amount" name="amount" className="form-control" 
                                                value={this.state.amount} onChange={this.changeamountHandler}/>
                                        </div>

                                        <button className="btn btn-success" onClick={this.saveOrUpdateItem}>Save</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </div>

                   </div>
            </div>
        )
    }
}

export default CreateItemComponent
