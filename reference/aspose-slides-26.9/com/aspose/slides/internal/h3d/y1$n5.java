package com.aspose.slides.internal.h3d;

import com.aspose.slides.Collections.IHashCodeProvider;
import com.aspose.slides.ms.System.j8;
import java.util.Comparator;

class y1$n5 implements IHashCodeProvider, Comparator {
   public static Object n5 = new Object();
   public static y1$n5 l6 = new y1$n5();

   private y1$n5() {
   }

   @Override
   public int hashCode(Object obj) {
      return obj == null ? 0 : obj.hashCode();
   }

   @Override
   public int compare(Object x, Object y) {
      return j8.l6(x, y) ? 0 : 1;
   }
}
