package services;

import java.util.ArrayList;
import java.util.List;

// solução 1 (reuso) sem generics - reuso apenas para um tipo (integer)

//	public class PrintService {
//		private List<Integer> list = new ArrayList<>();
//
//		public void addValue(Integer value) {
//			list.add(value);
//		}
//
//		public Integer first() {
//			if (list.isEmpty()) {
//				throw new IllegalStateException("List is empty");
//			}
//			return list.get(0);
//		}
//
//		public void print() {
//			System.out.print("[");
//			if (!list.isEmpty()) {
//				System.out.print(list.get(0));
//			}
//			for (int i = 1; i < list.size(); i++) {
//				System.out.print(", " + list.get(i));
//			}
//			System.out.print("]");
//		}
//	}

// solução 2 (type safety & performance) sem generics - utiliza obj para tentar
// atender todos os tipos, mas o problema é que aceita todos os tipos, sem
// segurança de tipo (type safety) e tendo que fazer casting, unboxing, etc

//	public class PrintService {
//		private List<Object> list = new ArrayList<>();
//
//		public void addValue(Object value) {
//			list.add(value);
//		}
//
//		public Object first() {
//			if (list.isEmpty()) {
//				throw new IllegalStateException("List is empty");
//			}
//			return list.get(0);
//		}
//
//		public void print() {
//			System.out.print("[");
//			if (!list.isEmpty()) {
//				System.out.print(list.get(0));
//			}
//			for (int i = 1; i < list.size(); i++) {
//				System.out.print(", " + list.get(i));
//			}
//			System.out.println("]");
//		}
//	}

// solução 3 com generics - com type safety e elimina a necessidade de casting

public class PrintService<T> {
	
	//tipo T <T> - de Type, mas pode ser usado outra letra, palavra..
	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
