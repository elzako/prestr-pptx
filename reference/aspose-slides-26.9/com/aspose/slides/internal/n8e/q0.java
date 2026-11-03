package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.List;

public class q0 implements j9 {
   private final List<t4> n5 = new List<>();

   public List<t4> n5() {
      return this.n5;
   }

   @Override
   public byte[] l6() {
      int var1 = 0;
      byte[] var4;
      if (this.n5.size() > 0) {
         var1 += 12;

         for (int var2 = 0; var2 < this.n5.size(); var2++) {
            var1 += 32;
            var1 += 16;
            int var3 = this.n5.get_Item(var2).l6().length() + 1;
            var1 += 4;
            var1 += var3 * 2;
            if ((var3 & 1) != 0) {
               var1 += 2;
            }
         }

         int var14 = 0;
         var4 = new byte[var1];
         y2.n5(var4, var14, 65);
         y2.n5(var4, var14 + 2, 0);
         var14 += 4;
         y2.l6(var4, var14, var1 - 8);
         var14 += 4;
         y2.l6(var4, var14, this.n5.size() * 6);
         var14 += 4;

         for (int var38 = 0; var38 < this.n5.size(); var38++) {
            y2.l6(var4, var14, 3);
            var14 += 4;
            y2.l6(var4, var14, 7);
            var14 += 4;
            y2.l6(var4, var14, 3);
            var14 += 4;
            y2.l6(var4, var14, 6);
            var14 += 4;
            y2.l6(var4, var14, 3);
            var14 += 4;
            y2.l6(var4, var14, 0);
            var14 += 4;
            y2.l6(var4, var14, 3);
            var14 += 4;
            y2.l6(var4, var14, 7);
            var14 += 4;
            if (this.n5.get_Item(var38).n5() == 1) {
               y2.l6(var4, var14, 31);
               var14 += 4;
               y2.l6(var4, var14, 1);
               var14 += 4;
               y2.l6(var4, var14, 0);
               var14 += 4;
               y2.l6(var4, var14, 31);
               var14 += 4;
               int var5 = this.n5.get_Item(var38).l6().length() + 1;
               y2.l6(var4, var14, var5);
               var14 += 4;
               com.aspose.slides.internal.l7h.t1 var6 = new com.aspose.slides.internal.l7h.t1();
               var6.n5(this.n5.get_Item(var38).l6(), 0, var5 - 1, var4, var14);
               var14 += var5 * 2;
               if ((var5 & 1) != 0) {
                  var14 += 2;
               }
            } else {
               y2.l6(var4, var14, 31);
               var14 += 4;
               String var39 = this.n5.get_Item(var38).l6();
               String var40 = "";
               if (com.aspose.slides.ms.System.d1.u3(var39, '#') >= 0) {
                  int var7 = com.aspose.slides.ms.System.d1.u3(var39, '#');
                  var40 = com.aspose.slides.ms.System.d1.k5(var39, var7 + 1);
                  var39 = com.aspose.slides.ms.System.d1.l6(var39, 0, var7);
               }

               int var41 = var39.length() + 1;
               y2.l6(var4, var14, var41);
               var14 += 4;
               com.aspose.slides.internal.l7h.t1 var8 = new com.aspose.slides.internal.l7h.t1();
               var8.n5(var39, 0, var41 - 1, var4, var14);
               var14 += var41 * 2;
               if ((var41 & 1) != 0) {
                  var14 += 2;
               }

               y2.l6(var4, var14, 31);
               var14 += 4;
               if (var40.length() > 0) {
                  int var9 = var40.length() + 1;
                  y2.l6(var4, var14, var9);
                  var14 += 4;
                  var8.n5(var40, 0, var9 - 1, var4, var14);
                  var14 += var9 * 2;
                  if ((var9 & 1) != 0) {
                     var14 += 2;
                  }
               } else {
                  y2.l6(var4, var14, 1);
                  var14 += 4;
                  y2.l6(var4, var14, 0);
                  var14 += 4;
               }
            }
         }
      } else {
         com.aspose.slides.internal.z0k.e2 var37 = new com.aspose.slides.internal.z0k.e2();
         y2.n5(var37, 65);
         y2.n5(var37, 4);
         y2.n5(var37, 0);
         var4 = var37.toArray();
      }

      return var4;
   }

   public q0() {
   }

   q0(y5 var1) {
      byte[] var2 = var1.l6();
      String var3 = "";
      String[] var4 = new String[]{var3};
      int var5 = y2.k5(var2, 0);
      if (var5 == 30) {
         var1.n5(var4, 1251);
         var3 = var4[0];
         byte var15 = 2;
         this.n5.add(new t4(var15, var3));
      } else {
         int var7 = 4;
         var7 += 4;
         int var8 = y2.k5(var2, var7);
         var7 += 4;
         if (var2.length >= var8 / 6) {
            while (var8 > 0) {
               var7 += 36;
               int var9 = y2.k5(var2, var7);
               var7 += 4;
               byte var6;
               if (var9 == 1) {
                  var6 = 1;
                  var7 += 8;
                  var9 = y2.k5(var2, var7);
                  var7 += 4;
                  com.aspose.slides.internal.l7h.t1 var10 = new com.aspose.slides.internal.l7h.t1();
                  var3 = var10.l6(var2, var7, (var9 - 1) * 2);
                  var7 += var9 * 2;
                  if ((var9 & 1) != 0) {
                     var7 += 2;
                  }
               } else {
                  var6 = 2;
                  com.aspose.slides.internal.l7h.t1 var26 = new com.aspose.slides.internal.l7h.t1();
                  var3 = var26.l6(var2, var7, (var9 - 1) * 2);
                  var7 += var9 * 2;
                  if ((var9 & 1) != 0) {
                     var7 += 2;
                  }

                  var7 += 4;
                  int var11 = y2.k5(var2, var7);
                  var7 += 4;
                  if (var11 > 1) {
                     String var12 = var26.l6(var2, var7, (var11 - 1) * 2);
                     var7 += var11 * 2;
                     if ((var11 & 1) != 0) {
                        var7 += 2;
                     }

                     var3 = com.aspose.slides.ms.System.d1.n5(new String[]{var3, "#", var12});
                  } else {
                     var7 += 4;
                  }
               }

               this.n5.addItem(new t4(var6, var3));
               var8 -= 6;
            }
         }
      }
   }
}
