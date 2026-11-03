package com.aspose.slides;

public interface IHtmlFormattingController {
   void writeDocumentStart(IHtmlGenerator var1, IPresentation var2);

   void writeDocumentEnd(IHtmlGenerator var1, IPresentation var2);

   void writeSlideStart(IHtmlGenerator var1, ISlide var2);

   void writeSlideEnd(IHtmlGenerator var1, ISlide var2);

   void writeShapeStart(IHtmlGenerator var1, IShape var2);

   void writeShapeEnd(IHtmlGenerator var1, IShape var2);
}
