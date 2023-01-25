import React, { Component } from 'react';
import Footer from '../component/Footer';
import '../component/Content.css';

export default class Sbuildings extends Component {
    constructor(props) {
        super(props);
        this.state = { buildings: [] }
    }
    componentDidMount() {
        fetch('/buildings')
            .then(response => response.json())
            .then(json => { this.setState({ buildings: json }) })
    }

    render() {
        return (
            <div>
                <div className='body'>
                <h2>Yapılar</h2>
                    <div className='container'>
                        <div className='row'>
                            {/* tekrar edilcek bölüm */}
                            {
                                this.state.buildings.map((building) => (
                                    <div className='col-sm-12 col-lg-4 col-md-6'>
                                        <div className='content'>
                                            <div className='card-img'>
                                                <img src={building.image} />
                                            </div>
                                            <div>
                                                <h3 className='fs-2 contentName'>{building.name}</h3>
                                                <p className='fw-normal contentDesciription'>
                                                    {building.description}
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                ))}

                            {/* Content bitimii */}
                        </div>
                    </div>
                </div>
                <Footer />
            </div>
        )
    }
}