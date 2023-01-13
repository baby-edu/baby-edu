import React from 'react'
import './Content.css';

function AnasayfaContent() {
    return (
        <div className='body'>
            <div className='container'>
                <div className='row'>
                    {/* tekrar edilcek bölüm */}
                    <div className='col-sm-12 col-lg-3 col-md-4'>
                        <div className='content'>
                            <div className='card-img'>
                                <img src='https://media.istockphoto.com/id/1136478981/tr/vekt%C3%B6r/sevimli-woodland-orman-hayvan-vector-illustration-set.jpg?s=1024x1024&w=is&k=20&c=FD8QOH1zv5rVqHLXZa0D9rq651iDs9tOjsxl4NlajkQ='></img>
                            </div>
                            <div>
                                <br></br>
                                <h3 className='fs-2 contentName'>{/* Kategori Ad */} Hayvanlar</h3> <br></br>
                                <button type='button' href='' className='btn btn-outline-warning'>Öğrenelim</button>
                            </div>
                        </div>
                    </div>
                    <div className='col-sm-12 col-lg-3 col-md-4'>
                        <div className='content'>
                            <div className='card-img'>
                                <img src='https://img.freepik.com/premium-vector/big-family-father-mother-grandfather-grandmother-children_213307-59.jpg?w=360'></img>
                            </div>
                            <div>
                                <br></br>
                                <h3 className='fs-2 contentName'>{/* Kategori Ad */} Aile</h3> <br></br>
                                <button type='button' href='' className='btn btn-outline-warning'>Öğrenelim</button>
                            </div>
                        </div>
                    </div>


                    {/* Content bitimii */}
                </div>
            </div>
        </div>
    )
}

export default AnasayfaContent
