public class MyClass{

	public static void main(String[] args){
		//decalram si initializam variabila primitiva a
		int a = 1;
		//decaram si intializam variabila de referinta myS
		String myS = "a";
		
		//afisam valoarea primitiva a lui a declarat in metoda main
		System.out.println(a);
		//chemam metoda doSomething trimitand doi parametri, unul de tip int (primitiv) 
		//altul de tip String (variabila de referinta), cerand sa ne printeze rezultatul.
		System.out.println(doSomething(a, myS));
		//pentru control afisam din nou variabila a decalrata in metoda main dupa apelarea metodei
		System.out.println(a);
		// la fel ca si mai sus, insa cu variabila myS
		System.out.println(myS);
		//testam valoarea lui a dupa apelarea metodei daca aceasta are valoare cu care am initializat-o
		//in metoda
		System.out.println(myS.equals("b"));
	}
	
	public static int doSomething(int a, String someString){ 
	    /*metoda doSomething nu creaza o referinta si nici nu intializeaza cei doi parametri trimisi
		//catre ea ci practic faca o copie a acestora (in cazul nostru un obiect de tip String si o
		// variabila prinmitiva) cu care va opera in intriorul metodei. Metoda doSomething nu va schimba
		valoarea variabilelor din metoda din care a fost apelata.*/
		System.out.println(someString = "b");
		//someString are valoarea 'b' = true
		System.out.println(someString.equals("b"));
		//in interiorul metodei doSomething() a are valoarea 2 fiind apelata o singura data.
		//in metoda main ea are valoarea 1.
		return a += 1;
	}
}