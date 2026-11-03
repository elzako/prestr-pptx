package com.aspose.slides.internal.v8;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class n3 extends t2 {
   private static final String[] a6 = new String[]{"lr-tb", "rl-tb", "tb-lr", "tb-rl"};
   private static final int[] u9 = new int[]{79, 121, 205, 140};
   public static final n3 n5 = new n3(0);
   public static final n3 l6 = new n3(1);
   public static final n3 k5 = new n3(2);
   public static final n3 u3 = new n3(3);
   private static final n3[] h0 = new n3[]{n5, l6, k5, u3};

   private n3(int var1) {
      super(a6[var1], u9[var1]);
   }

   public final void n5(a6 var1) {
      k5 var2;
      k5 var3;
      k5 var4;
      k5 var5;
      k5 var6;
      switch (this.l6()) {
         case 79:
         default:
            var2 = com.aspose.slides.internal.v8.k5.n5;
            var3 = com.aspose.slides.internal.v8.k5.k5;
            var4 = com.aspose.slides.internal.v8.k5.n5;
            var5 = com.aspose.slides.internal.v8.k5.k5;
            var6 = com.aspose.slides.internal.v8.k5.u3;
            break;
         case 121:
            var2 = com.aspose.slides.internal.v8.k5.l6;
            var3 = com.aspose.slides.internal.v8.k5.k5;
            var4 = com.aspose.slides.internal.v8.k5.l6;
            var5 = com.aspose.slides.internal.v8.k5.k5;
            var6 = com.aspose.slides.internal.v8.k5.u3;
            break;
         case 140:
            var2 = com.aspose.slides.internal.v8.k5.k5;
            var3 = com.aspose.slides.internal.v8.k5.l6;
            var4 = com.aspose.slides.internal.v8.k5.k5;
            var5 = com.aspose.slides.internal.v8.k5.l6;
            var6 = com.aspose.slides.internal.v8.k5.n5;
            break;
         case 205:
            var2 = com.aspose.slides.internal.v8.k5.k5;
            var3 = com.aspose.slides.internal.v8.k5.n5;
            var4 = com.aspose.slides.internal.v8.k5.k5;
            var5 = com.aspose.slides.internal.v8.k5.n5;
            var6 = com.aspose.slides.internal.v8.k5.l6;
      }

      var1.n5(var2);
      var1.l6(var3);
      var1.k5(var4);
      var1.u3(var5);
      var1.a6(var6);
      var1.n5(this);
   }

   public final boolean k5() {
      switch (this.l6()) {
         case 79:
         case 121:
            return true;
         case 140:
         case 205:
            return false;
         default:
            return true;
      }
   }

   public static n3 n5(int var0) {
      for (int var1 = 0; var1 < h0.length; var1++) {
         if (h0[var1].l6() == var0) {
            return h0[var1];
         }
      }

      throw new ArgumentException(d1.n5(new String[]{"Illegal writing mode: ", a3.l6(var0)}));
   }

   @Override
   public String toString() {
      return this.n5();
   }
}
