package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class a3 {
   private List<List<com.aspose.slides.internal.r4.u9>> n5 = null;
   private List<Integer> l6 = null;
   private boolean k5 = false;
   private int u3 = 0;
   private com.aspose.slides.internal.v8.u9 a6 = null;
   private s0 u9;

   public a3(com.aspose.slides.internal.v8.u9 var1) {
      this.a6 = var1;
      this.u9 = new s0(this);
   }

   public final void n5() {
      this.n5 = null;
      this.l6 = null;
      this.k5 = false;
      this.u3 = 0;
      this.u9.n5();
   }

   public final s0 l6() {
      return this.u9;
   }

   public final com.aspose.slides.internal.v8.u9 k5() {
      return this.a6;
   }

   public final int u3() {
      return this.l6 != null && this.l6.size() != 0 ? this.l6.get_Item(this.l6.size() - 1) : 0;
   }

   public final boolean a6() {
      return this.n5 != null && this.n5.size() > 0;
   }

   public final void u9() {
      this.k5 = false;
   }

   public final boolean h0() {
      return this.k5;
   }

   public final void n5(List<List<com.aspose.slides.internal.r4.u9>> var1) {
      if (this.n5 == null) {
         this.n5 = new List<>();
         this.l6 = new List<>();
      }

      if (!this.k5) {
         this.k5 = true;
         this.u3 = this.n5.size();
      }

      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3(var1);

      while (var2.l6()) {
         List var3 = (List)var2.k5();
         j4.n5(var3);
         int var4 = 0;
         this.n5.addItem(var3);
         com.aspose.slides.internal.r4.u3 var5 = new com.aspose.slides.internal.r4.u3(var3);

         while (var5.l6()) {
            i1 var6 = (i1)var5.k5();
            if (var6.e2() || var6.x_()) {
               var4 += var6.z1();
            }
         }

         this.l6.addItem(this.u3() + var4);
      }
   }

   public final void n5(s0 var1) {
      this.u9.n5 = var1.n5;
      this.u9.k5 = var1.k5;
      this.u9.l6 = var1.l6;
   }

   public final boolean c8() {
      return this.u9.n5 < this.u3();
   }

   public final int t2() {
      return this.n5.size() - 1 - this.u9.l6;
   }

   public final boolean s7() {
      return this.u9.k5 < this.n5.get_Item(this.u9.l6).size() - 1;
   }

   public final List<com.aspose.slides.internal.r4.u9> n5(int var1) {
      return this.n5 == null ? null : this.n5.get_Item(var1);
   }

   public final int n5(s0 var1, int var2, boolean var3) {
      if (var2 <= 0) {
         this.u9.n5 = var1.k5();
         return 0;
      }

      int var4 = 0;
      com.aspose.slides.internal.r4.u3 var5 = null;
      i1 var6 = null;
      boolean var7 = false;
      int var8 = var1.l6;
      int var9 = var1.k5;
      if (var8 != -1 && var9 != this.n5.get_Item(var8).size() - 1) {
         var9++;
      } else {
         var8++;
         var9 = 0;
      }

      if (this.n5.size() - 1 > var8) {
         if (!var3 && this.h0() && this.u3 > 0) {
            var4 = this.l6.get_Item(this.u3 - 1) - var1.n5;
            var8 = this.u3;
            var9 = 0;
         }

         while (this.l6.get_Item(var8) - var1.n5 <= var2) {
            var4 = this.l6.get_Item(var8) - var1.n5;
            var7 = true;
            var8++;
            var9 = 0;
         }
      }

      var5 = new com.aspose.slides.internal.r4.u3<>(this.n5.get_Item(var8), var9);
      int var10 = 0;
      int var11 = -1;
      int var12 = -1;

      while (!var7 || var4 <= var2) {
         if (!var7) {
            var7 = true;
         } else {
            var10 = var4;
            var11 = var12;
         }

         boolean var13 = false;

         while (var5.l6()) {
            var6 = (i1)var5.k5();
            if (var6.e2()) {
               var4 += var6.z1();
               var13 = true;
            } else if (var6.x_()) {
               if (var13) {
                  var12 = var5.h0();
                  break;
               }

               var13 = false;
               var4 += var6.z1();
            } else if (var6.t4() < 1000) {
               var12 = var5.h0();
               break;
            }
         }
      }

      if (!var7) {
         var10 = 0;
      } else if (var10 > 0) {
         this.u9.l6 = var11 != -1 ? var8 : var8 - 1;
         this.u9.k5 = var11 != -1 ? var11 : this.n5.get_Item(this.u9.l6).size() - 1;
      }

      this.u9.n5 = var1.k5() + var10;
      return var10;
   }

   public final int n5(s0 var1, int var2) {
      int var3 = 0;

      int var4;
      for (var4 = var1.l6 + 1; var4 < this.n5.size() && this.l6.get_Item(var4) - var1.n5 <= var2; var4++) {
         var3 = this.l6.get_Item(var4) - var1.n5;
      }

      this.u9.l6 = var4 - 1;
      this.u9.n5 = var1.n5 + var3;
      return var3;
   }

   public final void x8() {
      this.u9.n5 = this.u3();
      this.u9.l6 = this.n5.size() - 1;
      this.u9.k5 = this.n5.get_Item(this.u9.l6).size() - 1;
   }

   public final void l6(List<List<com.aspose.slides.internal.r4.u9>> var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         this.n5.removeAt(this.n5.size() - 1);
         this.l6.removeAt(this.l6.size() - 1);
      }
   }

   public final void n5(b3 var1, j9 var2, int var3) {
      this.u9.n5 = var1.t9.k5();
      this.u9.l6 = var1.t9.a6();
      this.u9.k5 = var1.t9.u3();
      int var4 = var3;
      int var5 = 0;
      b3 var6 = var1;

      while (this.u9.n5 < this.u3()) {
         if (this.l6.get_Item(this.u9.l6) - this.u9.n5 <= var4) {
            var4 -= this.l6.get_Item(this.u9.l6) - this.u9.n5;
            this.u9.n5 = this.l6.get_Item(this.u9.l6);
            this.u9.k5 = this.n5.get_Item(this.u9.l6).size() - 1;
         } else if ((var5 = this.n5(this.u9, var4, true)) > 0) {
            var4 -= var5;
         } else {
            b3 var7 = (b3)var2.n5(var1.n5, var6.l6 + 1, 1, this.u9.n5 - var6.t9.k5(), 0, 0, 0.0, 0, 0, 0, 0.0, var6);
            var2.n5(var7.l6, var7);
            var2.l6(var6.l6, var6);
            var6 = var7;
            var4 = var3;
         }
      }

      b3 var9 = (b3)var2.n5(var1.n5, var6.l6 + 1, 1, this.u3() - var6.t9.k5(), 0, 0, 0.0, 0, 0, 0, 0.0, var6);
      var2.n5(var9.l6, var9);
      var2.l6(var6.l6, var6);
   }

   public final void l6(b3 var1, j9 var2, int var3) {
      this.u9.n5 = var1.z1.k5();
      this.u9.l6 = var1.z1.a6();
      int var4 = var3;
      b3 var5 = var1;

      while (this.u9.n5 < this.u3()) {
         if (this.l6.get_Item(this.u9.l6 + 1) - this.u9.n5 <= var4) {
            this.u9.l6++;
            var4 -= this.l6.get_Item(this.u9.l6) - this.u9.n5;
            this.u9.n5 = this.l6.get_Item(this.u9.l6);
         } else {
            b3 var6 = (b3)var2.n5(var1.n5, var5.l6 + 1, 1, this.u9.n5 - var5.z1.k5(), 0, 0, 0.0, 0, 0, 0, var5.x8 + (this.u9.l6 - var5.z1.l6) * 10000, var5);
            var2.n5(var6.l6, var6);
            var2.l6(var5.l6, var5);
            var5 = var6;
            var4 = var3;
         }
      }

      b3 var7 = (b3)var2.n5(var1.n5, var5.l6 + 1, 1, this.u3() - var5.z1.k5(), 0, 0, 0.0, 0, 0, 0, var5.x8 + (this.u9.l6 - var5.z1.l6) * 10000, var5);
      var2.n5(var7.l6, var7);
      var2.l6(var5.l6, var5);
   }
}
