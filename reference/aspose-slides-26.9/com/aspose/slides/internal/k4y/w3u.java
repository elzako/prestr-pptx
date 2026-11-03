package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class w3u extends m3 implements s0, z6 {
   private b8n n5;
   private b8n l6;
   private w1c k5;
   private b9y u3;
   private n1b a6;
   private List<v0v> u9;
   private a4s h0;
   private List<l6z> c8;
   private List<y4g> t2;
   private l0u s7;
   private l6s x8;
   private a9t n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "idx", "order", "tx", "spPr", "pictureOptions", "dPt", "dLbls", "trendline", "errBars", "cat", "val", "extLst"
   );

   public w3u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.p8();
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (y4.n5(var1.n3())) {
                  case 0:
                     this.n5 = new b8n(var1);
                     break;
                  case 1:
                     this.l6 = new b8n(var1);
                     break;
                  case 2:
                     this.k5 = new w1c(var1);
                     break;
                  case 3:
                     this.u3 = new b9y(var1);
                     break;
                  case 4:
                     this.a6 = new n1b(var1);
                     var3 = true;
                     break;
                  case 5:
                     v0v var4 = new v0v(var1);
                     this.u9.addItem(var4);
                     break;
                  case 6:
                     this.h0 = new a4s(var1);
                     break;
                  case 7:
                     l6z var5 = new l6z(var1);
                     this.c8.addItem(var5);
                     break;
                  case 8:
                     y4g var6 = new y4g(var1);
                     this.t2.addItem(var6);
                     break;
                  case 9:
                     this.s7 = new l0u(var1);
                     break;
                  case 10:
                     this.x8 = new l6s(var1);
                     break;
                  case 11:
                     this.n3 = new a9t(var1);
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public w3u() {
      this.p8();
      this.n5 = new b8n();
      this.l6 = new b8n();
   }

   private void p8() {
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
         this.a6.n5("c", var2, "pictureOptions");
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
         this.s7.n5("c", var2, "cat");
      }

      if (this.x8 != null) {
         this.x8.n5("c", var2, "val");
      }

      if (this.n3 != null) {
         this.n3.n5("c", var2, "extLst");
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
   public final void n5(d3 var1) {
      this.a6 = (n1b)var1;
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
   public final l0u n3() {
      if (this.s7 != null) {
         throw new Exception("Only one <cat> element can be added.");
      }

      this.s7 = new l0u();
      return this.s7;
   }

   @Override
   public final l6s x8() {
      if (this.x8 != null) {
         throw new Exception("Only one <val> element can be added.");
      }

      this.x8 = new l6s();
      return this.x8;
   }

   @Override
   public x8 u9() {
      if (this.n3 != null) {
         throw new Exception("Only one <extLst> element can be added.");
      }

      this.n3 = new a9t();
      return this.n3;
   }

   @Override
   public void n5(x8 var1) {
      this.n3 = (a9t)var1;
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
   public n1b z8() {
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
   public l0u aF_() {
      return this.s7;
   }

   @Override
   public l6s aG_() {
      return this.x8;
   }

   @Override
   public x8 a6() {
      return this.n3;
   }
}
