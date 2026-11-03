package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class u1n extends m3 implements z6 {
   private b8n n5;
   private b8n l6;
   private w1c k5;
   private b9y u3;
   private x7u a6;
   private List<v0v> u9;
   private a4s h0;
   private l0u c8;
   private l6s t2;
   private a9t s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "idx", "order", "tx", "spPr", "marker", "dPt", "dLbls", "cat", "val", "extLst"
   );

   public u1n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.f2();
      n5(var1, new u1n$1(this, var1));
   }

   public u1n() {
      this.f2();
      this.n5 = new b8n();
      this.l6 = new b8n();
   }

   private void f2() {
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("c", var2, "idx");
      this.l6.n5("c", var2, "order");
      if (this.k5 != null) {
         this.k5.n5("c", var2, "tx");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "spPr");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "marker");
      }

      List$Enumerator var4 = this.u9.iterator();

      try {
         while (var4.hasNext()) {
            v0v var5 = (v0v)var4.next();
            var5.n5("c", var2, "dPt");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "dLbls");
      }

      if (this.c8 != null) {
         this.c8.n5("c", var2, "cat");
      }

      if (this.t2 != null) {
         this.t2.n5("c", var2, "val");
      }

      if (this.s7 != null) {
         this.s7.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   @Override
   public w1c c8() {
      if (this.k5 != null) {
         throw new Exception("Only one <tx> element can be added.");
      }

      this.k5 = new w1c();
      return this.k5;
   }

   @Override
   public b9y u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.u3 = new b9y();
      return this.u3;
   }

   @Override
   public x7u t9() {
      if (this.a6 != null) {
         throw new Exception("Only one <marker> element can be added.");
      }

      this.a6 = new x7u();
      return this.a6;
   }

   @Override
   public v0v m1() {
      v0v var1 = new v0v();
      this.u9.addItem(var1);
      return var1;
   }

   @Override
   public a4s q0() {
      if (this.h0 != null) {
         throw new Exception("Only one <dLbls> element can be added.");
      }

      this.h0 = new a4s();
      return this.h0;
   }

   @Override
   public final l0u n3() {
      if (this.c8 != null) {
         throw new Exception("Only one <cat> element can be added.");
      }

      this.c8 = new l0u();
      return this.c8;
   }

   @Override
   public final l6s x8() {
      if (this.t2 != null) {
         throw new Exception("Only one <val> element can be added.");
      }

      this.t2 = new l6s();
      return this.t2;
   }

   @Override
   public x8 u9() {
      if (this.s7 != null) {
         throw new Exception("Only one <extLst> element can be added.");
      }

      this.s7 = new a9t();
      return this.s7;
   }

   @Override
   public void n5(x8 var1) {
      this.s7 = (a9t)var1;
   }

   @Override
   public b8n n5() {
      return this.n5;
   }

   @Override
   public b8n l6() {
      return this.l6;
   }

   @Override
   public w1c h0() {
      return this.k5;
   }

   @Override
   public b9y k5() {
      return this.u3;
   }

   @Override
   public x7u aE_() {
      return this.a6;
   }

   @Override
   public v0v[] z3() {
      return this.u9.toArray(new v0v[0]);
   }

   @Override
   public a4s t4() {
      return this.h0;
   }

   @Override
   public l0u aF_() {
      return this.c8;
   }

   @Override
   public l6s aG_() {
      return this.t2;
   }

   @Override
   public x8 a6() {
      return this.s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 p8() {
      return x8;
   }

   // $VF: synthetic method
   static b8n n5(u1n var0, b8n var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b8n l6(u1n var0, b8n var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w1c n5(u1n var0, w1c var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static b9y n5(u1n var0, b9y var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static x7u n5(u1n var0, x7u var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List n5(u1n var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static a4s n5(u1n var0, a4s var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static l0u n5(u1n var0, l0u var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static l6s n5(u1n var0, l6s var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static a9t n5(u1n var0, a9t var1) {
      return var0.s7 = var1;
   }
}
