package com.aspose.slides.internal.v9e;

import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.Xml.f4;

class t1$l6 extends com.aspose.slides.internal.x7i.u3 {
   private int n5;
   private int l6;
   private String k5;
   private int u3;

   public t1$l6() {
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final void k5(int var1) {
      if (0 <= var1 && var1 <= 9) {
         this.u3 = var1;
      }
   }

   public final String n5(Object var1) {
      double var2;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, Integer.class)) {
         var2 = ((Integer)var1).intValue();
      } else {
         var2 = f4.n5(var1);
         if (!(0.5 <= var2) || com.aspose.slides.ms.System.d2.a6(var2)) {
            return f4.l6(var1);
         }

         var2 = f4.l6(var2);
      }

      switch (this.n5) {
         case 0:
         default:
            break;
         case 6:
         case 7:
            if (var2 <= 2.147483647E9) {
               com.aspose.slides.internal.l7h.a5 var6 = new com.aspose.slides.internal.l7h.a5();
               n5(var6, var2, (char)(this.n5 == 6 ? 'A' : 'a'), 26);
               return var6.toString();
            }
            break;
         case 20:
         case 21:
            if (var2 <= 32767.0) {
               com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
               n5(var4, var2, this.n5 == 20);
               return var4.toString();
            }
      }

      return n5(var2, this.l6, this.u3, this.k5);
   }

   private static String n5(double var0, int var2, int var3, String var4) {
      String var6;
      if (var3 != 0 && var4 != null) {
         com.aspose.slides.internal.x7n.s7 var5 = new com.aspose.slides.internal.x7n.s7();
         var5.n5(new int[]{var3});
         var5.u9(var4);
         if (q1.k5(var0) == var0) {
            var5.l6(0);
         }

         var6 = com.aspose.slides.ms.System.d2.n5(var0, "N", var5);
      } else {
         var6 = com.aspose.slides.ms.System.z3.n5(var0, com.aspose.slides.internal.x7n.l6.k5());
      }

      if (var6.length() >= var2) {
         return var6;
      }

      com.aspose.slides.internal.l7h.a5 var7 = new com.aspose.slides.internal.l7h.a5(var2);
      var7.n5('0', var2 - var6.length());
      var7.n5(var6);
      return var7.toString();
   }
}
