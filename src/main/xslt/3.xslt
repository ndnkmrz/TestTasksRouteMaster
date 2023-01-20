<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="3.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:foo="http://whatever">
    <xsl:function name="foo:innerblocks">
        <xsl:param name="obj_id"/>
        <xsl:param name="obj"/>
        <xsl:for-each select="$obj">
            <xsl:if test="reference/@id=$obj_id">
                <xsl:variable name="obj_id" select="@id"/>
                <xsl:value-of select="@id"/>
                <xsl:value-of select="foo:innerblocks($obj_id, $obj)"/>
            </xsl:if>
        </xsl:for-each>
    </xsl:function>
    <xsl:template match="/">
        <xsl:variable name="obj" select="objects/object[reference]"/>
        <xsl:for-each select="objects/object[not(reference)]">
            <xsl:variable name="obj_id" select="@id"/>
            <xsl:value-of select="$obj_id"/>
            <xsl:value-of select="foo:innerblocks($obj_id, $obj)"/>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>