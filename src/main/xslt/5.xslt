<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <!-- Compare two strings ignoring case, returning same
     values as compare(). -->
    <xsl:template match="/">
        <xsl:for-each select="lists/list1/element">
            <xsl:variable
                    name="obj_id"
                    select="@id"/>
            <xsl:if test="/lists/list2/element/@id=$obj_id">
                <xsl:value-of select="$obj_id"/>
            </xsl:if>
        </xsl:for-each>
        <xsl:for-each select="lists/list1/element">
            <xsl:variable
                    name="obj_id"
                    select="@id"/>
            <xsl:if test="not(/lists/list2/element/@id=$obj_id)">
                <xsl:value-of select="$obj_id"/>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>