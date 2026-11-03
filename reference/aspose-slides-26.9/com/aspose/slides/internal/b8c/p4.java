package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;

public final class p4 extends z1 {
   private s7 a6;
   private s7[] u9;
   private n2 h0;
   private c5 c8;
   private int t2;

   public p4(s7 var1, s7[] var2, n2 var3, c5 var4, int var5, int var6, boolean var7, boolean var8) {
      super(var6, var7, var8);
      this.a6 = var1;
      this.u9 = var2;
      this.h0 = var3;
      this.c8 = var4;
      this.t2 = var5;
   }

   @Override
   public void n5(x5 var1) {
      var1.t9[0] = this.a6.k5();
      var1.t9[1] = new s7(this.a6.n5());
      var1.y4.k5 = 0;
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.Xml.k6 var1, x5 var2, int[] var3) {
      s7 var4 = var2.t9[var2.y4.k5];
      int var5 = (var2.y4.k5 + 1) % 2;
      s7 var6 = var2.t9[var5];
      var6.l6();
      int var7 = this.h0.n5(var1);
      Object var8 = null;
      var3[0] = 0;

      for (int var9 = var4.u3(-1); var9 != -1; var9 = var4.u3(var9)) {
         if (var7 == this.c8.n5(var9).n5) {
            var6.l6(this.u9[var9]);
            var8 = this.c8.n5(var9).l6;
            break;
         }
      }

      if (!var6.u3()) {
         var2.y4.k5 = var5;
         return var8;
      }

      if (this.u3() && var4.n5(this.t2)) {
         return null;
      }

      var2.k5 = false;
      var3[0] = -1;
      return null;
   }

   @Override
   public boolean l6(x5 var1) {
      return var1.t9[var1.y4.k5].n5(this.t2);
   }

   @Override
   public ArrayList n5(x5 var1, boolean var2) {
      ArrayList var3 = null;
      s7 var4 = var1.t9[var1.y4.k5];

      for (int var5 = var4.u3(-1); var5 != -1; var5 = var4.u3(var5)) {
         if (var3 == null) {
            var3 = new ArrayList();
         }

         c1 var6 = (c1)this.c8.n5(var5).l6;
         if (var6 == null) {
            String var7 = this.h0.l6(this.c8.n5(var5).n5);
            if (var7.length() != 0) {
               var3.addItem(var7);
            }
         } else {
            String var8 = var6.t2();
            if (!var3.contains(var8)) {
               var3.addItem(var8);
            }
         }
      }

      return var3;
   }

   @Override
   public ArrayList n5(x5 var1, boolean var2, k0t var3) {
      ArrayList var4 = new ArrayList();
      s7 var5 = var1.t9[var1.y4.k5];

      for (int var6 = var5.u3(-1); var6 != -1; var6 = var5.u3(var6)) {
         c1 var7 = (c1)this.c8.n5(var6).l6;
         if (var7 != null) {
            n5(var7, var3, var4);
         }
      }

      return var4;
   }
}
