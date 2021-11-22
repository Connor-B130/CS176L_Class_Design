package labproject7.writtenworks;

public class TestWrittenWorks 
{

	public static void main(String[] args) 
	{
		Novel book = new Novel("Title", "Herman Melville", 1851, "Epic", 135);

		ShortStory smallSt = new ShortStory("Hills Like White Elephants", "Ernest Hemingway", 1927, "Ficton", 25, "No");

		System.out.println(book);
		System.out.println();
		System.out.println(smallSt);
	}
}
