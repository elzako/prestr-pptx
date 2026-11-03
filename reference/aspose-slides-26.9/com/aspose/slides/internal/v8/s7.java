package com.aspose.slides.internal.v8;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class s7 extends t2 {
   private static final String[] u3 = new String[]{"normal", "embed", "bidi-override"};
   private static final int[] a6 = new int[]{97, 38, 15};
   public static final s7 n5 = new s7(0);
   public static final s7 l6 = new s7(1);
   public static final s7 k5 = new s7(2);
   private static final s7[] u9 = new s7[]{n5, l6, k5};

   private s7(int var1) {
      super(u3[var1], a6[var1]);
   }

   public static s7 n5(int var0) {
      for (int var1 = 0; var1 < u9.length; var1++) {
         if (u9[var1].l6() == var0) {
            return u9[var1];
         }
      }

      throw new ArgumentException(d1.n5(new String[]{"Illegal unicode-bidi: ", a3.l6(var0)}));
   }

   @Override
   public String toString() {
      return this.n5();
   }
}
