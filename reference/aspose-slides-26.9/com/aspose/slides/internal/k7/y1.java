package com.aspose.slides.internal.k7;

import com.aspose.slides.internal.k5.l6$n5;

public class y1 extends com.aspose.slides.internal.q0.e2 {
   private boolean l6;
   private boolean k5;

   public y1(float var1, int var2) {
      super(var1, var2);
   }

   public final boolean k5() {
      return this.l6;
   }

   public final boolean u3() {
      return this.k5;
   }

   @Override
   public String toString() {
      if (this.k5()) {
         return "auto";
      } else {
         return this.u3() ? "none" : super.toString();
      }
   }

   public static y1 a6() {
      y1 var0 = new y1(0.0F, 0);
      var0.l6 = true;
      return var0;
   }

   public static y1 u9() {
      y1 var0 = new y1(0.0F, 0);
      var0.k5 = true;
      return var0;
   }

   public static y1 n5(com.aspose.slides.internal.y4.n5 var0) {
      switch (var0.n5()) {
         case 2:
            return new y1(var0.n5((short)2), 1);
         case 3:
            return new y1(var0.n5((short)3), 2);
         case 4:
            return new y1(var0.n5((short)4), 3);
         case 5:
            return new y1(var0.n5((short)5), 4);
         case 6:
            return new y1(var0.n5((short)6), 5);
         case 7:
            return new y1(var0.n5((short)7), 6);
         case 8:
            return new y1(var0.n5((short)8), 7);
         case 9:
            return new y1(var0.n5((short)9), 8);
         case 10:
            return new y1(var0.n5((short)10), 9);
         case 11:
            return new y1(var0.n5((short)10), 10);
         case 12:
            return new y1(var0.n5((short)10), 11);
         case 13:
            return new y1(var0.n5((short)10), 12);
         case 14:
            return new y1(var0.n5((short)10), 13);
         case 15:
            return new y1(var0.n5((short)10), 14);
         case 16:
            return new y1(var0.n5((short)10), 15);
         case 17:
            return new y1(var0.n5((short)10), 16);
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         default:
            return new y1(var0.n5((short)1), 0);
         case 26:
            return new y1(var0.n5((short)10), 17);
         case 27:
            return new y1(var0.n5((short)10), 18);
         case 28:
            return new y1(var0.n5((short)10), 19);
      }
   }

   public static y1 n5(com.aspose.slides.internal.k5.u9 var0) {
      com.aspose.slides.internal.k5.u3 var1 = (com.aspose.slides.internal.k5.u3)var0;
      switch (var1.n5()) {
         case 21:
            if (l6$n5.y1 == var1) {
               return a6();
            } else if (l6$n5.d2n == var1) {
               return new y1(Float.POSITIVE_INFINITY, 0);
            } else if (l6$n5.a0 == var1) {
               return u9();
            }
         default:
            return n5((com.aspose.slides.internal.y4.n5)var0);
      }
   }
}
