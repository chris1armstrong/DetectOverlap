
public class Claim {
	private Integer id;
	private Integer leftSpace;
	private Integer topSpace;
	private Integer width;
	private Integer height;
	
	public Claim(Integer id, Integer leftSpace, Integer topSpace, Integer width, Integer height) {
		this.id = id;
		this.leftSpace = leftSpace;
		this.topSpace = topSpace;
		this.width = width;
		this.height = height;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLeftSpace() {
		return leftSpace;
	}

	public void setLeftSpace(Integer leftSpace) {
		this.leftSpace = leftSpace;
	}

	public Integer getTopSpace() {
		return topSpace;
	}

	public void setTopSpace(Integer topSpace) {
		this.topSpace = topSpace;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

}
