package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class s4z extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private List<h0> u3 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("type", "encoding", "href");

   public s4z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      n5(var1, new s4z$1(this));
      if (!var1.m1()) {
         boolean var2 = false;
         String var3 = var1.n3();

         while (var2 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var2 = false;
            if (var1.s7() == 1) {
               switch (a6.n5(var1.n3())) {
                  default:
                     h0 var4 = new h0(var1);
                     this.u3.addItem(var4);
                     return;
               }
            }
         }
      }
   }

   public s4z() {
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

      if (this.k5 != null) {
         var2.l6("href", this.k5);
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            h0 var5 = (h0)var4.next();
            var5.n5("", var2, "");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(h0 var1) {
      this.u3.addItem(var1);
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
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final h0[] u3() {
      return this.u3.toArray(new h0[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(s4z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(s4z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(s4z var0, String var1) {
      return var0.k5 = var1;
   }
}
