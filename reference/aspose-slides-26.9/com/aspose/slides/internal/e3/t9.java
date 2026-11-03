package com.aspose.slides.internal.e3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;

public class t9 extends com.aspose.slides.internal.k6.z1 {
   private final com.aspose.slides.internal.k6.n5 n5 = new n5(this);

   @Override
   public com.aspose.slides.internal.k6.n5 n5() {
      return this.n5;
   }

   private void n5(
      String var1,
      y1 var2,
      com.aspose.slides.internal.x3.a6 var3,
      com.aspose.slides.internal.i0e.l6 var4,
      com.aspose.slides.internal.p1s.l6 var5,
      e5 var6,
      int var7,
      int var8
   ) {
      com.aspose.slides.internal.w0.l6 var9 = com.aspose.slides.internal.p1.n5.n5(var3.t9());
      com.aspose.slides.internal.w0.s7 var10 = new com.aspose.slides.internal.w0.s7(com.aspose.slides.internal.p1s.n5.b2);
      if (!d1.n5(var1) && var2.s7() > 0.0F) {
         var1 = com.aspose.slides.internal.f6z.n5.n5(var4, var1, var5, var2.y4());
      }

      w1 var11 = com.aspose.slides.internal.e1.z1.n5(var1, var5, var2.y4(), var6, var7, var8).u3();
      com.aspose.slides.internal.e1.z1 var12 = new com.aspose.slides.internal.e1.z1(var5, var9, var10, var11.u3(), var1, f2.n5.a6(), 0.0F);
      var12.n5(com.aspose.slides.internal.p1.n5.n5(var3.z1()));
      var3.<com.aspose.slides.internal.e1.n3>n5().n5(var12);
   }

   private void n5(
      String var1, y1 var2, com.aspose.slides.internal.x3.a6 var3, com.aspose.slides.internal.i0e.l6 var4, com.aspose.slides.internal.p1s.l6 var5, e5 var6
   ) {
      this.n5(var1, var2.y4(), var3, var4, var5, var6, 0, 1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.a4.z3 var1, y1 var2, com.aspose.slides.internal.o9b.n3 var3, e5 var4, com.aspose.slides.internal.x3.a6 var5) {
      com.aspose.slides.internal.p1s.l6 var6 = com.aspose.slides.internal.e1x.x8.u3().n5(var3.h0(), var3.c8(), var3.x8());
      String[] var7 = d1.n5(var1.n3(), '\n');

      for (int var8 = 0; var8 < var7.length; var8++) {
         var7[var8] = d1.n5(var7[var8], "\r", "");
      }

      if (var7.length > 0 && d1.n5(var7[var7.length - 1])) {
         String[] var18 = new String[var7.length - 1];

         for (int var9 = 0; var9 < var7.length - 1; var9++) {
            var18[var9] = var7[var9];
         }

         var7 = var18;
      }

      com.aspose.slides.internal.i0e.l6 var19 = new com.aspose.slides.internal.i0e.l6(var4);

      try {
         if (var7.length > 1) {
            for (int var20 = 0; var20 < var7.length; var20++) {
               this.n5(var7[var20], var2.y4(), var5, var19, var6, var4, var20, var7.length);
            }
         } else {
            String var21 = var7[0];
            var21 = d1.l6(var21);
            f2 var10 = var19.n5(var21, var6).a6();
            boolean var11 = var10.l6() > var2.s7();
            boolean var12 = var10.k5() * 2.0F <= var2.k5();
            if (var11 && var12) {
               List var13 = n5(var21, var19, var6, var2.s7());

               for (int var14 = 0; var14 < var13.size(); var14++) {
                  this.n5((String)var13.get_Item(var14), var2.y4(), var5, var19, var6, var4, var14, var13.size());
               }
            } else {
               this.n5(var21, var2.y4(), var5, var19, var6, var4);
            }
         }
      } finally {
         if (var19 != null) {
            var19.dispose();
         }
      }
   }

   private static List<String> n5(String var0, com.aspose.slides.internal.i0e.l6 var1, com.aspose.slides.internal.p1s.l6 var2, float var3) {
      if (d1.n5(var0)) {
         List var11 = new List();
         var11.addItem(d1.n5);
         return var11;
      }

      List var4 = new List();
      int var5 = 0;
      int var6 = var0.length();

      while (var5 < var6) {
         if (var0.charAt(var5) == '\n') {
            var4.addItem(d1.n5);
            var5++;
         } else {
            int var7 = n5(var0, var5, var6 - var5, var1, var2, var3);
            if (var7 <= 0) {
               var7 = 1;
            }

            int var8 = var5 + var7;
            int var9 = d1.l6(var0, '\n', var5, var7);
            if (var9 >= 0) {
               var8 = var9;
            } else if (var5 + var7 < var6) {
               if (var0.charAt(var5 + var7) != ' ') {
                  int var10 = d1.n5(var0, ' ', var5 + var7 - 1, var7);
                  if (var10 >= var5) {
                     var8 = var10;
                  }
               }
            } else {
               var8 = var6;
            }

            int var12 = var8 - var5;
            if (var12 == 0) {
               var5++;
            } else {
               var4.addItem(d1.l6(var0, var5, var12));
               var5 += var12;
               if (var5 < var6 && var0.charAt(var5) == '\r') {
                  var5++;
                  if (var5 < var6 && var0.charAt(var5) == '\n') {
                     var5++;
                  }
               } else if (var5 < var6 && var0.charAt(var5) == '\n') {
                  var5++;
               } else {
                  while (var5 < var6 && (var0.charAt(var5) == ' ' || var0.charAt(var5) == '\t')) {
                     var5++;
                  }
               }
            }
         }
      }

      return var4;
   }

   private static int n5(String var0, int var1, int var2, com.aspose.slides.internal.i0e.l6 var3, com.aspose.slides.internal.p1s.l6 var4, float var5) {
      if (!d1.n5(var0) && var1 < var0.length() && var2 > 0) {
         int var6 = 0;
         int var7 = var2;

         while (var6 < var7) {
            int var8 = (var6 + var7 + 1) / 2;
            String var9 = d1.l6(var0, var1, var8);
            float var10 = var3.n5(var9, var4).l6();
            if (var10 <= var5) {
               var6 = var8;
            } else {
               var7 = var8 - 1;
            }
         }

         return var6;
      } else {
         return 0;
      }
   }
}
