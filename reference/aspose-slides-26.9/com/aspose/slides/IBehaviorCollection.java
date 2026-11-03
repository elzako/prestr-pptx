package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

public interface IBehaviorCollection extends IGenericEnumerable<IBehavior> {
   IBehavior get_Item(int var1);

   void set_Item(int var1, IBehavior var2);

   int getCount();

   void add(IBehavior var1);

   int indexOf(IBehavior var1);

   void insert(int var1, IBehavior var2);

   boolean remove(IBehavior var1);

   void removeAt(int var1);

   void clear();

   boolean contains(IBehavior var1);
}
