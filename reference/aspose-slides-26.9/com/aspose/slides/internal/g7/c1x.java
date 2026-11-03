package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class c1x extends c5q {
   private p6w l6;
   private f1c k5;
   private List<x5h<w3k>> u3;

   public c1x(long var1, int var3) {
      super(var1, var3);
   }

   public final p6w l6() {
      return this.l6;
   }

   public final f1c k5() {
      return this.k5;
   }

   public final x5h<w3k> n5(int var1) {
      return this.u3.get_Item(var1);
   }

   public String u3() {
      return "Context substitution Format2";
   }

   @Override
   public void n5(f3c var1) {
      if (var1.n5() != ((this.n5 & 4294967295L) + 2L & 4294967295L)) {
         var1.n5((this.n5 & 4294967295L) + 2L & 4294967295L);
      }

      int var2 = var1.n3() & 65535;
      int var3 = var1.n3() & 65535;
      this.u3 = x5h.n5(w3k.class, this.n5 & 4294967295L, var1, true);
      this.l6 = n5(new p6w(this.n5 & 4294967295L, var2), var1);
      this.k5 = n5(new f1c(this.n5 & 4294967295L, var3), var1);
   }
}
