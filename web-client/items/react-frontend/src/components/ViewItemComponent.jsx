import React, { Component } from 'react'
import ItemService from '../services/ItemService'

class ViewItemComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            items: {}
        }
    }

    componentDidMount(){
        ItemService.getById(this.state.id).then( res => {
            this.setState({items: res.data});
        })
    }

    render() {
        return (
            <div>
                <br></br>
                <div className = "card col-md-6 offset-md-3">
                    <h3 className = "text-center"> View Item Details</h3>
                    <div className = "card-body">
                        <div className = "row">
                            <label> Items Name: </label>
                            <div> { this.state.items.item_name }</div>
                        </div>
                        <div className = "row">
                            <label> Items Count: </label>
                            <div> { this.state.items.count }</div>
                        </div>
                        <div className = "row">
                            <label> Items Amount: </label>
                            <div> { this.state.items.amount }</div>
                        </div>
                    </div>

                </div>
            </div>
        )
    }
}

export default ViewItemComponent
