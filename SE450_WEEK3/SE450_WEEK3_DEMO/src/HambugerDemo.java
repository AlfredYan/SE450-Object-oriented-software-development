/**
 * Hamburger demo
 * use builder pattern for complex structures, make code more readable
 * @author KYAN4
 *
 */
public class HambugerDemo {
	public static void main(String[] args){
		// get Burger without builder pattern
		Burger burger = new Burger(new Patty(), null, new Tomato(), null, null, null, new Ketchup(), null);
		
		// get Burger with builder pattern
		Burger burgerWithBuilder = new BurgerBuilder()
									.setPatty(new Patty())
									.setTomato(new Tomato())
									.setMustard(new Mustard())
									.toBurger();
	}
}

// builder pattern
class BurgerBuilder {
    private IPatty patty;
    private ILettuce lettuce;
    private ITomato tomato;
    private ICheese cheese;
    private IOnion onion;
    private IPickle pickle;
    private IKetchup ketchup;
    private IMustard mustard;
    
    public BurgerBuilder setPatty(IPatty patty) {
    	this.patty = patty;
    	return this;
    }
    
    public BurgerBuilder setLettuce(ILettuce lettuce) {
    	this.lettuce = lettuce;
    	return this;
    }
    
    public BurgerBuilder setTomato(ITomato tomato) {
		this.tomato = tomato;
		return this;
	}
    
	public BurgerBuilder setCheese(ICheese cheese) {
		this.cheese = cheese;
		return this;
	}
    
	public BurgerBuilder setOnion(IOnion onion) {
		this.onion = onion;
		return this;
	}
    
	public BurgerBuilder setPickle(IPickle pickle) {
		this.pickle = pickle;
		return this;
	}
    
	public BurgerBuilder setKetchup(IKetchup ketchup) {
		this.ketchup = ketchup;
		return this;
	}
    
	public BurgerBuilder setMustard(IMustard mustard) {
		this.mustard = mustard;
		return this;
	}
    
    public Burger toBurger() {
    	return new Burger(patty, lettuce, tomato, cheese, onion, pickle, ketchup, mustard);
    }
}

class Burger {
    private IPatty patty;
    private ILettuce lettuce;
    private ITomato tomato;
    private ICheese cheese;
    private IOnion onion;
    private IPickle pickle;
    private IKetchup ketchup;
    private IMustard mustard;
    
    public Burger(IPatty patty, ILettuce lettuce, ITomato tomato, ICheese cheese, IOnion onion, IPickle pickle, IKetchup ketchup, IMustard mustard) {
        this.patty = patty;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheese = cheese;
        this.onion = onion;
        this.pickle = pickle;
        this.ketchup = ketchup;
        this.mustard = mustard;
    }
}

interface IPatty {}
interface ILettuce {}
interface ITomato {}
interface ICheese {}
interface IOnion {}
interface IPickle {}
interface IKetchup {}
interface IMustard {}

class Patty implements IPatty {}
class Lettuce implements ILettuce {}
class Tomato implements ITomato {}
class Cheese implements ICheese {}
class Onion implements IOnion {}
class Pickle implements IPickle {}
class Ketchup implements IKetchup {}
class Mustard implements IMustard {}