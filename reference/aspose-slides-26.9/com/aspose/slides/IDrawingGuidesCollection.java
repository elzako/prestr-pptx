package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

public interface IDrawingGuidesCollection extends IGenericEnumerable<IDrawingGuide> {
   IDrawingGuide get_Item(int var1);

   IDrawingGuide add(byte var1, float var2);

   void removeAt(int var1);

   void clear();

   int getCount();
}
