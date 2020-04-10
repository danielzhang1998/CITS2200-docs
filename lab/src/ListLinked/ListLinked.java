package ListLinked;

import CITS2200.Link;
import CITS2200.OutOfBounds;
import CITS2200.WindowLinked;

	public class ListLinked implements CITS2200.List{
		private Link before;
		private Link after;

			public ListLinked () {
			after = new Link(null, null);
			before = new Link(null, after);
			}
	
		@Override
		public void afterLast(WindowLinked arg0) {
			// TODO Auto-generated method stub
			arg0.link = after;
		}

		@Override
		public void beforeFirst(WindowLinked arg0) {
			// TODO Auto-generated method stub
			arg0.link = before;
		}

		@Override
		public Object delete(WindowLinked arg0) throws OutOfBounds {
			// TODO Auto-generated method stub
			if(!isEmpty() && !isBeforeFirst(arg0) && !isAfterLast(arg0)) {
				if(before.successor==arg0.link) {
					Object the_element_delete=arg0.link.item;
					before.successor=arg0.link.successor;
					arg0.link=before;
					next(arg0);
					return the_element_delete;
				}else if(arg0.link.successor==after) {
					Object the_element_delete=arg0.link.item;
					arg0.link.item=null;
					arg0.link.successor=null;
					return the_element_delete;
				}else {
					Object the_element_delete=arg0.link.item;
					arg0.link.item=arg0.link.successor.item;
					arg0.link.successor=arg0.link.successor.successor;
					next(arg0);
					return the_element_delete;
				}
			}else {
				throw new OutOfBounds("can not delete before first/after last/the empty list");
			}
		}

		@Override
		public Object examine(WindowLinked arg0) throws OutOfBounds {
			// TODO Auto-generated method stub
			if(!isEmpty()) {
				if(!isBeforeFirst(arg0) && !isAfterLast(arg0)) {
					return arg0.link.item;
				}else {
					throw new OutOfBounds("the window is before first/after first");
				}
			}
			else {
				throw new OutOfBounds("the list is empty");
			}
		}

		@Override
		public void insertAfter(Object arg0, WindowLinked arg1) throws OutOfBounds {
			// TODO Auto-generated method stub
			if(!isAfterLast(arg1)) {
				arg1.link.successor=new Link(arg0, arg1.link.successor);
			}
			else {
				throw new OutOfBounds("can not insert the element after the end of list");
			}
		}

		@Override
		public void insertBefore(Object arg0, WindowLinked arg1) throws OutOfBounds {
			// TODO Auto-generated method stub
			if (!isBeforeFirst(arg1)) {
				arg1.link.successor = new Link(arg1.link.item, arg1.link.successor);
				if (isAfterLast(arg1)) after = arg1.link.successor;
				arg1.link.item = arg0;
				arg1.link = arg1.link.successor;
				}
				else throw new OutOfBounds ("inserting before start of list");
				}
			

		@Override
		public boolean isAfterLast(WindowLinked arg0) {
			// TODO Auto-generated method stub
			return arg0.link==after;
		}

		@Override
		public boolean isBeforeFirst(WindowLinked arg0) {
			// TODO Auto-generated method stub
			return arg0.link==before;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return before.successor == after;
		}

		@Override
		public void next(WindowLinked arg0) throws OutOfBounds {
			// TODO Auto-generated method stub
			if (!isAfterLast(arg0)) arg0.link = arg0.link.successor;
			else {
			throw new OutOfBounds("Calling next after list end.");
			}
		}

		@Override
		public void previous(WindowLinked arg0) throws OutOfBounds {
			// TODO Auto-generated method stub
			if (!isBeforeFirst(arg0)) {
				Link current = before.successor;
				Link previous = before;
				while (current != arg0.link) {
					previous = current;
					current = current.successor;
				}
					arg0.link = previous;
				}
				else throw new OutOfBounds ("Calling previous before start of list.");
		}

		@Override
		public Object replace(Object arg0, WindowLinked arg1) throws OutOfBounds {
			// TODO Auto-generated method stub
			if(!isEmpty()&& !isBeforeFirst(arg1)&&!isAfterLast(arg1)) {
					Object the_element_replaced=arg1.link.item;
					arg1.link.item=arg0;
					return the_element_replaced;
			}
				else {
						throw new OutOfBounds ("it is before first or after last.");
				}
		}
		
	}

