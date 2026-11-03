package com.aspose.slides;

public interface IControlCollection extends IGenericCollection<IControl> {
   void remove(IControl var1);

   void removeAt(int var1);

   void clear();

   IControl get_Item(int var1);

   IControl addControl(int var1, float var2, float var3, float var4, float var5);
}
