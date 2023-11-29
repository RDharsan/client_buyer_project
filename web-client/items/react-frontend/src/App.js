import React from 'react';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import ListItemComponent from './components/ListItemComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import CreateItemComponent from './components/CreateItemComponent';
import UpdateItemComponent from './components/UpdateItemComponent';
import ViewEmployeeComponent from './components/ViewItemComponent';

function App() {
  return (
    <div>
        <Router>
              <HeaderComponent />
                <div className="container">
                    <Switch> 
                          <Route path = "/" exact component = {ListItemComponent}></Route>
                          <Route path = "/items" component = {ListItemComponent}></Route>
                          <Route path = "/add-items/:id" component = {CreateItemComponent}></Route>
                          <Route path = "/view-items/:id" component = {ViewEmployeeComponent}></Route>
                          {/* <Route path = "/update-items/:id" component = {UpdateItemComponent}></Route> */}
                    </Switch>
                </div>
              <FooterComponent />
        </Router>
    </div>
    
  );
}

export default App;
