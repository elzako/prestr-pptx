package com.aspose.slides;

import java.awt.geom.Rectangle2D.Float;

/** A text paragraph. Layout bounds use points; rendered image dimensions use pixels. */
public interface IParagraph extends ISlideComponent {
   IPortionCollection getPortions();

   IParagraphFormat getParagraphFormat();

   void joinPortionsWithSameFormatting();

   String getText();

   void setText(String value);

   Float getRect();

   int getLinesCount();

   IImage getImage();

   IImage getImage(float scaleX, float scaleY);

   IPortionFormat getEndParagraphPortionFormat();

   void setEndParagraphPortionFormat(IPortionFormat value);
}
