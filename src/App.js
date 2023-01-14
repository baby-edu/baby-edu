import { BrowserRouter, Route, Routes } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
//componetns
// import Content from './component/Content';
import Navbar from './component/Navbar';
import İletisim from './component/İletisim';
//pages 
import Anasayfa from './pages/Anasayfa';
import Aile from './pages/Aile';
import Bitkiler from './pages/Bitkiler';
import Gezegenler from './pages/Gezegenler';
import Hayvanlar from './pages/Hayvanlar';
import Yapilar from './pages/Yapilar';


function App() {

  return (
    <BrowserRouter>
    <Navbar></Navbar>
      <Routes>
      <Route index element={<Anasayfa/>} ></Route>
      <Route path='aile'  element={<Aile/>} ></Route>
      <Route path='bitkiler' element={<Bitkiler/>}></Route>
      <Route path='gezegenler'  element={<Gezegenler/>} ></Route>
      <Route path='hayvanlar' element={<Hayvanlar/>}></Route>
      <Route path='aile'  element={<Aile/>} ></Route>
      <Route path='yapilar' element={<Yapilar/>}></Route>
      <Route path='iletisim' element={<İletisim/>}></Route>
      </Routes>
    </BrowserRouter>



  
  );
}

export default App;
