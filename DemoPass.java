
class Add
{ 
	int x, y; 
	Add(int i, int j) 
	{ 
		x = i; 
		y = j;
	}  
} 
class DemoPass
{ 
	public static void main(String[] args) 
	{ 
		Add obj = new Add(5, 10); 
		// call by value
		change(obj.x, obj.y);
		System.out.println("x = "+obj.x); 
		System.out.println("y = "+obj.y);
		
	} 
	public static void change(int x, int y) 
	{  
		x++;
		y++;
	} 
}

	