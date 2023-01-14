import React from 'react'
import { Link } from 'react-router-dom';
import './footer.css';


function Footer() {
  return (
      <div className='row container-fluid text-center footer'>
        <div className="box col-sm-12 col-md-3 col-lg-4">@2023</div>
        <div className="box col-sm-12 col-md-3 col-lg-4">ilk React Projem</div>
        <div className="box col-sm-12 col-md-3 col-lg-4"><Link to="iletisim">Bana ulaşın</Link></div>
      </div>
  )
}

export default Footer
