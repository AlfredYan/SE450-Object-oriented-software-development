/**
 * An example of dependency injection (can not be compiled)
 * @author KYAN4
 *
 */

interface ICreditCard{
	
}

class CreditCard implements ICreditCard{
	
}

interface ICardReader{
	void read(ICreditCard cc);
}

class creditCardChipReader implements ICardReader{
	public void read(ICreditCard cc){/*...*/};
}

class creditCardSwipeReader implements ICardReader{
	public void read(ICreditCard cc){/*...*/};
}

////////////////////////////////////////////////////////////////
public class DependencyInjection {
	public static void main(String[] args){
		CreditCardProcessor processor = new CreditCardProcessor();
		//dependency injection
		processor.processPayment(new creditCardSwipeReader(), new CreditCard());
	}
}

class CreditCardProcessor{
	//dependency injection
	public void processPayment(ICardReader r, ICreditCard cc){
		r.read(cc);
	}
}

