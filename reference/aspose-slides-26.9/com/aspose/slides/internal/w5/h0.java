package com.aspose.slides.internal.w5;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.s3;

public class h0 implements a5<h0> {
   private float n5 = -1.0F;
   private boolean l6;
   private int k5;
   private boolean u3;

   public final float n5() {
      return this.n5;
   }

   public h0(boolean var1) {
      this(0.0F, 0, var1, false);
   }

   public h0(float var1) {
      this(var1, 0, false, false);
   }

   public h0(float var1, int var2) {
      this(var1, var2, false, false);
   }

   public h0(float var1, int var2, boolean var3, boolean var4) {
      this.n5 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.l6 = var4;
   }

   public final int l6() {
      return this.k5;
   }

   public final boolean k5() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public final boolean u3() {
      return this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(obj, h0.class));
   }

   public final boolean n5(h0 var1) {
      if (j8.l6(null, var1)) {
         return false;
      } else if (this.u3() && var1.u3()) {
         return true;
      } else {
         return this.k5() && var1.k5() ? true : this.l6() == var1.l6() && n1.l6(this.n5(), var1.n5());
      }
   }

   @Override
   public String toString() {
      if (this.u3()) {
         return "auto";
      }

      if (this.k5()) {
         return "inherit";
      }

      String var1;
      switch (this.l6()) {
         case 0:
            var1 = "pt";
            break;
         case 1:
            var1 = "em";
            break;
         case 2:
            var1 = "ex";
            break;
         case 3:
            var1 = "%";
            break;
         case 4:
            var1 = "px";
            break;
         case 5:
            var1 = "in";
            break;
         case 6:
            var1 = "cm";
            break;
         case 7:
            var1 = "mm";
            break;
         case 8:
            var1 = "pc";
            break;
         default:
            throw new ArgumentOutOfRangeException(d1.n5(com.aspose.slides.internal.x7n.l6.k5(), "The Unit is out of range: {0}", s3.n5(u9.class, this.l6())));
      }

      return d1.n5(com.aspose.slides.internal.x7n.l6.k5(), "{0}{1}", this.n5(), var1);
   }
}
