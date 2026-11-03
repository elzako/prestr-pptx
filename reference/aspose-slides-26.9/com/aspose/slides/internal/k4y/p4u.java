package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p4u extends b3 {
   private long n5;
   private String l6;
   private List<i0c> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("ptCount", "name", "pt");

   public p4u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      p4u$1 var2 = new p4u$1(this);
      n5(var1, var2);
      n5(var1, new p4u$2(this, var1));
   }

   public p4u() {
      this.a6();
   }

   private void a6() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("ptCount", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6 != null) {
         var2.l6("name", this.l6);
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            i0c var5 = (i0c)var4.next();
            var5.n5("cx", var2, "pt");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final i0c n5() {
      i0c var1 = new i0c();
      this.k5.addItem(var1);
      return var1;
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final i0c[] k5() {
      return this.k5.toArray(new i0c[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static long n5(p4u var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(p4u var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(p4u var0) {
      return var0.k5;
   }
}
