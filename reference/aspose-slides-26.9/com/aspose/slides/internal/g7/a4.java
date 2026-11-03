package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.NotSupportedException;

public abstract class a4 {
   public abstract i2 n5(n2 var1);

   public static a4 n5(int var0) {
      if (var0 == 1) {
         return new t1h();
      } else if (var0 == 0) {
         return new r5t();
      } else if (var0 == 2) {
         return new j9();
      } else {
         throw new NotSupportedException();
      }
   }
}
