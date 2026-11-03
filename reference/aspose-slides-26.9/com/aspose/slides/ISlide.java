package com.aspose.slides;

import java.awt.Dimension;
import java.io.OutputStream;

/** A presentation slide. Geometry uses points; rendered image dimensions use pixels. */
public interface ISlide extends IBaseSlide, IOverrideThemeable {
   ISlideHeaderFooterManager getHeaderFooterManager();

   int getSlideNumber();

   void setSlideNumber(int value);

   boolean getHidden();

   void setHidden(boolean value);

   IImage getImage(float scaleX, float scaleY);

   IImage getImage();

   IImage getImage(Dimension imageSize);

   IImage getImage(ITiffOptions options);

   IImage getImage(IRenderingOptions options);

   IImage getImage(IRenderingOptions options, float scaleX, float scaleY);

   IImage getImage(IRenderingOptions options, Dimension imageSize);

   ILayoutSlide getLayoutSlide();

   void setLayoutSlide(ILayoutSlide value);

   INotesSlideManager getNotesSlideManager();

   IComment[] getSlideComments(ICommentAuthor author);

   void writeAsSvg(OutputStream stream);

   void writeAsSvg(OutputStream stream, ISVGOptions options);

   void writeAsEmf(OutputStream stream);

   void remove();

   void reset();
}
