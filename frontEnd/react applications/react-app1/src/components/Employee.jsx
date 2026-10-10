import './Employee.css'
function Employee(props){
    return <>
    <div class="emp">
        <h1>{props.emp.empId}</h1>
        <input type="text" value={props.emp.empName}></input>
         <h1>{props.emp.empName}</h1>
        <h1>{props.emp.address}</h1>
    </div>
    </>
}
export default Employee;