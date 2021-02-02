package com.marchalnicolas.androidcoroutineretrofitsample.models

import org.simpleframework.xml.Element
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.Root

@Root(name = "Envelope", strict = false)
@Namespace(prefix = "soap", reference = "http://schemas.xmlsoap.org/soap/envelope/")
data class EnvelopeResponse(
        @field:Element(name = "Body")
        @param:Element(name = "Body")
        var body: BodyResponse
)

@Root(name = "Body")
data class BodyResponse(
        @field:Element(name = "NumberToWordsResponse")
        @param:Element(name = "NumberToWordsResponse")
        val numberToWordsResponse: NumberToWordsResponse
)

@Root(name = "NumberToWordsResponse")
@Namespace(prefix = "m", reference = "http://www.dataaccess.com/webservicesserver/")
data class NumberToWordsResponse(
        @field:Element(name = "NumberToWordsResult")
        @param:Element(name = "NumberToWordsResult")
        val numberToWordsResult: String
)
