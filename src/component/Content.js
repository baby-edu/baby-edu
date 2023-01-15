import React from 'react';
import './Content.css';

function Content() {
  
  return (
    <div className='body'>
      <div className='container'>
        <div className='row'>
          {/* tekrar edilcek bölüm */}
          <div className='col-sm-12 col-lg-4 col-md-6'>
            <div className='content'>
              <div className='card-img'>
                <img src='https://i.pinimg.com/originals/6e/c5/e7/6ec5e78480b106c36671956d985a4470.jpg'></img>
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
