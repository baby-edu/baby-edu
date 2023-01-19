import React, { Component } from 'react'
import Footer from '../component/Footer';
import '../component/Content.css';

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
            <div>
                <div className='body'>
                <h2>bitkiler</h2>
                    <div className='container'>
                        <div className='row'>
                            {this.state.plants.map((plant) => (
                                <div className='col-sm-12 col-lg-4 col-md-6'>
                                    <div className='content'>
                                        <div className='card-img'>
                                            <img src={plant.image} />
                                            <h1>{plant.name}</h1>
                                            <p>{plant.description}</p>
                                        </div>
                                    </div>
                                </div>
                            ))
                            }
                        </div>
                    </div>
                    <Footer />
                </div>

            </div>
        )
    }
}
