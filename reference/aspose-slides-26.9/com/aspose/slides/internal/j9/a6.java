package com.aspose.slides.internal.j9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.b3.y2;
import com.aspose.slides.internal.h2.j5;
import com.aspose.slides.internal.h2.j9;
import com.aspose.slides.internal.h2.t1;
import com.aspose.slides.internal.u6.m3;
import com.aspose.slides.internal.u6.z1;
import com.aspose.slides.ms.System.IDisposable;

public class a6 {
   private z1 n5;
   private com.aspose.slides.internal.v8.u3 l6;
   private List<m3> k5 = new List<>();
   private List<com.aspose.slides.internal.f2.k5> u3 = new List<>();
   private int a6 = 0;

   public a6(z1 var1) {
      this.n5 = var1;
      this.l6 = com.aspose.slides.internal.v8.y4.n5(var1);
      this.l6();
      this.k5();
   }

   private void l6() {
      List var1 = this.n5.z7();
      if (var1 != null) {
         int var2 = 1;
         com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3(var1);

         while (var3.l6()) {
            m3 var4 = (m3)var3.k5();
            if (var4 != null) {
               var2 = var4.o0();

               for (int var5 = 0; var5 < var4.z7(); var5++) {
                  while (var2 > this.k5.size()) {
                     this.k5.addItem(null);
                  }

                  this.k5.set_Item(var2 - 1, var4);
                  var2++;
               }
            }
         }

         int var8 = 1;

         for (com.aspose.slides.internal.r4.u3 var9 = new com.aspose.slides.internal.r4.u3<>(this.k5); var9.l6(); var8++) {
            m3 var6 = (m3)var9.k5();
            if (var6 == null) {
            }
         }
      }
   }

   public final m3 n5(int var1) {
      int var2 = this.k5.size();
      if (var1 <= var2) {
         return this.k5.get_Item(var1 - 1);
      }

      if (var1 > this.a6) {
         this.a6 = var1;
         m3 var3 = this.n5(1);
         if ((var2 != 1 || !var3.u6()) && !this.n5.o0()) {
         }
      }

      return this.k5.get_Item(var2 - 1);
   }

   @Override
   public String toString() {
      return this.k5.toString();
   }

   public final int n5() {
      return this.a6 > this.k5.size() ? this.a6 : this.k5.size();
   }

   private void k5() {
      int var1 = this.k5.size();

      while (--var1 >= 0) {
         if (this.k5.get_Item(var1) != null) {
            m3 var2 = this.k5.get_Item(var1);
            com.aspose.slides.internal.f2.k5 var3 = var2.i1();
            this.u3.insertItem(0, var3);
         }
      }

      this.u3.insertItem(0, null);
   }

   public final double n5(y4 var1) {
      return this.n5(var1, var1.c8());
   }

   public final float n5(com.aspose.slides.internal.f2.u9 var1, int var2) {
      int var3 = 0;
      float var4 = 0.0F;
      float var5 = 0.0F;
      List$Enumerator var6 = this.u3.iterator();

      try {
         while (var6.hasNext()) {
            com.aspose.slides.internal.f2.k5 var7 = (com.aspose.slides.internal.f2.k5)var6.next();
            if (var7 != null) {
               var3 += var7.l6(var1);
               if (com.aspose.slides.internal.v6g.k5.l6(var7, y2.class)) {
                  var4 += (float)((y2)var7).t2();
               } else if (com.aspose.slides.internal.v6g.k5.l6(var7, j9.class)) {
                  var4 += (float)((j9)var7).e2();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if (var4 > 0.0F && var3 < var2) {
         var5 = (var2 - var3) / var4;
      }

      return var5;
   }

   public final int n5(int var1, com.aspose.slides.internal.f2.u9 var2) {
      return this.l6(var1, var2);
   }

   private int l6(int var1, com.aspose.slides.internal.f2.u9 var2) {
      int var3 = 0;
      int var4 = var1;

      while (--var4 >= 0) {
         int var5;
         if (var4 < this.u3.size()) {
            var5 = var4;
         } else {
            var5 = this.u3.size() - 1;
         }

         if (this.u3.get_Item(var5) != null) {
            var3 += this.u3.get_Item(var5).l6(var2);
         }
      }

      return var3;
   }

   public final int n5(com.aspose.slides.internal.f2.u9 var1) {
      int var2 = 0;
      int var3 = 1;

      for (int var4 = this.n5(); var3 <= var4; var3++) {
         int var5 = var3;
         if (var3 >= this.u3.size()) {
            var5 = this.u3.size() - 1;
         }

         if (this.u3.get_Item(var5) != null) {
            var2 += this.u3.get_Item(var5).l6(var1);
         }
      }

      return var2;
   }

   public final void l6(com.aspose.slides.internal.f2.u9 var1) {
      int var2 = this.n5();

      for (int var3 = 1; var3 <= var2; var3++) {
         m3 var4 = this.n5(var3);
         if (var4.i1().k5()) {
            int var5 = var4.i1().l6(var1);
            com.aspose.slides.internal.v8.u9 var6 = var4.b3();
            if (var6 != null && var6.n5() > var5) {
               var4.n5(j5.n5((double)(var6.n5())));
            }
         }
      }
   }

   public final int k5(com.aspose.slides.internal.f2.u9 var1) {
      int var2 = this.n5();
      int var3 = 0;

      for (int var4 = 1; var4 <= var2; var4++) {
         m3 var5 = this.n5(var4);
         if (var5.i1().k5() && var5.i1().l6(var1) != 0) {
            var3 += var5.i1().l6(var1);
         }
      }

      return var3;
   }

   public final boolean u3(com.aspose.slides.internal.f2.u9 var1) {
      int var2 = this.n5();

      for (int var3 = 1; var3 <= var2; var3++) {
         m3 var4 = this.n5(var3);
         if (!var4.i1().k5() || var4.i1().l6(var1) == 0) {
            return true;
         }
      }

      return false;
   }

   public final boolean a6(com.aspose.slides.internal.f2.u9 var1) {
      int var2 = this.n5();

      for (int var3 = 1; var3 <= var2; var3++) {
         m3 var4 = this.n5(var3);
         if ((!var4.i1().k5() || var4.i1().l6(var1) == 0) && !com.aspose.slides.internal.v6g.k5.l6(var4.i1(), t1.class)) {
            return true;
         }
      }

      return false;
   }

   public final void l6(com.aspose.slides.internal.f2.u9 var1, int var2) {
      int var3 = this.n5();
      int var4 = this.k5(var1);

      for (int var5 = 1; var5 <= var3; var5++) {
         m3 var6 = this.n5(var5);
         double var7 = (double)var2 / var4;
         int var9 = var6.i1().l6(var1);
         int var10 = com.aspose.slides.internal.v6g.k5.u3(var9 * var7, 14);
         if (var10 > var6.b3().n5()) {
            var4 -= var9;
            var2 -= var10;
            var6.n5(j5.n5(var10, "mpt"));
         }
      }
   }

   public final int k5(com.aspose.slides.internal.f2.u9 var1, int var2) {
      int var3 = this.n5();
      float var4 = 0.0F;

      for (int var5 = 1; var5 <= var3; var5++) {
         m3 var6 = this.n5(var5);
         t1 var7 = com.aspose.slides.internal.v6g.k5.n5(var6.i1(), t1.class);
         if (var7 != null) {
            float var8 = (float)(var7.e2() / 100.0 * var2);
            com.aspose.slides.internal.v8.u9 var9 = var6.b3();
            if (var9 != null && var9.n5() > var8) {
               var8 = var9.l6();
            }

            var4 += var8;
         }
      }

      return com.aspose.slides.internal.v6g.k5.u3(var4, 13);
   }

   public final void u3(com.aspose.slides.internal.f2.u9 var1, int var2) {
      int var3 = this.n5();

      for (int var4 = 1; var4 <= this.n5(); var4++) {
         if (this.n5(var4).u9) {
            var3--;
         }
      }

      if (var3 > 1) {
         var3 = this.n5();

         for (int var10 = 1; var10 <= var3; var10++) {
            m3 var5 = this.n5(var10);
            t1 var6 = com.aspose.slides.internal.v6g.k5.n5(var5.i1(), t1.class);
            if (var6 != null) {
               int var7 = com.aspose.slides.internal.v6g.k5.u3(var6.e2() / 100.0 * var2, 14);
               com.aspose.slides.internal.v8.u9 var8 = var5.b3();
               if (var8 != null && var8.n5() > var7) {
                  var7 = var8.l6();
               }

               var5.n5(j5.n5((double)(var7)));
            }
         }
      }
   }
}
