package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class w9d extends b3 {
   private int l6;
   private double k5;
   private double u3;
   private double a6;
   private double u9;
   private double h0;
   private List<n8c> c8;
   public static final int n5 = e0l.n5("linear");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9("type", "degree", "left", "right", "top", "bottom", "stop");

   public w9d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      w9d$1 var2 = new w9d$1(this);
      n5(var1, var2);
      n5(var1, new w9d$2(this, var1));
   }

   public w9d() {
      this.a6();
   }

   private void a6() {
      this.l6 = n5;
      this.k5 = 0.0;
      this.u3 = 0.0;
      this.a6 = 0.0;
      this.u9 = 0.0;
      this.h0 = 0.0;
      this.c8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("type", e0l.n5(this.l6));
      }

      if (this.k5 != 0.0) {
         var2.l6("degree", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if (this.u3 != 0.0) {
         var2.l6("left", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      if (this.a6 != 0.0) {
         var2.l6("right", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      }

      if (this.u9 != 0.0) {
         var2.l6("top", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      if (this.h0 != 0.0) {
         var2.l6("bottom", com.aspose.slides.ms.System.Xml.f4.n5(this.h0));
      }

      List$Enumerator var4 = this.c8.iterator();

      try {
         while (var4.hasNext()) {
            n8c var5 = (n8c)var4.next();
            var5.n5("ssml", var2, "stop");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final int n5() {
      return this.l6;
   }

   public final double l6() {
      return this.k5;
   }

   public final n8c[] k5() {
      return this.c8.toArray(new n8c[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return t2;
   }

   // $VF: synthetic method
   static int n5(w9d var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double n5(w9d var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static double l6(w9d var0, double var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double k5(w9d var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double u3(w9d var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static double a6(w9d var0, double var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static List n5(w9d var0) {
      return var0.c8;
   }
}
