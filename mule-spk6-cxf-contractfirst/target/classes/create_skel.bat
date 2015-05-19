@echo off

set wsdl2java=C:\Users\usuario\mulesoft\bin\apache-cxf-3.1.0\bin\wsdl2java.bat

setlocal enableDelayedExpansion

set FRONTEND=-fe jaxws21
set BINDING=-db jaxb
set WSDLVERSION=-wv 1.1
set PKGBASE=es.corpme.course.cxf2
set RELFOLDERBASE=
rem set EXTRA=-server -verbose -autoNameResolution
rem set EXTRA=-client -b jaxws-bindings.xml -b jaxb-bindings.xml -encoding UTF-8 
set EXTRA=-server -b jaxws-bindings.xml -b jaxb-bindings.xml -encoding UTF-8
rem set MULE_COMPAT=-xjc-Xbg -xjc-Xcollection-setter-injector

rmdir /s /q skel
md skel

set SERVICES=(contractfirst)

for %%S in %SERVICES% do (
	rem set DESTPKG_N=-p http://arce.corpme.es/notificaciones=%PKGBASE%
	set TMP_DESTPKG=%PKGBASE%.%%S
	set DESTPKG=-p !TMP_DESTPKG!
	set ALL_DESTPKG=!DESTPKG_N! !DESTPKG!
	set DESTPKG=
	set DESTFOLDER=-d .\skel\%%S
	set WSDL=%%S.wsdl
	set WSDLLOCATION=-wsdlLocation classpath:%%S.wsdl
	echo ======================================================
	echo PROCESSING %%S, package transformations: !ALL_DESTPKG!
	echo SENTENCE: call "%wsdl2java%" %FRONTEND% %BINDING% %WSDLVERSION% %EXTRA% %MULE_COMPAT% !ALL_DESTPKG! !DESTFOLDER! !WSDLLOCATION! !WSDL!
	call "%wsdl2java%" %FRONTEND% %BINDING% %WSDLVERSION% %EXTRA% %MULE_COMPAT% !ALL_DESTPKG! !DESTFOLDER! !WSDLLOCATION! !WSDL!
	echo ======================================================
)