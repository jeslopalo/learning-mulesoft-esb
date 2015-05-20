Crear un servicio WEB (SOAP) con un m�todo que permita realizar una consulta de paises. 
Permitir solicitar la respuesta paginada (admitir, c�mo m�ximo, 50 como tama�o de p�gina). 
Utilizar un cach� para reducir el n�mero de consultas.


select COD_ISO,NOMBRE,ID_ISO 
from ( 
	select q.*, ROWNUM ROWNUM_ 
	from (
		select COD_ISO,NOMBRE,ID_ISO 
		from pais 
		order by nombre asc) q 
	where rownum <= #[(pagina+1) * tamanopagina] )
where ROWNUM_ > #[ pagina * tamanopagina ]