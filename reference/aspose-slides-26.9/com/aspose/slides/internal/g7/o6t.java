package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class o6t extends c5q {
   private p6w l6;
   private List<Integer> k5 = new List<>();

   public o6t(long var1, int var3) {
      super(var1, var3);
   }

   public final p6w l6() {
      return this.l6;
   }

   public final int k5() {
      return this.k5.size();
   }

   public final Integer[] u3() {
      return this.k5.toArray(new Integer[0]);
   }

   public String a6() {
      return "Single substitution Format2";
   }

   @Override
   public void n5(f3c var1) {
      if (var1.n5() != ((this.n5 & 4294967295L) + 2L & 4294967295L)) {
         var1.n5((this.n5 & 4294967295L) + 2L & 4294967295L);
      }

      int var2 = var1.n3() & 65535;
      this.k5 = l6(var1);
      this.l6 = n5(new p6w(this.n5 & 4294967295L, var2), var1);
   }
}
