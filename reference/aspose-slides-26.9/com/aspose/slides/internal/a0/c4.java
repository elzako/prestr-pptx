package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.o5;

public class c4 extends h0 {
   private List<o5> n5 = new List<>();
   private k7 l6;
   private String k5;
   private String u3;

   public c4(k7 var1) {
      this.n5(var1);
   }

   public final void n5(k7 var1) {
      this.l6 = var1;
   }

   public final void n5(o5 var1) {
      this.n5.addItem(var1);
   }

   public final int n5() {
      return this.n5.size();
   }

   public final o5 n5(int var1) {
      return this.n5.get_Item(var1);
   }

   public final boolean l6(o5 var1) {
      return var1 == this.n5(0);
   }

   public final void n5(String var1) {
      if ("none".equals(var1)) {
         this.k5 = null;
      } else {
         this.k5 = var1;
      }
   }

   public final void l6(String var1) {
      if ("none".equals(var1)) {
         this.u3 = null;
      } else {
         this.u3 = var1;
      }
   }
}
