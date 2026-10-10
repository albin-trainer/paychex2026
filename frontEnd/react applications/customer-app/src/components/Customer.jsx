import './Customer.css'
import male from '../assets/male.png';
import female from  '../assets/female.jpg';
import { Link } from 'react-router-dom';
function Customer(props){
return <>
 <div class="container card mycard">
  <div class="card-header">
    {props.cust.id}
  </div>
  <div class="card-body">
    <h5 class="card-title">{props.cust.cname}</h5>
    <p class="card-text">{props.cust.address.place}</p>
    { /* conditional rendering   */ }
    {props.cust.gender=="M" &&  <img src={male} width="100px"/> }
    {props.cust.gender=="F" &&  <img src={female} width="100px"/> }
    <Link to={`../form/${props.cust.id}`} class="btn btn-primary">Edit </Link>
  </div>
</div>
</>
}

export default Customer;