package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;

public class r4$n5 extends h2 implements Cloneable {
   private static final int[] h0 = new int[]{103, 101, 144, 106, 107, 108};

   public r4$n5(int var1) {
      super(var1);
   }

   @Override
   public a5 n5(com.aspose.slides.internal.e5.w1 var1, String var2, com.aspose.slides.internal.e5.t9 var3) {
      try {
         r4 var4 = new r4();
         var4.n5(var2);
         String var5 = var2;
         a5 var6 = null;
         if (d1.a6(var5, "inherit")) {
            int var7 = h0.length;

            while (--var7 >= 0) {
               var6 = var1.h0(h0[var7]);
               r4.n5(var4, var6, var7);
            }
         } else {
            int var25 = h0.length;

            while (--var25 >= 0) {
               r4.n5(var4, null, var25);
            }

            var6 = this.n5(var5);
            if (var6 != null) {
               return null;
            }

            var25 = d1.u3(var2, ' ');
            int var8 = d1.u3(var2, '\'') == -1 ? d1.u3(var2, '"') : d1.u3(var2, '\'');
            if (var25 == -1 || var8 != -1 && var25 > var8) {
               throw new com.aspose.slides.internal.b3.z8(d1.n5("Invalid property value: ", "font=\"", var2, "\""));
            }

            h2 var9 = null;
            int var10 = var25 + 1;
            int var11 = var5.length();
            boolean var12 = false;
            int var13 = d1.u3(var2, ',');

            while (!var12) {
               if (var13 == -1) {
                  if (var8 != -1) {
                     var10 = var8;
                  }

                  var9 = com.aspose.slides.internal.e5.t9.l6(h0[1]);
                  var6 = var9.n5(var1, d1.k5(var5, var10), var3);
                  r4.n5(var4, var6, 1);
                  var12 = true;
               } else {
                  if (var8 != -1 && var8 < var13) {
                     var10 = var8;
                     var8 = -1;
                  } else {
                     var10 = d1.n5(var2, ' ', var13) + 1;
                  }

                  var13 = -1;
               }
            }

            var11 = var10 - 1;
            var10 = d1.n5(var2, ' ', var11 - 1) + 1;
            var2 = com.aspose.slides.internal.v3.x8.n5(var5, var10, var11);
            int var14 = d1.u3(var2, '/');
            String var15 = com.aspose.slides.internal.v3.x8.n5(var2, 0, var14 == -1 ? var2.length() : var14);
            var9 = com.aspose.slides.internal.e5.t9.l6(h0[0]);
            var6 = var9.n5(var1, var15, var3);
            var1.n5(h0[0], var6);
            r4.n5(var4, var6, 0);
            if (var14 != -1) {
               String var16 = d1.k5(var2, var14 + 1);
               var9 = com.aspose.slides.internal.e5.t9.l6(h0[2]);
               var6 = var9.n5(var1, var16, var3);
               r4.n5(var4, var6, 2);
            }

            if (var10 != 0) {
               var11 = var10 - 1;
               var2 = com.aspose.slides.internal.v3.x8.n5(var5, 0, var11);
               var10 = 0;
               var25 = d1.u3(var2, ' ');

               do {
                  var11 = var25 == -1 ? var2.length() : var25;
                  String var37 = com.aspose.slides.internal.v3.x8.n5(var2, var10, var11);
                  int var17 = 6;

                  while (--var17 >= 3) {
                     if (var4.n5.get_Item(var17) == null) {
                        var9 = com.aspose.slides.internal.e5.t9.l6(h0[var17]);
                        var37 = var9.k5(var37);
                        var6 = var9.n5(var37);
                        if (var6 != null) {
                           r4.n5(var4, var6, var17);
                        }
                     }
                  }

                  var10 = var11 + 1;
                  var25 = d1.l6(var2, ' ', var10);
               } while (var11 != var2.length());
            }
         }

         if (var4.n5.get_Item(0) != null && var4.n5.get_Item(1) != null) {
            return var4;
         } else {
            throw new com.aspose.slides.internal.b3.z8(
               d1.n5("Invalid property value: ", "font-size and font-family are required for the font shorthand", "\nfont=\"", var2, "\"")
            );
         }
      } catch (com.aspose.slides.internal.b3.z8 var18) {
         var18.n5(var1.n5().m_());
         var18.n5(this.u3());
         throw var18;
      }
   }
}
