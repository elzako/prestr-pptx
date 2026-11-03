package com.aspose.slides.internal.t1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.e5.t2$n5;
import com.aspose.slides.ms.System.d1;

public class u3 extends com.aspose.slides.internal.e5.t9 {
   private Dictionary<String, l6> u9 = null;

   public u3(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
      ((k7)var1).n5(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2) && !d1.a6(var3, "color-profile")) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   public void c8() {
      if (this.u3 != null) {
         t2$n5 var1 = this.x8();

         while (var1.l6()) {
            com.aspose.slides.internal.e5.t2 var2 = var1.c8();
            if (d1.a6(var2.t9(), "fo:color-profile")) {
               l6 var3 = (l6)var2;
               if (!d1.n5(var3.i1())) {
                  this.n5(var3);
               } else {
                  this.y4().n5(this, var3.t9(), "color-profile-name", this.k5);
               }
            }
         }
      }

      this.u3 = null;
   }

   private void n5(l6 var1) {
      if (this.u9 == null) {
         this.u9 = new Dictionary<>();
      }

      if (this.u9.containsKey(var1.i1())) {
         this.y4().l6(this, var1.t9(), var1.i1(), this.k5);
      }

      this.u9.addItem(var1.i1(), var1);
   }

   @Override
   public String z1() {
      return "declarations";
   }

   @Override
   public int z3() {
      return 13;
   }

   public final l6 a6(String var1) {
      l6 var2 = null;
      if (this.u9 != null) {
         l6[] var3 = new l6[]{var2};
         this.u9.tryGetValue(var1, var3);
         var2 = var3[0];
      }

      return var2;
   }
}
