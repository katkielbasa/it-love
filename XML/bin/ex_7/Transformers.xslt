<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" />
	<xsl:template match="osoby">
		<HTML>
			<HEAD>
				<TITLE>Lista osób</TITLE>
			</HEAD>
			<BODY>
				<H1>Lista osób</H1>
				<TABLE BORDER="1">
					<TR BORDER="1">
						<TH>lp.</TH>
						<TH>OSOBA</TH>
					</TR>
					<xsl:apply-templates />
				</TABLE>
			</BODY>
		</HTML>
	</xsl:template>
	<xsl:template match="osoba">

		<TR BORDER="1">
			<xsl:if test="wiek &gt; 20">
				<TD BGCOLOR="green">
					<xsl:number format="I"/>
				</TD>
			</xsl:if>
			<xsl:if test="wiek &lt; 20">
				<TD BGCOLOR="red">
					<xsl:number format="I"/>
				</TD>
			</xsl:if>
			<TD BORDER="1">
				<xsl:value-of select="imie" />
				<xsl:text>&#xA0;</xsl:text>
			</TD>
			<TD BORDER="1">
				<xsl:value-of select="nazwisko" />
			</TD>
			<TD BORDER="1">
				lat:
				<xsl:value-of select="wiek" />
			</TD>
		</TR>
	</xsl:template>
</xsl:stylesheet>