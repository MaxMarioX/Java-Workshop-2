package pl.coderslab.entity;

public class User {
    private int id;
    private String userName;
    private String email;
    private String password;

    public void setId(int _id)
    {
        this.id = _id;
    }

    public void setUserName(String _username)
    {
        this.userName = _username;
    }

    public void setEmail(String _email)
    {
        this.email = _email;
    }

    public void setPassword(String _password)
    {
        this.email = _password;
    }

    public int getId()
    {
        return this.id;
    }

    public String getUsername()
    {
        return this.userName;
    }

    public String getEmail()
    {
        return this.email;
    }

    public String getPassword()
    {
        return this.password;
    }
}
