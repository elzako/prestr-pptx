package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class u3r extends k7 implements e9, f0, t1, u6, v0 {
   private r0w n5;
   private n3o l6;
   private c8q k5;
   private List<i5k> u3;
   private a4s a6;
   private m9a u9;
   private m9a h0;
   private r3x c8;
   private List<y4x> t2;
   private a9t s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "barDir", "grouping", "varyColors", "ser", "dLbls", "gapWidth", "gapDepth", "shape", "axId", "extLst"
   );

   public u3r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u6();
      n5(var1, new u3r$1(this, var1));
   }

   public u3r() {
      this.u6();
      this.n5 = new r0w();
   }

   private void u6() {
      this.u3 = new List<>();
      this.t2 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("c", var2, "barDir");
      if (this.l6 != null) {
         this.l6.n5("c", var2, "grouping");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "varyColors");
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            i5k var5 = (i5k)var4.next();
            var5.n5("c", var2, "ser");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "dLbls");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "gapWidth");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "gapDepth");
      }

      if (this.c8 != null) {
         this.c8.n5("c", var2, "shape");
      }

      List$Enumerator var14 = this.t2.iterator();

      try {
         while (var14.hasNext()) {
            y4x var6 = (y4x)var14.next();
            var6.n5("c", var2, "axId");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.s7 != null) {
         this.s7.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final n3o o0() {
      if (this.l6 != null) {
         throw new Exception("Only one <grouping> element can be added.");
      }

      this.l6 = new n3o();
      return this.l6;
   }

   @Override
   public final c8q y2() {
      if (this.k5 != null) {
         throw new Exception("Only one <varyColors> element can be added.");
      }

      this.k5 = new c8q();
      return this.k5;
   }

   @Override
   public m3 k5() {
      i5k var1 = new i5k();
      this.u3.addItem(var1);
      return var1;
   }

   @Override
   public final a4s c4() {
      if (this.a6 != null) {
         throw new Exception("Only one <dLbls> element can be added.");
      }

      this.a6 = new a4s();
      return this.a6;
   }

   @Override
   public final m9a h0() {
      if (this.u9 != null) {
         throw new Exception("Only one <gapWidth> element can be added.");
      }

      this.u9 = new m9a();
      return this.u9;
   }

   @Override
   public final m9a s7() {
      if (this.h0 != null) {
         throw new Exception("Only one <gapDepth> element can be added.");
      }

      this.h0 = new m9a();
      return this.h0;
   }

   @Override
   public r3x i1() {
      if (this.c8 != null) {
         throw new Exception("Only one <shape> element can be added.");
      }

      this.c8 = new r3x();
      return this.c8;
   }

   @Override
   public final y4x a6() {
      y4x var1 = new y4x();
      this.t2.addItem(var1);
      return var1;
   }

   @Override
   public void n5(x8 var1) {
      this.s7 = (a9t)var1;
   }

   @Override
   public r0w av_() {
      return this.n5;
   }

   public final n3o z7() {
      return this.l6;
   }

   @Override
   public c8q y4() {
      return this.k5;
   }

   @Override
   public m3[] l6() {
      return this.u3.toArray(new i5k[0]);
   }

   @Override
   public a4s t2() {
      return this.a6;
   }

   @Override
   public m9a t9() {
      return this.u9;
   }

   @Override
   public m9a e2() {
      return this.h0;
   }

   @Override
   public r3x f2() {
      return this.c8;
   }

   @Override
   public y4x[] aD_() {
      return this.t2.toArray(new y4x[0]);
   }

   @Override
   public x8 c8() {
      return this.s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 v4() {
      return x8;
   }

   // $VF: synthetic method
   static r0w n5(u3r var0, r0w var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static n3o n5(u3r var0, n3o var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static c8q n5(u3r var0, c8q var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(u3r var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static a4s n5(u3r var0, a4s var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static m9a n5(u3r var0, m9a var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static m9a l6(u3r var0, m9a var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static r3x n5(u3r var0, r3x var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static List l6(u3r var0) {
      return var0.t2;
   }

   // $VF: synthetic method
   static a9t n5(u3r var0, a9t var1) {
      return var0.s7 = var1;
   }
}
