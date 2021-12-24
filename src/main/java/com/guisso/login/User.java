
package com.guisso.login;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
*
* @author João Gabriel
*/
@Named
@SessionScoped
public class User implements Serializable {

private String Username;
private Integer score = 1;
private Double total = 1234.56;
private String Language = "en";
private String Password = "123";

public String getUsername() {
return this.Username;
}

public void setUsername(String userName) {
this.Username = userName;
}

public String getPassword() {
return this.Password;
}

public void setPassword(String passWord) {
this.Password = passWord;
}


public void setScore(Integer score) {
this.score = score;
}

public Integer getScore() {
return score;
}

public void setTotal(Double total) {
this.total = total;
}

public Double getTotal() {
return total;
}

public void setLanguage(String language) {
this.Language = language;
}

public String getLanguage() {
return this.Language;
}

}
