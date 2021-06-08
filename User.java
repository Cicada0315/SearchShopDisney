public class User {
    private String id, password, name, dob, gender, phone;
    public User(String id, String password, String name, String dob, String gender, String phone){
        this.id=id;
        this.password=password;
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.phone=phone;
    }

    public String getid(){
		return id;
	}

    public String getPassword(){
        return password;
    }

    public String getName(){
		return name;
	}

    public String getDob(){
        return dob;
    }

    public String getGender(){
		return gender;
	}
    
    public String getPhone(){
		return phone;
	}

    public void setPassword(String newpassword){
        this.password=newpassword;
    }

    public void setName(String newname){
        this.name=newname;
    }

    public void setDob(String newdbob){
        this.dob=newdbob;
    }

    public void setGender(String newgender){
        this.gender=newgender;
    }

    public void setPhone(String newnumber){
        this.phone=newnumber;
    }
}
