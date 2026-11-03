package com.aspose.slides.Collections;

import java.util.Iterator;

public interface IEnumerator<T> extends Iterator<T> {
   @Override
   T next();

   @Override
   boolean hasNext();

   void reset();
}
