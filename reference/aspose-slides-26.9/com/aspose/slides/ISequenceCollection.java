package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

public interface ISequenceCollection extends IGenericEnumerable<ISequence> {
   int getCount();

   ISequence add(IShape var1);

   void remove(ISequence var1);

   void removeAt(int var1);

   void clear();

   ISequence get_Item(int var1);
}
