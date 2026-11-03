package com.aspose.slides.internal.b3z;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class a6 {
   private float n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "%", "rem", "em", "ex", "px", "cm", "mm", "in", "pt", "pc", ""
   );

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public a6() {
   }

   public a6(float var1, int var2) {
      this.n5(var1);
      this.n5(var2);
   }

   public final boolean k5() {
      return this.l6() == 2;
   }

   public static a6 n5(String var0, a6 var1) {
      try {
         return n5(var0);
      } catch (RuntimeException var3) {
         if (!d1.n5(var0) && !com.aspose.slides.internal.n1n.n5.n5) {
            throw var3;
         } else {
            return var1;
         }
      }
   }

   public static a6 n5(String var0) {
      a6 var1 = new a6();
      if (d1.n5(var0)) {
         throw new Exception("No number were provided");
      }

      int var2 = d1.l6(var0, new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});
      if (var2 < 0) {
         throw new Exception("No number were provided");
      }

      String var3 = d1.l6(var0, 0, var2 + 1);
      var1.n5(n1.n5(var3, com.aspose.slides.internal.x7n.l6.k5()));
      switch (k5.n5(d1.k5(var0, var2 + 1))) {
         case 0:
            var1.n5(2);
            break;
         case 1:
            var1.n5(13);
            break;
         case 2:
            var1.n5(3);
            break;
         case 3:
            var1.n5(4);
            break;
         case 4:
            var1.n5(5);
            break;
         case 5:
            var1.n5(6);
            break;
         case 6:
            var1.n5(7);
            break;
         case 7:
            var1.n5(8);
            break;
         case 8:
            var1.n5(9);
            break;
         case 9:
            var1.n5(10);
            break;
         case 10:
            var1.n5(1);
            break;
         default:
            throw new com.aspose.slides.internal.d0e.h0(1, "Invalid SvgLength", var0);
      }

      return var1;
   }

   @Override
   public String toString() {
      String var1 = n1.n5(this.n5(), com.aspose.slides.internal.x7n.l6.k5());
      switch (this.l6()) {
         case 2:
            return d1.n5(new String[]{var1, "%"});
         case 3:
            return d1.n5(new String[]{var1, "em"});
         case 4:
            return d1.n5(new String[]{var1, "ex"});
         case 5:
            return d1.n5(new String[]{var1, "px"});
         case 6:
            return d1.n5(new String[]{var1, "cm"});
         case 7:
            return d1.n5(new String[]{var1, "mm"});
         case 8:
            return d1.n5(new String[]{var1, "in"});
         case 9:
            return d1.n5(new String[]{var1, "pt"});
         case 10:
            return d1.n5(new String[]{var1, "pc"});
         default:
            return var1;
      }
   }

   public static a6 l6(float var0) {
      a6 var1 = new a6();
      var1.n5(2);
      var1.n5(var0);
      return var1;
   }

   public static a6 k5(float var0) {
      a6 var1 = new a6();
      var1.n5(1);
      var1.n5(var0);
      return var1;
   }
}
