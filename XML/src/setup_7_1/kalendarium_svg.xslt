<?xml version="1.0" encoding="UTF-8"?>
<!-- 
     Przykład obrazuje generowanie wykresu słupkowego w formacie SVG 
     na podstawie danych pobranych z pliku XML
     
     Słupek pomarańczowy obrazuje wartość czasu trwania kursu 
     (element "czas-trwania" * 100) 
     Słupek czerwony obrazuje wartość ceny kursu (element "cena" / 10) 
     Oba pliki transformat XSLT działają prawidłowo dla pliku XML zgodnego 
     ze schematem "kalendarium.xsd" 

     Uwagi:
	1. Zalecane przeglądarki: Opera i Firefox
	2. Przeglądarka IE nie rozpoznaje formatu SVG
	3. Przeglądarka Opera w przypadku braku arkusza stylów wyświetla jedynie 
	   zawartość tekstową dokumentu XML (nie wyświetla znaczników) 
-->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>
	<xsl:template match="kalendarium">
		<xsl:element name="svg" namespace="http://www.w3.org/2000/svg">
			<xsl:attribute name="version">1.1</xsl:attribute>
			<xsl:attribute name="width">6cm</xsl:attribute>
			<xsl:attribute name="height">6cm</xsl:attribute>
			<xsl:attribute name="viewBox">0 0 600 600</xsl:attribute>
			<xsl:element name="desc" namespace="http://www.w3.org/2000/svg">Wykres czasu trwania kursów</xsl:element>
			<xsl:element name="g" namespace="http://www.w3.org/2000/svg">
				<!-- transformacja do kartezjańskiego układu współrzędnych -->
				<xsl:attribute name="transform">translate(0,600) scale(1,-1)</xsl:attribute>
				<!-- obramowanie wykresu -->
				<xsl:element name="rect" namespace="http://www.w3.org/2000/svg">
					<xsl:attribute name="x">1</xsl:attribute>
					<xsl:attribute name="y">1</xsl:attribute>
					<xsl:attribute name="width">598</xsl:attribute>
					<xsl:attribute name="height">598</xsl:attribute>
					<xsl:attribute name="fill">none</xsl:attribute>
					<xsl:attribute name="stroke">black</xsl:attribute>
					<xsl:attribute name="stroke-width">1</xsl:attribute>
				</xsl:element>
				<xsl:apply-templates/>
			</xsl:element>
		</xsl:element>
	</xsl:template>
	<xsl:template match="kurs">
		<xsl:element name="rect" namespace="http://www.w3.org/2000/svg">
			<xsl:attribute name="x"><xsl:number/>00</xsl:attribute>
			<xsl:attribute name="y">100</xsl:attribute>
			<xsl:attribute name="width">50</xsl:attribute>
			<xsl:attribute name="height"><xsl:value-of select="czas-trwania * 100"/></xsl:attribute>
			<xsl:attribute name="fill">orange</xsl:attribute>
			<xsl:attribute name="stroke">gray</xsl:attribute>
			<xsl:attribute name="stroke-width">2</xsl:attribute>
		</xsl:element>
		<xsl:element name="rect" namespace="http://www.w3.org/2000/svg">
			<xsl:attribute name="x"><xsl:number/>20</xsl:attribute>
			<xsl:attribute name="y">100</xsl:attribute>
			<xsl:attribute name="width">50</xsl:attribute>
			<xsl:attribute name="height"><xsl:value-of select="cena div 10"/></xsl:attribute>
			<xsl:attribute name="fill">red</xsl:attribute>
			<xsl:attribute name="stroke">gray</xsl:attribute>
			<xsl:attribute name="stroke-width">2</xsl:attribute>
		</xsl:element>
		<xsl:element name="g" namespace="http://www.w3.org/2000/svg">
			<!-- transformacja odwrotna względem kartezjańskiego układu współrzędnych -->
			<!-- transformacja jest potrzebna, aby litery nie były odwrócone -->
			<!-- innym rozwiązaniem może być zastosowanie elementów formatujących tekst -->
			<xsl:attribute name="transform">scale(1,-1)</xsl:attribute>
			<xsl:element name="text" namespace="http://www.w3.org/2000/svg">
				<xsl:attribute name="x"><xsl:number/>00</xsl:attribute>
				<xsl:attribute name="y">-50</xsl:attribute>
				<!-- <xsl:attribute name="rotate">180</xsl:attribute> -->
				<xsl:attribute name="font-family">Verdana</xsl:attribute>
				<xsl:attribute name="font-size">24</xsl:attribute>
				<xsl:attribute name="fill">gray</xsl:attribute>
				<xsl:value-of select="kod-kursu"/>
			</xsl:element>
		</xsl:element>
	</xsl:template>
</xsl:stylesheet>
