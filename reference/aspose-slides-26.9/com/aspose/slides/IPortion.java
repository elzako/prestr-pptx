package com.aspose.slides;

import java.awt.geom.Rectangle2D.Float;

/** A formatted text run. Coordinates and bounds use presentation points. */
public interface IPortion extends ISlideComponent {
   IPortionFormat getPortionFormat();

   String getText();

   void setText(String value);

   IField getField();

   void addField(IFieldType fieldType);

   void addField(String fieldType);

   void removeField();

   Float getRect();

   java.awt.geom.Point2D.Float getCoordinates();
}
