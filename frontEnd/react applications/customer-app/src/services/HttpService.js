import axios from "axios";

class HttpService{
    getAllCustomers(){
        //returns Promise object
        return axios.get("http://localhost:3001/customers")
    }
     addNewCustomer(c){
        alert(c.id);
        console.log("Added")
        return axios.post("http://localhost:3001/customers",c)
    }

    searchById(id){
        return axios.get("http://localhost:3001/customers/"+id);
    }  
}
export default HttpService;