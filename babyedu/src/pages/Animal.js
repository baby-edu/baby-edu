import React, { Component } from 'react';
import Footer from '../component/Footer';
import '../component/Content.css';

export default class Animal extends Component {
  constructor(props) {
    super(props);
    this.state = { animals: [] }
  }
  componentDidMount() {
    fetch('/animals')
      .then(response => response.json())
      .then(json => { this.setState({ animals: json }) })
  }

  render() {
    return (

      <div>
        <div className='body'>
        <h2>Hayvanlar</h2>
          <div className='container'>
            <div className='row'>
              {/* tekrar edilcek bölüm */}
              {
                this.state.animals.map((animal) => (
                  <div className='col-sm-12 col-lg-4 col-md-6'>
                    <div className='content'>
                      <div className='card-img'>
                        <img src={animal.image} />
                      </div>
                      <div>
                        <h3 className='fs-2 contentName'>{animal.name}</h3>
                        <p className='fw-normal contentDesciription'>
                          {animal.description}
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
