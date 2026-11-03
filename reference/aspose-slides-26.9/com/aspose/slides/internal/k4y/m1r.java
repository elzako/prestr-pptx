package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class m1r extends b3 {
   private m3o n5;
   private List<o3d> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("oMathParaPr", "oMath");

   public m1r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      n5(var1, new m1r$1(this, var1));
   }

   public m1r() {
      this.a6();
   }

   private void a6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "oMathParaPr");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            o3d var5 = (o3d)var4.next();
            var5.n5("m", var2, "oMath");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(m3o var1) {
      this.n5 = var1;
   }

   public final o3d n5() {
      o3d var1 = new o3d();
      this.l6.addItem(var1);
      return var1;
   }

   public final m3o l6() {
      return this.n5;
   }

   public final o3d[] k5() {
      return this.l6.toArray(new o3d[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static m3o n5(m1r var0, m3o var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(m1r var0) {
      return var0.l6;
   }
}
