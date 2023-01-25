import React, { Component } from 'react';
import './Content.css';
import Videom from './video/bg.mp4'
import 'animate.css';


export default class VideoBg extends Component {
    render() {
        return (
            <div className='container'>
                <div className="row">
                    <div id='hero' className="col-12">
                        <video src={Videom} autoPlay loop muted></video>
                        <div className="bg-content col-12">
                          <h2 className='animate__animated animate__backInDown' >Mustafa Kemal Atatürk'ün dediği gibi;</h2>
                                <p className='animate__animated animate__backInUp' id='infoP'><i>"Küçük hanımlar, küçük beyler! Sizler hepiniz geleceğin bir gülü, yıldızı ve ikbal ışığısınız. 
                        Memleketi asıl ışığa boğacak olan sizsiniz. Kendinizin ne kadar önemli, değerli olduğunuzu düşünerek ona
                         göre çalışınız. Sizlerden çok şey bekliyoruz."</i></p>
                                <img width={'60px'} src='https://img.tamindir.com/resize/128x128/ti_e_ul/muratisci55/p/comizindeyiz-iatum-izindeyiz-logo-_250x250.png' /> 
                        </div>
                    </div>
                </div>

            </div>
        )
    }
}
