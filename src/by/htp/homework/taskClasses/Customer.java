package by.htp.homework.taskClasses;

public class Customer{
		
	private int id;
	private String name;
	private String middleName;
	private String surName;
	private String numCreditCard;
	private String numBankAcc;

	public Customer (int id, String name, String middleName, String surName, String numCreditCard, String numBankAcc) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.middleName = middleName;
		this.numCreditCard = numCreditCard;
		this.numBankAcc = numBankAcc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getNumCreditCard() {
		return numCreditCard;
	}

	public void setNumCreditCard(String numCreditCard) {
		this.numCreditCard = numCreditCard;
	}

	public String getNumBankAcc() {
		return numBankAcc;
	}

	public void setNumBankAcc(String numBankAcc) {
		this.numBankAcc = numBankAcc;
	}

	@Override
	public String toString() {
		return "Customer [" + surName + " " + name + " " + middleName + " " + ", id: " + id + ", numCreditCard: " + numCreditCard + ", numBankAcc: " + numBankAcc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numBankAcc == null) ? 0 : numBankAcc.hashCode());
		result = prime * result + ((numCreditCard == null) ? 0 : numCreditCard.hashCode());
		result = prime * result + ((surName == null) ? 0 : surName.hashCode());
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
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numBankAcc == null) {
			if (other.numBankAcc != null)
				return false;
		} else if (!numBankAcc.equals(other.numBankAcc))
			return false;
		if (numCreditCard == null) {
			if (other.numCreditCard != null)
				return false;
		} else if (!numCreditCard.equals(other.numCreditCard))
			return false;
		if (surName == null) {
			if (other.surName != null)
				return false;
		} else if (!surName.equals(other.surName))
			return false;
		return true;
	}

}
