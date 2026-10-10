import { useEffect } from "react";
import { useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import HttpService from "../services/HttpService";

function CustomerForm(){
    const [customer, setCustomer] = useState(  {
        id: "",
        cname: "",
        gender: "",
        address: {
          doorNo: "",
          place: "",
        }
      });
      let [formHeading,setFormHeading]=useState("Add Customer")
   // let obj={"empid":4,name:"abcd","address":"Blore"}
      //let {id}=arr; //Destructiring
    // let {name}=obj;
     // let {empid}=obj;

      let {id}  =  useParams(); //{"id":101,"name":"zzyz"}

      let service= new HttpService();
      useEffect( ()=>{
        if(id>0){
          setFormHeading("Update Customer")
          service.searchById(id).then(res=> setCustomer(res.data))
            
        }
      },[]);
      console.log(id);

      let navigate=useNavigate();
      let goBack=()=>{
        navigate("/customers")
      }

      let idHandler= (evt)=>{
        setCustomer( {...customer, id:evt.target.value})
      }
      let nameHandler=(evt)=>{
          setCustomer({...customer,cname:evt.target.value})
      }

    
    let genderHandler=(evt)=>{
        setCustomer({...customer,gender:evt.target.value})
    }

      ////for address obj in Customer
      let doorNoHandler= (evt)=>{
        setCustomer(  {...customer,
            address: {...customer.address, doorNo: evt.target.value}})
      }

      let placeNameHandler= (evt)=>{
        setCustomer(  {...customer,
            address: {...customer.address, place: evt.target.value}})
      }

     

      //other fields of address
    let  handleSubmit= (evt)=>{
        //in default when button clicked the page gets refresh
        //to avoid refreshing the page preventDefault() 
        evt.preventDefault();       
        console.log(customer);
      
      if(id==0)
        service.addNewCustomer(customer).then(res=>alert("customer Added "));
      else if(id>0)
        service.updateCustomer(customer).then(res=>alert("customer updated "));
      }
    return <>
      <div className="container mt-5">
      <div className="row justify-content-center">
        <div className="col-md-6">

          <div className="card shadow">
            <div className="card-header bg-primary text-white text-center">
              <h4>{formHeading}</h4>
            </div>

            <div className="card-body">
              <form onSubmit={handleSubmit}>

                <div className="mb-3">
                  <label for="cid">ID</label>
                  <input
                    type="text"
                    name="id"
                    id="cid"
                    className="form-control"  value={customer.id}
                    onChange={idHandler}
                  />
                </div>

                <div className="mb-3">
                  <label for ="cname">Name</label>
                  <input
                    type="text"
                    name="name"
                    className="form-control" id="cname" value={customer.cname}
                    onChange={nameHandler}
                  />
                </div>


                <div className="mb-3">
                  <label for="gender">Gender</label>
                  <select
                    name="gender" id="gender"
                    className="form-select" value={customer.gender}
                    onChange={genderHandler}
                  >
                    <option value="">Select</option>
                    <option value="M">Male</option>
                    <option value="F">Female</option>
                  </select>
                </div>

               

                <hr />
                <h5 className="text-primary">Address</h5>

                <div className="mb-3">
                  <label for="doorno">Door No</label>
                  <input
                    type="text"
                    name="doorNo" id="doorno"
                    className="form-control" value={customer.address.doorNo}
                    onChange={doorNoHandler}
                  />
                </div>

                <div className="mb-3">
                  <label for="placename">Place Name</label>
                  <input
                    type="text"
                    name="placeName" id="placename"
                    className="form-control" value={customer.address.place}
                    onChange={placeNameHandler}
                  />
                </div>


                
                <button className="btn btn-success w-50  me-2">
                  Save Customer
                </button>
                <button  className="btn btn-success w-40" 
                 type="button" onClick={goBack}>Back</button>
              </form>
            </div>
          </div>

        </div>
      </div>
    </div>
    </>
}
export default CustomerForm 