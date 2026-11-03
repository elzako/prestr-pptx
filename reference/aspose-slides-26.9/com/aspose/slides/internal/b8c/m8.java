package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.List;

public final class m8 extends z1 {
   private s7 a6;
   private s7[] u9;
   private s7 h0;
   private n2 c8;
   private c5 t2;
   private int s7;
   private int x8;

   public m8(s7 var1, s7[] var2, n2 var3, c5 var4, int var5, int var6, boolean var7, s7 var8, int var9) {
      super(var6, false, var7);
      this.a6 = var1;
      this.u9 = var2;
      this.c8 = var3;
      this.t2 = var4;
      this.h0 = var8;
      this.s7 = var9;
      this.x8 = var5;
   }

   @Override
   public void n5(x5 var1) {
      int var2 = this.t2.n5();
      List var3 = var1.t4;
      if (var3 != null) {
         var3.clear();
      } else {
         var3 = new List();
         var1.t4 = var3;
      }

      b9 var4 = new b9();
      var4.n5 = this.a6.k5();
      var4.l6 = (com.aspose.slides.ms.System.c4[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.c4.class), this.s7)
      );
      var3.addItem(var4.n5());
      var1.y4.u3 = 1;
      var1.e2 = var4.n5.k5(this.x8);
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.Xml.k6 var1, x5 var2, int[] var3) {
      var3[0] = 0;
      int var4 = this.c8.n5(var1);
      boolean var5 = false;
      List var6 = var2.t4;
      int var7 = var2.y4.u3;
      int var8 = 0;
      b9 var9 = new b9();
      int var10 = -1;
      int var11 = -1;
      boolean var12 = false;

      while (var8 < var7) {
         ((b9)var6.get_Item(var8)).n5(var9);
         s7 var13 = var9.n5;

         for (int var14 = var13.u3(-1); var14 != -1; var14 = var13.u3(var14)) {
            if (var4 == this.t2.n5(var14).n5) {
               var10 = var14;
               if (var11 == -1) {
                  var11 = var8;
               }

               var12 = true;
               break;
            }
         }

         if (var12 && com.aspose.slides.internal.v6g.k5.l6(this.t2.n5(var10).l6, v1.class)) {
            break;
         }

         var8++;
      }

      if (var8 == var7 && var10 != -1) {
         var8 = var11;
      }

      if (var8 < var7) {
         if (var8 != 0) {
            var6.removeRange(0, var8);
         }

         var7 -= var8;
         var8 = 0;

         while (var8 < var7) {
            ((b9)var6.get_Item(var8)).n5(var9);
            var12 = var9.n5.k5(var10);
            if (var12) {
               var9.n5 = this.u9[var10];
               var6.set_Item(var8, var9.n5());
               var8++;
            } else if (--var7 > 0) {
               b9 var24 = ((b9)var6.get_Item(var7)).n5();
               var6.set_Item(var7, ((b9)var6.get_Item(var8)).n5());
               var6.set_Item(var8, var24.n5());
            }
         }
      } else {
         var7 = 0;
      }

      if (var7 <= 0) {
         var3[0] = -1;
         var2.k5 = false;
         return null;
      }

      if (var7 >= 10000) {
         var2.q0 = true;
         var7 /= 2;
      }

      for (int var22 = var7 - 1; var22 >= 0; var22--) {
         int var25 = var22;
         s7 var26 = ((b9)var6.get_Item(var22)).n5;

         for (var5 = var5 || var26.k5(this.x8); var7 < 10000 && var26.k5(this.h0); var5 = var5 || var26.k5(this.x8)) {
            s7 var15 = var26.k5();
            var15.n5(this.h0);
            int var16 = var15.u3(-1);
            f4 var17 = com.aspose.slides.internal.v6g.k5.n5(this.t2.n5(var16).l6, f4.class);
            ((b9)var6.get_Item(var25)).n5(var9);
            if (var7 + 2 >= var6.size()) {
               var6.addItem(new b9());
               var6.addItem(new b9());
            }

            b9 var18 = ((b9)var6.get_Item(var7)).n5();
            if (var18.l6 == null) {
               var18.l6 = (com.aspose.slides.ms.System.c4[])com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.c4.class), this.s7)
               );
            }

            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var9.l6)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var18.l6)), 0, var9.l6.length);
            com.aspose.slides.ms.System.c4 var19 = com.aspose.slides.ms.System.c4.u3(var18.l6[var17.l6()]).l6();
            if (com.aspose.slides.ms.System.c4.c8(var19, var17.k5())) {
               var18.n5 = this.u9[var16];
               com.aspose.slides.internal.v6g.k5.s7(0, 9).k7(var18.l6[var17.l6()]);
               var6.set_Item(var7, var18.n5());
               var25 = var7++;
            } else {
               if (com.aspose.slides.ms.System.c4.x8(var19, var17.u3())) {
                  var18.n5 = var17.a6();
                  var6.set_Item(var7, var18.n5());
                  var7++;
                  break;
               }

               var18.n5 = var17.a6();
               var6.set_Item(var7, var18.n5());
               var25 = var7 + 1;
               ((b9)var6.get_Item(var25)).n5(var18);
               if (var18.l6 == null) {
                  var18.l6 = (com.aspose.slides.ms.System.c4[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.c4.class), this.s7)
                  );
               }

               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var9.l6)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var18.l6)), 0, var9.l6.length);
               var18.n5 = this.u9[var16];
               com.aspose.slides.internal.v6g.k5.s7(0, 9).k7(var18.l6[var17.l6()]);
               var6.set_Item(var25, var18.n5());
               var7 += 2;
            }

            var26 = ((b9)var6.get_Item(var25)).n5;
         }
      }

      var2.e2 = var5;
      var2.y4.u3 = var7;
      return this.t2.n5(var10).l6;
   }

   @Override
   public boolean l6(x5 var1) {
      return var1.e2;
   }

   @Override
   public ArrayList n5(x5 var1, boolean var2) {
      ArrayList var3 = null;
      if (var1.t4 != null) {
         List var4 = var1.t4;
         s7 var5 = new s7(this.t2.n5());

         for (int var6 = var1.y4.u3 - 1; var6 >= 0; var6--) {
            var5.l6(((b9)var4.get_Item(var6)).n5);
         }

         for (int var10 = var5.u3(-1); var10 != -1; var10 = var5.u3(var10)) {
            if (var3 == null) {
               var3 = new ArrayList();
            }

            int var7 = this.t2.n5(var10).n5;
            if (var7 >= 0) {
               c1 var8 = com.aspose.slides.internal.v6g.k5.n5(this.t2.n5(var10).l6, c1.class);
               if (var8 == null) {
                  String var9 = this.c8.l6(this.t2.n5(var10).n5);
                  if (var9.length() != 0) {
                     var3.addItem(var9);
                  }
               } else {
                  String var11 = var8.t2();
                  if (!var3.contains(var11)) {
                     var3.addItem(var11);
                  }
               }
            }
         }
      }

      return var3;
   }

   @Override
   public ArrayList n5(x5 var1, boolean var2, k0t var3) {
      ArrayList var4 = new ArrayList();
      if (var1.t4 != null) {
         List var5 = var1.t4;
         s7 var6 = new s7(this.t2.n5());

         for (int var7 = var1.y4.u3 - 1; var7 >= 0; var7--) {
            var6.l6(((b9)var5.get_Item(var7)).n5);
         }

         for (int var10 = var6.u3(-1); var10 != -1; var10 = var6.u3(var10)) {
            int var8 = this.t2.n5(var10).n5;
            if (var8 >= 0) {
               c1 var9 = com.aspose.slides.internal.v6g.k5.n5(this.t2.n5(var10).l6, c1.class);
               if (var9 != null) {
                  n5(var9, var3, var4);
               }
            }
         }
      }

      return var4;
   }
}
