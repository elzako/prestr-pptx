package com.aspose.slides.internal.v2;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.o5;
import com.aspose.slides.ms.System.q1;

public class t2 extends s7 {
   private o5<Integer> n5 = new o5<>();
   private o5<Float> l6 = new o5<>();

   public final int k5() {
      if (!this.n5.l6() && !this.l6.l6()) {
         return 0;
      } else {
         return o5.l6(this.n5, null) ? this.n5.n5() : com.aspose.slides.internal.v6g.k5.u3(q1.u3(this.u3()), 14);
      }
   }

   public final float u3() {
      if (!this.n5.l6() && !this.l6.l6()) {
         return 0.0F;
      } else {
         return o5.l6(this.l6, null) ? this.l6.n5() : this.k5();
      }
   }

   public t2(int var1) {
      this.n5 = new o5<>(var1);
   }

   public t2(float var1) {
      this.l6 = new o5<>(var1);
   }

   @Override
   public String toString() {
      if (this.n5.l6()) {
         return a3.l6(this.n5.n5());
      } else {
         return this.l6.l6() ? n1.u9(this.l6.n5()) : "null";
      }
   }

   public static t2 n5(String var0) {
      int var1 = 0;
      int[] var2 = new int[]{0};
      boolean var3 = a3.n5(var0, var2);
      var1 = var2[0];
      return var3 ? new t2(var1) : null;
   }

   public static t2 l6(String var0) {
      float var1 = 0.0F;
      float[] var2 = new float[]{0.0F};
      boolean var3 = n1.n5(var0, 511, com.aspose.slides.internal.x7n.l6.k5(), var2);
      var1 = var2[0];
      return var3 ? new t2(var1) : null;
   }
}
