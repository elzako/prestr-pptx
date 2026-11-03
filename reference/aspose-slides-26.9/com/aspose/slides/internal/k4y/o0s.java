package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class o0s extends b3 {
   private String n5;
   private List<j0p> l6;
   private z3k k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("xml:id", "channel", "intermittentChannels");

   public o0s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      o0s$1 var2 = new o0s$1(this);
      n5(var1, var2);
      n5(var1, new o0s$2(this, var1));
   }

   public o0s() {
      this.a6();
   }

   private void a6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("xml:id", this.n5);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            j0p var5 = (j0p)var4.next();
            var5.n5("inkml", var2, "channel");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("inkml", var2, "intermittentChannels");
      }

      var2.s7();
   }

   public final void n5(j0p var1) {
      this.l6.addItem(var1);
   }

   public final void n5(z3k var1) {
      this.k5 = var1;
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final j0p[] l6() {
      return this.l6.toArray(new j0p[0]);
   }

   public final z3k k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(o0s var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(o0s var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static z3k n5(o0s var0, z3k var1) {
      return var0.k5 = var1;
   }
}
