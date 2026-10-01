package springwiring;

public class AccountServiceImpl implements AccountService {
    private AccountRep rep;

	//here spring injects the accountrep
	public void setRepository(AccountRep rep) {
		this.rep = rep;
	}
	@Override
	public String creditService(float amt) {
		return rep.credit(amt);
	}

    
}
