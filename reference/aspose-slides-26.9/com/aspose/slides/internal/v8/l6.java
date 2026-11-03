package com.aspose.slides.internal.v8;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class l6 extends t2 {
   private static final String[] x8 = new String[]{"none", "hidden", "dotted", "dashed", "solid", "double", "groove", "ridge", "inset", "outset"};
   private static final int[] n3 = new int[]{95, 57, 36, 31, 133, 37, 55, 119, 67, 101};
   public static final l6 n5 = new l6(0);
   public static final l6 l6 = new l6(1);
   public static final l6 k5 = new l6(2);
   public static final l6 u3 = new l6(3);
   public static final l6 a6 = new l6(4);
   public static final l6 u9 = new l6(5);
   public static final l6 h0 = new l6(6);
   public static final l6 c8 = new l6(7);
   public static final l6 t2 = new l6(8);
   public static final l6 s7 = new l6(9);
   private static final l6[] y4 = new l6[]{n5, l6, k5, u3, a6, u9, h0, c8, t2, s7};

   private l6(int var1) {
      super(x8[var1], n3[var1]);
   }

   public static l6 n5(int var0) {
      for (int var1 = 0; var1 < y4.length; var1++) {
         if (y4[var1].l6() == var0) {
            return y4[var1];
         }
      }

      throw new ArgumentException(d1.n5(new String[]{"Illegal border style: ", a3.l6(var0)}));
   }

   @Override
   public String toString() {
      return d1.n5(new String[]{"BorderStyle:", this.n5()});
   }
}
