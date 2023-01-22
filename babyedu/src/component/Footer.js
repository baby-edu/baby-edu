import React from 'react'
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
 import { solid, regular, brands, icon } from '@fortawesome/fontawesome-svg-core/import.macro'
import './footer.css';


function Footer() {
  return (
    <div className='row container-fluid text-center footer'>
      <div className="box col-sm-12 col-md-3 col-lg-4">
        <div className="navbar-brand">Bebekler</div>
        <div className="iletisim">
         <FontAwesomeIcon icon={solid('user-secret')} />
          <FontAwesomeIcon icon={regular('coffee')} />
          <FontAwesomeIcon icon={icon({ name: 'coffee', style: 'solid' })} />
          <FontAwesomeIcon icon={brands('twitter')} /> 
        </div>
      </div>
      <div className="box col-sm-12 col-md-3 col-lg-4">ilk React Projem</div>
    </div>
  )
}

export default Footer
