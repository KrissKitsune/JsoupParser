package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {
    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/?page=1")
            .get()
    val quotesFromBook: Elements = doc.select(".sc-2aegk7-2")
    for (quote: Element in quotesFromBook) {
        println("${quote.ownText()}\n\t")
    }
}