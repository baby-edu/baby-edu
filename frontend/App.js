import { BrowserRouter, Route, Routes } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
//componetns
import Navbar from './src/component/Navbar';
//pages 
import Animal from './src/pages/Animal';
import Plants from './src/pages/Plants';
import Planets from './src/pages/Planets';
import Buildings from './src/pages/Buildings';
import Family from './src/pages/Family';
import Home from './src/pages/Home';


function App() {

  return (
    <BrowserRouter>
    <Navbar></Navbar>
      <Routes>
      <Route index element={<Home/>} ></Route>
      <Route path='/family'  element={<Family/>} ></Route>
      <Route path='/plants' element={<Plants/>}></Route>
      <Route path='/planets'  element={<Planets/>} ></Route>
      <Route path='/animals' element={<Animal/>}></Route>
      <Route path='/buildings' element={<Buildings/>}></Route>
      </Routes>
    </BrowserRouter>

  );
}

export default App;
