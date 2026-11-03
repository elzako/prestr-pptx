package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.internal.v7y.r1;
import com.aspose.slides.ms.System.Xml.k6;

public class l6 {
   private int n5;
   private int l6;
   private Object[] k5;
   private Hashtable u3;
   private n5 a6;
   private l6 u9;
   private int h0;
   private com.aspose.slides.internal.x6s.h0 c8;
   private com.aspose.slides.internal.x6s.h0 t2;
   private f0 s7;
   private String x8;

   public final f0 n5() {
      return this.s7;
   }

   public final void n5(f0 var1) {
      this.s7 = var1;
   }

   public final String l6() {
      return this.x8;
   }

   public final void n5(String var1) {
      this.x8 = var1;
   }

   public final int k5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int u3() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.x6s.a6 a6() {
      return this.c8 != null ? this.c8.k5() : null;
   }

   public final com.aspose.slides.internal.x6s.h0 u9() {
      return this.c8;
   }

   public final com.aspose.slides.internal.x6s.h0 h0() {
      return this.t2;
   }

   public final int c8() {
      return ++this.l6;
   }

   public final void k5(int var1) {
      if (0 < var1) {
         this.k5 = new Object[var1];
      } else {
         this.k5 = null;
      }
   }

   public final Object u3(int var1) {
      return this.k5[var1];
   }

   public final void n5(int var1, Object var2) {
      this.k5[var1] = var2;
   }

   public final void n5(k6 var1, Object var2) {
      if (this.u3 == null) {
         this.u3 = new Hashtable();
      }

      this.u3.set_Item(var1, var2);
   }

   public final void t2() {
      if (this.u3 != null) {
         this.u3.clear();
      }
   }

   public final Object n5(k6 var1) {
      return this.u3 != null ? this.u3.get_Item(var1) : null;
   }

   public final void n5(com.aspose.slides.internal.x6s.h0 var1) {
      this.c8 = var1;
   }

   public final void l6(com.aspose.slides.internal.x6s.h0 var1) {
      this.t2 = var1;
   }

   public final void n5(p3 var1, ArrayList var2) {
      int var3 = var2.size();
      r1 var4 = new r1(var3);

      for (int var5 = 0; var5 < var3; var5++) {
         z6 var6 = (z6)var2.get_Item(var5);
         com.aspose.slides.internal.v7y.j9 var7 = var1.k5(var6.n5);
         var4.n5(var7, new com.aspose.slides.internal.v7y.p6(var6.u3, var6.a6, var6.l6, var6.k5));
      }

      ArrayList var9 = new ArrayList();

      while (this.k5(var1)) {
         com.aspose.slides.internal.x6s.h0 var10 = this.c8;
         this.c8 = this.t2;
         com.aspose.slides.internal.v7y.w2 var11 = new com.aspose.slides.internal.v7y.w2(var3, var9.size(), this.t2.k5().n5());

         for (int var8 = 0; var8 < var3; var8++) {
            var11.n5(var8, var4.n5(var8).n5(this.t2));
         }

         var9.addItem(var11);
         this.c8 = var10;
      }

      var9.sort(var4);
      this.t2 = new l6$n5(var9);
   }

   public final void s7() {
      this.n5(-1);
   }

   public final void n5(l6 var1) {
      this.k5 = var1.k5;
   }

   private void n5(n5 var1, l6 var2, com.aspose.slides.internal.x6s.h0 var3) {
      this.n5 = 0;
      this.a6 = var1;
      this.u9 = var2;
      this.h0 = 0;
      this.c8 = var3;
      this.t2 = null;
   }

   public final void n5(n5 var1, com.aspose.slides.internal.x6s.h0 var2) {
      this.n5(var1, null, var2);
   }

   public final void n5(l6 var1, com.aspose.slides.internal.x6s.h0 var2) {
      this.n5(var1.a6(0), var1, var2);
   }

   public final void n5(n5 var1) {
      this.n5(var1, 0);
   }

   public final void n5(n5 var1, int var2) {
      this.a6 = var1;
      this.n5 = var2;
   }

   private n5 a6(int var1) {
      return ((t4)this.a6).n5(var1);
   }

   public final void x8() {
      this.s7();
      this.u9 = null;
   }

   public final boolean n5(p3 var1) {
      if (this.a6 == null) {
         return true;
      }

      this.a6.n5(var1, this);
      if (this.k5() == -1) {
         if (this.u9 != null) {
            this.h0++;
            this.a6 = this.u9.a6(this.h0);
            this.n5(0);
         } else {
            this.a6 = null;
         }

         return this.a6 == null;
      } else {
         return false;
      }
   }

   public final boolean l6(p3 var1) {
      boolean var2 = this.c8.l6();
      if (var2 && var1.l6().n5()) {
         int var3 = this.c8.k5().k5();
         if (var3 == 6) {
            com.aspose.slides.internal.x6s.a6 var4 = this.c8.k5().n5();

            boolean var5;
            do {
               var4.n5(this.c8.k5());
               var4.q0();
               var5 = !var1.l6().n5(var1, var4) && (var2 = this.c8.l6());
               var3 = this.c8.k5().k5();
            } while (var5 && var3 == 6);
         }
      }

      return var2;
   }

   public final boolean k5(p3 var1) {
      boolean var2 = this.t2.l6();
      if (var2 && var1.l6().n5()) {
         int var3 = this.t2.k5().k5();
         if (var3 == 6) {
            com.aspose.slides.internal.x6s.a6 var4 = this.t2.k5().n5();

            boolean var5;
            do {
               var4.n5(this.t2.k5());
               var4.q0();
               var5 = !var1.l6().n5(var1, var4) && (var2 = this.t2.l6());
               var3 = this.t2.k5().k5();
            } while (var5 && var3 == 6);
         }
      }

      return var2;
   }
}
