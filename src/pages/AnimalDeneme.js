import React,{ Component } from 'react';
import "slick-carousel/slick/slick.css"; 
import "slick-carousel/slick/slick-theme.css";


class AnimalDeneme extends Component {
    constructor(props) {
        super(props);
        this.state = { animals: [] };
      }
    
      componentDidMount() {
        fetch('/animals')
          .then(response => response.json())
          .then(data => this.setState({ animals: data }));
      }
    render(){
    const { animals,setDefaultImage } = this.state;

    const animalsList = animals.map(animal => {
      return <tr key={animal.id}>
        <td style={{ whiteSpace: 'nowrap' }}>{animal.name}</td>
        <td>{animal.description}</td>
        <img src={animal.image} width="100px" height="100px"/>
      </tr>
    });
   
    
  return (
    
  
    <div className='body'>
      <div className='container'>
        <div className='row'>
          {/* tekrar edilcek bölüm */}
          <div className='col-sm-12 col-lg-4 col-md-6'>
            <div className='content'>
              <div className='card-img'>
                <img src={animals.image}/>
              </div>
              <div>
                <h3 className='fs-2 contentName'>{animals.name}</h3>
                <p className='fw-normal contentDesciription'>
                  {animals.description}
                </p>
              </div>
            </div>
          </div>


          {/* Content bitimii */}
        </div>
      </div>
    </div>
    )
}
}

export default AnimalDeneme;