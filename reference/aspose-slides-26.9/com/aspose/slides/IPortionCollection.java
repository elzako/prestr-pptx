package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

public interface IPortionCollection extends IGenericEnumerable<IPortion> {
   IPortion get_Item(int var1);

   int getCount();

   void add(IPortion var1);

   int indexOf(IPortion var1);

   void insert(int var1, IPortion var2);

   void clear();

   boolean contains(IPortion var1);

   boolean remove(IPortion var1);

   void removeAt(int var1);
}
