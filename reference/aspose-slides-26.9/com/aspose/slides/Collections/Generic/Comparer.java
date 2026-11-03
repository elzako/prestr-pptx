package com.aspose.slides.Collections.Generic;

import com.aspose.slides.ms.System.j3;
import java.util.Comparator;

@j3
public abstract class Comparer<T> implements Comparator<T> {
   static Comparer n5 = new n5();

   @Override
   public abstract int compare(T var1, T var2);

   public static <T> Comparer<T> getDefault() {
      return n5;
   }
}
