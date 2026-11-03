package com.aspose.slides.internal.f4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.e1.m3;
import com.aspose.slides.internal.e1.n3;
import com.aspose.slides.internal.e1.w1;
import com.aspose.slides.internal.j3.z1;
import com.aspose.slides.internal.j3.z3;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class n5 implements k5 {
   private com.aspose.slides.internal.y9.n5 n5;
   private z1 l6;
   private w1[] k5;
   private Dictionary<String, y1> u3;
   private Dictionary<z3, n5$n5> a6 = new Dictionary<>();
   private Dictionary<String, n5$n5> u9 = new Dictionary<>();

   public n5(z1 var1, com.aspose.slides.internal.y9.n5 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   public final String n5(z3 var1) {
      if (this.a6.containsKey(var1)) {
         return this.k5(var1).n5();
      } else {
         String var2 = this.n5.n5(var1);
         if (var2 != null && var2.length() != 0) {
            var2 = d1.t2(var2);
            this.n5(new n5$n5(var2, var1));
            return var2;
         } else {
            return var2;
         }
      }
   }

   public final z1 n5() {
      return this.l6;
   }

   public final w1[] l6() {
      return this.k5;
   }

   public final z3 n5(m3 var1) {
      if (d1.n5(var1.j5())) {
         return null;
      }

      n5$n5 var2 = this.n5(d1.t2(var1.j5()));
      return var2 == null ? null : var2.l6();
   }

   @Override
   public final l6 l6(z3 var1) {
      return this.n5(var1, 0);
   }

   public final l6 n5(z3 var1, int var2) {
      com.aspose.slides.internal.w3.n5.n5(var1, "element");
      y1 var3 = y1.n5.y4();
      y1[] var4 = new y1[]{var3};
      this.n5(var1, var2, var4);
      var4[0].a6(var3);
      return new l6(var1, var3.y4(), this);
   }

   @Override
   public final l6 l6(m3 var1) {
      com.aspose.slides.internal.w3.n5.n5(var1, "node");
      z3 var2 = this.n5(var1);
      return var2 == null ? null : this.l6(var2);
   }

   public final void n5(w1[] var1) {
      this.k5 = var1;

      for (w1 var5 : var1) {
         this.k5(var5);
      }
   }

   private void k5(m3 var1) {
      if (!d1.n5(var1.j5())) {
         n5$n5 var2 = this.n5(d1.t2(var1.j5()));
         if (var2 != null) {
            var2.k5().addItem(var1);
         }
      }

      n3 var5 = com.aspose.slides.internal.v6g.k5.n5(var1, n3.class);
      if (var5 != null) {
         for (int var3 = 0; var3 < var5.t2(); var3++) {
            m3 var4 = var5.n5(var3);
            this.k5(var4);
         }
      }
   }

   private void n5(n5$n5 var1) {
      this.a6.addItem(var1.l6(), var1);
      this.u9.addItem(var1.n5(), var1);
   }

   private n5$n5 n5(String var1) {
      return !this.u9.containsKey(var1) ? null : this.u9.get_Item(var1);
   }

   private n5$n5 k5(z3 var1) {
      return !this.a6.containsKey(var1) ? null : this.a6.get_Item(var1);
   }

   public final void n5(Dictionary<String, y1> var1) {
      this.u3 = var1;
   }

   public final boolean n5(z3 var1, int var2, y1[] var3) {
      n5$n5 var4 = this.k5(var1);
      if (var4 == null) {
         return false;
      }

      String var5 = d1.u9(var4.n5());
      if (var2 > 0 && this.u3.tryGetValue(d1.n5(new String[]{var5, "_", a3.l6(var2)}), var3)) {
         return true;
      }

      if (!this.u3.containsKey(var5)) {
         return false;
      }

      this.u3.get_Item(var5).a6(var3[0]);
      return true;
   }
}
