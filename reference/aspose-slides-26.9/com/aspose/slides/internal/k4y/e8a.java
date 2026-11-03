package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class e8a extends b3 {
   private l3t n5;
   private List<k6w> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("mPr", "mr");

   public e8a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      n5(var1, new e8a$1(this, var1));
   }

   public e8a() {
      this.a6();
   }

   private void a6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "mPr");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            k6w var5 = (k6w)var4.next();
            var5.n5("m", var2, "mr");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(l3t var1) {
      this.n5 = var1;
   }

   public final k6w n5() {
      k6w var1 = new k6w();
      this.l6.addItem(var1);
      return var1;
   }

   public final l3t l6() {
      return this.n5;
   }

   public final k6w[] k5() {
      return this.l6.toArray(new k6w[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static l3t n5(e8a var0, l3t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(e8a var0) {
      return var0.l6;
   }
}
