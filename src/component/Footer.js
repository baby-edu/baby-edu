import React from 'react'

import './footer.css';


function Footer() {
  return (
    <div>
      <div className='container-fluid footer'>
        <div className="container">
          <div className="row ">
            <div id='whoAreYou' className="col-sm-12 col-md-6 col-lg-4 box">
              <h3>Who Are You ?</h3>
              <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Asperiores nihil aspernatur laborum.</p>
            </div>
            <div id='categories' className="col-sm-12 col-md-6 col-lg-4 box">
              <h3>Categories</h3>
              <ul >
                <li ><a href='/family'>Aile</a></li>
                <li ><a href='/animals'>Hayvanlar</a></li>
                <li ><a href='/plants'>Bitkiler</a></li>
                <li ><a href='/buildings'>Yapılar</a></li>
                <li ><a href='/planets'>Gezegenler</a></li>
              </ul>
            </div>
            <div id='about' className="col-sm-12 col-md-6 col-lg-4 box">
              <h3>About</h3>
              <ul>
                <li ><a href='/'>Bize Ulaşın</a></li>
                <li ><a href='/'>SSS</a></li>
                <li ><a href='/'>daha fazlası</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <div className='alt container-fluid'>
        <div className='row'>
          <div className='col-sm-12 col-md-6 col-lg-4' >
            <strong> @2022 Bebekler</strong> - Bebekler için öğrenim kartları
          </div>
          <div className='col-sm-12 col-md-6 col-lg-4' >
          </div>
          <div className='col-sm-12 col-md-6 col-lg-4 d-flex justify-content-end' >
           her hakkı saklıdır sjsjsjsjsjjsjsj :)))
          </div>
        </div>
      </div>
    </div>
  )
}

export default Footer