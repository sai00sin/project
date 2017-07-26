public class File extends Entry {
	private String name;
	private int Size;
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		terurn size;
	}
	protected void printList(String prefix) {
		System.out.println(prefix + "" + this);
	}
}