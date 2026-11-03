package com.aspose.slides.Collections;

import com.aspose.slides.ms.System.u3;

public interface ICollection<T> extends IEnumerable<T> {
   int size();

   boolean isSynchronized();

   Object getSyncRoot();

   void copyTo(u3 var1, int var2);
}
