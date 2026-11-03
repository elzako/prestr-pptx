package com.aspose.slides.internal.q0;

import com.aspose.slides.internal.m3.y2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.s3;

public class e2 {
   private int l6;
   private float k5;
   public static final com.aspose.slides.internal.x7n.l6 n5 = new com.aspose.slides.internal.x7n.l6("en-US");

   public e2(float var1, int var2) {
      this.k5 = var1;
      this.l6 = var2;
   }

   public final int n5() {
      return this.l6;
   }

   public final float l6() {
      return this.k5;
   }

   @Override
   public String toString() {
      return d1.n5(n5, "{0}{1}", this.l6(), com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(y2.class), this.n5()));
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      }

      if (j8.l6(this, obj)) {
         return true;
      }

      e2 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, e2.class);
      return j8.l6(null, var2) ? false : this.n5(var2);
   }

   public final boolean n5(e2 var1) {
      if (j8.l6(null, var1)) {
         return false;
      } else {
         return j8.l6(this, var1) ? true : j8.n5(var1.l6, this.l6) && n1.l6(var1.k5, this.k5);
      }
   }

   @Override
   public int hashCode() {
      return s3.n5(this.l6) * 397 ^ n1.n5(this.k5);
   }
}
