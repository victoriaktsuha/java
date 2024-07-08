package services;

import java.util.List;

//solução que recebe apenas lista de integer
//public class CalculationService {
//	
//	public static Integer max(List<Integer> list) {
//		if(list.isEmpty()) {
//			throw new IllegalStateException("List can't be empty");
//		}
//		Integer max = list.get(0);
//		for(Integer item : list) {
//			if(item.compareTo(max) > 0) {
//				max = item;
//			}
//		}
//		return max;
//	}
//	
//}

//solução que recebe list de qualquer tipo

public class CalculationService<T> {
	//para utilizar comparable com tipo T, deve ser declarado com abaixo:
	public static <T extends Comparable<T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for(T item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
	
}
