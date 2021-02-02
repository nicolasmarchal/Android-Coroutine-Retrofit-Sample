package com.marchalnicolas.androidcoroutineretrofitsample.models

import org.simpleframework.xml.Element
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.Root

@Root(name = "Envelope")
@Namespace( prefix = "soap", reference = "http://schemas.xmlsoap.org/soap/envelope/")
data class Envelope(
        @field:Element(name = "soap:Body")
        val body: Body
)

@Root(name = "soap:Body")
data class Body(
        @field:Element(name = "NumberToWords")
        val data: NumberToWords

)

@Namespace(reference = "http://www.dataaccess.com/webservicesserver/")
@Root(name = "NumberToWords")
data class NumberToWords(
        @field:Element(name = "ubiNum")
        val ubiNum: Int
)