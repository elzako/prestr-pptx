package com.aspose.slides.internal.a5;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e5.t2;
import com.aspose.slides.internal.e5.t9;
import com.aspose.slides.internal.t1.k7;
import com.aspose.slides.internal.w2.u9;
import com.aspose.slides.ms.System.d1;

public class k5 extends t9 {
   private List<n5> u9 = new List<>();

   public k5(t2 var1) {
      super(var1);
   }

   @Override
   public void n5(t2 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, n5.class)) {
         this.u9.addItem(com.aspose.slides.internal.v6g.k5.n5(var1, n5.class));
      }
   }

   @Override
   public void c8() {
      if (this.u9 == null) {
         this.l6("(fo:bookmark+)");
      }

      ((k7)this.n5).n5(this);
   }

   @Override
   public void n5(u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2) && !d1.a6(var3, "bookmark")) {
         this.k5(var1, var2, var3);
      }
   }

   public final List<n5> i1() {
      return this.u9;
   }

   @Override
   public String z1() {
      return "bookmark-tree";
   }

   @Override
   public int z3() {
      return 5;
   }
}
