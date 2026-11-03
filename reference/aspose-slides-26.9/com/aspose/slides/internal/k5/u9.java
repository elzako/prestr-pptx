package com.aspose.slides.internal.k5;

import com.aspose.slides.ms.System.j8;

public abstract class u9 {
   private final short n5;

   public u9(short var1) {
      this.n5 = var1;
   }

   public abstract String u9();

   public abstract void n5(String var1);

   public final short h0() {
      return this.n5;
   }

   @Override
   public String toString() {
      return this.u9();
   }

   protected boolean n5(u9 var1) {
      if (j8.l6(null, var1)) {
         return false;
      } else {
         return j8.l6(this, var1) ? true : this.n5 == var1.n5;
      }
   }

   @Override
   public boolean equals(Object obj) {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(obj, u9.class));
   }
}
