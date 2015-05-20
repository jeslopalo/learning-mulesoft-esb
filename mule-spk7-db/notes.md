Crear un servicio WEB (SOAP) con un método que permita realizar una consulta de paises. 
Permitir solicitar la respuesta paginada (admitir, cómo máximo, 50 como tamaño de página). 
Utilizar un caché para reducir el número de consultas.


select COD_ISO,NOMBRE,ID_ISO 
from ( 
	select q.*, ROWNUM ROWNUM_ 
	from (
		select COD_ISO,NOMBRE,ID_ISO 
		from pais 
		order by nombre asc) q 
	where rownum <= #[(pagina+1) * tamanopagina] )
where ROWNUM_ > #[ pagina * tamanopagina ]