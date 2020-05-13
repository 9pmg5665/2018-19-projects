package addressbook;

public class AddressBook implements AddressBookInterface {
private Contact []addresses = new Contact[4];
	@Override
	public Contact getContact(String number) {
		int numb = Integer.parseInt(number);
		return addresses[numb];
	}

	@Override
	public String list() {
	String all = "";
                all = addresses[0]+", "+addresses[1]+", "+addresses[2]+", "+addresses[3];
                
		return all;
	}

	@Override
	public void add(Contact c) {
            for(int i = 0; i< addresses.length;i++){
            if(addresses[i]==null){
            addresses[i] = c;
            break;
            }
            }
    addresses[addresses.length-1] = c;
	}

	@Override
	public void delete(String s) {
		for(int i = 0; i< addresses.length;i++){
            if(addresses[i].getSurname()==s||addresses[i].getSurname()==s){
            addresses[i]=null;
            }
            }

	}

	@Override
	public Contact search(String s) {
	Contact answer = null;	
            for(int i = 0; i< addresses.length;i++){
                if(addresses[i].getName()==s||addresses[i].getSurname()==s){
                answer = addresses[i];
                break;
                }
                }
		return answer;
	}

	@Override
	public Contact searchAll(String s) {
		Contact answer = null;	
        for(int i = 0; i< addresses.length;i++){
            if(addresses[i].toString().contains(s)){
            answer = addresses[i];
            break;
            }
            }
	return answer;
	}

	@Override
	public void print() {
		System.out.println(addresses[0]+"\n"+
				addresses[1]+"\n"+
				addresses[2]+"\n"+
				addresses[3]+"\n"
	);

	}

}
