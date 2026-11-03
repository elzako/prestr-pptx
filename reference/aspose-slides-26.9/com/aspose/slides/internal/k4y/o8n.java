package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class o8n extends b3 {
   private int n5;
   private f2z l6;
   private f2z k5;
   private List<w0r> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("type", "f", "nf", "lvl");

   public o8n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      o8n$1 var2 = new o8n$1(this);
      n5(var1, var2);
      n5(var1, new o8n$2(this, var1));
   }

   public o8n() {
      this.h0();
   }

   private void h0() {
      this.n5 = 0;
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("type", v8y.n5(this.n5));
      if (this.l6 != null) {
         this.l6.n5("cx", var2, "f");
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "nf");
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            w0r var5 = (w0r)var4.next();
            var5.n5("cx", var2, "lvl");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final f2z n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <f> element can be added.");
      }

      this.l6 = new f2z();
      return this.l6;
   }

   public final void n5(f2z var1) {
      this.l6 = var1;
   }

   public final w0r l6() {
      w0r var1 = new w0r();
      this.u3.addItem(var1);
      return var1;
   }

   public final int k5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final f2z u3() {
      return this.l6;
   }

   public final w0r[] a6() {
      return this.u3.toArray(new w0r[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(o8n var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static f2z n5(o8n var0, f2z var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static f2z l6(o8n var0, f2z var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(o8n var0) {
      return var0.u3;
   }
}
