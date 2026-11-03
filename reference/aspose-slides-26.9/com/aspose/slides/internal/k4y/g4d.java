package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class g4d extends m3 implements j8, o5, p3 {
   private b8n n5;
   private b8n l6;
   private w1c k5;
   private b9y u3;
   private c8q a6;
   private List<v0v> u9;
   private a4s h0;
   private List<l6z> c8;
   private List<y4g> t2;
   private l0u s7;
   private l6s x8;
   private l6s n3;
   private c8q y4;
   private a9t e2;
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
      "idx", "order", "tx", "spPr", "invertIfNegative", "dPt", "dLbls", "trendline", "errBars", "xVal", "yVal", "bubbleSize", "bubble3D", "extLst"
   );

   public g4d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.i1();
      n5(var1, new g4d$1(this, var1));
   }

   public g4d() {
      this.i1();
      this.n5 = new b8n();
      this.l6 = new b8n();
   }

   private void i1() {
      this.u9 = new List<>();
      this.c8 = new List<>();
      this.t2 = new List<>();
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
         this.a6.n5("c", var2, "invertIfNegative");
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

      List$Enumerator var21 = this.c8.iterator();

      try {
         while (var21.hasNext()) {
            l6z var6 = (l6z)var21.next();
            var6.n5("c", var2, "trendline");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
            var21.dispose();
         }
      }

      List$Enumerator var22 = this.t2.iterator();

      try {
         while (var22.hasNext()) {
            y4g var7 = (y4g)var22.next();
            var7.n5("c", var2, "errBars");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      if (this.s7 != null) {
         this.s7.n5("c", var2, "xVal");
      }

      if (this.x8 != null) {
         this.x8.n5("c", var2, "yVal");
      }

      if (this.n3 != null) {
         this.n3.n5("c", var2, "bubbleSize");
      }

      if (this.y4 != null) {
         this.y4.n5("c", var2, "bubble3D");
      }

      if (this.e2 != null) {
         this.e2.n5("c", var2, "extLst");
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
   public final c8q e2() {
      if (this.a6 != null) {
         throw new Exception("Only one <invertIfNegative> element can be added.");
      }

      this.a6 = new c8q();
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
   public l6z m3() {
      l6z var1 = new l6z();
      this.c8.addItem(var1);
      return var1;
   }

   @Override
   public y4g r4() {
      y4g var1 = new y4g();
      this.t2.addItem(var1);
      return var1;
   }

   @Override
   public final l0u t2() {
      if (this.s7 != null) {
         throw new Exception("Only one <xVal> element can be added.");
      }

      this.s7 = new l0u();
      return this.s7;
   }

   @Override
   public final l6s s7() {
      if (this.x8 != null) {
         throw new Exception("Only one <yVal> element can be added.");
      }

      this.x8 = new l6s();
      return this.x8;
   }

   public final l6s p8() {
      if (this.n3 != null) {
         throw new Exception("Only one <bubbleSize> element can be added.");
      }

      this.n3 = new l6s();
      return this.n3;
   }

   @Override
   public c8q s3() {
      if (this.y4 != null) {
         throw new Exception("Only one <bubble3D> element can be added.");
      }

      this.y4 = new c8q();
      return this.y4;
   }

   @Override
   public x8 u9() {
      if (this.e2 != null) {
         throw new Exception("Only one <extLst> element can be added.");
      }

      this.e2 = new a9t();
      return this.e2;
   }

   @Override
   public void n5(x8 var1) {
      this.e2 = (a9t)var1;
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
   public c8q c4() {
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
   public l6z[] k7() {
      return this.c8.toArray(new l6z[0]);
   }

   @Override
   public y4g[] j5() {
      return this.t2.toArray(new y4g[0]);
   }

   @Override
   public l0u aA_() {
      return this.s7;
   }

   @Override
   public l6s aB_() {
      return this.x8;
   }

   @Override
   public l6s aK_() {
      return this.n3;
   }

   @Override
   public c8q d5() {
      return this.y4;
   }

   @Override
   public x8 a6() {
      return this.e2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 f2() {
      return t9;
   }

   // $VF: synthetic method
   static b8n n5(g4d var0, b8n var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b8n l6(g4d var0, b8n var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w1c n5(g4d var0, w1c var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static b9y n5(g4d var0, b9y var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static c8q n5(g4d var0, c8q var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List n5(g4d var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static a4s n5(g4d var0, a4s var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static List l6(g4d var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static List k5(g4d var0) {
      return var0.t2;
   }

   // $VF: synthetic method
   static l0u n5(g4d var0, l0u var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static l6s n5(g4d var0, l6s var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static l6s l6(g4d var0, l6s var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static c8q l6(g4d var0, c8q var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static a9t n5(g4d var0, a9t var1) {
      return var0.e2 = var1;
   }
}
