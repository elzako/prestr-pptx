package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class i3p extends b3 {
   private String n5;
   private String l6;
   private List<g7> k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("type", "encoding");

   public i3p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      i3p$1 var2 = new i3p$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         var1.u9();
         this.u3 = var1.z1();
      }
   }

   public i3p() {
      this.a6();
   }

   private void a6() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("type", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("encoding", this.l6);
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            var2.l6(var5.n5(), (String)var5.k5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.l6(this.u3);
      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void k5(String var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(i3p var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(i3p var0, String var1) {
      return var0.l6 = var1;
   }
}
