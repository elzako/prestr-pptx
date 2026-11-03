package com.aspose.slides.internal.h2;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.d1;

public class q0 extends a5 implements com.aspose.slides.internal.f2.l6 {
   private a5 n5;
   private z8 l6;
   private boolean k5 = false;
   private int u3 = -1;

   @Override
   public void n5(int var1, a5 var2, boolean var3) {
      if (this.k5) {
         throw new Exception("CondLengthProperty.setComponent() called on a cached value!");
      }

      if (var1 == 2048) {
         this.n5 = var2;
      } else if (var1 == 1024) {
         this.l6 = (z8)var2;
      }
   }

   @Override
   public a5 n5(int var1) {
      if (var1 == 2048) {
         return this.n5;
      } else {
         return var1 == 1024 ? this.l6 : null;
      }
   }

   public boolean s7() {
      return this.l6.a6() == 32;
   }

   public int t2() {
      return this.n5.c8().u3();
   }

   public int n5(com.aspose.slides.internal.f2.u9 var1) {
      return this.n5.c8().l6(var1);
   }

   @Override
   public String toString() {
      return d1.n5("CondLength[", this.n5.g_().toString(), ", ", this.s7() ? d1.u9(this.l6.toString()) : this.l6.toString(), "]");
   }

   @Override
   public q0 x8() {
      if (this.n5.c8().k5()) {
         this.k5 = true;
         return this;
      } else {
         return this;
      }
   }

   @Override
   public com.aspose.slides.internal.f2.k5 c8() {
      return this.n5.c8();
   }

   @Override
   public Object g_() {
      return this;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      q0 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, q0.class);
      return var2 == null ? false : this.n5 == var2.n5 && this.l6 == var2.l6;
   }

   @Override
   public int hashCode() {
      if (this.u3 == -1) {
         int var1 = 17;
         var1 = 37 * var1 + (this.n5 == null ? 0 : this.n5.hashCode());
         var1 = 37 * var1 + (this.l6 == null ? 0 : this.l6.hashCode());
         this.u3 = var1;
      }

      return this.u3;
   }
}
