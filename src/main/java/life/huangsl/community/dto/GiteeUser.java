package life.huangsl.community.dto;

/**
 * @author hsl
 * @create 2021-07-28 22:26
 */
public class GiteeUser {
    private String name;
    private Long id;
    private String bio;

    @Override
    public String toString() {
        return "GiteeUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", bio='" + bio + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}