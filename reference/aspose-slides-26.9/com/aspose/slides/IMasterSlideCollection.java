package com.aspose.slides;

public interface IMasterSlideCollection extends IGenericCollection<IMasterSlide> {
   IMasterSlide get_Item(int var1);

   void remove(IMasterSlide var1);

   void removeAt(int var1);

   void removeUnused(boolean var1);

   IMasterSlide addClone(IMasterSlide var1);

   IMasterSlide insertClone(int var1, IMasterSlide var2);
}
