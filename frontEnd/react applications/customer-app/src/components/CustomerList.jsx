import { useEffect, useState } from "react";
import Customer from "./Customer";
import HttpService from "../services/HttpService";

function CustomerList(){
   
    let x=10;//local variable its not a react state
    //let count=0;
    //useState is hook to maintain state in react component
    let [count,setCount]=useState(10);
    let [name,setName]=useState("Albin");
    let [search,setSearch]=useState("");
    let [customers,setCustomers]= useState([  ])

   let service= new HttpService();

    useEffect( ()=>{ 
        //receive prominsse obj
        //promise obj has a fn called then
        service.getAllCustomers().then(
            //callback Fn, will get called autimatically once the 
            //client received the response
            (res)=>setCustomers(res.data)
        )
     } ,[] );

    let counter=()=>{
        setCount(count+1);
        console.log(count)
    }
    let searchCustomers=(event)=>{
        setSearch(event.target.value);
    }
    customers=customers.filter(c=>c.cname.toLowerCase().includes(search.toLowerCase()))
    return <>
     <div class="container">
        <h1> Count = {count}</h1>
        <button onClick={counter}>Add count</button>
          <h2>Hi {name}</h2>
         <div class="col-sm-4">
      search:    <input type="text" class="form-control" onKeyUp={searchCustomers} ></input>
            </div>
            <br></br>
        {
            customers.map(c => <Customer key={c.cid}  cust={c}/> )
        }
        </div>
    </>

}

export default CustomerList;