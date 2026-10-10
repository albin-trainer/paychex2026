import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'
import Employee from './components/Employee'

function App() {
  let empData=[
    {"empId":101,"empName":"Raj","address":"Bangalore"},
    {"empId":102,"empName":"Manaas","address":"Hyderbad"},
    {"empId":103,"empName":"Gaurav","address":"Pune"},
    {"empId":104,"empName":"Pranshu","address":"Vadodara"},
  ];
    return (
    <>
    {
      /*
        <Employee emp={empData[0]}/>
        <Employee emp={empData[1]}/>
        */
    }
  
    {
      empData.map(e => <Employee emp={e}/>)
    }
    </>
  )
}

export default App
