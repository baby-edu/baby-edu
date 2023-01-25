import React, { Component } from 'react'
import '../component/Content.css';
import Footer from '../component/Footer';

export default class Plants extends Component {
    constructor(props) {
        super(props);
        this.state = { plants: [] }
    }
    componentDidMount() {
        fetch('/plants')
            .then(response => response.json())
            .then(json => { this.setState({ plants: json }) });
    }
    render() {
        return (
            <div className='body'>
                <h2>bitkiler</h2>
                <div className='container'>
                    <div className='row'>
                        {
                            this.state.plants.map((plant) => (
                                <div className='col-sm-12 col-lg-4 col-md-6'>
                                    <div className='content'>
                                        <div className='card-img'>
                                            <img src={plant.image} />
                                        </div>
                                        <div>
                                            <h3 className='fs-2 contentName'>{plant.name}</h3>
                                            <p className='fw-normal contentDesciription'>
                                                {plant.description}
                                            </p>
                                        </div>
                                    </div>
                                </div>
                 )) }
                    </div>
                </div>
                <Footer />
            </div>
        )
    }
}
