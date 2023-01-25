import React, { Component } from 'react'
import Footer from '../component/Footer';
import '../component/Content.css';
import VideoBg from '../component/VideoBg';
export default class Home extends Component {
    render() {
        return (
            <div>
            <div className='main'>
            <VideoBg/>
            </div>
            <Footer/>
        </div>
        )
    }
}