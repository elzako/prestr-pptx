package com.aspose.slides;

public interface IFontFallBackRule {
   void addFallBackFonts(String var1);

   void addFallBackFonts(String[] var1);

   long getRangeStartIndex();

   long getRangeEndIndex();

   int getCount();

   String get_Item(int var1);

   void clear();

   void remove(String var1);

   void removeAt(int var1);

   String[] toArray();

   String[] toArray(int var1, int var2);

   int indexOf(String var1);
}
