package addressbook;
import java.util.ArrayList;

public class AddressBook implements AddressBookInterface {
	ArrayList<Contact> book = new ArrayList<Contact>();
	@Override
	public Contact getContact(String number) {
		int numb = Integer.parseInt(number);
		return book.get(numb);
	}

	@Override
	public String list() {
	String all = "";
                all = book.get(0)+", "+book.get(1)+", "+book.get(2)+", "+book.get(3);
                
		return all;
	}

	@Override
	public void add(Contact c) {
            
    book.add(c);
	}

	@Override
	public void delete(String s) {
		for(int i = 0; i< book.size();i++){
            if(book.get(i).getName()==s||book.get(i).getSurname()==s){
            book.remove(i);
            }
            }

	}

	@Override
	public Contact search(String s) {
	Contact answer = null;	
            for(int i = 0; i< book.size();i++){
                if(book.get(i).getName()==s||book.get(i).getSurname()==s){
                answer =book.get(i);
                break;
                }
                }
		return answer;
	}

	@Override
	public Contact searchAll(String s) {
		Contact answer = null;	
        for(int i = 0; i< book.size();i++){
            if(book.get(i).toString().contains(s)){
            answer = book.get(i);
            break;
            }
            }
	return answer;
	}

	@Override
	public void print() {
		System.out.println(book.get(0)+"\n"+
				book.get(1)+"\n"+
				book.get(2)+"\n"+
				book.get(3)+"\n"
	);

	}

}
