package com.designpatterns.builder;

public class PdfDocumentBuilder implements PresentationBuilder{

    private PdfDocument pdfDocument = new PdfDocument();

    @Override
    public void addSlide(Slide slide) {
        pdfDocument.addPage(slide.getText());
    }

    public PdfDocument getDocument() {
        return pdfDocument;
    }
}
