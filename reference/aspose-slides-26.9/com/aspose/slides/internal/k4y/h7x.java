package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class h7x extends b3 {
   private String n5;
   private List<c5f> l6;
   private List<z4h> k5;
   private d6b u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("t", "r", "rPh", "phoneticPr");

   public h7x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new h7x$1(this, var1));
   }

   public h7x() {
      this.u3();
   }

   private void u3() {
      this.l6 = new List<>();
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5("ssml", var2, "t", this.n5, true);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            c5f var5 = (c5f)var4.next();
            var5.n5("ssml", var2, "r");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.k5.iterator();

      try {
         while (var14.hasNext()) {
            z4h var6 = (z4h)var14.next();
            var6.n5("ssml", var2, "rPh");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.u3 != null) {
         this.u3.n5("ssml", var2, "phoneticPr");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final c5f[] l6() {
      return this.l6.toArray(new c5f[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(h7x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(h7x var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static List l6(h7x var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static List k5(h7x var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static d6b n5(h7x var0, d6b var1) {
      return var0.u3 = var1;
   }
}
