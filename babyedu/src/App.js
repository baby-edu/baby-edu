import { BrowserRouter, Route, Routes } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
//componetns
// import Content from './component/Content';
import Navbar from './component/Navbar';
//pages 
import Animal from './pages/Animal';
import Plants from'./pages/Plants';
import Planets from './pages/Planets';
import Buildings from './pages/Buildings';
import Family from './pages/Family';
import Home from './pages/Home';
import Admin from './admin/Admin';





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
      <Route path='/sbuildings' element={<Buildings/>}></Route>
      <Route path='/admin' element={<Admin/>}></Route>
      </Routes>
    </BrowserRouter>

  );
}

export default App;
