package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

public interface IMathElementCollection extends IGenericEnumerable<IMathElement> {
   IMathElement get_Item(int var1);

   int getCount();

   void add(IMathElement var1);

   int indexOf(IMathElement var1);

   void insert(int var1, IMathElement var2);

   void clear();

   boolean contains(IMathElement var1);

   boolean remove(IMathElement var1);

   void removeAt(int var1);

   void copyTo(IMathElement[] var1, int var2);
}
