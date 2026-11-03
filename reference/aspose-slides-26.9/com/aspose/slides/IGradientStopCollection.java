package com.aspose.slides;

import java.awt.Color;

public interface IGradientStopCollection extends IGenericCollection<IGradientStop> {
   IGradientStop get_Item(int var1);

   IGradientStop add(float var1, Color var2);

   IGradientStop addPresetColor(float var1, int var2);

   IGradientStop addSchemeColor(float var1, int var2);

   void insert(int var1, float var2, Color var3);

   void insertPresetColor(int var1, float var2, int var3);

   void insertSchemeColor(int var1, float var2, int var3);

   void removeAt(int var1);

   void clear();
}
