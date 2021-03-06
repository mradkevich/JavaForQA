package com.example.tests;

public class ContactData implements Comparable<ContactData> {
	private String id;
	private String name = "";
	private String lastname = "";
	private String address = "";
	private String home = "";
	private String mobile = "";
	private String work = "";
	private String email = "";
	private String email2 = "";
	private String bday = "-";
	private String bmonth = "-";
	private String byear = "";
	private String new_group = "[none]";
	private String address2 = "";
	private String phone2 = "";

	public ContactData() {
	}

	public ContactData(String firstname, String lastname, String address,
			String home, String mobile, String work, String email,
			String email2, String bday, String bmonth, String byear,
			String new_group, String address2, String phone2) {
		this.name = firstname;
		this.lastname = lastname;
		this.address = address;
		this.home = home;
		this.mobile = mobile;
		this.work = work;
		this.email = email;
		this.email2 = email2;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.new_group = new_group;
		this.address2 = address2;
		this.phone2 = phone2;
	}

	@Override
	public String toString() {
		return "ContactData [name=" + name + ", lastname=" + lastname
				+ ", address=" + address + ", home=" + home + ", mobile="
				+ mobile + ", work=" + work + ", email=" + email + ", email2="
				+ email2 + ", bday=" + bday + ", bmonth=" + bmonth + ", byear="
				+ byear + ", new_group=" + new_group + ", address2=" + address2
				+ ", phone2=" + phone2 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		// result = prime * result
		// + ((lastname == null) ? 0 : lastname.hashCode());
		// result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactData other) {
		// compareTo should return < 0 if this is supposed to be less than
		// other, > 0 if this is supposed to be greater than other and 0 if they
		// are supposed to be equal
		int i = this.lastname.toLowerCase().compareTo(
				other.lastname.toLowerCase());
		if (i == 0) {
			i = this.name.toLowerCase().compareTo(other.name.toLowerCase());
			if (i == 0) {
				i = this.email.compareTo(other.email);
				if (i == 0) {
					i = this.mobile.compareTo(other.mobile);
				}
			}
		}
		return i;

	}

	public ContactData withId(String id) {
		this.id = id;
		return this;
	}
	
	public ContactData withName(String name) {
		this.name = name;
		return this;
	}

	public ContactData withLastname(String lastName) {
		this.lastname = lastName;
		return this;
	}

	public ContactData withAddress(String address) {
		this.address = address;
		return this;
	}

	public ContactData withHome(String home) {
		this.home = home;
		return this;
	}

	public ContactData withMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}

	public ContactData withWork(String work) {
		this.work = work;
		return this;
	}

	public ContactData withEmail(String email) {
		this.email = email;
		return this;
	}

	public ContactData withEmail2(String email) {
		this.email2 = email;
		return this;
	}

	public ContactData withBday(String bday) {
		this.bday = bday;
		return this;
	}

	public ContactData withBmonth(String bmonth) {
		this.bmonth = bmonth;
		return this;
	}

	public ContactData withByear(String byear) {
		this.byear = byear;
		return this;
	}

	public ContactData withNew_group(String new_group) {
		this.new_group = new_group;
		return this;
	}

	public ContactData withAddress2(String address) {
		this.address2 = address;
		return this;
	}

	public ContactData withPhone2(String phone) {
		this.phone2 = phone;
		return this;
	}	
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public String getAddress() {
		return address;
	}

	public String getHome() {
		return home;
	}

	public String getMobile() {
		return mobile;
	}

	public String getWork() {
		return work;
	}

	public String getEmail() {
		return email;
	}

	public String getEmail2() {
		return email2;
	}

	public String getBday() {
		return bday;
	}

	public String getBmonth() {
		return bmonth;
	}

	public String getByear() {
		return byear;
	}

	public String getNew_group() {
		return new_group;
	}

	public String getAddress2() {
		return address2;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public void setBmonth(String bmonth) {
		this.bmonth = bmonth;
	}

	public void setByear(String byear) {
		this.byear = byear;
	}

	public void setNew_group(String new_group) {
		this.new_group = new_group;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

}
