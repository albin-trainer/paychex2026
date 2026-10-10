import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'
import CustomerList from './components/CustomerList'
import Menu from './components/Menu'
import { Route, Routes } from 'react-router-dom'
import CustomerForm from './components/CustomerForm'
function App() {
  return (
    <>
    <Menu/>
    <Routes>
      <Route path='/customers' element={<CustomerList/>}/>
      <Route path='/form/:id' element={<CustomerForm/>}/>
    </Routes>
    </>
  )
}

export default App
