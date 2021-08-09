package aug3;



public class Bussinessvalid {
	//checkedException
	public boolean isValidEmail(String s) throws InvalidEmailException {
		if(s!=null && s.matches("[a-zA-z0-9_/-/.]+[@][a-z]+[/.]{2,3}"))
			return true;
		else
			throw new InvalidEmailException("Invalid email string:");	
	}
	
	public boolean isValidPassword(String s) throws InvalidPassException{
		if(s!=null && s.matches("[A-Z][a-zA-Z0-9/@/_/-/.]"))
			return true;
		else
			throw new InvalidPassException("Invalid password");	
	}
	public boolean isValidAdhar(String s) throws InvalidAdharException{
		if(s!=null && s.matches("[0-9]{12}"))
			return true;
		else
			throw new InvalidAdharException("Invalid Adhar number");	
	}
}