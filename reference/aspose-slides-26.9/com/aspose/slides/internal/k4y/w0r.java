package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class w0r extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private List<t7d> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("ptCount", "formatCode", "name", "pt");

   public w0r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      w0r$1 var2 = new w0r$1(this);
      n5(var1, var2);
      n5(var1, new w0r$2(this, var1));
   }

   public w0r() {
      this.u9();
   }

   private void u9() {
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("ptCount", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6 != null) {
         var2.l6("formatCode", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("name", this.k5);
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            t7d var5 = (t7d)var4.next();
            var5.n5("cx", var2, "pt");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final t7d n5() {
      t7d var1 = new t7d();
      this.u3.addItem(var1);
      return var1;
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final String k5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final t7d[] u3() {
      return this.u3.toArray(new t7d[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static long n5(w0r var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(w0r var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(w0r var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(w0r var0) {
      return var0.u3;
   }
}
