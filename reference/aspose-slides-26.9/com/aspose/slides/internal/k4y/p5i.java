package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p5i extends b3 {
   private int n5;
   private long l6;
   private List<s6m> k5;
   private l8r u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("type", "rev", "param", "extLst");

   public p5i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      p5i$1 var2 = new p5i$1(this);
      n5(var1, var2);
      n5(var1, new p5i$2(this, var1));
   }

   public p5i() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0;
      this.l6 = 0L;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("type", j3.n5(this.n5));
      if ((this.l6 & 4294967295L) != 0L) {
         var2.l6("rev", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            s6m var5 = (s6m)var4.next();
            var5.n5("dgm", var2, "param");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.u3 != null) {
         this.u3.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   public final s6m[] l6() {
      return this.k5.toArray(new s6m[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(p5i var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(p5i var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(p5i var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static l8r n5(p5i var0, l8r var1) {
      return var0.u3 = var1;
   }
}
