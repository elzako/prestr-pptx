package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

public interface IMathBlockCollection extends IGenericEnumerable<IMathBlock> {
   void add(IMathBlock var1);

   void insert(int var1, IMathBlock var2);

   boolean remove(IMathBlock var1);

   void removeAt(int var1);

   boolean contains(IMathBlock var1);

   int indexOf(IMathBlock var1);

   int getCount();

   IMathBlock get_Item(int var1);

   void set_Item(int var1, IMathBlock var2);

   void clear();
}
