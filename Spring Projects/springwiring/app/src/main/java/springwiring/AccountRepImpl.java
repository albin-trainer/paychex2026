package springwiring;

public class AccountRepImpl  implements AccountRep{
 public     String credit(float amt){
    //here i need to connect with DB
    return "The amount of "+amt+" credited in ur savings account";
 }
}
