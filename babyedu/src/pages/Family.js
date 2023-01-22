import React, { Component } from 'react';
import '../component/Content.css';
import Footer from '../component/Footer';


export default class Family extends Component {
    constructor(props) {
        super(props);
        this.state = { family: [] }
    }
    componentDidMount() {
        fetch('/family')
            .then(response => response.json())
            .then(json => { this.setState({ family: json }) })
    }

    render() {
        return (
            <div>
                <div className='body'>
                <h2>Aile Üyeleri</h2>
                    <div className='container'>
                        <div className='row'>
                            {/* tekrar edilcek bölüm */}
                            {
                                this.state.family.map((familyMember) => (
                                    <div className='col-sm-12 col-lg-4 col-md-6'>
                                        <div className='content'>
                                            <div className='card-img'>
                                                <img src={familyMember.image} />
                                            </div>
                                            <div>
                                                <h3 className='fs-2 contentName'>{familyMember.name}</h3>
                                                <p className='fw-normal contentDesciription'>
                                                    {familyMember.description}
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
