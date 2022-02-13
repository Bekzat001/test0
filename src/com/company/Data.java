package com.company;

public class Data {
    private String email;
    private String contacts;
    private String address;

    public Data() {//empty constructor to set default values
        this.email = "samsungalaxyj77715@gmail.com";
        this.contacts = "87753121910";
        this.address = "Nur-Sultan,Kabanbai 60a/6";
    }

    public Data(String email, String contacts, String address) {//constructor to change values
        this.email = email;
        this.contacts = contacts;
        this.address = address;
    }

    public String getEmail() {//to get email
        return email;
    }

    public void setEmail(String email) {//to set email
        this.email = email;
    }

    public String getContacts() {//to get contacts
        return contacts;
    }

    public void setContacts(String contacts) {//to set contacts
        this.contacts = contacts;
    }

    public String getAddress() {//to get address
        return address;
    }

    public void setAddress(String address) {//to set address
        this.address = address;
    }
    public void Contacts(){//method for output information(contacts)
        System.out.println("Our address:"+this.address+"\n"
                +"Our phonenumber:"+this.contacts+"\n"+"Our email:"+this.email);
    }

}
