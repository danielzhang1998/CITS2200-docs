package SingleLinkedList;

public class SingleLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroNode hero1 = new HeroNode(1,"a","a_nickname");
		HeroNode hero2 = new HeroNode(2,"b","b_nickname");
		HeroNode hero3 = new HeroNode(3,"c","c_nickname");
		HeroNode hero4 = new HeroNode(4,"d","d_nickname");
		HeroNode hero5 = new HeroNode(5,"e","e_nickname");
		HeroNode hero6 = new HeroNode(6,"f","f_nickname");
		
		SingleLinkedList SingleLinkedList = new SingleLinkedList();
		SingleLinkedList.addByOrder(hero1);
		SingleLinkedList.addByOrder(hero2);
		SingleLinkedList.addByOrder(hero5);
		SingleLinkedList.addByOrder(hero6);
		SingleLinkedList.addByOrder(hero3);
		SingleLinkedList.addByOrder(hero4);
		SingleLinkedList.addByOrder(hero6);
		SingleLinkedList.list();
		
		HeroNode  newHeroNode = new HeroNode(2,"b_change","b_nickname_change");
		SingleLinkedList.update(newHeroNode);
		System.out.println("");
		System.out.println("The list after change");
		SingleLinkedList.list();
		
		System.out.println("");
		System.out.println("The list after change");
		SingleLinkedList.delete(2);
		SingleLinkedList.list();
	}

}

//	define the SingleLinkedList to manage the hero
class SingleLinkedList{
	private HeroNode head = new HeroNode(0, "", "");
	
	/*
	//	add node into the single linked list
	public void add(HeroNode heroNode) {
		HeroNode temp=head;
		while(true) {
			if(temp.next==null) {
				break;
			}
			temp=temp.next;
		}
		temp.next=heroNode;
	}
	*/
	public void addByOrder(HeroNode heroNode) {
		HeroNode temp=head;
		boolean flag = false;
		while(true) {
			if(temp.next==null) {
				break;
			}
			if(temp.next.number>heroNode.number) {
				break;
			}else if(temp.next.number==heroNode.number) {
				flag=true;//	this number already appear
				break;
			}
			temp=temp.next;
		}
		if(flag==true) {
			System.out.printf("The number %d already appear\n",heroNode.number);
		}
		else {
			heroNode.next=temp.next;
			temp.next=heroNode;
		}
	}
	
	public void update(HeroNode newHeroNode) {
		if(head.next==null) {
			System.out.println("It is empty");
			return;
		}
		HeroNode temp=head.next;
		boolean flag = false;
		while(true) {
			if(temp==null) {
				break;
			}
			if(temp.number==newHeroNode.number) {
				flag=true;
				break;
			}
			temp=temp.next;
		}
		if(flag==true) {
			temp.name=newHeroNode.name;
			temp.number=newHeroNode.number;
		}else {
			System.out.println("This number is not exists.");
		}
	}
	
	public void delete(int number) {
		HeroNode temp =head;
		boolean flag = false;
		while(true) {
			if(temp.next==null) {
				break;
			}
			if(temp.next.number==number) {
				flag = true;
				break;
			}
			temp=temp.next;
		}
		if(flag==true) {
			temp.next=temp.next.next;
		}else {
			System.out.printf("The number %d is not exists",number);
		}
	}
	
	public void list() {
		if(head.next==null) {
			System.out.println("it is empty");
			return;
		}
		HeroNode temp=head.next;
		while(true) {
			if(temp==null) {
				break;
			}
			System.out.println(temp);
			temp=temp.next;
		}
	}
}

class HeroNode{
	public int number;
	public String name;
	public String nickname;
	public HeroNode next;
	
	public HeroNode(int number,String name, String nickname) {
		this.number=number;
		this.name=name;
		this.nickname=nickname;
	}
	
	public String toString() {
		return "HeroNode [number=" + number + ", name=" + name + ", nickname=" + nickname +"]";
	}
}
