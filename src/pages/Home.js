import React, { Component } from 'react'
import Footer from '../component/Footer';
import '../component/Content.css';
import Animal from './Animal';

export default class Home extends Component {
    // constructor(props) {
    //     super(props);
    //     this.state = { home: [] }
    // }
    // componentDidMount() {
    //     fetch('/home')
    //         .then(response => response.json())
    //         .then(json => { this.setState({ home:json }) })
    // }

    render() {
        return (
            <div className='body'>
                
            <div className='container'>
                <div className='row'>
                       <h2>Neler Ögrenecegiz?</h2>
                       <p>
                       "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum." 
                       </p>
                </div>
            </div>
            <Footer/>
        </div>
        )
    }
}
