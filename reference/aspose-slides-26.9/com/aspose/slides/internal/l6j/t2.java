package com.aspose.slides.internal.l6j;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

class t2<T> extends n5 {
   public t2(T var1, int var2, int var3) {
      super(var1, var2, var3);
      if (var1 == null) {
         throw new ArgumentNullException("data");
      }

      if (var2 < 0) {
         throw new ArgumentException("key should be positive");
      }

      if (var3 < 0) {
         throw new ArgumentException("offset should be positive");
      }
   }
}
