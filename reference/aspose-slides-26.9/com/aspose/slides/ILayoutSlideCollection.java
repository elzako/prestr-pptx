package com.aspose.slides;

public interface ILayoutSlideCollection extends IGenericCollection<ILayoutSlide> {
   ILayoutSlide get_Item(int var1);

   ILayoutSlide getByType(byte var1);

   void remove(ILayoutSlide var1);

   void removeUnused();
}
