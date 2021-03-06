package us.lsi.algoritmos;

import java.util.List;

import com.google.common.collect.Lists;

import us.lsi.bt.AlgoritmoBT;
import us.lsi.bt.ProblemaBT;
import us.lsi.pd.AlgoritmoPD;
import us.lsi.pd.ProblemaPD;

public class Algoritmos {
	
	/**
	 * @param <S> El tipo de la solución
	 * @param <A> El tipo de la alternativa
	 * @param p - Problema a resolver 
	 * @return Algoritmo de Programación Dinámica para resolver le problema
	 */
	public static <S, A> AlgoritmoPD<S,A> createPD(ProblemaPD<S, A> p) {
		List<ProblemaPD<S, A>> lis = Lists.newArrayList();
		lis.add(p);
		return new AlgoritmoPD<S, A>(lis);
	}

	/**
	 * @param <S> El tipo de la solución
	 * @param <A> El tipo de la alternativa
	 * @param p - Conjunto de problemas a resolver 
	 * @return Algoritmo de Programación Dinámica para resolver los problemas
	 */
	public static <S, A> AlgoritmoPD<S,A> createPD(Iterable<ProblemaPD<S, A>> p) {
		return new AlgoritmoPD<S, A>(p);
	}
	
	/**
	 * @param <S> El tipo de la solución
	 * @param <A> El tipo de la alternativa
	 * @param p - Problema a resolver
	 * @return Algoritmo de Backtracking para resolver el problema
	 */
	public static <S, A> AlgoritmoBT<S,A> createBT(ProblemaBT<S, A> p) {
		return new AlgoritmoBT<S,A>(p);
	}
}
