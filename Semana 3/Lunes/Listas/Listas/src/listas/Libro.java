package listas;

public class Libro {
    private String name;
    private String author;
    private String code;

    public Libro(String name, String author, String code) {
        this.name = name;
        this.author = author;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
}
