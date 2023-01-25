import React from 'react';
import './Content.css';

function Content() {
  
  return (
    <div className='body'>
      <div className='container'>
        <div className='row'>
          {/* tekrar edilcek bölüm */}
          <div className='col-sm-12 col-lg-4 col-md-6 card'>
            <div className='content'>
              <div className='card-img'>
                <img src='frontend/src/component'></img>
              </div>
              <div>
                <h3 className='fs-2 contentName'>Hayvan ad</h3>
                <p className='fw-normal contentDesciription'>
                  açıklama:quisquam? Laudantium eaque inventore blanditiis tempora?
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

export default Content
