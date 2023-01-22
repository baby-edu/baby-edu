import React, { Component } from 'react'
import Footer from '../component/Footer';
import '../component/Content.css';

export default class Planets extends Component {
    constructor(props) {
        super(props);
        this.state = { planets: [] }
    }
    componentDidMount() {
        fetch('/planets')
            .then(response => response.json())
            .then(json => { this.setState({ planets: json }) })
    }
    render() {
        return (
            <div>
                <div className='body'>
                <h2>Gezegenler</h2>
                    <div className='container'>
                        <div className='row'>
                            {/* tekrar edilcek bölüm */}
                            {
                                this.state.planets.map((planet) => (
                                    <div className='col-sm-12 col-lg-4 col-md-6'>
                                        <div className='content'>
                                            <div className='card-img'>
                                                <img src={planet.img}></img>
                                            </div>
                                            <div>
                                                <h3 className='fs-2 contentName'>{planet.name}</h3>
                                                <p className='fw-normal contentDesciription'>
                                                    {planet.description}
                                                </p>
                                            </div>
                                        </div>
                                    </div>
                                ))
                            }
                            {/* Content bitimii */}
                        </div>
                    </div>
                </div>
                <Footer />
            </div>
        )
    }
}
