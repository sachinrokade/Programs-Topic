
interface i1
{
	void m1();
}
interface i2
{
	protected void m1();
}
class A implements i1,i2
{
	Properties p = new Properties();

	@Override
	public void m1() {
	}
	
}
public class TestInterfceIn {

}
