package com.aspose.slides;

public interface IMasterLayoutSlideCollection extends ILayoutSlideCollection {
   ILayoutSlide addClone(ILayoutSlide var1);

   ILayoutSlide insertClone(int var1, ILayoutSlide var2);

   ILayoutSlide add(byte var1, String var2);

   ILayoutSlide insert(int var1, byte var2, String var3);

   void removeAt(int var1);

   void reorder(int var1, ILayoutSlide var2);
}
