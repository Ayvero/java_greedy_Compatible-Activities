package Greedy_2;



	/**
	 * Ejercicio 3 Maximizar el n�mero de actividades compatibles. Se tienen n
	 * actividades que necesitan utilizar un recurso, tal como una sala de
	 * conferencias, en exclusi�n mutua. Cada actividad i tiene asociado un tiempo
	 * de comienzo ci y un tiempo de finalizaci�n fi de utilizaci�n del recurso, con
	 * ci < fi. Si la actividad i es seleccionada se llevar� a cabo durante el
	 * intervalo [ci, fi). Las actividades i y j son compatibles si los intervalos
	 * [ci, fi) y [cj, fj) no se superponen (es decir, ci > fj o cj > fi). El
	 * problema consiste en encontrar la cantidad m�xima de actividades compatibles
	 * entre s�.
	 * 
	 * 
	 *
	 */
	public class greedy {
		Actividad actividades; // Tiene una lista de actividades.
		Recurso recursos; // Recursos, puede ser una lista de recursos, que se a su vez tiene una lista de
							// actividades asignadas

		public greedy(Actividad actividades, Recurso recursos) {
			this.actividades = actividades;
			this.recursos = recursos;
		}

		public Recurso ordenar() {
			boolean pudoAsignar = true;
			while (pudoAsignar && actividades.hayActividades()) {// Mientras haya actividades para asignar y haya podido
																	// asignar
				Actividad actividad = actividades.getMenorComienzo();// Me da la actividad que empieza primero con ci menor
																		// y la quita de
																		// la lista de actividades;
				actividades.quitar(actividad);// Quita la actividad de las actividades, por ah� queda m�s claro que quitarla
												// arriba
				pudoAsignar = recursos.asignar(actividad);// Asigna una actividad en un recurso que no est� ocupado en la
															// hora de comienzo de la actividad o la hora de "liberacion"
															// del recurso < a la hora de comienzo de la actividad
															// seleccionada
			}

			if (!actividades.hayActividades()) {
				System.out.println("Se asignaron todas las actividades");
			} else {
				System.out.println("No se pudo completar la asignacion de todas las actividades");
			}
			return recursos; // retorno recursos para ver las actividades que fueron asignadas.
		}
	}


