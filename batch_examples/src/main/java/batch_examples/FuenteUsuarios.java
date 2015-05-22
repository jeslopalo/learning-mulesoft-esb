package batch_examples;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Random;

import org.apache.commons.lang.NotImplementedException;

public class FuenteUsuarios implements Iterable<Usuario>, Iterator<Usuario> {

	final int count;
	int i = 0;
	Random ran;

	public FuenteUsuarios(final int count) {
		this.count = count;
		ran = new Random(System.currentTimeMillis());
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return i < count;
	}

	@Override
	public Usuario next() {
		if (i < count) {
			++i;
			final Usuario u = new Usuario();
			u.setId(i);
			if (ran.nextBoolean()) {
				u.setSexo("M");
				u.setNombre(generarSecuenciaNomApe(NOMBRES_NI�AS));
			} else {
				u.setSexo("H");
				u.setNombre(generarSecuenciaNomApe(NOMBRES_NI�OS));
			}
			u.setApellido1(generarSecuenciaNomApe(APELLIDOS));
			u.setApellido2(generarSecuenciaNomApe(APELLIDOS));
			u.setFechaNacimiento(generarFN());
			return u;
		} else {
			return null;
		}
	}

	@Override
	public void remove() {
		throw new NotImplementedException("Iterator.remove not implemented!");
	}

	@Override
	public Iterator<Usuario> iterator() {
		return this;
	}

	// Generación de datos aleatorios

	final static String[] NOMBRES_NI�AS = { "LUCIA", "MARIA", "PAULA",
			"DANIELA", "MARTINA", "CARLA", "SARA", "SOFIA", "VALERIA", "JULIA",
			"ALBA", "CLAUDIA", "NOA", "MARTA", "IRENE", "EMMA", "CARMEN",
			"LAURA", "ANA", "AINHOA", "ELENA", "ADRIANA", "VALENTINA",
			"ALEJANDRA", "INES", "AITANA", "ARIADNA", "LEIRE", "AINARA",
			"LAIA", "NEREA", "MARINA", "ANDREA", "CARLOTA", "LOLA", "JIMENA",
			"ANGELA", "CANDELA", "ROCIO", "BLANCA", "VERA", "NORA", "ALICIA",
			"CELIA", "VEGA", "NATALIA", "CLARA", "LEYRE", "VICTORIA", "EVA",
			"OLIVIA", "ISABEL", "CRISTINA", "AINA", "AROA", "NURIA", "LARA",
			"ALMA", "ABRIL", "CAROLINA", "ELSA", "MAR", "MARA", "GABRIELA",
			"MANUELA", "ZOE", "NOELIA", "AFRICA", "IRIA", "BERTA", "ALEXIA",
			"ERIKA", "HELENA", "MIRIAM", "NAIARA", "SILVIA", "AYA", "SALMA",
			"NAIA", "NAYARA", "CHLOE", "MIREIA", "PAOLA", "ONA", "SANDRA",
			"MALAK", "RAQUEL", "ANE", "NAHIA", "JANA", "DIANA", "PATRICIA",
			"MIA", "ANNA", "IRIS", "YANIRA", "LUNA", "ARLET", "NADIA", "LIDIA" };
	final static String[] NOMBRES_NI�OS = { "HUGO", "DANIEL", "PABLO",
			"ALEJANDRO", "ALVARO", "ADRIAN", "DAVID", "MARIO", "DIEGO",
			"JAVIER", "LUCAS", "NICOLAS", "MANUEL", "MARCOS", "IKER", "SERGIO",
			"IZAN", "JORGE", "CARLOS", "MARTIN", "LEO", "MIGUEL", "MARC",
			"MATEO", "ALEX", "GONZALO", "ANTONIO", "IVAN", "JUAN", "ANGEL",
			"RUBEN", "VICTOR", "HECTOR", "SAMUEL", "AITOR", "ERIC", "GABRIEL",
			"JOEL", "RAUL", "JOSE", "RODRIGO", "ADAM", "GUILLERMO", "DARIO",
			"JESUS", "ERIK", "BRUNO", "MARCO", "FRANCISCO", "AARON", "PAU",
			"PEDRO", "ALBERTO", "JAIME", "ENZO", "LUIS", "OLIVER", "ASIER",
			"RAFAEL", "UNAI", "POL", "MOHAMED", "OSCAR", "ANDRES", "BIEL",
			"ISMAEL", "FERNANDO", "ARNAU", "RAYAN", "ALONSO", "MARTI",
			"GERARD", "IAN", "JAN", "IGNACIO", "MIGUEL ANGEL", "CRISTIAN",
			"SANTIAGO", "GAEL", "NIL", "JOAN", "THIAGO", "ENRIQUE", "ISAAC",
			"SAUL", "JOSE ANTONIO", "YAGO", "JOSE MANUEL", "ROBERTO",
			"EDUARDO", "OMAR", "ALEIX", "LUCA", "ORIOL", "JORDI",
			"FRANCISCO JAVIER", "ANDER", "JON", "YERAY", "DYLAN" };
	static String[] APELLIDOS = { "GARCIA", "GONZALEZ", "RODRIGUEZ",
			"FERNANDEZ", "LOPEZ", "MARTINEZ", "SANCHEZ", "PEREZ", "GOMEZ",
			"MARTIN", "JIMENEZ", "RUIZ", "HERNANDEZ", "DIAZ", "MORENO",
			"ALVAREZ", "MUÑOZ", "ROMERO", "ALONSO", "GUTIERREZ", "NAVARRO",
			"TORRES", "DOMINGUEZ", "VAZQUEZ", "RAMOS", "GIL", "RAMIREZ",
			"SERRANO", "BLANCO", "MOLINA", "SUAREZ", "MORALES", "ORTEGA",
			"DELGADO", "CASTRO", "ORTIZ", "RUBIO", "MARIN", "SANZ", "NUÑEZ",
			"IGLESIAS", "MEDINA", "GARRIDO", "CORTES", "SANTOS", "CASTILLO",
			"LOZANO", "GUERRERO", "CANO", "PRIETO", "MENDEZ", "CALVO", "CRUZ",
			"GALLEGO", "VIDAL", "LEON", "MARQUEZ", "HERRERA", "PEÑA", "FLORES",
			"CABRERA", "CAMPOS", "VEGA", "FUENTES", "DIEZ", "CARRASCO",
			"CABALLERO", "NIETO", "REYES", "AGUILAR", "PASCUAL", "HERRERO",
			"SANTANA", "LORENZO", "HIDALGO", "MONTERO", "GIMENEZ", "IBAÑEZ",
			"FERRER", "DURAN", "SANTIAGO", "VICENTE", "BENITEZ", "MORA",
			"ARIAS", "VARGAS", "CARMONA", "CRESPO", "ROMAN", "PASTOR", "SOTO",
			"SAEZ", "VELASCO", "MOYA", "SOLER", "ESTEBAN", "PARRA", "BRAVO",
			"GALLARDO", "ROJAS", "PARDO", "MERINO", "FRANCO", "ESPINOSA",
			"LARA", "IZQUIERDO", "RIVAS", "RIVERA", "CASADO", "ARROYO",
			"REDONDO", "CAMACHO", "SILVA", "REY", "VERA", "GALAN", "LUQUE",
			"OTERO", "MONTES", "RIOS", "SIERRA", "SEGURA", "CARRILLO",
			"MARCOS", "MARTI", "SORIANO", "MENDOZA", "BERNAL", "ROBLES",
			"VILA", "VALERO", "EXPOSITO", "PALACIOS", "HEREDIA", "MACIAS",
			"BENITO", "VARELA", "ANDRES", "GUERRA", "BUENO", "ROLDAN", "MATEO",
			"CONTRERAS", "VILLAR", "PEREIRA", "MIRANDA", "GUILLEN", "MATEOS",
			"ESCUDERO", "AGUILERA", "CASAS", "MENENDEZ", "APARICIO", "RIVERO",
			"ESTEVEZ", "PADILLA", "BELTRAN", "CALDERON", "GALVEZ", "RICO",
			"GRACIA", "ABAD", "CONDE", "JURADO", "SALAS", "PLAZA", "QUINTANA",
			"ARANDA", "ACOSTA", "BERMUDEZ", "BLAZQUEZ", "ROCA", "SANTAMARIA",
			"SALAZAR", "GUZMAN", "MIGUEL", "COSTA", "SERRA", "MANZANO",
			"VILLANUEVA", "CUESTA", "TOMAS", "HURTADO", "RUEDA", "TRUJILLO",
			"AVILA", "PACHECO", "SIMON", "DE LA FUENTE", "PONS", "MESA",
			"LAZARO", "SANCHO", "DEL RIO", "ESCOBAR", "MILLAN", "LUNA",
			"ALARCON", "BLASCO", "ZAMORA", "CASTAÑO", "SALVADOR", "BERMEJO",
			"BALLESTEROS", "PAREDES", "VALVERDE", "MALDONADO", "ANTON",
			"BAUTISTA", "VALLE", "PONCE", "OLIVA", "LORENTE", "RODRIGO",
			"DE LA CRUZ", "CORDERO", "JUAN", "COLLADO", "MONTOYA", "MAS",
			"MURILLO", "POZO", "CUEVAS", "CUENCA", "MARTOS", "QUESADA",
			"BARROSO", "MARCO", "BARRERA", "ROS", "DE LA TORRE", "ORDOÑEZ",
			"ALBA", "GIMENO", "CABELLO", "CORRAL", "PULIDO", "NAVAS", "CHEN",
			"PUIG", "ROJO", "ARENAS", "SAIZ", "AGUADO", "SORIA", "DOMINGO",
			"GALINDO", "ESCRIBANO", "VALLEJO", "MENA", "ASENSIO", "AMADOR",
			"VALENCIA", "CARO", "RAMON", "LUCAS", "POLO", "NARANJO", "REINA",
			"AGUIRRE", "MATA", "VILLALBA", "LINARES", "MORAN", "PAZ", "OJEDA",
			"LEAL", "BURGOS", "CARRETERO", "OLIVER", "BONILLA", "SOSA",
			"ARAGON", "ROIG", "CARRION", "CLEMENTE", "CASTELLANO", "VILLA",
			"MOHAMED", "CORDOBA", "ROSA", "CACERES", "ANDREU", "CARRERA",
			"HERNANDO", "CALERO", "CARDENAS", "COBO", "JUAREZ", "CHACON",
			"ALCARAZ", "VELAZQUEZ", "CORREA", "SOLA", "SAAVEDRA", "DOMENECH",
			"ZAPATA", "RIERA", "TOLEDO", "LLORENTE", "MORAL", "VELA",
			"SALGADO", "CARBONELL", "VILLEGAS", "REQUENA", "ARRIBAS",
			"ALFONSO", "SEVILLA", "AYALA", "PELAEZ", "PRADO", "BARRIOS",
			"FONT", "OLIVARES", "CARBALLO", "PIÑEIRO", "FERREIRA", "LUIS",
			"ESTEVE", "SOLIS", "QUINTERO", "PINEDA", "CAMARA", "SALINAS",
			"GRAU", "PEREA", "BOSCH", "MARQUES", "CASTILLA", "CID", "PINTO",
			"CANTERO", "MARRERO", "DE LA ROSA", "BALLESTER", "SANCHIS",
			"PALOMO", "AREVALO", "BAENA", "NICOLAS", "RINCON", "CASANOVA",
			"MIRALLES", "SALA", "PORRAS", "BELMONTE", "LAGO", "RECIO", "PINO",
			"HERRANZ", "PALMA", "CARDONA", "BARBA", "MUÑIZ", "ARRANZ",
			"VENTURA", "COBOS", "SINGH", "COLL", "CABEZAS", "BARREIRO",
			"CUADRADO", "MADRID", "ANGULO", "CERVERA", "VAQUERO", "VELEZ",
			"PUENTE", "OCAÑA", "DA SILVA", "NAVARRETE", "BECERRA", "OCHOA",
			"GRANADOS", "PUJOL", "TAPIA", "BELLO", "ALFARO", "PERALTA",
			"VERGARA", "VALLS", "GAMEZ", "LATORRE", "ALCANTARA", "LOSADA",
			"CASTELLANOS", "MEJIAS", "CORRALES", "ROVIRA", "EGEA", "SASTRE",
			"CAMPO", "BARRAGAN", "FALCON", "FRAILE", "CEBRIAN", "ESTRADA",
			"GODOY", "HUERTAS", "CEREZO", "CATALAN", "SEGOVIA", "RUANO",
			"BORREGO", "BARBERO", "MORCILLO", "VALENZUELA", "AZNAR",
			"GUIJARRO", "ARJONA", "FERREIRO", "DEL VALLE", "PAVON", "FAJARDO",
			"SOLE", "TORO", "CARVAJAL", "DUARTE", "ARIZA", "PEINADO",
			"CANOVAS", "ROMERA", "MORILLO", "ALCAIDE", "SAINZ", "MELERO",
			"JORGE", "GORDILLO", "AGUDO", "LLAMAS", "LOBATO", "TEJERO",
			"VALDES", "GALVAN", "REAL", "ROSALES", "ROYO", "ESPEJO", "BARRIO",
			"PORTILLO", "TIRADO", "GONZALO", "DAVILA", "CRIADO", "DUQUE",
			"DORADO", "GRANDE", "CHAMORRO", "FREIRE", "FRIAS", "LIN", "MOYANO",
			"SOLANO", "CALLEJA", "PIZARRO", "FIGUEROA", "DE MIGUEL",
			"ZAMBRANO", "ROSADO", "HUERTA", "PLA", "OLMEDO", "MOSQUERA",
			"WANG", "ALCAZAR", "TENA", "ALCALDE", "AVILES", "PANIAGUA",
			"ALCALA", "FERRERO", "SAENZ", "DEL POZO", "AMAYA", "PENA", "VIVES",
			"LLORENS", "PAZOS", "GARZON", "NOGUERA", "REBOLLO", "LAFUENTE",
			"HERAS", "BONET", "SALGUERO", "CHAVES", "SERNA", "PAEZ", "SALCEDO",
			"BARTOLOME", "ARAUJO", "MATEU", "POVEDA", "HERVAS", "PIÑERO",
			"BRITO", "ARCE", "DOS SANTOS", "OLMO" };

	final String generarSecuenciaNomApe(String[] alternativas) {
		String nombre = alternativas[ran.nextInt(alternativas.length)];
		while (ran.nextInt(3) == 0) {
			nombre += " " + alternativas[ran.nextInt(alternativas.length)];
		}
		return nombre;

	}

	final String generarFN() {
		final GregorianCalendar cal = new GregorianCalendar();
		cal.set(Calendar.DAY_OF_YEAR, ran.nextInt(365) + 1);
		cal.set(Calendar.YEAR, 1970 + ran.nextInt(15));
		return String.format("%1$tY-%1$tm-%1$td", cal);
	}
	
	public static void main(String[] argv) {
		// Some tests
		final FuenteUsuarios fu = new FuenteUsuarios(1);
		System.out.println(fu.generarSecuenciaNomApe(NOMBRES_NI�AS));
		System.out.println(fu.generarSecuenciaNomApe(NOMBRES_NI�OS));
		System.out.println(fu.generarSecuenciaNomApe(APELLIDOS));
		System.out.println(fu.generarFN());
	}
}
