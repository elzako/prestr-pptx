package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class InkTrace implements IInkTrace {
   private String n5;
   private int l6;
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private double h0 = 0.0;
   private double c8 = 0.0;
   private String t2;
   private Ink s7;
   private List<List<Float>> x8;

   @Override
   public final IInkBrush getBrush() {
      return y9k.l6(this.s7, this.c8());
   }

   @Override
   public final java.awt.geom.Point2D.Float[] getPoints() {
      return com.aspose.slides.internal.n8e.v4.n5(this.n5());
   }

   com.aspose.slides.internal.o9b.w1[] n5() {
      return this.n5(com.aspose.slides.internal.o9b.p8.n5(new com.aspose.slides.internal.o9b.p8(0, 0)).a6()).toArray(new com.aspose.slides.internal.o9b.w1[0]);
   }

   final List<List<Float>> l6() {
      return this.x8;
   }

   final String k5() {
      return this.n5;
   }

   final void n5(String var1) {
      this.n5 = var1;
   }

   final int u3() {
      return this.l6;
   }

   final void n5(int var1) {
      this.l6 = var1;
   }

   final int a6() {
      return this.k5;
   }

   final void l6(int var1) {
      this.k5 = var1;
   }

   final String u9() {
      return this.u3;
   }

   final void l6(String var1) {
      this.u3 = var1;
   }

   final String h0() {
      return this.a6;
   }

   final void k5(String var1) {
      this.a6 = var1;
   }

   final String c8() {
      return this.u9;
   }

   final void u3(String var1) {
      this.u9 = var1;
   }

   final double t2() {
      return this.h0;
   }

   final void n5(double var1) {
      this.h0 = var1;
   }

   final double s7() {
      return this.c8;
   }

   final void l6(double var1) {
      this.c8 = var1;
   }

   final String x8() {
      return this.t2;
   }

   final void a6(String var1) {
      this.t2 = var1;
   }

   final a9j n3() {
      return y9k.n5(this.s7, this.h0());
   }

   InkTrace(Ink ink) {
      this.s7 = ink;
      this.l6(0);
      this.n5(1);
   }

   final List<com.aspose.slides.internal.o9b.w1> n5(com.aspose.slides.internal.o9b.f2 var1) {
      this.n5(this.n3());
      List var2 = new List();
      double var3 = this.u9("X");
      double var5 = this.u9("Y");
      List$Enumerator var7 = this.x8.iterator();

      try {
         while (var7.hasNext()) {
            List var8 = (List)var7.next();
            var8.set_Item(0, (Float)var8.get_Item(0) / (float)var3);
            var8.set_Item(1, (Float)var8.get_Item(1) / (float)var5);
            var2.addItem(new com.aspose.slides.internal.o9b.w1((Float)var8.get_Item(0), (Float)var8.get_Item(1)));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      return var2;
   }

   private void n5(a9j var1) {
      List var2 = new List();
      List var3 = new List();
      List var4 = new List();
      new List();
      List var6 = new List();

      for (int var7 = 0; var7 < var1.l6().size(); var7++) {
         var3.addItem(0.0);
         var2.addItem(0.0);
         var4.addItem((double)var7);
         var6.addItem(2);
      }

      List var18 = this.e2();
      this.x8 = new List<>();
      List$Enumerator var8 = var18.iterator();

      try {
         while (var8.hasNext()) {
            List var9 = (List)var8.next();
            List var5 = new List();

            for (int var10 = 0; var10 < var9.size(); var10++) {
               double var11 = 0.0;
               if (var1.l6().get_Item(var10).k5() != 1 && var1.l6().get_Item(var10).k5() != 2 && var1.l6().get_Item(var10).k5() != 3) {
                  if (var1.l6().get_Item(var10).k5() == 4) {
                     var11 = com.aspose.slides.ms.System.z3.n5(((s0v)var9.get_Item(var10)).n5()) ? 1.0 : 0.0;
                  }
               } else if (((s0v)var9.get_Item(var10)).l6() != 0 && (((s0v)var9.get_Item(var10)).l6() != 5 || (Integer)var6.get_Item(var10) != 0)) {
                  if (((s0v)var9.get_Item(var10)).l6() != 1 && (((s0v)var9.get_Item(var10)).l6() != 5 || (Integer)var6.get_Item(var10) != 1)) {
                     if (((s0v)var9.get_Item(var10)).l6() != 2 && (((s0v)var9.get_Item(var10)).l6() != 5 || (Integer)var6.get_Item(var10) != 2)) {
                        if (com.aspose.slides.ms.System.s3.n5(x4d.class, ((s0v)var9.get_Item(var10)).l6(), x4d.class, 4L)) {
                           var11 = (Double)var4.get_Item(var10);
                        }
                     } else {
                        var6.set_Item(var10, 2);
                        double var13 = com.aspose.slides.ms.System.z3.n3(((s0v)var9.get_Item(var10)).n5(), com.aspose.slides.internal.x7n.l6.k5());
                        var11 = var13;
                        var4.set_Item(var10, var13);
                     }
                  } else {
                     var2.set_Item(
                        var10,
                        com.aspose.slides.ms.System.z3.n3(var3.get_Item(var10), com.aspose.slides.internal.x7n.l6.k5())
                           + com.aspose.slides.ms.System.z3.n3(((s0v)var9.get_Item(var10)).n5(), com.aspose.slides.internal.x7n.l6.k5())
                     );
                     var3.set_Item(var10, var2.get_Item(var10));
                     var11 = com.aspose.slides.ms.System.z3.n3(var4.get_Item(var10), com.aspose.slides.internal.x7n.l6.k5())
                        + com.aspose.slides.ms.System.z3.n3(var2.get_Item(var10), com.aspose.slides.internal.x7n.l6.k5());
                     var4.set_Item(var10, var11);
                     var6.set_Item(var10, 1);
                  }
               } else {
                  var11 = com.aspose.slides.ms.System.z3.n3(var4.get_Item(var10), com.aspose.slides.internal.x7n.l6.k5())
                     + com.aspose.slides.ms.System.z3.n3(((s0v)var9.get_Item(var10)).n5(), com.aspose.slides.internal.x7n.l6.k5());
                  var4.set_Item(var10, var11);
                  var3.set_Item(var10, com.aspose.slides.ms.System.z3.n3(((s0v)var9.get_Item(var10)).n5(), com.aspose.slides.internal.x7n.l6.k5()));
                  var6.set_Item(var10, 0);
               }

               var5.addItem((float)var11);
            }

            this.x8.addItem(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }
   }

   private List<List<s0v>> e2() {
      String var1 = this.t9();
      String[] var2 = com.aspose.slides.ms.System.d1.n5(var1, ',');
      List var3 = new List();

      for (int var4 = 0; var4 <= var2.length - 1; var4++) {
         String[] var5 = new String[]{" ", "\r\n", "\t", "\r", "\n"};
         String[] var6 = com.aspose.slides.ms.System.d1.n5(var2[var4], var5, 1);
         List var7 = new List();

         for (int var8 = 0; var8 < var6.length; var8++) {
            s0v var9 = new s0v();
            if (com.aspose.slides.ms.System.d1.u3(var6[var8], "T", (short)5) || com.aspose.slides.ms.System.d1.u3(var6[var8], "F", (short)5)) {
               var9.n5(var6[var8]);
            } else if (com.aspose.slides.ms.System.d1.t2(var6[var8], "#")) {
               var9.n5(com.aspose.slides.ms.System.d1.k5(var6[var8], com.aspose.slides.ms.System.d1.u3(var6[var8], "#") + 1));
            } else if (com.aspose.slides.ms.System.d1.t2(var6[var8], ".")) {
               var9.n5(var6[var8]);
            } else {
               var9.n5(var6[var8]);
            }

            if (com.aspose.slides.ms.System.d1.l6(var6[var8], "'")) {
               var9.n5(com.aspose.slides.ms.System.d1.k5(var6[var8], 1));
               var9.n5(0);
            } else if (com.aspose.slides.ms.System.d1.l6(var6[var8], "\"")) {
               var9.n5(com.aspose.slides.ms.System.d1.k5(var6[var8], 1));
               var9.n5(1);
            } else if (com.aspose.slides.ms.System.d1.l6(var6[var8], "!")) {
               var9.n5(com.aspose.slides.ms.System.d1.k5(var6[var8], 1));
               var9.n5(2);
            } else if (com.aspose.slides.ms.System.d1.a6(var6[var8], "*")) {
               var9.n5(var6[var8]);
               var9.n5(4);
            } else if (com.aspose.slides.ms.System.d1.a6(var6[var8], "?")) {
               var9.n5(var6[var8]);
               var9.n5(3);
            }

            var7.addItem(var9);
         }

         var3.addItem(var7);
      }

      return var3;
   }

   private String t9() {
      char var1 = ' ';
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();

      for (int var3 = 0; var3 < this.x8().length(); var3++) {
         if (this.x8().charAt(var3) == '+') {
            var2.n5(' ');
         }

         if (this.x8().charAt(var3) == '\'' || this.x8().charAt(var3) == '"') {
            var2.n5(' ');
         }

         if (this.x8().charAt(var3) == '-' && (com.aspose.slides.ms.System.t9.u3(var1) || com.aspose.slides.ms.System.t9.u9(var1))) {
            var2.n5(' ');
         }

         var2.n5(this.x8().charAt(var3));
         var1 = this.x8().charAt(var3);
      }

      return var2.toString();
   }

   final com.aspose.slides.internal.o9b.c8 y4() {
      return ((InkBrush)this.getBrush()).n5();
   }

   private double u9(String var1) {
      return y9k.n5(2540.0, "1/in");
   }
}
