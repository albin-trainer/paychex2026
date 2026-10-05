package springwiring;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService {
    	@Autowired 
	private AccountRep rep;

	//here spring injects the accountrep
	/*@Autowired 
	public void setRepository(AccountRep rep) {
		System.out.println("setter called ...");
		this.rep = rep;
	}*/
	@Override
	public String creditService(float amt) {
		return rep.credit(amt);
	}

    
}
