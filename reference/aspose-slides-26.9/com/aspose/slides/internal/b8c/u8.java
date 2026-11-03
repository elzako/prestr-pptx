package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ArrayList;

public final class u8 extends z1 {
   private int[][] a6;
   private n2 u9;

   public u8(int[][] var1, n2 var2, int var3, boolean var4, boolean var5) {
      super(var3, var4, var5);
      this.a6 = var1;
      this.u9 = var2;
   }

   @Override
   public void n5(x5 var1) {
      var1.y4.n5 = 0;
      var1.e2 = this.a6[0][this.u9.n5()] > 0;
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.Xml.k6 var1, x5 var2, int[] var3) {
      int var4 = this.u9.n5(var1);
      int var5 = this.a6[var2.y4.n5][var4];
      var3[0] = 0;
      if (var5 != -1) {
         var2.y4.n5 = var5;
         var2.e2 = this.a6[var2.y4.n5][this.u9.n5()] > 0;
         return this.u9.n5(var4);
      }

      if (this.u3() && var2.e2) {
         return null;
      }

      var2.k5 = false;
      var3[0] = -1;
      return null;
   }

   @Override
   public boolean l6(x5 var1) {
      return var1.e2;
   }

   @Override
   public ArrayList n5(x5 var1, boolean var2) {
      ArrayList var3 = null;
      int[] var4 = this.a6[var1.y4.n5];
      if (var4 != null) {
         for (int var5 = 0; var5 < var4.length - 1; var5++) {
            if (var4[var5] != -1) {
               if (var3 == null) {
                  var3 = new ArrayList();
               }

               c1 var6 = (c1)this.u9.n5(var5);
               if (var6 == null) {
                  String var7 = this.u9.l6(var5);
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
         }
      }

      return var3;
   }

   @Override
   public ArrayList n5(x5 var1, boolean var2, k0t var3) {
      ArrayList var4 = new ArrayList();
      int[] var5 = this.a6[var1.y4.n5];
      if (var5 != null) {
         for (int var6 = 0; var6 < var5.length - 1; var6++) {
            if (var5[var6] != -1) {
               c1 var7 = (c1)this.u9.n5(var6);
               if (var7 != null) {
                  n5(var7, var3, var4);
               }
            }
         }
      }

      return var4;
   }
}
